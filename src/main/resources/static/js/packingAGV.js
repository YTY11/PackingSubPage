



function getReachDataSeven(){
    $.ajax({
       url: 'getReachDataSeven',
       type: "get",
        dataType: "json",
        success:function (data) {
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
                        data: [95],
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
                        data: data[3],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        name: 'D061FARF02',
                        type: 'line',
                        smooth: true,
                        data: data[3],
                        itemStyle : { normal: {label : {show: true}}}
                    },
                    {
                        type: 'line',
                        smooth: false,
                        symbol: "none",
                        color: '#04E723',
                        data: [5],
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
        }
    });
}




//获取别的页面传的值
var loader = "";
$(document).ready(function () {
    let url = window.location.search;//获取'?'后的链接包含'?'
    if(url.indexOf("?") != -1){
        let str = url.substr(1);//获取'?'后的字符串不包含'?'
        strs = str.split("&");//获取url带的值
        var arr = [];//用于存储数据
        for(var i = 0; i < strs.length; i++){
            arr[i]=decodeURI(strs[i].split("=")[1]);//获取每个"="后的数据
        }
        loader = arr[0];



        var html5 = ""
        if (loader == "d302"){

            html5+=`<tr>
                        <td rowspan="14" style="vertical-align: middle;text-align: center">ARF01</td>
                    </tr>`
            for(var i = 0; i<13; i++){
                html5+=`<tr>
                            <td>&nbsp</td>
                        </tr>`
            }
        }
        else if(loader == "d301"){
            html5+=`<tr>
                        <td rowspan="14" style="vertical-align: middle;text-align: center">ARF02</td>
                    </tr>`
            for(var i = 0; i<13; i++){
                html5+=`<tr>
                            <td>&nbsp</td>
                        </tr>`
            }
        }
        $("#xianTi").html("");
        $("#xianTi").html(html5);
    }
})




function getLdrtoagv(){
    var a = [];
    $.ajax({
        async:false,
        url: 'getLdrtoagv',
        type: "get",
        dataType: "json",
        data:{
            "loader":loader,
        },
        success:function (data){
            a = data;
        }
    });
    return a;
}

function getAgvData(){
    $.ajax({
        url: 'getLdrtoagv',
        type: "get",
        dataType: "json",
        data:{
            "loader":loader,
        },
        success:function (data) {
            var arrayLists = data;

            var isDayTime = [];
            if(arrayLists[16][0] == "1"){
                //白天
                isDayTime = ["TTL","8:30~9:30","9:30~10:30","10:30~11:30","11:30~12:30","12:30~13:30","13:30~14:30","14:30~15:30","15:30~16:30","16:30~17:30","17:30~18:30","18:30~19:30","19:30~20:30"];
            }
            else{
                //夜晚
                isDayTime = ["TTL","20:30~21:30","21:30~22:30","22:30~23:30","23:30~0:30","0:30~1:30","1:30~2:30","2:30~3:30","3:30~4:30","4:30~5:30","5:30~6:30","6:30~07:30","7:30~8:30"];
            }



            // 线体1的实际产能率
            var yieldRte1 = arrayLists[1][0] / arrayLists[0][0];
            var yieldRte2 = arrayLists[1][1] / arrayLists[0][1];
            var yieldRte3 = arrayLists[1][2] / arrayLists[0][2];
            var yieldRte4 = arrayLists[1][3] / arrayLists[0][3];
            var yieldRte5 = arrayLists[1][4] / arrayLists[0][4];
            var yieldRte6 = arrayLists[1][5] / arrayLists[0][5];
            var yieldRte7 = arrayLists[1][6] / arrayLists[0][6];
            var yieldRte8 = arrayLists[1][7] / arrayLists[0][7];
            var yieldRte9 = arrayLists[1][8] / arrayLists[0][8];
            var yieldRte10 = arrayLists[1][9] / arrayLists[0][9];
            var yieldRte11 = arrayLists[1][10] / arrayLists[0][10];
            var yieldRte12 = arrayLists[1][11] / arrayLists[0][11];
            var yieldRte13 = arrayLists[1][12] / arrayLists[0][12];
            var yieldRteList = [yieldRte1,yieldRte2,yieldRte3,yieldRte4,yieldRte5,yieldRte6,yieldRte7,yieldRte8,yieldRte9,yieldRte10,yieldRte11,yieldRte12,yieldRte13];
            for(var i = 0 ; i < yieldRteList.length; i++){
                if(isNaN(yieldRteList[i])){
                    yieldRteList[i] = 1;
                }
            }


            var html3 = "";
            var html4 = "";
            //线体1
            for(var i = 0; i < 13; i++){
                html3+=`<tr>
                    <td>`+ isDayTime[i] +`</td>
                    <td>`+ arrayLists[0][i] +`</td>
                    <td class="shiJiCN1`+ (i+1) +`"> ` + arrayLists[1][i] + ` </td>
                </tr>`;
                html4+=`<tr>
                    <td>100%</td>
                    <td class="DaChengShiJi1`+ (i+1) +`"> ` + ((yieldRteList[i] * 100).toFixed(2) + "%") + ` </td>
                </tr>`;
            }



            $("#chanNengData").html("");
            $("#chanNengData").html(html3);
            $("#yieldRte").html("");
            $("#yieldRte").html(html4);
            for(var i = 0; i < 13; i++) {
                if (arrayLists[0][i] != 0) {
                    if (yieldRteList[i] < 0.95) {
                        $(".DaChengShiJi1" + (i + 1)).css("background-color", "#E13434");
                        $(".DaChengShiJi1" + (i + 1)).text("");
                        $(".DaChengShiJi1" + (i + 1)).append("<span >" + ((yieldRteList[i] * 100).toFixed(2) + "%") + "</span>")

                        $(".shiJiCN1" + (i + 1)).css("background-color", "#E13434");
                        $(".shiJiCN1" + (i + 1)).text("");
                        $(".shiJiCN1" + (i + 1)).append("<span >" + arrayLists[1][i] + "</span>")

                    } else if (0.97 > yieldRteList[i] > 0.95) {
                        $(".DaChengShiJi1" + (i + 1)).css("background-color", "#F7B500");
                        $(".DaChengShiJi1" + (i + 1)).text("");
                        $(".DaChengShiJi1" + (i + 1)).append("<span >" + ((yieldRteList[i] * 100).toFixed(2) + "%") + "</span>")

                        $(".shiJiCN1" + (i + 1)).css("background-color", "#F7B500");
                        $(".shiJiCN1" + (i + 1)).text("");
                        $(".shiJiCN1" + (i + 1)).append("<span >" + arrayLists[1][i] + "</span>")

                    } else {
                        $(".DaChengShiJi1" + (i + 1)).css("background-color", "");
                        $(".DaChengShiJi1" + (i + 1)).text("");
                        $(".DaChengShiJi1" + (i + 1)).text(((yieldRteList[i] * 100).toFixed(2) + "%"));

                        $(".shiJiCN1" + (i + 1)).css("background-color", "");
                        $(".shiJiCN1" + (i + 1)).text("");
                        $(".shiJiCN1" + (i + 1)).text(arrayLists[1][i]);


                    }
                } else {
                    $(".DaChengShiJi1" + (i + 1)).css("background-color", "");
                    $(".DaChengShiJi1" + (i + 1)).text("");
                    $(".DaChengShiJi1" + (i + 1)).text(((yieldRteList[i] * 100).toFixed(2) + "%"));

                    $(".shiJiCN1" + (i + 1)).css("background-color", "");
                    $(".shiJiCN1" + (i + 1)).text("");
                    $(".shiJiCN1" + (i + 1)).text(arrayLists[1][i]);
                }
            }





            var html = "";
            //機故數據
            for(var i = 2; i < 15;i++){
                if(arrayLists[i][5]/60 < 1){
                    arrayLists[i][5] = 0;
                }
                else{
                    arrayLists[i][5] = Math.floor(arrayLists[i][5] / 60);
                }
                html += ` <tr>
                <td>`+ arrayLists[i][0] +`</td>
                <td>`+ arrayLists[i][1] +`</td>
                <td>`+ arrayLists[i][2] +`</td>
                <td>`+ arrayLists[i][3] +`</td>
                <td>`+ arrayLists[i][4] +`</td>
                <td>`+ arrayLists[i][5] +`</td>
            </tr>`
            }

            $(".chanceData").html("");
            $(".chanceData").html(html);

            var html2 = "";
            for(var i = 0; i < arrayLists[15].length; i++){
                let time = isDayTime[i];
                html2+=`<tr>
                <td>5%</td>
                <td class="chanceRate`+ (i+1) +`" onclick="getErrorMsg('`+ time +`')"></td>
            </tr>`
            }
            $(".chanceRate").html("");
            $(".chanceRate").html(html2);
            for(var i = 1; i < arrayLists[15].length; i++){


                arrayLists[15][i] = (arrayLists[15][i]/60/60*100).toFixed(2);

                if(arrayLists[15][i] > 5){
                    $(".chanceRate"+ (i+1)).css("background-color","#E13434");
                    $(".chanceRate"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (arrayLists[15][i]+"%") +"</span>");
                }else{
                    $(".chanceRate"+ (i+1)).css("background-color","");
                    $(".chanceRate"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (arrayLists[15][i]+"%") +"</span>");
                }

            }
            var a = arrayLists[17][0]+0;
            if(a == 0){
                a = 1;
            }
            arrayLists[15][0] = (arrayLists[15][0]/60/a*100).toFixed(2);
            if(arrayLists[15][0] > 5){
                $(".chanceRate1").css("background-color","#E13434");
                $(".chanceRate1").append("<span >"+ (arrayLists[15][0]+"%") +"</span>");
            }else{
                $(".chanceRate1").css("background-color","");
                $(".chanceRate1").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (arrayLists[15][0]+"%") +"</span>");
            }

        }
    });
}



function getErrorMsg(time) {


    $.ajax({
        url:'getErrorMsg',
        type:"get",
        dataType:"json",
        data:{
            "errorTime":time,
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
                            <span>`+ data[i][1] +`</span>
                            <span>`+ data[i][0] +`</span>
                            <span>`+ data[i][2] +`</span>
                            <span>AGV</span>
                       </li>`

            }
            $("#errorMsg").html("");

            $("#errorMsg").html(html);
        }

    })

}



setInterval(function () {
    getAgvData();
},60000);


