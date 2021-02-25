package com.packing.pd.service.impl;

import com.packing.pd.entity.AutofloorSmtGrt;
import com.packing.pd.mapper.AutofloorSmtGrtMapper;
import com.packing.pd.service.AutofloorSmtGrtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-23 9:26
 */
@Primary
@Service
public class AutofloorSmtGrtServiceImpl implements AutofloorSmtGrtService {

    @Autowired
    private AutofloorSmtGrtMapper autofloorSmtGrtMapper;

    @Override
    public String getTime() {
        return autofloorSmtGrtMapper.getTime();
    }

    @Override
    public String getAllData1(String lineName) {
        return autofloorSmtGrtMapper.getAllData1(lineName);
    }

    @Override
    public String getAllData2(String lineName) {
        return autofloorSmtGrtMapper.getAllData2(lineName);
    }

    @Override
    public String getAllData3(String lineName) {
        return autofloorSmtGrtMapper.getAllData3(lineName);
    }

    @Override
    public String getAllData4(String lineName) {
        return autofloorSmtGrtMapper.getAllData4(lineName);
    }

    @Override
    public String getAllData5(String lineName) {
        return autofloorSmtGrtMapper.getAllData5(lineName);
    }

    @Override
    public String getAllData6(String lineName) {
        return autofloorSmtGrtMapper.getAllData6(lineName);
    }

    @Override
    public String getAllData7(String lineName) {
        return autofloorSmtGrtMapper.getAllData7(lineName);
    }

    @Override
    public String getAllData8(String lineName) {
        return autofloorSmtGrtMapper.getAllData8(lineName);
    }

    @Override
    public String getAllData9(String lineName) {
        return autofloorSmtGrtMapper.getAllData9(lineName);
    }

    @Override
    public String getAllData10(String lineName) {
        return autofloorSmtGrtMapper.getAllData10(lineName);
    }

    @Override
    public String getAllData11(String lineName) {
        return autofloorSmtGrtMapper.getAllData11(lineName);
    }

    @Override
    public String getAllData12(String lineName) {
        return autofloorSmtGrtMapper.getAllData12(lineName);
    }

    @Override
    public String getAllData13(String lineName) {
        return autofloorSmtGrtMapper.getAllData13(lineName);
    }

    @Override
    public String getFejectData1(String lineName) {
        return autofloorSmtGrtMapper.getFejectData1(lineName);
    }

    @Override
    public String getFejectData2(String lineName) {
        return autofloorSmtGrtMapper.getFejectData2(lineName);
    }

    @Override
    public String getFejectData3(String lineName) {
        return autofloorSmtGrtMapper.getFejectData3(lineName);
    }

    @Override
    public String getFejectData4(String lineName) {
        return autofloorSmtGrtMapper.getFejectData4(lineName);
    }

    @Override
    public String getFejectData5(String lineName) {
        return autofloorSmtGrtMapper.getFejectData5(lineName);
    }

    @Override
    public String getFejectData6(String lineName) {
        return autofloorSmtGrtMapper.getFejectData6(lineName);
    }

    @Override
    public String getFejectData7(String lineName) {
        return autofloorSmtGrtMapper.getFejectData7(lineName);
    }

    @Override
    public String getFejectData8(String lineName) {
        return autofloorSmtGrtMapper.getFejectData8(lineName);
    }

    @Override
    public String getFejectData9(String lineName) {
        return autofloorSmtGrtMapper.getFejectData9(lineName);
    }

    @Override
    public String getFejectData10(String lineName) {
        return autofloorSmtGrtMapper.getFejectData10(lineName);
    }

    @Override
    public String getFejectData11(String lineName) {
        return autofloorSmtGrtMapper.getFejectData11(lineName);
    }

    @Override
    public String getFejectData12(String lineName) {
        return autofloorSmtGrtMapper.getFejectData12(lineName);
    }

    @Override
    public String getFejectData13(String lineName) {
        return autofloorSmtGrtMapper.getFejectData13(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal1(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal1(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal2(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal2(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal3(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal3(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal4(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal4(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal5(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal5(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal6(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal6(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal7(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal7(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal8(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal8(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal9(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal9(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal10(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal10(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal11(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal11(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal12(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal12(lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormal13(String lineName) {
        return autofloorSmtGrtMapper.getOffNormal13(lineName);
    }

    @Override
    public String getAllDataY1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataY1(lineName,time1,time2);
    }
    @Override
    public String getAllDataY2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataY2(lineName,time1,time2);
    }
    @Override
    public String getAllDataY11(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataY11(lineName,time1,time2);
    }
    @Override
    public String getAllDataY12(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataY12(lineName,time1,time2);
    }

    @Override
    public String getAllDataYAll1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataYAll1(lineName,time1,time2);
    }
    @Override
    public String getAllDataYAll2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getAllDataYAll2(lineName,time1,time2);
    }



    @Override
    public String getFejectDataY1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataY1(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataY2(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY11(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataY11(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY12(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataY12(lineName,time1,time2);
    }

    @Override
    public String getFejectDataYAll1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataYAll1(lineName,time1,time2);
    }
    @Override
    public String getFejectDataYAll2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getFejectDataYAll2(lineName,time1,time2);
    }






    @Override
    public AutofloorSmtGrt getOffNormalY1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalY1(lineName,time1,time2);
    }
    @Override
    public AutofloorSmtGrt getOffNormalY2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalY2(lineName,time1,time2);
    }
    @Override
    public AutofloorSmtGrt getOffNormalY11(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalY11(lineName,time1,time2);
    }
    @Override
    public AutofloorSmtGrt getOffNormalY12(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalY12(lineName,time1,time2);
    }



    @Override
    public AutofloorSmtGrt getOffNormalYAll1(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalYAll1(lineName,time1,time2);
    }
    @Override
    public AutofloorSmtGrt getOffNormalYAll2(String lineName, String time1, String time2) {
        return autofloorSmtGrtMapper.getOffNormalYAll2(lineName,time1,time2);
    }



    @Override
    public ArrayList<String> getSevenDate() {
        return autofloorSmtGrtMapper.getSevenDate();
    }

    @Override
    public String getAllDataSeven(String time,String lineName) {
        return autofloorSmtGrtMapper.getAllDataSeven(time,lineName);
    }

    @Override
    public String getFejectDataSeven(String time,String lineName) {
        return autofloorSmtGrtMapper.getFejectDataSeven(time,lineName);
    }

    @Override
    public AutofloorSmtGrt getOffNormalSeven(String time,String lineName) {
        return autofloorSmtGrtMapper.getOffNormalSeven(time,lineName);
    }
}
