function getAgvData(){
    $.ajax({
       url: 'getLdrtoagvJs',
       type: "get",
        dataType: "json",
        success:function (data){
            var arrayLists = data;

            //機故數據
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
            $(".chanceData").html("");
            $(".chanceData").html(html);

            var html2 = "";
            for(var i = 0; i < arrayLists[16].length; i++){
                html2+=`<tr>
                <td>5%</td>
                <td class="chanceRate`+ (i+1) +`"></td>
            </tr>`
            }
            $(".chanceRate").html("");

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
            // console.log(yieldRteList);

            if(arrayLists[0][0] == 0){
                $("#TTL1").text(0);
                $("#shiJiCNAll1").text(0);
                $("#yieldRte1").text("100%");
                for(var i = 1; i < 13; i++){
                    $("#ARF01"+ i).text(0);
                    $("#shiJiCNARF01"+ i).text(0);
                    $("#yieldRte"+ (i + 1)).text("100%");
                }
            }
            else{
                if(arrayLists[1][0] < arrayLists[0][0]){
                    if(yieldRte1 < 0.95){
                        $("#yieldRte1").text('');
                        $("#TTL1").text('');
                        $("#shiJiCNAll1").text('');

                        $("#yieldRte1").css("background-color","#E13434");
                        $("#yieldRte1").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRte1 * 100).toFixed(2)+"%") +"</span>")
                        $("#shiJiCNAll1").text(arrayLists[0][0]);
                        $("#TTL1").css("background-color","#E13434");
                        $("#TTL1").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[1][0] +"</span>")
                    }
                    else if(0.97 > yieldRte1 > 0.95 ){
                        $("#yieldRte1").text('');
                        $("#TTL1").text('');
                        $("#shiJiCNAll1").text('');

                        $("#yieldRte1").css("background-color","#F7B500");
                        $("#yieldRte1").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRte1 * 100).toFixed(2)+"%") +"</span>")

                        $("#shiJiCNAll1").text(arrayLists[0][0]);
                        $("#TTL1").css("background-color","#F7B500");
                        $("#TTL1").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[1][0] +"</span>")
                    }
                    else{
                        $("#yieldRte1").text('');
                        $("#TTL1").text('');
                        $("#shiJiCNAll1").text('');

                        $("#yieldRte1").css("background-color","");
                        $("#TTL1").css("background-color","");
                        $("#shiJiCNAll1").css("background-color","");

                        $("#yieldRte1").text(((yieldRte1 * 100).toFixed(2)+"%"));
                        $("#TTL1").text(arrayLists[1][0]);
                        $("#shiJiCNAll1").text(arrayLists[0][0]);
                    }
                }
                else{
                    $("#yieldRte1").text('');
                    $("#TTL1").text('');
                    $("#shiJiCNAll1").text('');

                    $("#yieldRte1").css("background-color","");
                    $("#TTL1").css("background-color","");
                    $("#shiJiCNAll1").css("background-color","");
                    $("#yieldRte1").text(((yieldRte1* 100).toFixed(2) +"%"));
                    $("#shiJiCNAll1").text(arrayLists[0][0]);
                    $("#TTL1").text(arrayLists[1][0]);
                }

                for(var i = 1; i < 13; i++){
                    if(arrayLists[0][i] == 0){
                        $("#ARF01"+ i).text(0);
                        $("#shiJiCNARF01"+ i).text(0);
                        $("#yieldRte"+ (i + 1)).text("100%");
                    }else{
                        if(arrayLists[1][i] < arrayLists[0][i]){
                            if(yieldRteList[i] < 0.95){
                                $("#yieldRte"+ (i + 1)).text('');
                                $("#ARF01"+ i).text('');
                                $("#shiJiCNARF01"+ i).text('');

                                $("#yieldRte"+ (i + 1)).css("background-color","#E13434");
                                $("#yieldRte"+ (i + 1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList[i] * 100).toFixed(2)+"%") +"</span>")


                                $("#shiJiCNARF01"+ i).text(arrayLists[0][i]);
                                $("#ARF01"+ i).css("background-color","#E13434");
                                $("#ARF01"+ i).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[1][i] +"</span>")
                            }
                            else if( 0.97 > yieldRteList[i] > 0.95){
                                $("#yieldRte"+ (i + 1)).text('');
                                $("#ARF01"+ i).text('');
                                $("#shiJiCNARF01"+ i).text('');

                                $("#yieldRte"+ (i + 1)).css("background-color","#F7B500");
                                $("#yieldRte"+ (i + 1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList[i] * 100).toFixed(2)+"%") +"</span>")


                                $("#shiJiCNARF01"+ i).text(arrayLists[0][i]);
                                $("#ARF01"+ i).css("background-color","#F7B500");
                                $("#ARF01"+ i).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[1][i] +"</span>")

                            }else{
                                $("#yieldRte"+ (i + 1)).text('');
                                $("#ARF01"+ i).text('');
                                $("#shiJiCNARF01"+ i).text('');

                                $("#yieldRte"+ (i + 1)).css("background-color","");
                                $("#ARF01"+ i).css("background-color","");
                                $("#shiJiCNARF01"+ i).css("background-color","");

                                $("#yieldRte"+ (i + 1)).text(((yieldRteList[i] * 100).toFixed(2)+"%"));
                                $("#shiJiCNARF01"+ i).text(arrayLists[0][i]);

                                $("#ARF01"+ i).text(arrayLists[1][i]);
                            }
                        }
                        else{
                            $("#yieldRte"+ (i + 1)).text('');
                            $("#ARF01"+ i).text('');
                            $("#shiJiCNARF01"+ i).text('');

                            $("#yieldRte"+ (i + 1)).css("background-color","");
                            $("#ARF01"+ i).css("background-color","");
                            $("#shiJiCNARF01"+ i).css("background-color","");

                            $("#yieldRte"+ (i + 1)).text(((yieldRteList[i] * 100).toFixed(2)+"%"));
                            $("#shiJiCNARF01"+ i).text(arrayLists[0][i]);
                            $("#ARF01"+ i).text(arrayLists[1][i]);
                        }
                    }
                }

            }





            if(arrayLists[0][0] == 0){
                $("#TTL2").text(0);
                $("#shiJiCNAll2").text(0);
                $("#yieldRte21").text("100%");
                for(var i = 1; i < 13; i++){
                    $("#ARF02"+ i).text(0);
                    $("#shiJiCNARF02"+ i).text(0);
                    $("#yieldRte2"+ (i + 1)).text("100%");
                }
            }
            else{
                if(arrayLists[2][0] < arrayLists[0][0]){
                    if(yieldRte21 < 0.95){
                        $("#yieldRte21").text('');
                        $("#TTL2").text('');
                        $("#shiJiCNAll2").text('');

                        $("#yieldRte21").css("background-color","#E13434");
                        $("#yieldRte21").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRte21 * 100).toFixed(2)+"%") +"</span>")
                        $("#shiJiCNAll2").text(arrayLists[0][0]);
                        $("#TTL2").css("background-color","#E13434");
                        $("#TTL2").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[2][0] +"</span>")
                    }
                    else if(0.97 > yieldRte21 > 0.95 ){
                        $("#yieldRte21").text('');
                        $("#TTL2").text('');
                        $("#shiJiCNAll2").text('');

                        $("#yieldRte21").css("background-color","#F7B500");
                        $("#yieldRte21").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRte21 * 100).toFixed(2)+"%") +"</span>")

                        $("#shiJiCNAll2").text(arrayLists[0][0]);
                        $("#TTL2").css("background-color","#F7B500");
                        $("#TTL2").append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[2][0] +"</span>")
                    }
                    else{
                        $("#yieldRte21").text('');
                        $("#TTL2").text('');
                        $("#shiJiCNAll2").text('');

                        $("#yieldRte21").css("background-color","");
                        $("#TTL2").css("background-color","");
                        $("#shiJiCNAll2").css("background-color","");


                        $("#yieldRte21").text(((yieldRte21 * 100).toFixed(2)+"%"));
                        $("#TTL2").text(arrayLists[2][0]);
                        $("#shiJiCNAll2").text(arrayLists[0][0]);
                    }
                }
                else{
                    $("#yieldRte21").text('');
                    $("#TTL2").text('');
                    $("#shiJiCNAll2").text('');

                    $("#yieldRte21").css("background-color","");
                    $("#TTL2").css("background-color","");
                    $("#shiJiCNAll2").css("background-color","");

                    $("#yieldRte21").text(((yieldRte21 * 100).toFixed(2)+"%"));
                    $("#shiJiCNAll2").text(arrayLists[0][0]);
                    $("#TTL2").text(arrayLists[2][0]);
                }

                for(var i = 1; i < 13; i++){
                    if(arrayLists[0][i] == 0){
                        $("#ARF02"+ i).text(0);
                        $("#shiJiCNARF02"+ i).text(0);
                        $("#yieldRte2"+ (i + 1)).text("100%");
                    }else{
                        if(arrayLists[2][i] < arrayLists[0][i]){
                            if(yieldRteList2[i] < 0.95){
                                $("#yieldRte2"+ (i + 1)).text('');
                                $("#ARF02"+ i).text('');
                                $("#shiJiCNARF02"+ i).text('');

                                $("#yieldRte2"+ (i + 1)).css("background-color","#E13434");
                                $("#yieldRte2"+ (i + 1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList2[i] * 100).toFixed(2)+"%") +"</span>")


                                $("#shiJiCNARF02"+ i).text(arrayLists[0][i]);
                                $("#ARF02"+ i).css("background-color","#E13434");
                                $("#ARF02"+ i).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[2][i] +"</span>")
                            }
                            else if( 0.97 > yieldRteList2[i] > 0.95){
                                $("#yieldRte2"+ (i + 1)).text('');
                                $("#ARF02"+ i).text('');
                                $("#shiJiCNARF02"+ i).text('');

                                $("#yieldRte2"+ (i + 1)).css("background-color","#F7B500");
                                $("#yieldRte2"+ (i + 1)).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ ((yieldRteList2[i] * 100).toFixed(2)+"%") +"</span>")


                                $("#shiJiCNARF02"+ i).text(arrayLists[0][i]);
                                $("#ARF02"+ i).css("background-color","#F7B500");
                                $("#ARF02"+ i).append("<span data-toggle=\"modal\" data-target=\"#exampleModal\">"+ arrayLists[2][i] +"</span>")

                            }else{
                                $("#yieldRte2"+ (i + 1)).text('');
                                $("#ARF02"+ i).text('');
                                $("#shiJiCNARF02"+ i).text('');

                                $("#yieldRte2"+ (i + 1)).css("background-color","");
                                $("#shiJiCNARF02"+ i).css("background-color","");
                                $("#ARF02"+ i).css("background-color","");


                                $("#yieldRte2"+ (i + 1)).text(((yieldRteList2[i] * 100).toFixed(2)+"%"));

                                $("#shiJiCNARF02"+ i).text(arrayLists[0][i]);

                                $("#ARF02"+ i).text(arrayLists[2][i]);
                            }
                        }
                        else{
                            $("#yieldRte2"+ (i + 1)).text('');
                            $("#ARF02"+ i).text('');
                            $("#shiJiCNARF02"+ i).text('');

                            $("#yieldRte2"+ (i + 1)).css("background-color","");
                            $("#shiJiCNARF02"+ i).css("background-color","");
                            $("#ARF02"+ i).css("background-color","");

                            $("#yieldRte2"+ (i + 1)).text(((yieldRteList2[i] * 100).toFixed(2)+"%"));
                            $("#shiJiCNARF02"+ i).text(arrayLists[0][i]);
                            $("#ARF02"+ i).text(arrayLists[2][i]);
                        }
                    }
                }

            }
        },
    });
}

setInterval(function () {
    getAgvData();
},15000);