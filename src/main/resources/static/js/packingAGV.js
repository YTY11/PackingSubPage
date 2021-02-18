function getAgvData(){
    $.ajax({
       url: 'getLdrtoagvJs',
       type: "get",
        dataType: "json",
        success:function (data) {
            $(".chanceData").html("");
            $(".chanceRate").html("");

            $("#chanNengData").html("");
            $("#yieldRte").html("");
            var arrayLists = data;
            var html = "";
            //機故數據
            for(var i = 3; i < 16;i++){
                for(var j = 0; j < arrayLists[i].length; j++){
                    if(arrayLists[i][j]/60 < 1){
                        arrayLists[i][j] = 0;
                    }
                    else{
                        arrayLists[i][j] = (arrayLists[i][j] / 60).toFixed(0);
                    }

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

            $(".chanceData").html(html);

            var html2 = "";
            for(var i = 0; i < arrayLists[16].length; i++){
                html2+=`<tr>
                <td>5%</td>
                <td class="chanceRate`+ (i+1) +`"></td>
            </tr>`
            }
            $(".chanceRate").html(html2);
            for(var i = 0; i < arrayLists[16].length; i++){
                arrayLists[16][i] = (arrayLists[16][i]/60/60*100).toFixed(2);
                if(arrayLists[16][i] > 5){
                    $(".chanceRate"+ (i+1)).css("background-color","#E13434");
                    $(".chanceRate"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ (arrayLists[16][i]+"%") +"</span>");
                }else{
                    $(".chanceRate"+ (i+1)).css("background-color","");
                    $(".chanceRate"+ (i+1)).text(arrayLists[16][i]+"%");
                }

            }

            var isDayTime = [];
            if(arrayLists[17][0] == "1"){
                //白天
                isDayTime = ["TTL","08:30~09:30","09:30~10:30","10:30~11:30","11:30~12:30","12:30~13:30","13:30~14:30","14:30~15:30","15:30~16:30","16:30~17:30","17:30~18:30","18:30~19:30","19:30~20:30"];
            }
            else{
                //夜晚
                isDayTime = ["TTL","20:30~21:30","21:30~22:30","22:30~23:30","23:30~00:30","00:30~01:30","01:30~02:30","02:30~03:30","03:30~04:30","04:30~05:30","05:30~06:30","06:30~07:30","07:30~08:30"];
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

            // 线体2的实际产能率
            var yieldRte21 = arrayLists[2][0] / arrayLists[0][0];
            var yieldRte22 = arrayLists[2][1] / arrayLists[0][1];
            var yieldRte23 = arrayLists[2][2] / arrayLists[0][2];
            var yieldRte24 = arrayLists[2][3] / arrayLists[0][3];
            var yieldRte25 = arrayLists[2][4] / arrayLists[0][4];
            var yieldRte26 = arrayLists[2][5] / arrayLists[0][5];
            var yieldRte27 = arrayLists[2][6] / arrayLists[0][6];
            var yieldRte28 = arrayLists[2][7] / arrayLists[0][7];
            var yieldRte29 = arrayLists[2][8] / arrayLists[0][8];
            var yieldRte210 = arrayLists[2][9] / arrayLists[0][9];
            var yieldRte211 = arrayLists[2][10] / arrayLists[0][10];
            var yieldRte212 = arrayLists[2][11] / arrayLists[0][11];
            var yieldRte213 = arrayLists[2][12] / arrayLists[0][12];
            var yieldRteList2 = [yieldRte21,yieldRte22,yieldRte23,yieldRte24,yieldRte25,yieldRte26,yieldRte27,yieldRte28,yieldRte29,yieldRte210,yieldRte211,yieldRte212,yieldRte213];
            for(var i = 0 ; i < yieldRteList2.length; i++){
                if(isNaN(yieldRteList2[i])){
                    yieldRteList2[i] = 1;
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

            //线体2
            for(var i = 0; i < 13; i++){
                html3+=`<tr>
                    <td>`+ isDayTime[i] +`</td>
                    <td>`+ arrayLists[0][i] +`</td>
                    <td class="shiJiCN2`+ (i+1) +`"> ` + arrayLists[2][i] + ` </td>
                </tr>`;
                html4+=`<tr>
                    <td>100%</td>
                    <td class="DaChengShiJi2`+ (i+1) +`"> ` + ((yieldRteList2[i] * 100).toFixed(2) + "%") + ` </td>
                </tr>`;
            }

            $("#chanNengData").html(html3);
            $("#yieldRte").html(html4);
            for(var i = 0; i < 13; i++){
                if(arrayLists[0][i] != 0){
                    if(yieldRteList[i] < 0.95){
                        $(".DaChengShiJi1" + (i+1)).css("background-color","#E13434");
                        $(".DaChengShiJi1" + (i+1)).text("");
                        $(".DaChengShiJi1"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList[i] * 100).toFixed(2) + "%") +"</span>")

                        $(".shiJiCN1" + (i+1)).css("background-color","#E13434");
                        $(".shiJiCN1" + (i+1)).text("");
                        $(".shiJiCN1"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((arrayLists[1][i] * 100).toFixed(2) + "%") +"</span>")

                    }
                    else if( 0.97 > yieldRteList[i] > 0.95){
                        $(".DaChengShiJi1" + (i+1)).css("background-color","#F7B500");
                        $(".DaChengShiJi1" + (i+1)).text("");
                        $(".DaChengShiJi1"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList[i] * 100).toFixed(2) + "%") +"</span>")

                        $(".shiJiCN1" + (i+1)).css("background-color","#F7B500");
                        $(".shiJiCN1" + (i+1)).text("");
                        $(".shiJiCN1"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((arrayLists[1][i] * 100).toFixed(2) + "%") +"</span>")

                    }else{
                        $(".DaChengShiJi1" + (i+1)).css("background-color","");
                        $(".DaChengShiJi1" + (i+1)).text("");
                        $(".DaChengShiJi1" + (i+1)).text(((yieldRteList[i] * 100).toFixed(2) + "%"));

                        $(".shiJiCN1" + (i+1)).css("background-color","");
                        $(".shiJiCN1" + (i+1)).text("");
                        $(".shiJiCN1" + (i+1)).text(((arrayLists[1][i] * 100).toFixed(2) + "%"));


                    }
                }
                else{
                    $(".DaChengShiJi1" + (i+1)).css("background-color","");
                    $(".DaChengShiJi1" + (i+1)).text("");
                    $(".DaChengShiJi1" + (i+1)).text(((yieldRteList[i] * 100).toFixed(2) + "%"));

                    $(".shiJiCN1" + (i+1)).css("background-color","");
                    $(".shiJiCN1" + (i+1)).text("");
                    $(".shiJiCN1" + (i+1)).text(((arrayLists[1][i] * 100).toFixed(2) + "%"));
                }
                if(arrayLists[0][i] != 0){
                    if(yieldRteList2[i] < 0.95){
                        $(".DaChengShiJi2" + (i+1)).css("background-color","#E13434");
                        $(".DaChengShiJi2" + (i+1)).text("");
                        $(".DaChengShiJi2"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList2[i] * 100).toFixed(2) + "%") +"</span>")

                        $(".shiJiCN2" + (i+1)).css("background-color","#E13434");
                        $(".shiJiCN2" + (i+1)).text("");
                        $(".shiJiCN2"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((arrayLists[2][i] * 100).toFixed(2) + "%") +"</span>")

                    }
                    else if( 0.97 > yieldRteList[i] > 0.95){
                        $(".DaChengShiJi2" + (i+1)).css("background-color","#F7B500");
                        $(".DaChengShiJi2" + (i+1)).text("");
                        $(".DaChengShiJi2"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList2[i] * 100).toFixed(2) + "%") +"</span>")

                        $(".shiJiCN2" + (i+1)).css("background-color","#F7B500");
                        $(".shiJiCN2" + (i+1)).text("");
                        $(".shiJiCN2"+ (i+1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((arrayLists[2][i] * 100).toFixed(2) + "%") +"</span>")

                    }else{
                        $(".DaChengShiJi2" + (i+1)).css("background-color","");
                        $(".DaChengShiJi2" + (i+1)).text("");
                        $(".DaChengShiJi2" + (i+1)).text(((yieldRteList2[i] * 100).toFixed(2) + "%"));

                        $(".shiJiCN2" + (i+1)).css("background-color","");
                        $(".shiJiCN2" + (i+1)).text("");
                        $(".shiJiCN2" + (i+1)).text(((arrayLists[2][i] * 100).toFixed(2) + "%"));


                    }
                }
                else{
                    $(".DaChengShiJi2" + (i+1)).css("background-color","");
                    $(".DaChengShiJi2" + (i+1)).text("");
                    $(".DaChengShiJi2" + (i+1)).text(((yieldRteList2[i] * 100).toFixed(2) + "%"));

                    $(".shiJiCN2" + (i+1)).css("background-color","");
                    $(".shiJiCN2" + (i+1)).text("");
                    $(".shiJiCN2" + (i+1)).text(((arrayLists[2][i] * 100).toFixed(2) + "%"));


                }

            }

        }
    });
}



function getReachDataSeven(){
    $.ajax({
       url: 'getReachDataSeven',
       type: "get",
        dataType: "json",
        success:function (data) {
            console.log(data);
            var newTime = data[0];
            var xian = ['D061FARF01','D061FARF02'];


            var sst = [];


            sst = newTime.slice(0,8);
            var chart1 = echarts.init(document.getElementById('chart1'));//初始化折线图
            var option1 = {
                tooltip: {
                    trigger: 'axis',
                    formatter:function (params) {
                        var str = "";
                        str = '<div style="color: white">' + params[0].name + '</div>'+params[0].marker+" "+params[0].seriesName+": "+params[0].data+"%"  +'<br/>'+params[1].marker+" "+params[1].seriesName+": "+params[1].data+"%"  +''
                        return str;
                    },//展示百分比
                },
                color: ['#60C0DD', '#0084C6', '#9BCA64', '#FE8463'],
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
                        boundaryGap: false,
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
                        color: '#00FE00',
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
                        var str = "";
                        str = '<div style="color: white">' + params[0].name + '</div>'+params[0].marker+" "+params[0].seriesName+": "+params[0].data+"%"  +'<br/>'+params[1].marker+" "+params[1].seriesName+": "+params[1].data+"%"  +''
                        return str;
                    },//展示百分比
                },
                color: ['#60C0DD', '#0084C6', '#9BCA64', '#FE8463'],
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
                        boundaryGap: false,
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
                        color: '#00FE00',
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


setInterval(function () {
    getAgvData();
    getReachDataSeven();
},15000);


