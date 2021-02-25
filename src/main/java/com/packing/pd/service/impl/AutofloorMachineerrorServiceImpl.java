package com.packing.pd.service.impl;

import com.packing.pd.entity.AutofloorMachineerror;
import com.packing.pd.mapper.AutofloorMachineerrorMapper;
import com.packing.pd.service.AutofloorMachineerrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-24 18:54
 */
@Primary
@Service
public class AutofloorMachineerrorServiceImpl implements AutofloorMachineerrorService {

    @Autowired
    private AutofloorMachineerrorMapper autofloorMachineerrorMapper;


    @Override
    public String getTimeJiGe1() {
        return autofloorMachineerrorMapper.getTimeJiGe1();
    }

    @Override
    public String getTimeJiGe2() {
        return autofloorMachineerrorMapper.getTimeJiGe2();
    }


    @Override
    public String getPd2JiGuTime1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuTime1(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuTimeY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuTimeY11(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuTimeY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuTimeY12(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuGeShu1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuGeShu1(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuGeShuY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuGeShuY11(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuGeShuY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2JiGuGeShuY12(lineName, time1, time2);
    }

    @Override
    public String getPd2JiGuSeven(String time, String lineName) {
        return autofloorMachineerrorMapper.getPd2JiGuSeven(time,lineName);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd2JiGuSeven1(String lineName, String time1, String time2, String time3, String time4, String time5, String time6, String time7) {
        return autofloorMachineerrorMapper.getPd2JiGuSeven1(lineName, time1,time2,time3,time4,time5,time6,time7);
    }














    @Override
    public String getPd1JiGuTime1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuTime1(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuTimeY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuTimeY11(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuTimeY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuTimeY12(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuGeShu1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuGeShu1(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuGeShuY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuGeShuY11(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuGeShuY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1JiGuGeShuY12(lineName, time1, time2);
    }

    @Override
    public String getPd1JiGuSeven(String time, String lineName) {
        return autofloorMachineerrorMapper.getPd1JiGuSeven(time,lineName);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd1JiGuSeven1(String lineName, String time1, String time2, String time3, String time4, String time5, String time6, String time7) {
        return autofloorMachineerrorMapper.getPd1JiGuSeven1(lineName, time1,time2,time3,time4,time5,time6,time7);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd1ErrorMsg1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1ErrorMsg1(lineName,time1,time2);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd1ErrorMsgY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1ErrorMsgY11(lineName,time1,time2);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd1ErrorMsgY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd1ErrorMsgY12(lineName,time1,time2);
    }







    @Override
    public ArrayList<AutofloorMachineerror> getPd2ErrorMsg1(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2ErrorMsg1(lineName,time1,time2);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd2ErrorMsgY11(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2ErrorMsgY11(lineName,time1,time2);
    }

    @Override
    public ArrayList<AutofloorMachineerror> getPd2ErrorMsgY12(String lineName, String time1, String time2) {
        return autofloorMachineerrorMapper.getPd2ErrorMsgY12(lineName,time1,time2);
    }
}
