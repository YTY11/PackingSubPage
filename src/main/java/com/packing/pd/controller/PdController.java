package com.packing.pd.controller;

import com.packing.agv.entity.AgvException;
import com.packing.pd.entity.AutofloorMachineerror;
import com.packing.pd.entity.AutofloorSmtGrt;
import com.packing.pd.service.AutofloorMachineerrorService;
import com.packing.pd.service.AutofloorSmtGrtService;
import com.packing.pd.service.AutofloorSmtSctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @Description:
 * @create 2021-02-23 8:16
 */
@Controller
public class PdController {

    @Autowired
    private AutofloorSmtGrtService autofloorSmtGrtService;

    @Autowired
    private AutofloorSmtSctService autofloorSmtSctService;

    @Autowired
    private AutofloorMachineerrorService autofloorMachineerrorService;

    //间隔分钟数 白天
    public long getTimeJiGe(String startTime) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateY = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateT = new SimpleDateFormat("HH:mm:ss");

        String format = dateY.format(dateFormat.parse(startTime));


        long start = dateFormat.parse(format+" 08:30:00").getTime();

        long end = dateFormat.parse(startTime).getTime();

        long timeJiGe = (end - start) / (1000 * 60); //间隔分钟数

        return timeJiGe;
    }

    //间隔分钟数 夜晚
    public long getTimeJiGe2(String startTime,String endTime) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateY = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateT = new SimpleDateFormat("HH:mm:ss");

        String format = dateY.format(dateFormat.parse(startTime));


        long start = dateFormat.parse(format+" 20:30:00").getTime();

        long end = dateFormat.parse(endTime).getTime();

        long timeJiGe = (end - start) / (1000 * 60); //间隔分钟数

        return timeJiGe;
    }





    //pd1页面
    @RequestMapping("getPd1Html")
    public String getPd1Html(){
        return "packingPD1";
    }
    //pd2页面
    @RequestMapping("getPd2Html")
    public String getPd2Html(){
        return "packingPD2";
    }

    //pd1数据
    @RequestMapping("getPd1Data")
    @ResponseBody
    public ArrayList<ArrayList<Integer>> getPd1Data(String lineName) throws ParseException {
        ArrayList<String> timeList1 = new ArrayList<>();
        ArrayList<String> timeList2 = new ArrayList<>();
        timeList1.add("20:30:00");
        timeList1.add("21:30:00");
        timeList1.add("22:30:00");
        timeList1.add("23:30:00");
        timeList1.add("00:30:00");
        timeList1.add("01:30:00");
        timeList1.add("02:30:00");
        timeList1.add("03:30:00");
        timeList1.add("04:30:00");
        timeList1.add("05:30:00");
        timeList1.add("06:30:00");
        timeList1.add("07:30:00");

        timeList2.add("21:30:00");
        timeList2.add("22:30:00");
        timeList2.add("23:30:00");
        timeList2.add("00:30:00");
        timeList2.add("01:30:00");
        timeList2.add("02:30:00");
        timeList2.add("03:30:00");
        timeList2.add("04:30:00");
        timeList2.add("05:30:00");
        timeList2.add("06:30:00");
        timeList2.add("07:30:00");
        timeList2.add("08:30:00");

        //存储所有数据
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

        //判断isNot 白天or晚上
        ArrayList<Integer> isDayTime = new ArrayList<>();
        isDayTime.add(0, 1);

        //存储数据
        ArrayList<Integer> chanLiangList = new ArrayList<>();//产量
        ArrayList<Integer> fejectList = new ArrayList<>();//抛料
        ArrayList<Integer> offNormalList = new ArrayList<>();//偏位




        //获取当前系统时间
        String oracleTime = autofloorSmtSctService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        String oracleTime2 = oracleTime.substring(3, 5);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
//            抛料的数据
            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData1(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData1(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData2(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData2(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData3(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData3(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData4(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData4(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData5(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData5(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData6(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData6(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData7(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData7(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData8(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData8(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData9(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData9(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData10(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData10(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData11(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData11(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData12(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData12(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllData13(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectData13(lineName)));

            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal1(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal2(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal3(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal4(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal5(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal6(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal7(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal8(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal9(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal10(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal11(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal12(lineName)));
            offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormal13(lineName)));
        }
        //晚上
        else{
            isDayTime.set(0, 0);

            if(Integer.parseInt(oracleTime1) >= 20){
                chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataYAll1(lineName, timeList1.get(0), timeList2.get(11)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataYAll1(lineName, timeList1.get(0), timeList2.get(11)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalYAll1(lineName, timeList1.get(0), timeList2.get(11)))) ;

                for(int i = 0; i < 3; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                }
                chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataY11(lineName, timeList1.get(3), timeList2.get(3)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataY11(lineName, timeList1.get(3), timeList2.get(3)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalY11(lineName, timeList1.get(3), timeList2.get(3)))) ;

                for(int i = 4; i < 12; i++){
                    chanLiangList.add(0);
                    fejectList.add(0);
                    offNormalList.add(0);
                }

            }
            else{
                chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataYAll2(lineName, timeList1.get(0), timeList2.get(11)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataYAll2(lineName, timeList1.get(0), timeList2.get(11)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalYAll2(lineName, timeList1.get(0), timeList2.get(11)))) ;

                for(int i = 0; i < 3; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataY2(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataY2(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalY2(lineName, timeList1.get(i), timeList2.get(i)))) ;
                }
                chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataY12(lineName, timeList1.get(3), timeList2.get(3)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataY12(lineName, timeList1.get(3), timeList2.get(3)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalY12(lineName, timeList1.get(3), timeList2.get(3)))) ;

                for(int i = 4; i < 12; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtSctService.getAllDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtSctService.getFejectDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtSctService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                }
            }

        }


        //判断isNot 白天or晚上
        listAll.add(isDayTime);

        //产量数据
        listAll.add(chanLiangList);
        //抛料数据
        listAll.add(fejectList);
        //偏位数据
        listAll.add(offNormalList);



//        System.out.println(listAll);

        return listAll;
    }

    //pd1机故数据
    @RequestMapping("getPd1JiGuData")
    @ResponseBody
    public ArrayList<ArrayList<String>> getPd1JiGuData(String lineName) throws ParseException {
        double all = 0.0;
        int allNum = 0;
        //存储所有数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();


        //存储机故数据
        ArrayList<String> jiGuList = new ArrayList<>();
        //存机故个数
        ArrayList<String> jiGuNumList = new ArrayList<>();

        ArrayList<String> timeList1 = new ArrayList<>();
        ArrayList<String> timeList2 = new ArrayList<>();
        timeList1.add("20:30:00");
        timeList1.add("21:30:00");
        timeList1.add("22:30:00");
        timeList1.add("23:30:00");
        timeList1.add("00:30:00");
        timeList1.add("01:30:00");
        timeList1.add("02:30:00");
        timeList1.add("03:30:00");
        timeList1.add("04:30:00");
        timeList1.add("05:30:00");
        timeList1.add("06:30:00");
        timeList1.add("07:30:00");
        timeList1.add("08:30:00");


        timeList2.add("08:30:00");
        timeList2.add("09:30:00");
        timeList2.add("10:30:00");
        timeList2.add("11:30:00");
        timeList2.add("12:30:00");
        timeList2.add("13:30:00");
        timeList2.add("14:30:00");
        timeList2.add("15:30:00");
        timeList2.add("16:30:00");
        timeList2.add("17:30:00");
        timeList2.add("18:30:00");
        timeList2.add("19:30:00");
        timeList2.add("20:30:00");
        //获取当前系统时间
        String oracleTime = autofloorSmtGrtService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        String oracleTime2 = oracleTime.substring(3, 5);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){


            jiGuNumList.add("");

            jiGuList.add((all+""));
            String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe1();

            long timeJiGe = getTimeJiGe(timeJiGe1);
            if(timeJiGe==0){
                timeJiGe = 1;
            }
            for(int i = 0; i < 12; i++){

                double a  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))).toString());

                all += a;
                jiGuList.add((a/60+""));

                int num =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                allNum+=num;
                jiGuNumList.add(num+"");

            }
            jiGuList.set(0,(all/timeJiGe+""));
            jiGuNumList.set(0,allNum+"");
        }
        //晚上
        else{
            jiGuList.add((all+""));
            jiGuNumList.add("");

            if(Integer.parseInt(oracleTime1) >= 20){
                String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe1);
                if(timeJiGe==0){
                    timeJiGe = 1;
                }
                for(int i = 0; i < 3; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                double b  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTimeY11(lineName, timeList1.get(3),timeList1.get(4)).toString());

                all += b;
                jiGuList.add((b/60+""));

                int num1 =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(3),timeList2.get(4)));
                allNum+=num1;
                jiGuNumList.add(num1+"");

                for(int i = 4; i < 12; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                jiGuList.set(0,(all/timeJiGe+""));
                jiGuNumList.set(0,allNum+"");
            }
            else{
                String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe2();
                String timeJiGe2 = autofloorMachineerrorService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe2);
                if(timeJiGe==0){
                    timeJiGe = 1;
                }
                for(int i = 0; i < 3; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                double b  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTimeY11(lineName, timeList1.get(3),timeList1.get(4)).toString());

                all += b;
                jiGuList.add((b/60+""));

                int num1 =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(3),timeList2.get(4)));
                allNum+=num1;
                jiGuNumList.add(num1+"");
                for(int i = 4; i < 12; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));


                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd1JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                jiGuList.set(0,(all/timeJiGe+""));
                jiGuNumList.set(0,allNum+"");
            }

        }


        arrayLists.add(jiGuList);
        arrayLists.add(jiGuNumList);

//        System.out.println(arrayLists);

        return arrayLists;

    }




    //pd2数据
    @RequestMapping("getPd2Data")
    @ResponseBody
    public ArrayList<ArrayList<Integer>> getPd2Data(String lineName) throws ParseException {
        ArrayList<String> timeList1 = new ArrayList<>();
        ArrayList<String> timeList2 = new ArrayList<>();
        timeList1.add("20:30:00");
        timeList1.add("21:30:00");
        timeList1.add("22:30:00");
        timeList1.add("23:30:00");
        timeList1.add("00:30:00");
        timeList1.add("01:30:00");
        timeList1.add("02:30:00");
        timeList1.add("03:30:00");
        timeList1.add("04:30:00");
        timeList1.add("05:30:00");
        timeList1.add("06:30:00");
        timeList1.add("07:30:00");

        timeList2.add("21:30:00");
        timeList2.add("22:30:00");
        timeList2.add("23:30:00");
        timeList2.add("00:30:00");
        timeList2.add("01:30:00");
        timeList2.add("02:30:00");
        timeList2.add("03:30:00");
        timeList2.add("04:30:00");
        timeList2.add("05:30:00");
        timeList2.add("06:30:00");
        timeList2.add("07:30:00");
        timeList2.add("08:30:00");

        //存储所有数据
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

        //判断isNot 白天or晚上
        ArrayList<Integer> isDayTime = new ArrayList<>();
        isDayTime.add(0, 1);

        //存储数据
        ArrayList<Integer> chanLiangList = new ArrayList<>();//产量
        ArrayList<Integer> fejectList = new ArrayList<>();//抛料
        ArrayList<Integer> offNormalList = new ArrayList<>();//偏位
        ArrayList<Integer> offNormalCLList = new ArrayList<>();//偏位的产量




        //获取当前系统时间
        String oracleTime = autofloorSmtGrtService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        String oracleTime2 = oracleTime.substring(3, 5);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
//            抛料的数据
            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData1(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData1(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData2(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData2(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData3(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData3(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData4(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData4(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData5(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData5(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData6(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData6(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData7(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData7(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData8(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData8(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData9(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData9(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData10(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData10(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData11(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData11(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData12(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData12(lineName)));

            chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllData13(lineName)));
            fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectData13(lineName)));

            //偏位数据
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal1(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal2(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal3(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal4(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal5(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal6(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal7(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal8(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal9(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal10(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal11(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal12(lineName).getReCheckNg()));
            offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal13(lineName).getReCheckNg()));


            //偏位产量数据
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal1(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal2(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal3(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal4(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal5(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal6(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal7(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal8(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal9(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal10(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal11(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal12(lineName).getUph()));
            offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormal13(lineName).getUph()));



        }
        //晚上
        else{
            isDayTime.set(0, 0);

            if(Integer.parseInt(oracleTime1) >= 20){
                chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataYAll1(lineName, timeList1.get(0), timeList2.get(11)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataYAll1(lineName, timeList1.get(0), timeList2.get(11)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalYAll1(lineName, timeList1.get(0), timeList2.get(11)).getReCheckNg())) ;
                offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalYAll1(lineName, timeList1.get(0), timeList2.get(11)).getUph())) ;

                for(int i = 0; i < 3; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)).getReCheckNg())) ;
                    offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)).getUph())) ;
                }
                chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataY11(lineName, timeList1.get(3), timeList2.get(3)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataY11(lineName, timeList1.get(3), timeList2.get(3)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY11(lineName, timeList1.get(3), timeList2.get(3)).getReCheckNg())) ;
                offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY11(lineName, timeList1.get(3), timeList2.get(3)).getUph())) ;

                for(int i = 4; i < 12; i++){
                    chanLiangList.add(0);
                    fejectList.add(0);
                    offNormalList.add(0);
                }

            }
            else{
                chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataYAll2(lineName, timeList1.get(0), timeList2.get(11)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataYAll2(lineName, timeList1.get(0), timeList2.get(11)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalYAll2(lineName, timeList1.get(0), timeList2.get(11)).getReCheckNg())) ;
                offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalYAll2(lineName, timeList1.get(0), timeList2.get(11)).getUph())) ;

                for(int i = 0; i < 3; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataY2(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataY2(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY2(lineName, timeList1.get(i), timeList2.get(i)).getReCheckNg())) ;
                    offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY2(lineName, timeList1.get(i), timeList2.get(i)).getUph())) ;
                }
                chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataY12(lineName, timeList1.get(3), timeList2.get(3)))) ;
                fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataY12(lineName, timeList1.get(3), timeList2.get(3)))) ;
                offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY12(lineName, timeList1.get(3), timeList2.get(3)).getReCheckNg())) ;
                offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY12(lineName, timeList1.get(3), timeList2.get(3)).getUph())) ;

                for(int i = 4; i < 12; i++){
                    chanLiangList.add(Integer.parseInt(autofloorSmtGrtService.getAllDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    fejectList.add(Integer.parseInt(autofloorSmtGrtService.getFejectDataY1(lineName, timeList1.get(i), timeList2.get(i)))) ;
                    offNormalList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)).getReCheckNg())) ;
                    offNormalCLList.add(Integer.parseInt(autofloorSmtGrtService.getOffNormalY1(lineName, timeList1.get(i), timeList2.get(i)).getUph())) ;
                }
            }

        }


        //判断isNot 白天or晚上
        listAll.add(isDayTime);

        //产量数据
        listAll.add(chanLiangList);
        //抛料数据
        listAll.add(fejectList);
        //偏位数据
        listAll.add(offNormalList);
        //偏位产量数据
        listAll.add(offNormalCLList);

//        .out.println(listAll);

        return listAll;
    }

    //pd2机故数据
    @RequestMapping("getPd2JiGuData")
    @ResponseBody
    public ArrayList<ArrayList<String>> getPd2JiGuData(String lineName) throws ParseException {
        double all = 0.0;
        int allNum = 0;
        //存储所有数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();


        //存储机故数据
        ArrayList<String> jiGuList = new ArrayList<>();
        //存机故个数
        ArrayList<String> jiGuNumList = new ArrayList<>();

        ArrayList<String> timeList1 = new ArrayList<>();
        ArrayList<String> timeList2 = new ArrayList<>();
        timeList1.add("20:30:00");
        timeList1.add("21:30:00");
        timeList1.add("22:30:00");
        timeList1.add("23:30:00");
        timeList1.add("00:30:00");
        timeList1.add("01:30:00");
        timeList1.add("02:30:00");
        timeList1.add("03:30:00");
        timeList1.add("04:30:00");
        timeList1.add("05:30:00");
        timeList1.add("06:30:00");
        timeList1.add("07:30:00");
        timeList1.add("08:30:00");


        timeList2.add("08:30:00");
        timeList2.add("09:30:00");
        timeList2.add("10:30:00");
        timeList2.add("11:30:00");
        timeList2.add("12:30:00");
        timeList2.add("13:30:00");
        timeList2.add("14:30:00");
        timeList2.add("15:30:00");
        timeList2.add("16:30:00");
        timeList2.add("17:30:00");
        timeList2.add("18:30:00");
        timeList2.add("19:30:00");
        timeList2.add("20:30:00");
        //获取当前系统时间
        String oracleTime = autofloorSmtGrtService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        String oracleTime2 = oracleTime.substring(3, 5);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){


            jiGuNumList.add("");

            jiGuList.add((all+""));
            String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe1();

            long timeJiGe = getTimeJiGe(timeJiGe1);
            if(timeJiGe==0){
                timeJiGe = 1;
            }
            for(int i = 0; i < 12; i++){

            double a  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))).toString());

                all += a;
                jiGuList.add((a/60+""));

              int num =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                allNum+=num;
                jiGuNumList.add(num+"");

            }
            jiGuList.set(0,(all/timeJiGe+""));
            jiGuNumList.set(0,allNum+"");
        }
        //晚上
        else{
            jiGuList.add((all+""));
            jiGuNumList.add("");

            if(Integer.parseInt(oracleTime1) >= 20){
                String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe1);
                if(timeJiGe==0){
                    timeJiGe = 1;
                }
                for(int i = 0; i < 3; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                double b  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTimeY11(lineName, timeList1.get(3),timeList1.get(4)).toString());

                all += b;
                jiGuList.add((b/60+""));

                int num1 =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(3),timeList2.get(4)));
                allNum+=num1;
                jiGuNumList.add(num1+"");

                for(int i = 4; i < 12; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                jiGuList.set(0,(all/timeJiGe+""));
                jiGuNumList.set(0,allNum+"");
            }
            else{
                String timeJiGe1 = autofloorMachineerrorService.getTimeJiGe2();
                String timeJiGe2 = autofloorMachineerrorService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe2);
                if(timeJiGe==0){
                    timeJiGe = 1;
                }
                for(int i = 0; i < 3; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));

                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                double b  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTimeY11(lineName, timeList1.get(3),timeList1.get(4)).toString());

                all += b;
                jiGuList.add((b/60+""));

                int num1 =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(3),timeList2.get(4)));
                allNum+=num1;
                jiGuNumList.add(num1+"");
                for(int i = 4; i < 12; i++){
                    double a  =  Double.valueOf(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList1.get(i),timeList1.get((i+1))).toString());

                    all += a;
                    jiGuList.add((a/60+""));


                    int num =  Integer.parseInt(autofloorMachineerrorService.getPd2JiGuTime1(lineName, timeList2.get(i),timeList2.get((i+1))));
                    allNum+=num;
                    jiGuNumList.add(num+"");
                }
                jiGuList.set(0,(all/timeJiGe+""));
                jiGuNumList.set(0,allNum+"");
            }

        }


        arrayLists.add(jiGuList);
        arrayLists.add(jiGuNumList);

//        System.out.println(arrayLists);

        return arrayLists;

    }



    //pd1 7天数据
    @RequestMapping("getPd1SevenData")
    @ResponseBody
    public ArrayList<ArrayList<String>> getPd1SevenData(){
        //存储所有数据
        ArrayList<ArrayList<String>> allList = new ArrayList<>();


        //存日期 List
        ArrayList<String> dateList = new ArrayList<>();
        ArrayList<String> dateList2 = new ArrayList<>();



        //存抛料 List1
        ArrayList<String> fejectList1 = new ArrayList<>();
        //存抛料 List2
        ArrayList<String> fejectList2 = new ArrayList<>();


        //存偏位 List1
        ArrayList<String> offNormalList1 = new ArrayList<>();
        //存偏位 List2
        ArrayList<String> offNormalList2 = new ArrayList<>();

        //机故率 list
        ArrayList<String> jiGuList1 = new ArrayList<>();
        ArrayList<String> jiGuList2 = new ArrayList<>();

//        获取前七天日期
        ArrayList<String> sevenDateList = autofloorSmtGrtService.getSevenDate();
        for (String s : sevenDateList) {
            dateList2.add(s);
        }

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
                //遍历存储数据1
                for (String s : sevenDateList) {
                    //存日期
                    dateList.add(s.substring(5));
                    int allDate = Integer.parseInt(autofloorSmtSctService.getAllDataSeven(s, "D061FARF01"));
                    int feject = Integer.parseInt(autofloorSmtSctService.getFejectDataSeven(s, "D061FARF01"));
                    int offNormal = Integer.parseInt(autofloorSmtSctService.getOffNormalSeven(s, "D061FARF01"));
                    if(allDate == 0){
                        allDate = 1;
                    }

                    fejectList1.add(String.format("%.2f", (feject/(allDate+0.0)*100.0)));
                    offNormalList1.add(String.format("%.2f", (offNormal/(allDate+0.0)*100.0)));

                }
                ArrayList<AutofloorMachineerror> jiGuSeven1 = autofloorMachineerrorService.getPd2JiGuSeven1("D061FARF01", dateList2.get(0)
                        , dateList2.get(1), dateList2.get(2), dateList2.get(3), dateList2.get(4), dateList2.get(5)
                        , dateList2.get(6));


                if (jiGuSeven1 != null && jiGuSeven1.size() > 0) {
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    for (AutofloorMachineerror autofloorMachineerror : jiGuSeven1) {
                        for (int i = 0; i < dateList2.size(); i++) {
                            if (dateList2.get(i).equals(autofloorMachineerror.getP3())) {
                                Double aDouble = Double.valueOf(autofloorMachineerror.getP4().toString());
                                String format = String.format("%.2f", (aDouble / (24 * 60) * 100));
                                jiGuList1.set(i, format);
                                break;
                            }
                        }
                    }
                } else {
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                }

//            }
//        });
//        thread.start();




        //遍历存储数据2
        for (String s : sevenDateList) {

            int allDate = Integer.parseInt(autofloorSmtSctService.getAllDataSeven(s, "D061FARF02"));
            int feject = Integer.parseInt(autofloorSmtSctService.getFejectDataSeven(s, "D061FARF02"));
            int offNormal = Integer.parseInt(autofloorSmtSctService.getOffNormalSeven(s, "D061FARF02"));

            if(allDate == 0){
                allDate = 1;
            }
            fejectList2.add(String.format("%.2f", (feject/(allDate+0.0)*100.0)));
            offNormalList2.add(String.format("%.2f", (offNormal/(allDate+0.0)*100.0)));

        }

        ArrayList<AutofloorMachineerror> jiGuSeven2 = autofloorMachineerrorService.getPd2JiGuSeven1("D061FARF02", dateList2.get(0)
                , dateList2.get(1), dateList2.get(2), dateList2.get(3), dateList2.get(4), dateList2.get(5)
                , dateList2.get(6));




        if(jiGuSeven2 != null && jiGuSeven2.size()>0){
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            for (AutofloorMachineerror autofloorMachineerror : jiGuSeven2) {
                for (int i = 0; i < dateList2.size();i++) {
                    if(dateList2.get(i).equals(autofloorMachineerror.getP3())){
                        Double aDouble = Double.valueOf(autofloorMachineerror.getP4().toString());
                        String format = String.format("%.2f", (aDouble / (24 * 60) * 100));
                        jiGuList2.set(i,format);
                        break;
                    }
                }
            }
        }
        else{
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
        }

        //存日期
        allList.add(dateList);

        //存抛料 线别 1 and 2
        allList.add(fejectList1);
        allList.add(fejectList2);


        //存偏位 线别 1 and 2
        allList.add(offNormalList1);
        allList.add(offNormalList2);

        //存机故
        allList.add(jiGuList1);
        allList.add(jiGuList2);
        return allList;
    }



    //pd2 7天数据
    @RequestMapping("getPd2SevenData")
    @ResponseBody
    public ArrayList<ArrayList<String>> getPd2SevenData(){



        //存储所有数据
        ArrayList<ArrayList<String>> allList = new ArrayList<>();


        //存日期 List
        ArrayList<String> dateList = new ArrayList<>();
        ArrayList<String> dateList2 = new ArrayList<>();




        //存抛料 List
        ArrayList<String> fejectList1 = new ArrayList<>();
        ArrayList<String> fejectList2 = new ArrayList<>();

        //存偏位 List
        ArrayList<String> offNormalList1 = new ArrayList<>();
        ArrayList<String> offNormalList2 = new ArrayList<>();

        //机故率 list
        ArrayList<String> jiGuList1 = new ArrayList<>();
        ArrayList<String> jiGuList2 = new ArrayList<>();



//        获取前七天日期
        ArrayList<String> sevenDateList = autofloorSmtGrtService.getSevenDate();
        for (String s : sevenDateList) {
            dateList2.add(s);
        }

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //遍历存储数据1
                for (String s : sevenDateList) {
                    //存日期
                    dateList.add(s.substring(5));

                    int allDate = Integer.parseInt(autofloorSmtGrtService.getAllDataSeven(s, "D061FARF01"));
                    int feject = Integer.parseInt(autofloorSmtGrtService.getFejectDataSeven(s, "D061FARF01"));
                    int offNormal = Integer.parseInt(autofloorSmtGrtService.getOffNormalSeven(s, "D061FARF01").getReCheckNg());
                    int offNormalCL = Integer.parseInt(autofloorSmtGrtService.getOffNormalSeven(s, "D061FARF01").getUph());

//                    int jiGu = Integer.parseInt(autofloorMachineerrorService.getPd2JiGuSeven(s, "D061FARF01"));

                    if (allDate == 0) {
                        allDate = 1;
                    }
                    if (offNormalCL == 0) {
                        offNormalCL = 1;
                    }


                    fejectList1.add(String.format("%.2f", (feject / (allDate + 0.0) * 100.0)));
                    offNormalList1.add(String.format("%.2f", (offNormal / (offNormalCL + 0.0) * 100.0)));
//                    jiGuList1.add(String.format("%.2f", (jiGu / (24 * 60 + 0.0) * 100.0)));

                }
                ArrayList<AutofloorMachineerror> jiGuSeven1 = autofloorMachineerrorService.getPd2JiGuSeven1("D061FARF01", dateList2.get(0)
                        , dateList2.get(1), dateList2.get(2), dateList2.get(3), dateList2.get(4), dateList2.get(5)
                        , dateList2.get(6));


                if (jiGuSeven1 != null && jiGuSeven1.size() > 0) {
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    for (AutofloorMachineerror autofloorMachineerror : jiGuSeven1) {
                        for (int i = 0; i < dateList2.size(); i++) {
                            if (dateList2.get(i).equals(autofloorMachineerror.getP3())) {
                                Double aDouble = Double.valueOf(autofloorMachineerror.getP4().toString());
                                String format = String.format("%.2f", (aDouble / (24 * 60) * 100));
                                jiGuList1.set(i, format);
                                break;
                            }
                        }
                    }
                } else {
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                    jiGuList1.add("0.00");
                }

//            }
//        });
//        thread.start();

        //遍历存储数据2
        for (String s : sevenDateList) {

//            System.out.println(s);
            int allDate = Integer.parseInt(autofloorSmtGrtService.getAllDataSeven(s, "D061FARF02"));
            int feject = Integer.parseInt(autofloorSmtGrtService.getFejectDataSeven(s, "D061FARF02"));
            int offNormal = Integer.parseInt(autofloorSmtGrtService.getOffNormalSeven(s, "D061FARF02").getReCheckNg());
            int offNormalCL = Integer.parseInt(autofloorSmtGrtService.getOffNormalSeven(s, "D061FARF02").getUph());
//            int jiGu = Integer.parseInt(autofloorMachineerrorService.getPd2JiGuSeven(s, "D061FARF02"));


            if(allDate == 0){
                allDate = 1;
            }
            if(offNormalCL == 0){
                offNormalCL = 1;
            }

            fejectList2.add(String.format("%.2f", (feject/(allDate+0.0)*100.0)));
            offNormalList2.add(String.format("%.2f", (offNormal/(offNormalCL+0.0)*100.0)));
//            jiGuList2.add(String.format("%.2f", (jiGu / (24 * 60 + 0.0) * 100.0)));

        }


        ArrayList<AutofloorMachineerror> jiGuSeven2 = autofloorMachineerrorService.getPd2JiGuSeven1("D061FARF02", dateList2.get(0)
                , dateList2.get(1), dateList2.get(2), dateList2.get(3), dateList2.get(4), dateList2.get(5)
                , dateList2.get(6));




        if(jiGuSeven2 != null && jiGuSeven2.size()>0){
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            for (AutofloorMachineerror autofloorMachineerror : jiGuSeven2) {
                for (int i = 0; i < dateList2.size();i++) {
                    if(dateList2.get(i).equals(autofloorMachineerror.getP3())){
                        Double aDouble = Double.valueOf(autofloorMachineerror.getP4().toString());
                        String format = String.format("%.2f", (aDouble / (24 * 60) * 100));
                        jiGuList2.set(i,format);
                        break;
                    }
                }
            }
        }
        else{
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
            jiGuList2.add("0.00");
        }



        //存日期
        allList.add(dateList);

        //存抛料
        allList.add(fejectList1);
        allList.add(fejectList2);


        //存偏位
        allList.add(offNormalList1);
        allList.add(offNormalList2);

        //存机故
        allList.add(jiGuList1);
        allList.add(jiGuList2);
        return allList;
    }





    //PD1error信息
    @RequestMapping("getErrorMsgPD1")
    @ResponseBody
    public ArrayList<ArrayList<String>> getErrorMsgPD1(String errorTime,String lineName) throws ParseException {

        //最终返回的数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        //获取当前系统时间
        String oracleTime = autofloorSmtGrtService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        Date date = new Date();
//        String oracleTime1 = dateFormat.format(date).substring(0, 2);
//        Long time = dateFormat.parse(dateFormat.format(date)).getTime();
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
            ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
            if("TTL".equals(errorTime)){
                errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsg1(lineName,"08:30:00","20:30:00");
            }
            else{
                String pdTime1 = errorTime.substring(0, 5);
                String pdTime2 = errorTime.substring(6,11);
//                System.out.println(pdTime1+"~"+pdTime2);
                errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsg1(lineName,pdTime1,pdTime2);
            }



            //数据存入集合
            for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                ArrayList<String> errorMsg1List = new ArrayList<String>();
                errorMsg1List.add(autofloorMachineerror.getP3());
                errorMsg1List.add(autofloorMachineerror.getP4());


                arrayLists.add(errorMsg1List);

            }

        }
        //夜晚
        else{
            if(Integer.parseInt(oracleTime1) >= 20){

                ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsgY11(lineName,"08:30:00","20:30:00");
                }
                else{
                    String pdTime1 = errorTime.substring(0, 5);
                    String pdTime2 = errorTime.substring(6,11);

                    if("23:30:00".equals(pdTime1)){
                        errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsgY11(lineName,pdTime1,pdTime2);

                    }
                    else{
                        errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsg1(lineName,pdTime1,pdTime2);
                    }
                }

                //数据存入集合
                for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();
                    errorMsg1List.add(autofloorMachineerror.getP3());
                    errorMsg1List.add(autofloorMachineerror.getP4());


                    arrayLists.add(errorMsg1List);

                }
            }else{
                ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsgY12(lineName,"08:30:00","20:30:00");
                }
                else{
                    String pdTime1 = errorTime.substring(0, 5);
                    String pdTime2 = errorTime.substring(6,11);

                    if("23:30:00".equals(pdTime1)){
                        errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsgY12(lineName,pdTime1,pdTime2);

                    }
                    else{
                        errorMsg1 = autofloorMachineerrorService.getPd1ErrorMsg1(lineName,pdTime1,pdTime2);
                    }
                }
                //数据存入集合
                for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();
                    errorMsg1List.add(autofloorMachineerror.getP3());
                    errorMsg1List.add(autofloorMachineerror.getP4());


                    arrayLists.add(errorMsg1List);

                }
            }
        }

//        System.out.println(arrayLists);
        return arrayLists;


    }

    //PD2error信息
    @RequestMapping("getErrorMsgPD2")
    @ResponseBody
    public ArrayList<ArrayList<String>> getErrorMsgPD2(String errorTime,String lineName) throws ParseException {

        //最终返回的数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        //获取当前系统时间
        String oracleTime = autofloorSmtGrtService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        Date date = new Date();
//        String oracleTime1 = dateFormat.format(date).substring(0, 2);
//        Long time = dateFormat.parse(dateFormat.format(date)).getTime();
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
            ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
            if("TTL".equals(errorTime)){
                errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsg1(lineName,"08:30:00","20:30:00");
            }
            else{
                String pdTime1 = errorTime.substring(0, 5);
                String pdTime2 = errorTime.substring(6,11);
//                System.out.println(pdTime1+"~"+pdTime2);
                errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsg1(lineName,pdTime1,pdTime2);
            }



            //数据存入集合
            for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                ArrayList<String> errorMsg1List = new ArrayList<String>();
                errorMsg1List.add(autofloorMachineerror.getP3());
                errorMsg1List.add(autofloorMachineerror.getP4());


                arrayLists.add(errorMsg1List);

            }

        }
        //夜晚
        else{
            if(Integer.parseInt(oracleTime1) >= 20){

                ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsgY11(lineName,"20:30:00","08:30:00");
                }
                else{
                    String pdTime1 = errorTime.substring(0, 5);
                    String pdTime2 = errorTime.substring(6,11);

                    if("23:30:00".equals(pdTime1)){
                        errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsgY11(lineName,pdTime1,pdTime2);

                    }
                    else{
                        errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsg1(lineName,pdTime1,pdTime2);
                    }
                }

                //数据存入集合
                for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();
                    errorMsg1List.add(autofloorMachineerror.getP3());
                    errorMsg1List.add(autofloorMachineerror.getP4());


                    arrayLists.add(errorMsg1List);

                }
            }else{
                ArrayList<AutofloorMachineerror> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsgY12(lineName,"20:30:00","08:30:00");
                }
                else{
                    String pdTime1 = errorTime.substring(0, 5);
                    String pdTime2 = errorTime.substring(6,11);

                    if("23:30:00".equals(pdTime1)){
                        errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsgY12(lineName,pdTime1,pdTime2);

                    }
                    else{
                        errorMsg1 = autofloorMachineerrorService.getPd2ErrorMsg1(lineName,pdTime1,pdTime2);
                    }
                }
                //数据存入集合
                for (AutofloorMachineerror autofloorMachineerror : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();
                    errorMsg1List.add(autofloorMachineerror.getP3());
                    errorMsg1List.add(autofloorMachineerror.getP4());


                    arrayLists.add(errorMsg1List);

                }
            }
        }

//        System.out.println(arrayLists);
        return arrayLists;


    }




    @RequestMapping("test")
    @ResponseBody
    public String getTest(){
        AutofloorSmtGrt d061FARF01 = autofloorSmtGrtService.getOffNormal1("D061FARF01");
//        System.out.println(d061FARF01);
//        System.out.println(d061FARF01.getUph()+":"+d061FARF01.getReCheckNg());
        return "ss";
    }


}
