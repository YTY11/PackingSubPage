package com.packing.agv.service.impl;

import com.packing.agv.entity.AgvException;
import com.packing.agv.mapper.AgvExceptionMapper;
import com.packing.agv.service.AgvExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Description:
 * @create 2021-02-17 15:53
 */
@Primary
@Service
public class AgvExceptionServiceImpl implements AgvExceptionService {
    @Autowired
    private AgvExceptionMapper agvExceptionMapper;


    //獲取機故數據
    @Override
    public List<AgvException> getChance() {
        return agvExceptionMapper.getChance();
    }

    @Override
    public List<AgvException> getChance2() {
        return agvExceptionMapper.getChance2();
    }

    @Override
    public List<AgvException> getChance3() {
        return agvExceptionMapper.getChance3();
    }

    @Override
    public String getJiGuTime1(String sTime) {
        return agvExceptionMapper.getJiGuTime1(sTime);
    }

    @Override
    public String getJiGuTime21(String sTime) {
        return agvExceptionMapper.getJiGuTime21(sTime);
    }

    @Override
    public String getJiGuTime22(String sTime) {
        return agvExceptionMapper.getJiGuTime22(sTime);
    }

    @Override
    public AgvException getChanceSeven(String sTime) {
        return agvExceptionMapper.getChanceSeven(sTime);
    }

    @Override
    public ArrayList<AgvException> getErrorMsg1(String sTime) {
        return agvExceptionMapper.getErrorMsg1(sTime);
    }

    @Override
    public ArrayList<AgvException> getErrorMsgAll1() {
        return agvExceptionMapper.getErrorMsgAll1();
    }

    @Override
    public ArrayList<AgvException> getErrorMsg21(String sTime) {
        return agvExceptionMapper.getErrorMsg21(sTime);
    }

    @Override
    public ArrayList<AgvException> getErrorMsgAll21() {
        return agvExceptionMapper.getErrorMsgAll21();
    }

    @Override
    public ArrayList<AgvException> getErrorMsg22(String sTime) {
        return agvExceptionMapper.getErrorMsg21(sTime);
    }

    @Override
    public ArrayList<AgvException> getErrorMsgAll22() {
        return agvExceptionMapper.getErrorMsgAll22();
    }
}
