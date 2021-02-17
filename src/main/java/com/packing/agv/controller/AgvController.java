package com.packing.agv.controller;

import com.packing.agv.entity.AgvException;
import com.packing.agv.service.AgvExceptionService;
import com.packing.agv.service.AgvExvhangeCostCountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public  ArrayList<Integer> getAgvData(String loader){
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


        ArrayList<Integer> ldrtoagvList = new ArrayList<>();
        int ldrtoagvAll = ldrtoagv08 + ldrtoagv09 + ldrtoagv09 + ldrtoagv10 +ldrtoagv11
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
        return ldrtoagvList;
    }
    @RequestMapping("getLdrtoagv")
    public String getLdrtoagv(Model model) throws ParseException {
        int timeNum = 0;
        String oracleTime = agvExvhangeCostCountService.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
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

        ArrayList<Integer> jiHuaCNList = new ArrayList<>();
        for(int i = 0; i < 13; i++){
            jiHuaCNList.add(0);
        }
        for(int i = 0; i < timeNum; i++){
            jiHuaCNList.set(i+1, 370);
        }
        int jiHuaCNAll = jiHuaCNList.stream().mapToInt(x -> x).sum();
        jiHuaCNList.set(0,jiHuaCNAll);



        ArrayList<Integer> ldrtoagvList = getAgvData("d302");
        //纖體2 實際產能數據
        ArrayList<Integer> ldrtoagvList2 = getAgvData("d301");


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

        //機故時長
        int JiGuTime1 = 0;
        int JiGuTime2 = 0;
        int JiGuTime3 = 0;
        int JiGuTime4 = 0;
        int JiGuTime5 = 0;
        int JiGuTime6 = 0;
        int JiGuTime7 = 0;
        int JiGuTime8 = 0;
        int JiGuTime9 = 0;
        int JiGuTime10 = 0;
        int JiGuTime11 = 0;
        int JiGuTime12 = 0;
        int JiGuTimeAll = 0;


        //機故數據
        List<AgvException> chance = agvExceptionService.getChance();

        for (AgvException agvException : chance) {
            if("8:30~9:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                         ChaoShiTime1 += Integer.parseInt(agvException.getCost());

                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("9:30~10:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("10:30~11:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("11:30~12:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("12:30~13:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("13:30~14:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("14:30~15:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("15:30~16:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("16:30~17:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("17:30~18:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("18:30~19:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("19:30~20:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
            }

        }
        //8.30
        ArrayList<Integer> chanceList1 = new ArrayList<>();
        chanceList1.add(ChaoShiTime1);
        chanceList1.add(TuoGuiTime1);
        chanceList1.add(PengZhuangTime1);
        chanceList1.add(ZuDangTime1);
        chanceList1.add(JiTingTime1);
        chanceList1.add(JiGuTime1);

        //9.30
        ArrayList<Integer> chanceList2 = new ArrayList<>();
        chanceList2.add(ChaoShiTime2);
        chanceList2.add(TuoGuiTime2);
        chanceList2.add(PengZhuangTime2);
        chanceList2.add(ZuDangTime2);
        chanceList2.add(JiTingTime2);
        chanceList2.add(JiGuTime2);

        //10.30
        ArrayList<Integer> chanceList3 = new ArrayList<>();
        chanceList3.add(ChaoShiTime3);
        chanceList3.add(TuoGuiTime3);
        chanceList3.add(PengZhuangTime3);
        chanceList3.add(ZuDangTime3);
        chanceList3.add(JiTingTime3);
        chanceList3.add(JiGuTime3);

        //11.30
        ArrayList<Integer> chanceList4 = new ArrayList<>();
        chanceList4.add(ChaoShiTime4);
        chanceList4.add(TuoGuiTime4);
        chanceList4.add(PengZhuangTime4);
        chanceList4.add(ZuDangTime4);
        chanceList4.add(JiTingTime4);
        chanceList4.add(JiGuTime4);

        //12.30
        ArrayList<Integer> chanceList5 = new ArrayList<>();
        chanceList5.add(ChaoShiTime5);
        chanceList5.add(TuoGuiTime5);
        chanceList5.add(PengZhuangTime5);
        chanceList5.add(ZuDangTime5);
        chanceList5.add(JiTingTime5);
        chanceList5.add(JiGuTime5);

        //13.30
        ArrayList<Integer> chanceList6 = new ArrayList<>();
        chanceList6.add(ChaoShiTime6);
        chanceList6.add(TuoGuiTime6);
        chanceList6.add(PengZhuangTime6);
        chanceList6.add(ZuDangTime6);
        chanceList6.add(JiTingTime6);
        chanceList6.add(JiGuTime6);

        //14.30
        ArrayList<Integer> chanceList7 = new ArrayList<>();
        chanceList7.add(ChaoShiTime7);
        chanceList7.add(TuoGuiTime7);
        chanceList7.add(PengZhuangTime7);
        chanceList7.add(ZuDangTime7);
        chanceList7.add(JiTingTime7);
        chanceList7.add(JiGuTime7);

        //15.30
        ArrayList<Integer> chanceList8 = new ArrayList<>();
        chanceList8.add(ChaoShiTime8);
        chanceList8.add(TuoGuiTime8);
        chanceList8.add(PengZhuangTime8);
        chanceList8.add(ZuDangTime8);
        chanceList8.add(JiTingTime8);
        chanceList8.add(JiGuTime8);

        //16.30
        ArrayList<Integer> chanceList9 = new ArrayList<>();
        chanceList9.add(ChaoShiTime9);
        chanceList9.add(TuoGuiTime9);
        chanceList9.add(PengZhuangTime9);
        chanceList9.add(ZuDangTime9);
        chanceList9.add(JiTingTime9);
        chanceList9.add(JiGuTime9);

        //17.30
        ArrayList<Integer> chanceList10 = new ArrayList<>();
        chanceList10.add(ChaoShiTime10);
        chanceList10.add(TuoGuiTime10);
        chanceList10.add(PengZhuangTime10);
        chanceList10.add(ZuDangTime10);
        chanceList10.add(JiTingTime10);
        chanceList10.add(JiGuTime10);

        //18.30
        ArrayList<Integer> chanceList11 = new ArrayList<>();
        chanceList11.add(ChaoShiTime11);
        chanceList11.add(TuoGuiTime11);
        chanceList11.add(PengZhuangTime11);
        chanceList11.add(ZuDangTime11);
        chanceList11.add(JiTingTime11);
        chanceList11.add(JiGuTime11);

        //19.30
        ArrayList<Integer> chanceList12 = new ArrayList<>();
        chanceList12.add(ChaoShiTime12);
        chanceList12.add(TuoGuiTime12);
        chanceList12.add(PengZhuangTime12);
        chanceList12.add(ZuDangTime12);
        chanceList12.add(JiTingTime12);
        chanceList12.add(JiGuTime12);



        ChaoShiTimeAll = ChaoShiTime1 + ChaoShiTime2 + ChaoShiTime3 + ChaoShiTime4 +ChaoShiTime5+ChaoShiTime6+ChaoShiTime7+ChaoShiTime8+ChaoShiTime9+ChaoShiTime10+ChaoShiTime11+ChaoShiTime12;
        TuoGuiTimeAll = TuoGuiTime1+TuoGuiTime2+TuoGuiTime3+TuoGuiTime4+TuoGuiTime5+TuoGuiTime6+TuoGuiTime7+TuoGuiTime8+TuoGuiTime9+TuoGuiTime10+TuoGuiTime11+TuoGuiTime12;
        PengZhuangTimeAll = PengZhuangTime1+PengZhuangTime2+PengZhuangTime3+PengZhuangTime4+PengZhuangTime5+PengZhuangTime6+PengZhuangTime7+PengZhuangTime8+PengZhuangTime9+PengZhuangTime10+PengZhuangTime11
            +PengZhuangTime12;
        ZuDangTimeAll = ZuDangTime1+ZuDangTime2+ZuDangTime3+ZuDangTime4+ZuDangTime5+ZuDangTime6+ZuDangTime7+ZuDangTime8+ZuDangTime9+ZuDangTime10+ZuDangTime11+ZuDangTime12;
        JiTingTimeAll = JiTingTime1+JiTingTime2+JiTingTime3+JiTingTime4+JiTingTime5+JiTingTime6+JiTingTime7+JiTingTime8+JiTingTime9+JiTingTime10+JiTingTime11+JiTingTime12;
        JiGuTimeAll = JiGuTime1+JiGuTime2+JiGuTime3+JiGuTime4+JiGuTime5+JiGuTime6+JiGuTime7+JiGuTime8+JiGuTime9+JiGuTime10+JiGuTime11+JiGuTime12;

        ArrayList<Integer> chanceListAll = new ArrayList<>();
        chanceListAll.add(ChaoShiTimeAll);
        chanceListAll.add(TuoGuiTimeAll);
        chanceListAll.add(PengZhuangTimeAll);
        chanceListAll.add(ZuDangTimeAll);
        chanceListAll.add(JiTingTimeAll);
        chanceListAll.add(JiGuTimeAll);

        int timeData1 = ChaoShiTime1+TuoGuiTime1+PengZhuangTime1+ZuDangTime1+JiTingTime1+JiGuTime1;
        int timeData2 = ChaoShiTime2+TuoGuiTime2+PengZhuangTime2+ZuDangTime2+JiTingTime2+JiGuTime2;
        int timeData3 = ChaoShiTime3+TuoGuiTime3+PengZhuangTime3+ZuDangTime3+JiTingTime3+JiGuTime3;
        int timeData4 = ChaoShiTime4+TuoGuiTime4+PengZhuangTime4+ZuDangTime4+JiTingTime4+JiGuTime4;
        int timeData5 = ChaoShiTime5+TuoGuiTime5+PengZhuangTime5+ZuDangTime5+JiTingTime5+JiGuTime5;
        int timeData6 = ChaoShiTime6+TuoGuiTime6+PengZhuangTime6+ZuDangTime6+JiTingTime6+JiGuTime6;
        int timeData7 = ChaoShiTime7+TuoGuiTime7+PengZhuangTime7+ZuDangTime7+JiTingTime7+JiGuTime7;
        int timeData8 = ChaoShiTime8+TuoGuiTime8+PengZhuangTime8+ZuDangTime8+JiTingTime8+JiGuTime8;
        int timeData9 = ChaoShiTime9+TuoGuiTime9+PengZhuangTime9+ZuDangTime9+JiTingTime9+JiGuTime9;
        int timeData10 = ChaoShiTime10+TuoGuiTime10+PengZhuangTime10+ZuDangTime10+JiTingTime10+JiGuTime10;
        int timeData11 = ChaoShiTime11+TuoGuiTime11+PengZhuangTime11+ZuDangTime11+JiTingTime11+JiGuTime11;
        int timeData12 = ChaoShiTime12+TuoGuiTime12+PengZhuangTime12+ZuDangTime12+JiTingTime12+JiGuTime12;
        int timeDataAll = ChaoShiTimeAll+TuoGuiTimeAll+PengZhuangTimeAll+ZuDangTimeAll+JiTingTimeAll+JiGuTimeAll;
//        DecimalFormat df = new DecimalFormat("#.00");
//        if(timeData1/60.0 >1){
//            double v = timeData1 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData1 = Double.valueOf(format);
//        }
//        else{
//            timeData1 = 0;
//        }
//        if(timeData2/60.0 >1){
//            double v = timeData2 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData2 = Double.valueOf(format);
//        }
//        else{
//            timeData2 = 0;
//        }
//        if(timeData3/60.0 >1){
//            double v = timeData3 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData3 = Double.valueOf(format);
//        }
//        else{
//            timeData3 = 0;
//        }
//        if(timeData4/60.0 >1){
//            double v = timeData4 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData4 = Double.valueOf(format);
//        }
//        else{
//            timeData4 = 0;
//        }
//        if(timeData5/60.0 >1){
//            double v = timeData5 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData5 = Double.valueOf(format);
//        }
//        else{
//            timeData5 = 0;
//        }
//        if(timeData6/60.0 >1){
//            double v = timeData6 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData6 = Double.valueOf(format);
//        }
//        else{
//            timeData6 = 0;
//        }
//        if(timeData7/60.0 >1){
//            double v = timeData7 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData7 = Double.valueOf(format);
//        }
//        else{
//            timeData7 = 0;
//        }
//        if(timeData8/60.0 >1){
//            double v = timeData8 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData8 = Double.valueOf(format);
//        }
//        else{
//            timeData8 = 0;
//        }
//        if(timeData9/60.0 >1){
//            double v = timeData9 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData9 = Double.valueOf(format);
//        }
//        else{
//            timeData9 = 0;
//        }
//        if(timeData10/60.0 >1){
//            double v = timeData10 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData10 = Double.valueOf(format);
//        }
//        else{
//            timeData10 = 0;
//        }
//        if(timeData11/60.0 >1){
//            double v = timeData11 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData11 = Double.valueOf(format);
//        }
//        else{
//            timeData11 = 0;
//        }
//        if(timeData12/60.0 >1){
//            double v = timeData12 / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeData12 = Double.valueOf(format);
//        }
//        else{
//            timeData12 = 0;
//        }
//        if(timeDataAll/60.0 >1){
//            double v = timeDataAll / 60.0 / 60.0 * 100;
//            String format = df.format(v);
//            timeDataAll = Double.valueOf(format);
//        }
//        else{
//            timeDataAll = 0;
//        }

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

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(jiHuaCNList);
        arrayLists.add(ldrtoagvList);
        arrayLists.add(ldrtoagvList2);

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
        model.addAttribute("arrayLists", arrayLists);
        System.out.println(arrayLists);

        return "packingAGV";
    }

    @RequestMapping("getLdrtoagvJs")
    @ResponseBody
    public ArrayList<ArrayList<Integer>> getLdrtoagvJs() throws ParseException {
        int timeNum = 0;
        String oracleTime = agvExvhangeCostCountService.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
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

        ArrayList<Integer> jiHuaCNList = new ArrayList<>();
        for(int i = 0; i < 13; i++){
            jiHuaCNList.add(0);
        }
        for(int i = 0; i < timeNum; i++){
            jiHuaCNList.set(i+1, 370);
        }
        int jiHuaCNAll = jiHuaCNList.stream().mapToInt(x -> x).sum();
        jiHuaCNList.set(0,jiHuaCNAll);



        ArrayList<Integer> ldrtoagvList = getAgvData("d302");
        //纖體2 實際產能數據
        ArrayList<Integer> ldrtoagvList2 = getAgvData("d301");


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

        //機故時長
        int JiGuTime1 = 0;
        int JiGuTime2 = 0;
        int JiGuTime3 = 0;
        int JiGuTime4 = 0;
        int JiGuTime5 = 0;
        int JiGuTime6 = 0;
        int JiGuTime7 = 0;
        int JiGuTime8 = 0;
        int JiGuTime9 = 0;
        int JiGuTime10 = 0;
        int JiGuTime11 = 0;
        int JiGuTime12 = 0;
        int JiGuTimeAll = 0;


        //機故數據
        List<AgvException> chance = agvExceptionService.getChance();

        for (AgvException agvException : chance) {
            if("8:30~9:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime1 += Integer.parseInt(agvException.getCost());

                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime1 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("9:30~10:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime2 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("10:30~11:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime3 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("11:30~12:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime4 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("12:30~13:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime5 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("13:30~14:30".equals(agvException.getTimeSlot())){
                //超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime6 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("14:30~15:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime7 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("15:30~16:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime8 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("16:30~17:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime9 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("17:30~18:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime10 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("18:30~19:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime11 += Integer.parseInt(agvException.getCost());
                    }
                }
            }
            if("19:30~20:30".equals(agvException.getTimeSlot())){
//超時的時間
                if("ChaoShi".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ChaoShiTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //脫軌的時間
                else if("TuoGui".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        TuoGuiTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //碰撞的時間
                else if("PengZhuang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        PengZhuangTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //阻擋的時間
                else if("ZuDang".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        ZuDangTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //急停的時間
                else if("JiTing".equals(agvException.getError())){
                    if(agvException.getCost() != null){
                        JiTingTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
                //機故超時的時間
                else{
                    if(agvException.getCost() != null){
                        JiGuTime12 += Integer.parseInt(agvException.getCost());
                    }
                }
            }

        }
        //8.30
        ArrayList<Integer> chanceList1 = new ArrayList<>();
        chanceList1.add(ChaoShiTime1);
        chanceList1.add(TuoGuiTime1);
        chanceList1.add(PengZhuangTime1);
        chanceList1.add(ZuDangTime1);
        chanceList1.add(JiTingTime1);
        chanceList1.add(JiGuTime1);

        //9.30
        ArrayList<Integer> chanceList2 = new ArrayList<>();
        chanceList2.add(ChaoShiTime2);
        chanceList2.add(TuoGuiTime2);
        chanceList2.add(PengZhuangTime2);
        chanceList2.add(ZuDangTime2);
        chanceList2.add(JiTingTime2);
        chanceList2.add(JiGuTime2);

        //10.30
        ArrayList<Integer> chanceList3 = new ArrayList<>();
        chanceList3.add(ChaoShiTime3);
        chanceList3.add(TuoGuiTime3);
        chanceList3.add(PengZhuangTime3);
        chanceList3.add(ZuDangTime3);
        chanceList3.add(JiTingTime3);
        chanceList3.add(JiGuTime3);

        //11.30
        ArrayList<Integer> chanceList4 = new ArrayList<>();
        chanceList4.add(ChaoShiTime4);
        chanceList4.add(TuoGuiTime4);
        chanceList4.add(PengZhuangTime4);
        chanceList4.add(ZuDangTime4);
        chanceList4.add(JiTingTime4);
        chanceList4.add(JiGuTime4);

        //12.30
        ArrayList<Integer> chanceList5 = new ArrayList<>();
        chanceList5.add(ChaoShiTime5);
        chanceList5.add(TuoGuiTime5);
        chanceList5.add(PengZhuangTime5);
        chanceList5.add(ZuDangTime5);
        chanceList5.add(JiTingTime5);
        chanceList5.add(JiGuTime5);

        //13.30
        ArrayList<Integer> chanceList6 = new ArrayList<>();
        chanceList6.add(ChaoShiTime6);
        chanceList6.add(TuoGuiTime6);
        chanceList6.add(PengZhuangTime6);
        chanceList6.add(ZuDangTime6);
        chanceList6.add(JiTingTime6);
        chanceList6.add(JiGuTime6);

        //14.30
        ArrayList<Integer> chanceList7 = new ArrayList<>();
        chanceList7.add(ChaoShiTime7);
        chanceList7.add(TuoGuiTime7);
        chanceList7.add(PengZhuangTime7);
        chanceList7.add(ZuDangTime7);
        chanceList7.add(JiTingTime7);
        chanceList7.add(JiGuTime7);

        //15.30
        ArrayList<Integer> chanceList8 = new ArrayList<>();
        chanceList8.add(ChaoShiTime8);
        chanceList8.add(TuoGuiTime8);
        chanceList8.add(PengZhuangTime8);
        chanceList8.add(ZuDangTime8);
        chanceList8.add(JiTingTime8);
        chanceList8.add(JiGuTime8);

        //16.30
        ArrayList<Integer> chanceList9 = new ArrayList<>();
        chanceList9.add(ChaoShiTime9);
        chanceList9.add(TuoGuiTime9);
        chanceList9.add(PengZhuangTime9);
        chanceList9.add(ZuDangTime9);
        chanceList9.add(JiTingTime9);
        chanceList9.add(JiGuTime9);

        //17.30
        ArrayList<Integer> chanceList10 = new ArrayList<>();
        chanceList10.add(ChaoShiTime10);
        chanceList10.add(TuoGuiTime10);
        chanceList10.add(PengZhuangTime10);
        chanceList10.add(ZuDangTime10);
        chanceList10.add(JiTingTime10);
        chanceList10.add(JiGuTime10);

        //18.30
        ArrayList<Integer> chanceList11 = new ArrayList<>();
        chanceList11.add(ChaoShiTime11);
        chanceList11.add(TuoGuiTime11);
        chanceList11.add(PengZhuangTime11);
        chanceList11.add(ZuDangTime11);
        chanceList11.add(JiTingTime11);
        chanceList11.add(JiGuTime11);

        //19.30
        ArrayList<Integer> chanceList12 = new ArrayList<>();
        chanceList12.add(ChaoShiTime12);
        chanceList12.add(TuoGuiTime12);
        chanceList12.add(PengZhuangTime12);
        chanceList12.add(ZuDangTime12);
        chanceList12.add(JiTingTime12);
        chanceList12.add(JiGuTime12);



        ChaoShiTimeAll = ChaoShiTime1 + ChaoShiTime2 + ChaoShiTime3 + ChaoShiTime4 +ChaoShiTime5+ChaoShiTime6+ChaoShiTime7+ChaoShiTime8+ChaoShiTime9+ChaoShiTime10+ChaoShiTime11+ChaoShiTime12;
        TuoGuiTimeAll = TuoGuiTime1+TuoGuiTime2+TuoGuiTime3+TuoGuiTime4+TuoGuiTime5+TuoGuiTime6+TuoGuiTime7+TuoGuiTime8+TuoGuiTime9+TuoGuiTime10+TuoGuiTime11+TuoGuiTime12;
        PengZhuangTimeAll = PengZhuangTime1+PengZhuangTime2+PengZhuangTime3+PengZhuangTime4+PengZhuangTime5+PengZhuangTime6+PengZhuangTime7+PengZhuangTime8+PengZhuangTime9+PengZhuangTime10+PengZhuangTime11
                +PengZhuangTime12;
        ZuDangTimeAll = ZuDangTime1+ZuDangTime2+ZuDangTime3+ZuDangTime4+ZuDangTime5+ZuDangTime6+ZuDangTime7+ZuDangTime8+ZuDangTime9+ZuDangTime10+ZuDangTime11+ZuDangTime12;
        JiTingTimeAll = JiTingTime1+JiTingTime2+JiTingTime3+JiTingTime4+JiTingTime5+JiTingTime6+JiTingTime7+JiTingTime8+JiTingTime9+JiTingTime10+JiTingTime11+JiTingTime12;
        JiGuTimeAll = JiGuTime1+JiGuTime2+JiGuTime3+JiGuTime4+JiGuTime5+JiGuTime6+JiGuTime7+JiGuTime8+JiGuTime9+JiGuTime10+JiGuTime11+JiGuTime12;

        ArrayList<Integer> chanceListAll = new ArrayList<>();
        chanceListAll.add(ChaoShiTimeAll);
        chanceListAll.add(TuoGuiTimeAll);
        chanceListAll.add(PengZhuangTimeAll);
        chanceListAll.add(ZuDangTimeAll);
        chanceListAll.add(JiTingTimeAll);
        chanceListAll.add(JiGuTimeAll);

        int timeData1 = ChaoShiTime1+TuoGuiTime1+PengZhuangTime1+ZuDangTime1+JiTingTime1+JiGuTime1;
        int timeData2 = ChaoShiTime2+TuoGuiTime2+PengZhuangTime2+ZuDangTime2+JiTingTime2+JiGuTime2;
        int timeData3 = ChaoShiTime3+TuoGuiTime3+PengZhuangTime3+ZuDangTime3+JiTingTime3+JiGuTime3;
        int timeData4 = ChaoShiTime4+TuoGuiTime4+PengZhuangTime4+ZuDangTime4+JiTingTime4+JiGuTime4;
        int timeData5 = ChaoShiTime5+TuoGuiTime5+PengZhuangTime5+ZuDangTime5+JiTingTime5+JiGuTime5;
        int timeData6 = ChaoShiTime6+TuoGuiTime6+PengZhuangTime6+ZuDangTime6+JiTingTime6+JiGuTime6;
        int timeData7 = ChaoShiTime7+TuoGuiTime7+PengZhuangTime7+ZuDangTime7+JiTingTime7+JiGuTime7;
        int timeData8 = ChaoShiTime8+TuoGuiTime8+PengZhuangTime8+ZuDangTime8+JiTingTime8+JiGuTime8;
        int timeData9 = ChaoShiTime9+TuoGuiTime9+PengZhuangTime9+ZuDangTime9+JiTingTime9+JiGuTime9;
        int timeData10 = ChaoShiTime10+TuoGuiTime10+PengZhuangTime10+ZuDangTime10+JiTingTime10+JiGuTime10;
        int timeData11 = ChaoShiTime11+TuoGuiTime11+PengZhuangTime11+ZuDangTime11+JiTingTime11+JiGuTime11;
        int timeData12 = ChaoShiTime12+TuoGuiTime12+PengZhuangTime12+ZuDangTime12+JiTingTime12+JiGuTime12;
        int timeDataAll = ChaoShiTimeAll+TuoGuiTimeAll+PengZhuangTimeAll+ZuDangTimeAll+JiTingTimeAll+JiGuTimeAll;


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

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(jiHuaCNList);
        arrayLists.add(ldrtoagvList);
        arrayLists.add(ldrtoagvList2);

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
        return arrayLists;
    }

}
