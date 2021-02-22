package com.packing.agv.controller;

import com.packing.agv.entity.AgvException;
import com.packing.agv.service.AgvExceptionService;
import com.packing.agv.service.AgvExvhangeCostCountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @Description:
 * @create 2021-02-16 14:20
 */

@Controller
public class AgvController {
    @Autowired
    private AgvExvhangeCostCountService agvExvhangeCostCountService;
    @Autowired
    private AgvExceptionService agvExceptionService;

    //获取agv数据方法
    public  ArrayList<Integer> getAgvData(String loader) throws ParseException {
        ArrayList<Integer> ldrtoagvList = new ArrayList<>();
        //获取当前系统时间
        String oracleTime = agvExvhangeCostCountService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
            int ldrtoagv08;
            int ldrtoagv09;
            int ldrtoagv10;
            int ldrtoagv11;
            int ldrtoagv12;
            int ldrtoagv13;
            int ldrtoagv14;
            int ldrtoagv15;
            int ldrtoagv16;
            int ldrtoagv17;
            int ldrtoagv18;
            int ldrtoagv19;

            if(agvExvhangeCostCountService.getLdrtoagv08(loader)==null){
                ldrtoagv08 = 0;
            }
            else {
                ldrtoagv08 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv08(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv09(loader)==null){
                ldrtoagv09 = 0;
            }
            else {
                ldrtoagv09 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv09(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv10(loader)==null){
                ldrtoagv10 = 0;
            }
            else {
                ldrtoagv10 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv10(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv11(loader)==null){
                ldrtoagv11 = 0;
            }
            else {
                ldrtoagv11 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv11(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv12(loader)==null){
                ldrtoagv12 = 0;
            }
            else {
                ldrtoagv12 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv12(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv13(loader)==null){
                ldrtoagv13 = 0;
            }
            else {
                ldrtoagv13 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv13(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv14(loader)==null){
                ldrtoagv14 = 0;
            }
            else {
                ldrtoagv14 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv14(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv15(loader)==null){
                ldrtoagv15 = 0;
            }
            else {
                ldrtoagv15 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv15(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv16(loader)==null){
                ldrtoagv16 = 0;
            }
            else {
                ldrtoagv16 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv16(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv17(loader)==null){
                ldrtoagv17 = 0;
            }
            else {
                ldrtoagv17 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv17(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv18(loader)==null){
                ldrtoagv18 = 0;
            }
            else {
                ldrtoagv18 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv18(loader))*250;
            }

            if(agvExvhangeCostCountService.getLdrtoagv19(loader)==null){
                ldrtoagv19 = 0;
            }
            else {
                ldrtoagv19 = Integer.parseInt(agvExvhangeCostCountService.getLdrtoagv19(loader))*250;
            }


            int ldrtoagvAll = ldrtoagv08  + ldrtoagv09 + ldrtoagv10 +ldrtoagv11
                    + ldrtoagv12 +ldrtoagv13 +ldrtoagv14 +ldrtoagv15 +ldrtoagv16 + ldrtoagv17
                    + ldrtoagv18 + ldrtoagv19;
            ldrtoagvList.add(ldrtoagvAll);
            ldrtoagvList.add(ldrtoagv08);
            ldrtoagvList.add(ldrtoagv09);
            ldrtoagvList.add(ldrtoagv10);
            ldrtoagvList.add(ldrtoagv11);
            ldrtoagvList.add(ldrtoagv12);
            ldrtoagvList.add(ldrtoagv13);
            ldrtoagvList.add(ldrtoagv14);
            ldrtoagvList.add(ldrtoagv15);
            ldrtoagvList.add(ldrtoagv16);
            ldrtoagvList.add(ldrtoagv17);
            ldrtoagvList.add(ldrtoagv18);
            ldrtoagvList.add(ldrtoagv19);

        }
        //夜天
        else{
            int wanLdrtoagv1 = 0;
            int wanLdrtoagv2 = 0;
            int wanLdrtoagv3 = 0;
            int wanLdrtoagv4 = 0;
            int wanLdrtoagv5 = 0;
            int wanLdrtoagv6 = 0;
            int wanLdrtoagv7 = 0;
            int wanLdrtoagv8 = 0;
            int wanLdrtoagv9 = 0;
            int wanLdrtoagv10 = 0;
            int wanLdrtoagv11 = 0;
            int wanLdrtoagv12 = 0;





            if(agvExvhangeCostCountService.getWanLdrtoagv1(loader)!=null){
                wanLdrtoagv1 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv1(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv2(loader)!=null){
                wanLdrtoagv2 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv2(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv3(loader)!=null){
                wanLdrtoagv3 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv3(loader))*250;
            }

            if(Integer.parseInt(oracleTime1) >= 20){
                if(agvExvhangeCostCountService.getWanLdrtoagv4(loader)!=null){
                    wanLdrtoagv4 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv4(loader))*250;
                }
            }else{
                if(agvExvhangeCostCountService.getWanLdrtoagv42(loader)!=null){
                    wanLdrtoagv4 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv42(loader))*250;
                }
            }


            if(agvExvhangeCostCountService.getWanLdrtoagv5(loader)!=null){
                wanLdrtoagv5 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv5(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv6(loader)!=null){
                wanLdrtoagv6 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv6(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv7(loader)!=null){
                wanLdrtoagv7 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv7(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv8(loader)!=null){
                wanLdrtoagv8 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv8(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv9(loader)!=null){
                wanLdrtoagv9 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv9(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv10(loader)!=null){
                wanLdrtoagv10 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv10(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv11(loader)!=null){
                wanLdrtoagv11 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv11(loader))*250;
            }
            if(agvExvhangeCostCountService.getWanLdrtoagv12(loader)!=null){
                wanLdrtoagv12 = Integer.parseInt(agvExvhangeCostCountService.getWanLdrtoagv12(loader))*250;
            }



            int wanLdrtoagvAll = wanLdrtoagv1 + wanLdrtoagv2 + wanLdrtoagv3 + wanLdrtoagv4 +wanLdrtoagv5
                    + wanLdrtoagv6 +wanLdrtoagv7 +wanLdrtoagv8 +wanLdrtoagv9+wanLdrtoagv10 + wanLdrtoagv11
                    + wanLdrtoagv12;
            ldrtoagvList.add(wanLdrtoagvAll);
            ldrtoagvList.add(wanLdrtoagv1);
            ldrtoagvList.add(wanLdrtoagv2);
            ldrtoagvList.add(wanLdrtoagv3);
            ldrtoagvList.add(wanLdrtoagv4);
            ldrtoagvList.add(wanLdrtoagv5);
            ldrtoagvList.add(wanLdrtoagv6);
            ldrtoagvList.add(wanLdrtoagv7);
            ldrtoagvList.add(wanLdrtoagv8);
            ldrtoagvList.add(wanLdrtoagv9);
            ldrtoagvList.add(wanLdrtoagv10);
            ldrtoagvList.add(wanLdrtoagv11);
            ldrtoagvList.add(wanLdrtoagv12);
        }




        return ldrtoagvList;
    }


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

    @RequestMapping("getAgvPage")
    public String getAgvPage(){
        return "packingAGV";
    }



    //获取agv数据
    @RequestMapping("getLdrtoagv")
    @ResponseBody
    public ArrayList<ArrayList<Integer>> getLdrtoagv(String loader) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-mm-dd");
        String date = dateFormat2.format(new Date());

        int timeNum = 0;
        String oracleTime = agvExvhangeCostCountService.getTime();
        String dateString = date + oracleTime;

        String oracleTime1 = oracleTime.substring(0, 2);
        String oracleTimeSub1 = oracleTime.substring(3, 5);
        String timeDemo = "00:30:00";
        if(oracleTime1.equals("00")){
            if(Integer.parseInt(oracleTimeSub1) < 30){
                String oracleTime2 = oracleTime.substring(2);
                oracleTime = "24" + oracleTime2;
                timeDemo = "24:30:00";
            }

        }




        //计划产能数据
        ArrayList<Integer> jiHuaCNList = new ArrayList<>();


        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("09:30:00").getTime();
        Long time3 = dateFormat.parse("10:30:00").getTime();
        Long time4 = dateFormat.parse("11:30:00").getTime();
        Long time5 = dateFormat.parse("12:30:00").getTime();
        Long time6 = dateFormat.parse("13:30:00").getTime();
        Long time7 = dateFormat.parse("14:30:00").getTime();
        Long time8 = dateFormat.parse("15:30:00").getTime();
        Long time9 = dateFormat.parse("16:30:00").getTime();
        Long time10 = dateFormat.parse("17:30:00").getTime();
        Long time11 = dateFormat.parse("18:30:00").getTime();
        Long time12 = dateFormat.parse("19:30:00").getTime();
        Long time13 = dateFormat.parse("20:30:00").getTime();
        Long time14 = dateFormat.parse("21:30:00").getTime();
        Long time15 = dateFormat.parse("22:30:00").getTime();
        Long time16 = dateFormat.parse("23:30:00").getTime();
        Long time17 = dateFormat.parse(timeDemo).getTime();
        Long time18 = dateFormat.parse("01:30:00").getTime();
        Long time19 = dateFormat.parse("02:30:00").getTime();
        Long time20 = dateFormat.parse("03:30:00").getTime();
        Long time21 = dateFormat.parse("04:30:00").getTime();
        Long time22 = dateFormat.parse("05:30:00").getTime();
        Long time23 = dateFormat.parse("06:30:00").getTime();
        Long time24 = dateFormat.parse("07:30:00").getTime();


        //纖體1 實際產能數據
        ArrayList<Integer> ldrtoagvList = getAgvData(loader);
//        //纖體2 實際產能數據
//        ArrayList<Integer> ldrtoagvList2 = getAgvData("d301");


        //機故
        //超時
        int ChaoShiTime1 = 0;
        int ChaoShiTime2 = 0;
        int ChaoShiTime3 = 0;
        int ChaoShiTime4 = 0;
        int ChaoShiTime5 = 0;
        int ChaoShiTime6 = 0;
        int ChaoShiTime7 = 0;
        int ChaoShiTime8 = 0;
        int ChaoShiTime9 = 0;
        int ChaoShiTime10 = 0;
        int ChaoShiTime11 = 0;
        int ChaoShiTime12 = 0;
        int ChaoShiTimeAll = 0;

        //脫軌
        int TuoGuiTime1 = 0;
        int TuoGuiTime2 = 0;
        int TuoGuiTime3 = 0;
        int TuoGuiTime4 = 0;
        int TuoGuiTime5 = 0;
        int TuoGuiTime6 = 0;
        int TuoGuiTime7 = 0;
        int TuoGuiTime8 = 0;
        int TuoGuiTime9 = 0;
        int TuoGuiTime10 = 0;
        int TuoGuiTime11 = 0;
        int TuoGuiTime12 = 0;
        int TuoGuiTimeAll = 0;

        //碰撞
        int PengZhuangTime1 = 0;
        int PengZhuangTime2 = 0;
        int PengZhuangTime3 = 0;
        int PengZhuangTime4 = 0;
        int PengZhuangTime5 = 0;
        int PengZhuangTime6 = 0;
        int PengZhuangTime7 = 0;
        int PengZhuangTime8 = 0;
        int PengZhuangTime9 = 0;
        int PengZhuangTime10 = 0;
        int PengZhuangTime11 = 0;
        int PengZhuangTime12 = 0;
        int PengZhuangTimeAll = 0;

        //阻擋
        int ZuDangTime1 = 0;
        int ZuDangTime2 = 0;
        int ZuDangTime3 = 0;
        int ZuDangTime4 = 0;
        int ZuDangTime5 = 0;
        int ZuDangTime6 = 0;
        int ZuDangTime7 = 0;
        int ZuDangTime8 = 0;
        int ZuDangTime9 = 0;
        int ZuDangTime10 = 0;
        int ZuDangTime11 = 0;
        int ZuDangTime12 = 0;
        int ZuDangTimeAll = 0;

        //急停

        int JiTingTime1 = 0;
        int JiTingTime2 = 0;
        int JiTingTime3 = 0;
        int JiTingTime4 = 0;
        int JiTingTime5 = 0;
        int JiTingTime6 = 0;
        int JiTingTime7 = 0;
        int JiTingTime8 = 0;
        int JiTingTime9 = 0;
        int JiTingTime10 = 0;
        int JiTingTime11 = 0;
        int JiTingTime12 = 0;
        int JiTingTimeAll = 0;

//        //機故時長
//        int JiGuTime1 = 0;
//        int JiGuTime2 = 0;
//        int JiGuTime3 = 0;
//        int JiGuTime4 = 0;
//        int JiGuTime5 = 0;
//        int JiGuTime6 = 0;
//        int JiGuTime7 = 0;
//        int JiGuTime8 = 0;
//        int JiGuTime9 = 0;
//        int JiGuTime10 = 0;
//        int JiGuTime11 = 0;
//        int JiGuTime12 = 0;
//        int JiGuTimeAll = 0;



        int timeSlot1 = 0;//机故故障时间
        int timeSlot2 = 0;//机故故障时间
        int timeSlot3 = 0;//机故故障时间
        int timeSlot4 = 0;//机故故障时间
        int timeSlot5 = 0;//机故故障时间
        int timeSlot6 = 0;//机故故障时间
        int timeSlot7 = 0;//机故故障时间
        int timeSlot8 = 0;//机故故障时间
        int timeSlot9 = 0;//机故故障时间
        int timeSlot10 = 0;//机故故障时间
        int timeSlot11 = 0;//机故故障时间
        int timeSlot12 = 0;//机故故障时间
        int timeSlotAll = 0;//机故故障时间
        ArrayList<Integer> timeJiGeList = new ArrayList<>();

        //機故數據
        List<AgvException> chance = new ArrayList<>();
//        List<AgvException> chance = agvExceptionService.getChance();

        ArrayList<Integer> isDayTime = new ArrayList<>();
        isDayTime.add(0, 1);
        //白天
        if(time >= time1 && time <= time13){
            String timeJiGe1 = agvExvhangeCostCountService.getTimeJiGe1();
            long timeJiGe = getTimeJiGe(timeJiGe1);
            timeJiGeList.add((int)timeJiGe);

            chance = agvExceptionService.getChance();
            if(time >= time1 && time <= time2){
                timeNum = 1;
            }
            if(time >= time2 && time <= time3){
                timeNum = 2;
            }
            if(time >= time3 && time <= time4){
                timeNum = 3;
            }
            if(time >= time4 && time <= time5){
                timeNum = 4;
            }
            if(time >= time5 && time <= time6){
                timeNum = 5;
            }
            if(time >= time6 && time <= time7){
                timeNum = 6;
            }
            if(time >= time7 && time <= time8){
                timeNum = 7;
            }
            if(time >= time8 && time <= time9){
                timeNum = 8;
            }
            if(time >= time9 && time <= time10){
                timeNum = 9;
            }
            if(time >= time10 && time <= time11){
                timeNum = 10;
            }
            if(time >= time11 && time <= time12){
                timeNum = 11;
            }
            if(time >= time12 && time <= time13){
                timeNum = 12;
            }

            for(int i = 0; i < 13; i++){
                jiHuaCNList.add(0);
            }
            for(int i = 0; i < timeNum; i++){
                jiHuaCNList.set(i+1, 370);
            }
            //求list中的数据和
            int jiHuaCNAll = jiHuaCNList.stream().mapToInt(x -> x).sum();
            jiHuaCNList.set(0,jiHuaCNAll);


            //白天機故數據
            for (AgvException agvException : chance) {
                if ("8:30~9:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot1 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime1++;
                            break;
                        case "TuoGui":
                            TuoGuiTime1++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime1++;
                            break;
                        case "ZuDang":
                            ZuDangTime1++;
                            break;
                        case "JiTing":
                            JiTingTime1++;
                            break;
                        default:
                            break;
                    }
                }
                if ("9:30~10:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot2 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime2++;
                            break;
                        case "TuoGui":
                            TuoGuiTime2++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime2++;
                            break;
                        case "ZuDang":
                            ZuDangTime2++;
                            break;
                        case "JiTing":
                            JiTingTime2++;
                            break;
                        default:
                            break;
                    }
                }
                if ("10:30~11:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot3 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime3++;
                            break;
                        case "TuoGui":
                            TuoGuiTime3++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime3++;
                            break;
                        case "ZuDang":
                            ZuDangTime3++;
                            break;
                        case "JiTing":
                            JiTingTime3++;
                            break;
                        default:
                            break;
                    }
                }
                if ("11:30~12:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot4 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime4++;
                            break;
                        case "TuoGui":
                            TuoGuiTime4++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime4++;
                            break;
                        case "ZuDang":
                            ZuDangTime4++;
                            break;
                        case "JiTing":
                            JiTingTime4++;
                            break;
                        default:
                            break;
                    }
                }
                if ("12:30~13:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot5 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime5++;
                            break;
                        case "TuoGui":
                            TuoGuiTime5++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime5++;
                            break;
                        case "ZuDang":
                            ZuDangTime5++;
                            break;
                        case "JiTing":
                            JiTingTime5++;
                            break;
                        default:
                            break;
                    }
                }
                if ("13:30~14:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot6 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime6++;
                            break;
                        case "TuoGui":
                            TuoGuiTime6++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime6++;
                            break;
                        case "ZuDang":
                            ZuDangTime6++;
                            break;
                        case "JiTing":
                            JiTingTime6++;
                            break;
                        default:
                            break;
                    }
                }
                if ("14:30~15:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot7 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime7++;
                            break;
                        case "TuoGui":
                            TuoGuiTime7++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime7++;
                            break;
                        case "ZuDang":
                            ZuDangTime7++;
                            break;
                        case "JiTing":
                            JiTingTime7++;
                            break;
                        default:
                            break;
                    }
                }
                if ("15:30~16:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot8 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime8++;
                            break;
                        case "TuoGui":
                            TuoGuiTime8++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime8++;
                            break;
                        case "ZuDang":
                            ZuDangTime8++;
                            break;
                        case "JiTing":
                            JiTingTime8++;
                            break;
                        default:
                            break;
                    }
                }
                if ("16:30~17:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot9 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime9++;
                            break;
                        case "TuoGui":
                            TuoGuiTime9++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime9++;
                            break;
                        case "ZuDang":
                            ZuDangTime9++;
                            break;
                        case "JiTing":
                            JiTingTime9++;
                            break;
                        default:
                            break;
                    }
                }
                if ("17:30~18:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot10 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime10++;
                            break;
                        case "TuoGui":
                            TuoGuiTime10++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime10++;
                            break;
                        case "ZuDang":
                            ZuDangTime10++;
                            break;
                        case "JiTing":
                            JiTingTime10++;
                            break;
                        default:
                            break;
                    }
                }
                if ("18:30~19:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot11 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime11++;
                            break;
                        case "TuoGui":
                            TuoGuiTime11++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime11++;
                            break;
                        case "ZuDang":
                            ZuDangTime11++;
                            break;
                        case "JiTing":
                            JiTingTime11++;
                            break;
                        default:
                            break;
                    }
                }
                if ("19:30~20:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot12 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()){
                        case "ChaoShi":
                            ChaoShiTime12++;
                            break;
                        case "TuoGui":
                            TuoGuiTime12++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime12++;
                            break;
                        case "ZuDang":
                            ZuDangTime12++;
                            break;
                        case "JiTing":
                            JiTingTime12++;
                            break;
                        default:
                            break;
                    }
                }
            }

            timeSlotAll = timeSlot1+timeSlot2+timeSlot3+
                    timeSlot4+timeSlot5+timeSlot6+
                    timeSlot7+timeSlot8+timeSlot9+
                    timeSlot10+timeSlot11+timeSlot12;
        }

        //夜晚
        else{



            if(Integer.parseInt(oracleTime1) <= 20){
                chance = agvExceptionService.getChance2();
                String timeJiGe1 = agvExvhangeCostCountService.getTimeJiGe2();
                String timeJiGe2 = agvExvhangeCostCountService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe2);
                timeJiGeList.add((int)timeJiGe);
            }
            else{
                chance = agvExceptionService.getChance3();
                String timeJiGe1 = agvExvhangeCostCountService.getTimeJiGe1();
                long timeJiGe = getTimeJiGe2(timeJiGe1,timeJiGe1);
                timeJiGeList.add((int)timeJiGe);
            }


            isDayTime.set(0, 0);
            if(time >= time13 && time <= time14){
                timeNum = 1;
            }
            if(time >= time14 && time <= time15){
                timeNum = 2;
            }
            if(time >= time15 && time <= time16){
                timeNum = 3;
            }
            if(time >= time16 && time <= time17){
                timeNum = 4;
            }

            if(time >= time17 && time <= time18){
                timeNum = 5;
            }

            if(time >= time18 && time <= time19){
                timeNum = 6;
            }
            if(time >= time19 && time <= time20){
                timeNum = 7;
            }
            if(time >= time20 && time <= time21){
                timeNum = 8;
            }
            if(time >= time21 && time <= time22){
                timeNum = 9;
            }
            if(time >= time22 && time <= time23){
                timeNum = 10;
            }
            if(time >= time23 && time <= time24){
                timeNum = 11;
            }
            if(time >= time24 && time <= time1){
                timeNum = 12;
            }

            for(int i = 0; i < 13; i++){
                jiHuaCNList.add(0);
            }
            for(int i = 0; i < timeNum; i++){
                jiHuaCNList.set(i+1, 370);
            }
            //求list中的数据和
            int jiHuaCNAll = jiHuaCNList.stream().mapToInt(x -> x).sum();
            jiHuaCNList.set(0,jiHuaCNAll);

            //夜晚機故數據
            for (AgvException agvException : chance) {
                if ("20:30~21:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot1 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime1++;
                            break;
                        case "TuoGui":
                            TuoGuiTime1++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime1++;
                            break;
                        case "ZuDang":
                            ZuDangTime1++;
                            break;
                        case "JiTing":
                            JiTingTime1++;
                            break;
                        default:
                            break;
                    }
                }
                if ("21:30~22:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot2 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime2++;
                            break;
                        case "TuoGui":
                            TuoGuiTime2++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime2++;
                            break;
                        case "ZuDang":
                            ZuDangTime2++;
                            break;
                        case "JiTing":
                            JiTingTime2++;
                            break;
                        default:
                            break;
                    }
                }
                if ("22:30~23:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot3 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime3++;
                            break;
                        case "TuoGui":
                            TuoGuiTime3++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime3++;
                            break;
                        case "ZuDang":
                            ZuDangTime3++;
                            break;
                        case "JiTing":
                            JiTingTime3++;
                            break;
                        default:
                            break;
                    }
                }
                if ("23:30~0:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot4 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime4++;
                            break;
                        case "TuoGui":
                            TuoGuiTime4++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime4++;
                            break;
                        case "ZuDang":
                            ZuDangTime4++;
                            break;
                        case "JiTing":
                            JiTingTime4++;
                            break;
                        default:
                            break;
                    }
                }
                if ("0:30~1:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot5 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime5++;
                            break;
                        case "TuoGui":
                            TuoGuiTime5++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime5++;
                            break;
                        case "ZuDang":
                            ZuDangTime5++;
                            break;
                        case "JiTing":
                            JiTingTime5++;
                            break;
                        default:
                            break;
                    }
                }
                if ("1:30~2:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot6 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime6++;
                            break;
                        case "TuoGui":
                            TuoGuiTime6++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime6++;
                            break;
                        case "ZuDang":
                            ZuDangTime6++;
                            break;
                        case "JiTing":
                            JiTingTime6++;
                            break;
                        default:
                            break;
                    }
                }
                if ("2:30~3:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot7 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime7++;
                            break;
                        case "TuoGui":
                            TuoGuiTime7++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime7++;
                            break;
                        case "ZuDang":
                            ZuDangTime7++;
                            break;
                        case "JiTing":
                            JiTingTime7++;
                            break;
                        default:
                            break;
                    }
                }
                if ("3:30~4:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot8 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime8++;
                            break;
                        case "TuoGui":
                            TuoGuiTime8++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime8++;
                            break;
                        case "ZuDang":
                            ZuDangTime8++;
                            break;
                        case "JiTing":
                            JiTingTime8++;
                            break;
                        default:
                            break;
                    }
                }
                if ("4:30~5:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot9 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime9++;
                            break;
                        case "TuoGui":
                            TuoGuiTime9++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime9++;
                            break;
                        case "ZuDang":
                            ZuDangTime9++;
                            break;
                        case "JiTing":
                            JiTingTime9++;
                            break;
                        default:
                            break;
                    }
                }
                if ("5:30~6:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot10 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime10++;
                            break;
                        case "TuoGui":
                            TuoGuiTime10++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime10++;
                            break;
                        case "ZuDang":
                            ZuDangTime10++;
                            break;
                        case "JiTing":
                            JiTingTime10++;
                            break;
                        default:
                            break;
                    }
                }
                if ("6:30~7:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot11 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime11++;
                            break;
                        case "TuoGui":
                            TuoGuiTime11++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime11++;
                            break;
                        case "ZuDang":
                            ZuDangTime11++;
                            break;
                        case "JiTing":
                            JiTingTime11++;
                            break;
                        default:
                            break;
                    }
                }
                if ("7:30~8:30".equals(agvException.getTimeSlot())) {
                    if(agvException.getCost() != null){
                        timeSlot12 += Integer.parseInt(agvException.getCost());
                    }
                    //机故个数统计
                    switch (agvException.getError()) {
                        case "ChaoShi":
                            ChaoShiTime12++;
                            break;
                        case "TuoGui":
                            TuoGuiTime12++;
                            break;
                        case "PengZhuang":
                            PengZhuangTime12++;
                            break;
                        case "ZuDang":
                            ZuDangTime12++;
                            break;
                        case "JiTing":
                            JiTingTime12++;
                            break;
                        default:
                            break;
                    }

                }
            }
            timeSlotAll = timeSlot1+timeSlot2+timeSlot3+
                    timeSlot4+timeSlot5+timeSlot6+
                    timeSlot7+timeSlot8+timeSlot9+
                    timeSlot10+timeSlot11+timeSlot12;
        }


        //时间段1
        ArrayList<Integer> chanceList1 = new ArrayList<>();
        chanceList1.add(ChaoShiTime1);
        chanceList1.add(TuoGuiTime1);
        chanceList1.add(PengZhuangTime1);
        chanceList1.add(ZuDangTime1);
        chanceList1.add(JiTingTime1);
        chanceList1.add(timeSlot1);

        //时间段2
        ArrayList<Integer> chanceList2 = new ArrayList<>();
        chanceList2.add(ChaoShiTime2);
        chanceList2.add(TuoGuiTime2);
        chanceList2.add(PengZhuangTime2);
        chanceList2.add(ZuDangTime2);
        chanceList2.add(JiTingTime2);
        chanceList2.add(timeSlot2);

        //时间段3
        ArrayList<Integer> chanceList3 = new ArrayList<>();
        chanceList3.add(ChaoShiTime3);
        chanceList3.add(TuoGuiTime3);
        chanceList3.add(PengZhuangTime3);
        chanceList3.add(ZuDangTime3);
        chanceList3.add(JiTingTime3);
        chanceList3.add(timeSlot3);

        //时间段4
        ArrayList<Integer> chanceList4 = new ArrayList<>();
        chanceList4.add(ChaoShiTime4);
        chanceList4.add(TuoGuiTime4);
        chanceList4.add(PengZhuangTime4);
        chanceList4.add(ZuDangTime4);
        chanceList4.add(JiTingTime4);
        chanceList4.add(timeSlot4);

        //时间段5
        ArrayList<Integer> chanceList5 = new ArrayList<>();
        chanceList5.add(ChaoShiTime5);
        chanceList5.add(TuoGuiTime5);
        chanceList5.add(PengZhuangTime5);
        chanceList5.add(ZuDangTime5);
        chanceList5.add(JiTingTime5);
        chanceList5.add(timeSlot5);

        //时间段6
        ArrayList<Integer> chanceList6 = new ArrayList<>();
        chanceList6.add(ChaoShiTime6);
        chanceList6.add(TuoGuiTime6);
        chanceList6.add(PengZhuangTime6);
        chanceList6.add(ZuDangTime6);
        chanceList6.add(JiTingTime6);
        chanceList6.add(timeSlot6);

        //时间段7
        ArrayList<Integer> chanceList7 = new ArrayList<>();
        chanceList7.add(ChaoShiTime7);
        chanceList7.add(TuoGuiTime7);
        chanceList7.add(PengZhuangTime7);
        chanceList7.add(ZuDangTime7);
        chanceList7.add(JiTingTime7);
        chanceList7.add(timeSlot7);

        //时间段8
        ArrayList<Integer> chanceList8 = new ArrayList<>();
        chanceList8.add(ChaoShiTime8);
        chanceList8.add(TuoGuiTime8);
        chanceList8.add(PengZhuangTime8);
        chanceList8.add(ZuDangTime8);
        chanceList8.add(JiTingTime8);
        chanceList8.add(timeSlot8);

        //时间段9
        ArrayList<Integer> chanceList9 = new ArrayList<>();
        chanceList9.add(ChaoShiTime9);
        chanceList9.add(TuoGuiTime9);
        chanceList9.add(PengZhuangTime9);
        chanceList9.add(ZuDangTime9);
        chanceList9.add(JiTingTime9);
        chanceList9.add(timeSlot9);

        //时间段10
        ArrayList<Integer> chanceList10 = new ArrayList<>();
        chanceList10.add(ChaoShiTime10);
        chanceList10.add(TuoGuiTime10);
        chanceList10.add(PengZhuangTime10);
        chanceList10.add(ZuDangTime10);
        chanceList10.add(JiTingTime10);
        chanceList10.add(timeSlot10);

        //时间段11
        ArrayList<Integer> chanceList11 = new ArrayList<>();
        chanceList11.add(ChaoShiTime11);
        chanceList11.add(TuoGuiTime11);
        chanceList11.add(PengZhuangTime11);
        chanceList11.add(ZuDangTime11);
        chanceList11.add(JiTingTime11);
        chanceList11.add(timeSlot11);

        //时间段12
        ArrayList<Integer> chanceList12 = new ArrayList<>();
        chanceList12.add(ChaoShiTime12);
        chanceList12.add(TuoGuiTime12);
        chanceList12.add(PengZhuangTime12);
        chanceList12.add(ZuDangTime12);
        chanceList12.add(JiTingTime12);
        chanceList12.add(timeSlot12);



        //机故All
        ChaoShiTimeAll = ChaoShiTime1 + ChaoShiTime2 + ChaoShiTime3 + ChaoShiTime4 +ChaoShiTime5+ChaoShiTime6+ChaoShiTime7+ChaoShiTime8+ChaoShiTime9+ChaoShiTime10+ChaoShiTime11+ChaoShiTime12;
        TuoGuiTimeAll = TuoGuiTime1+TuoGuiTime2+TuoGuiTime3+TuoGuiTime4+TuoGuiTime5+TuoGuiTime6+TuoGuiTime7+TuoGuiTime8+TuoGuiTime9+TuoGuiTime10+TuoGuiTime11+TuoGuiTime12;
        PengZhuangTimeAll = PengZhuangTime1+PengZhuangTime2+PengZhuangTime3+PengZhuangTime4+PengZhuangTime5+PengZhuangTime6+PengZhuangTime7+PengZhuangTime8+PengZhuangTime9+PengZhuangTime10+PengZhuangTime11
            +PengZhuangTime12;
        ZuDangTimeAll = ZuDangTime1+ZuDangTime2+ZuDangTime3+ZuDangTime4+ZuDangTime5+ZuDangTime6+ZuDangTime7+ZuDangTime8+ZuDangTime9+ZuDangTime10+ZuDangTime11+ZuDangTime12;
        JiTingTimeAll = JiTingTime1+JiTingTime2+JiTingTime3+JiTingTime4+JiTingTime5+JiTingTime6+JiTingTime7+JiTingTime8+JiTingTime9+JiTingTime10+JiTingTime11+JiTingTime12;

        //TTL 机故
        ArrayList<Integer> chanceListAll = new ArrayList<>();
        chanceListAll.add(ChaoShiTimeAll);
        chanceListAll.add(TuoGuiTimeAll);
        chanceListAll.add(PengZhuangTimeAll);
        chanceListAll.add(ZuDangTimeAll);
        chanceListAll.add(JiTingTimeAll);
        chanceListAll.add(timeSlotAll);

        int timeData1 = timeSlot1;
        int timeData2 = timeSlot2;
        int timeData3 = timeSlot3;
        int timeData4 = timeSlot4;
        int timeData5 = timeSlot5;
        int timeData6 = timeSlot6;
        int timeData7 = timeSlot7;
        int timeData8 = timeSlot8;
        int timeData9 = timeSlot9;
        int timeData10 = timeSlot10;
        int timeData11 = timeSlot11;
        int timeData12 = timeSlot12;
        int timeDataAll = timeSlotAll;

        //机故率中的数据
        ArrayList<Integer> timeDataList = new ArrayList<>();
        timeDataList.add(timeDataAll);
        timeDataList.add(timeData1);
        timeDataList.add(timeData2);
        timeDataList.add(timeData3);
        timeDataList.add(timeData4);
        timeDataList.add(timeData5);
        timeDataList.add(timeData6);
        timeDataList.add(timeData7);
        timeDataList.add(timeData8);
        timeDataList.add(timeData9);
        timeDataList.add(timeData10);
        timeDataList.add(timeData11);
        timeDataList.add(timeData12);
        //返回页面的总数据
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        //计划的产能
        arrayLists.add(jiHuaCNList);

        //线体1
        arrayLists.add(ldrtoagvList);

//        //线体2
//        arrayLists.add(ldrtoagvList2);

        //機故數據
        arrayLists.add(chanceListAll);
        arrayLists.add(chanceList1);
        arrayLists.add(chanceList2);
        arrayLists.add(chanceList3);
        arrayLists.add(chanceList4);
        arrayLists.add(chanceList5);
        arrayLists.add(chanceList6);
        arrayLists.add(chanceList7);
        arrayLists.add(chanceList8);
        arrayLists.add(chanceList9);
        arrayLists.add(chanceList10);
        arrayLists.add(chanceList11);
        arrayLists.add(chanceList12);

        //機故率
        arrayLists.add(timeDataList);

        //用于页面判断是白天or夜晚的数据
        arrayLists.add(isDayTime);
        arrayLists.add(timeJiGeList);



//        //返回页面数据
//        model.addAttribute("arrayLists", arrayLists);

        return arrayLists;
    }




    //获取前七天数据
    @RequestMapping("getReachDataSeven")
    @ResponseBody
    public ArrayList<ArrayList<String>> getReachDataSeven() throws ParseException {

        //用于存储总数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        //存日期 List
        ArrayList<String> dateList = new ArrayList<>();

        //存线体1 List
        ArrayList<String> xianTi1 = new ArrayList<>();

        //存线体2 List
        ArrayList<String> xianTi2 = new ArrayList<>();
        //存机故 List
        ArrayList<String> jiGu = new ArrayList<>();

        //前七天日期
        ArrayList<String> sevenDate = agvExvhangeCostCountService.getSevenDate();

        for (String s : sevenDate) {
            //机故
            String cost = "";
            if(agvExceptionService.getChanceSeven(s) != null) {
                cost = agvExceptionService.getChanceSeven(s).getCost();
            }else{
                cost = "0";
            }
            if(cost != null){
                jiGu.add(String.format("%.2f",(Integer.parseInt(cost)/60.0/1440.0)*100));
            }else{
                jiGu.add("0");
            }

            //存日期
            dateList.add(s.substring(5));
            //线体1达成数据
            String d1Data = "";
            if(agvExvhangeCostCountService.getReachDataSeven("d302", s).size() > 0) {
                 d1Data = agvExvhangeCostCountService.getReachDataSeven("d302", s).get(0).getLdrtoagv();
            }else{
                 d1Data = "0";
            }
            //线体2达成数据
            String d2Data = "";
            if(agvExvhangeCostCountService.getReachDataSeven("d301", s).size() > 0) {
                 d2Data = agvExvhangeCostCountService.getReachDataSeven("d301", s).get(0).getLdrtoagv();
            }else{
                d2Data = "0";
            }

            if(d1Data != null){
                xianTi1.add(String.format("%.2f",(Integer.parseInt(d1Data)*250/4440.0)*100));
            }else{
                xianTi1.add("0");
            }

            if(d2Data != null){
                xianTi2.add(String.format("%.2f",(Integer.parseInt(d2Data)*250/4440.0)*100));
            }else{
                xianTi2.add("0");
            }
        }

        arrayLists.add(dateList);
        arrayLists.add(xianTi1);
        arrayLists.add(xianTi2);
        arrayLists.add(jiGu);


        return arrayLists;
    }



    //error信息
    @RequestMapping("getErrorMsg")
    @ResponseBody
    public ArrayList<ArrayList<String>> getErrorMsg(String errorTime) throws ParseException {

        //最终返回的数据
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();


        ArrayList<Integer> ldrtoagvList = new ArrayList<>();
        //获取当前系统时间
        String oracleTime = agvExvhangeCostCountService.getTime();
        String oracleTime1 = oracleTime.substring(0, 2);
        //判断是白天or夜天
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Long time = dateFormat.parse(oracleTime).getTime();
        Long time1 = dateFormat.parse("08:30:00").getTime();
        Long time2 = dateFormat.parse("20:30:00").getTime();

        //白天
        if(time >= time1 && time <= time2){
            ArrayList<AgvException> errorMsg1 = new ArrayList<>();
            if("TTL".equals(errorTime)){
                errorMsg1 = agvExceptionService.getErrorMsgAll1();
            }
            else{
                errorMsg1 = agvExceptionService.getErrorMsg1(errorTime);
            }



            //数据存入集合
            for (AgvException agvException : errorMsg1) {
                ArrayList<String> errorMsg1List = new ArrayList<String>();

                switch (agvException.getError()) {
                    case "ChaoShi":
                        errorMsg1List.add("超时");
                        break;
                    case "TuoGui":
                        errorMsg1List.add("脱轨");
                        break;
                    case "PengZhuang":
                        errorMsg1List.add("碰撞");
                        break;
                    case "ZuDang":
                        errorMsg1List.add("阻挡");
                        break;
                    case "JiTing":
                        errorMsg1List.add("急停");
                        break;
                    default:
                        errorMsg1List.add(agvException.getError());
                        break;
                }
                errorMsg1List.add(agvException.getTimeSlot());
                errorMsg1List.add(agvException.getCost());
                arrayLists.add(errorMsg1List);

            }

        }
        //夜晚
        else{
            if(Integer.parseInt(oracleTime1) >= 20){

                ArrayList<AgvException> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = agvExceptionService.getErrorMsgAll21();
                }
                else{
                    errorMsg1 = agvExceptionService.getErrorMsg21(errorTime);
                }

                //数据存入集合
                for (AgvException agvException : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();

                    errorMsg1List.add(agvException.getError());
                    errorMsg1List.add(agvException.getTimeSlot());
                    errorMsg1List.add(agvException.getCost());
                    arrayLists.add(errorMsg1List);

                }
            }else{
                ArrayList<AgvException> errorMsg1 = new ArrayList<>();
                if("TTL".equals(errorTime)){
                    errorMsg1 = agvExceptionService.getErrorMsgAll22();
                }
                else{
                    errorMsg1 = agvExceptionService.getErrorMsg22(errorTime);
                }
                //数据存入集合
                for (AgvException agvException : errorMsg1) {
                    ArrayList<String> errorMsg1List = new ArrayList<String>();

                    errorMsg1List.add(agvException.getError());
                    errorMsg1List.add(agvException.getTimeSlot());
                    errorMsg1List.add(agvException.getCost());
                    arrayLists.add(errorMsg1List);

                }
            }
        }


        return arrayLists;


    }

}
