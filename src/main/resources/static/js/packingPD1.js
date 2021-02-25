
//获取别的页面传的值
var lineName = "";
$(document).ready(function () {
    let url = window.location.search;//获取'?'后的链接包含'?'
    if(url.indexOf("?") != -1){
        let str = url.substr(1);//获取'?'后的字符串不包含'?'
        strs = str.split("&");//获取url带的值
        var arr = [];//用于存储数据
        for(var i = 0; i < strs.length; i++){
            arr[i]=decodeURI(strs[i].split("=")[1]);//获取每个"="后的数据
        }
        lineName = arr[0];

        var html1 = "";


        //判断 1 or 2 线
        if(lineName=="D061FARF01"){
            html1 += `<tr>
                            <td rowspan="13" style="vertical-align: middle;height: 481px;">ARF01</td>
                        </tr>`;
        }else{
            html1 += `<tr>
                            <td rowspan="13" style="vertical-align: middle;height: 481px;">ARF02</td>
                          </tr>`;
        }

        //线别
        $(".xianBie").html("");
        $(".xianBie").html(html1);
    }
})

function getDayTime(){
    var idDayTime = "";
    $.ajax({
        async:false,
        url: 'getPd1Data',
        type: "get",
        dataType: "json",
        data: {
            "lineName": lineName,
        },
        success: function (data) {
            idDayTime = data[0][0];
        }
    });

    return idDayTime;
}



//获取抛料数据
$(document).ready(function (){

    $.ajax({
        url: 'getPd1Data',
        type: "get",
        dataType: "json",
        data:{
          "lineName": lineName,
        },
        success:function (data){

            var html3 = "";//抛料
            var html4 = "";//偏位
            var html5 = "";//机故率
            var html6 = "";//机故


            //抛料数据
            for(var i =0; i< 13; i++){

                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                html3 += `<tr>
                            <td>0.3%</td>
                            <td class="fejectRate`+ (i+1) +`">`+ ((data[2][i]/data[1][i]) * 100).toFixed(2)+"%" +`</td>
                          </tr>`
            }
            $(".fejectRate").html("");
            $(".fejectRate").html(html3);

            for(var i =0; i< 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                if(((data[2][i]/data[1][i]) * 100).toFixed(2)>0.3){
                    $(".fejectRate"+(i+1)).css("background-color", "#E13434");
                }
                else {
                    $(".fejectRate"+(i+1)).css("background-color", "");
                }
            }


            //偏位
            for(var i = 0; i < 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                html4 += `<tr>
                            <td>0.3%</td>
                            <td class="offNormal`+ (i+1) +`">`+ ((data[3][i]/data[1][i]) * 100).toFixed(2)+"%" +`</td>
                          </tr>`
            }
            $(".offNormal").html("");
            $(".offNormal").html(html4);
            for(var i =0; i< 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                if(((data[3][i]/data[1][i]) * 100).toFixed(2)>0.3){
                    $(".offNormal"+(i+1)).css("background-color", "#E13434");
                }
                else {
                    $(".offNormal"+(i+1)).css("background-color", "");
                }
            }

        }
    });

});




// 获取Pd1机故
$(document).ready(function (){

    $.ajax({
        url: 'getPd1JiGuData',
        type: "get",
        dataType: "json",
        data:{
            "lineName": lineName,
        },
        success:function (data) {
            var html5 = "";//机故率
            var html6 = "";//机故
            // console.log(data);

            //机故率
            for(var i = 0; i < 13; i++){
                let time = $(".isDaytime"+(i+1)).text();
                // console.log(time);
                html5 += `<tr>
                            <td>0.3%</td>
                            <td class="jiGuRate`+ (i+1) +`" onclick="getErrorMsg('`+ time +`')"></td>
                          </tr>`
            }
            $(".jiGuData").html("");
            $(".jiGuData").html(html5);
            for(var i = 0; i < 13; i++){
                $(".jiGuRate"+(i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (data[0][i]+0)+'%' +"</span>");

                if((data[0][i]+0) > 0.3){
                    $(".jiGuRate"+(i+1)).css("background-color", "#E13434");

                }
                else{
                    $(".jiGuRate"+(i+1)).css("background-color", "");
                }
            }


            //机故num
            for(var i = 0; i < 13; i++){
                html6 += `<tr>
                            <td>`+ data[1][i] +`</td>
                            <td>0</td>
                          </tr>`
            }
            $(".jiGuNum").html("");
            $(".jiGuNum").html(html6);
        }
    });

});


//折线图
$(document).ready(function (){

    $.ajax({
        url: 'getPd1SevenData',
        type: "get",
        dataType: "json",

        success:function (data) {
            // console.log(data)
            var xian = ['D061FARF01','D061FARF02'];



            var chart1 = echarts.init(document.getElementById('chart1'));//初始化折线图
            var option1 = {
                tooltip: {
                    trigger: 'axis',
                    formatter:function (params) {
                        var res = "<div><p style='color: white'>"  + params[0].name + "</p></div>";
                        for (var i = 0; i < params.length; i++) {
                            if (params[i].data != undefined) {
                                res +=
                                    "<span style='color: white'>" + params[i].marker  + params[i].seriesName + ": &nbsp;" + params[i].data+'%' + "</span><br/>";
                            }
                        }
                        return res;
                    },//展示百分比
                },
                color: ['#0FC3EC', '#162EE5', '#9BCA64', '#FE8463'],
                legend: {
                    top:5,
                    left:60,
                    itemGap:1,
                    data: xian,
                    show: true,
                    x: '0',
                    y: '20px',
                    textStyle: {
                        "fontSize": 10,
                        color: 'black'
                    }
                },
                toolbox: { show: false, },
                calculable: true,
                grid: {          //柱状图和折线图的大小通过调整grid里面的值。
                    top: 30,
                    x: 45,
                    x2: 30,
                    y2: 30,
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: true,//x轴刻度不从0开始
                        data: data[0],
                        // axisLabel: {        //文字傾斜
                        //     interval: 0,
                        //     rotate: 20
                        // },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        axisLabel:{
                            margin:1,//刻度标签与轴线之间的距离。
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            show:true,
                            interval:'auto',
                            formatter:'{value}%' //纵轴显示百分比
                        },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        splitLine: {
                            show: false
                        }
                    }
                ],
                series: [
                    {
                        name: 'D061FARF01',
                        type: 'line',
                        smooth: true,
                        data: data[1],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        name: 'D061FARF02',
                        type: 'line',
                        smooth: true,
                        data: data[2],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        type: 'line',
                        smooth: false,
                        symbol: "none",
                        color: '#04E723',
                        data: [0.3],
                        itemStyle: {
                            normal: {
                                lineStyle: {
                                    width: 1,
                                    type: 'dotted',  //'dotted'虚线 'solid'实线

                                }
                            }
                        },
                        markLine: {
                            data: [
                                { type: 'average', name: '平均值' }
                            ]
                        },

                    },
                ]
            };

            chart1.setOption(option1);


            var chart2 = echarts.init(document.getElementById('chart2'));//初始化折线图
            var option2 = {
                tooltip: {
                    trigger: 'axis',
                    formatter:function (params) {
                        var res = "<div><p style='color: white'>"  + params[0].name + "</p></div>";
                        for (var i = 0; i < params.length; i++) {
                            if (params[i].data != undefined) {
                                res +=
                                    "<span style='color: white'>" + params[i].marker  + params[i].seriesName + ": &nbsp;" + params[i].data+'%' + "</span><br/>";
                            }
                        }
                        return res;
                    },//展示百分比
                },
                color: ['#0FC3EC', '#162EE5', '#9BCA64', '#FE8463'],
                legend: {
                    top:5,
                    left:60,
                    itemGap:1,
                    data: xian,
                    show: true,
                    x: '0',
                    y: '20px',
                    textStyle: {
                        "fontSize": 10,
                        color: 'black'
                    }
                },
                toolbox: { show: false, },
                calculable: true,
                grid: {          //柱状图和折线图的大小通过调整grid里面的值。
                    y: 40,
                    x: 45,
                    x2: 30,
                    y2: 30,
                    containLabel: false,
                    height:'auto',
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: true,//x轴刻度不从0开始
                        data: data[0],
                        // axisLabel: {        //文字傾斜
                        //     interval: 0,
                        //     rotate: 20
                        // },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        axisLabel:{
                            margin:1,//刻度标签与轴线之间的距离。
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        boundaryGap:true,
                        axisLabel: {
                            show:true,
                            interval:'auto',
                            formatter:'{value}%' //纵轴显示百分比
                        },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        splitLine: {
                            show: false
                        }
                    }
                ],
                series: [
                    {
                        name: 'D061FARF01',
                        type: 'line',
                        smooth: true,
                        data: data[3],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        name: 'D061FARF02',
                        type: 'line',
                        smooth: true,
                        data: data[4],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        type: 'line',
                        smooth: false,
                        symbol: "none",
                        color: '#04E723',
                        data: [0.3],
                        itemStyle: {
                            normal: {
                                lineStyle: {
                                    width: 1,
                                    type: 'dotted',  //'dotted'虚线 'solid'实线

                                }
                            }
                        },
                        markLine: {
                            data: [
                                { type: 'average', name: '平均值' }
                            ]
                        },

                    },
                ]
            };

            chart2.setOption(option2);



            var chart3 = echarts.init(document.getElementById('chart3'));//初始化折线图
            var option3 = {
                tooltip: {
                    trigger: 'axis',
                    formatter:function (params) {
                        var res = "<div><p style='color: white'>"  + params[0].name + "</p></div>";
                        for (var i = 0; i < params.length; i++) {
                            if (params[i].data != undefined) {
                                res +=
                                    "<span style='color: white'>" + params[i].marker  + params[i].seriesName + ": &nbsp;" + params[i].data+'%' + "</span><br/>";
                            }
                        }
                        return res;
                    },//展示百分比
                },
                color: ['#0FC3EC', '#162EE5', '#9BCA64', '#FE8463'],
                legend: {
                    top:5,
                    left:60,
                    itemGap:1,
                    data: xian,
                    show: true,
                    x: '0',
                    y: '20px',
                    textStyle: {
                        "fontSize": 10,
                        color: 'black'
                    }
                },
                toolbox: { show: false, },
                calculable: true,
                grid: {          //柱状图和折线图的大小通过调整grid里面的值。
                    top: 30,
                    x: 45,
                    x2: 30,
                    y2: 30,
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: true,//x轴刻度不从0开始
                        data: data[0],
                        // axisLabel: {        //文字傾斜
                        //     interval: 0,
                        //     rotate: 20
                        // },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        axisLabel:{
                            margin:1,//刻度标签与轴线之间的距离。
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            show:true,
                            interval:'auto',
                            formatter:'{value}%' //纵轴显示百分比
                        },
                        axisLine: {
                            lineStyle: {
                                color: "black",
                            }
                        },
                        splitLine: {
                            show: false
                        }
                    }
                ],
                series: [
                    {
                        name: 'D061FARF01',
                        type: 'line',
                        smooth: true,
                        data: data[5],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        name: 'D061FARF02',
                        type: 'line',
                        smooth: true,
                        data: data[6],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        type: 'line',
                        smooth: false,
                        symbol: "none",
                        color: '#04E723',
                        data: [0.3],
                        itemStyle: {
                            normal: {
                                lineStyle: {
                                    width: 1,
                                    type: 'dotted',  //'dotted'虚线 'solid'实线

                                }
                            }
                        },
                        markLine: {
                            data: [
                                { type: 'average', name: '平均值' }
                            ]
                        },

                    },
                ]
            };

            chart3.setOption(option3);
        }
    });

});


//异常信息
function getErrorMsg(time) {


    $.ajax({
        url:'getErrorMsgPD1',
        type:"get",
        dataType:"json",
        data:{
            "errorTime":time,
            "lineName":lineName,
        },
        success:function (data) {
            //errorMsg
            var html="";
            html = `<li>
                        <span>Time</span>
                        <span>机故</span>
                        <span>异常时间（s）</span>
                        <span>异常位置</span>
                    </li>`;

            for(var i = 0; i < data.length; i++){

                html+=`<li>
                            <span>`+ data[i][0] +`</span>
                            <span>急停</span>
                            <span>`+ data[i][1] +`</span>
                            <span>PD1</span>
                       </li>`

            }
            $("#errorMsg").html("");

            $("#errorMsg").html(html);
        }

    })

}

function aa(){
    $.ajax({
        url: 'getPd1Data',
        type: "get",
        dataType: "json",
        data:{
            "lineName": lineName,
        },
        success:function (data){

            var html3 = "";//抛料
            var html4 = "";//偏位
            var html5 = "";//机故率
            var html6 = "";//机故


            //抛料数据
            for(var i =0; i< 13; i++){

                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                html3 += `<tr>
                            <td>0.3%</td>
                            <td class="fejectRate`+ (i+1) +`">`+ ((data[2][i]/data[1][i]) * 100).toFixed(2)+"%" +`</td>
                          </tr>`
            }
            $(".fejectRate").html("");
            $(".fejectRate").html(html3);

            for(var i =0; i< 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                if(((data[2][i]/data[1][i]) * 100).toFixed(2)>0.3){
                    $(".fejectRate"+(i+1)).css("background-color", "#E13434");
                }
                else {
                    $(".fejectRate"+(i+1)).css("background-color", "");
                }
            }


            //偏位
            for(var i = 0; i < 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                html4 += `<tr>
                            <td>0.3%</td>
                            <td class="offNormal`+ (i+1) +`">`+ ((data[3][i]/data[1][i]) * 100).toFixed(2)+"%" +`</td>
                          </tr>`
            }
            $(".offNormal").html("");
            $(".offNormal").html(html4);
            for(var i =0; i< 13; i++){
                if(data[1][i] == 0){
                    data[1][i] = 1;
                }
                if(((data[3][i]/data[1][i]) * 100).toFixed(2)>0.3){
                    $(".offNormal"+(i+1)).css("background-color", "#E13434");
                }
                else {
                    $(".offNormal"+(i+1)).css("background-color", "");
                }
            }

        }
    });
}

function bb(){
    $.ajax({
        url: 'getPd1JiGuData',
        type: "get",
        dataType: "json",
        data:{
            "lineName": lineName,
        },
        success:function (data) {
            var html5 = "";//机故率
            var html6 = "";//机故
            // console.log(data);

            //机故率
            for(var i = 0; i < 13; i++){
                let time = $(".isDaytime"+(i+1)).text();
                // console.log(time);
                html5 += `<tr>
                            <td>0.3%</td>
                            <td class="jiGuRate`+ (i+1) +`" onclick="getErrorMsg('`+ time +`')"></td>
                          </tr>`
            }
            $(".jiGuData").html("");
            $(".jiGuData").html(html5);
            for(var i = 0; i < 13; i++){
                $(".jiGuRate"+(i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (data[0][i]+0)+'%' +"</span>");

                if((data[0][i]+0) > 0.3){
                    $(".jiGuRate"+(i+1)).css("background-color", "#E13434");

                }
                else{
                    $(".jiGuRate"+(i+1)).css("background-color", "");
                }
            }


            //机故num
            for(var i = 0; i < 13; i++){
                html6 += `<tr>
                            <td>`+ data[1][i] +`</td>
                            <td>0</td>
                          </tr>`
            }
            $(".jiGuNum").html("");
            $(".jiGuNum").html(html6);
        }
    });
}
setInterval(function () {
    aa();
    bb();

},60000)