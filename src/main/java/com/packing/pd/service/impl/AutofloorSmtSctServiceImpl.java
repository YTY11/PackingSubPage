package com.packing.pd.service.impl;

import com.packing.pd.mapper.AutofloorSmtSctMapper;
import com.packing.pd.service.AutofloorSmtSctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-23 9:26
 */
@Primary
@Service
public class AutofloorSmtSctServiceImpl implements AutofloorSmtSctService {
    
    @Autowired
    private AutofloorSmtSctMapper autofloorSmtSctMapper;

    @Override
    public String getTime() {
        return autofloorSmtSctMapper.getTime();
    }

    @Override
    public String getAllData1(String lineName) {
        return autofloorSmtSctMapper.getAllData1(lineName);
    }

    @Override
    public String getAllData2(String lineName) {
        return autofloorSmtSctMapper.getAllData2(lineName);
    }

    @Override
    public String getAllData3(String lineName) {
        return autofloorSmtSctMapper.getAllData3(lineName);
    }

    @Override
    public String getAllData4(String lineName) {
        return autofloorSmtSctMapper.getAllData4(lineName);
    }

    @Override
    public String getAllData5(String lineName) {
        return autofloorSmtSctMapper.getAllData5(lineName);
    }

    @Override
    public String getAllData6(String lineName) {
        return autofloorSmtSctMapper.getAllData6(lineName);
    }

    @Override
    public String getAllData7(String lineName) {
        return autofloorSmtSctMapper.getAllData7(lineName);
    }

    @Override
    public String getAllData8(String lineName) {
        return autofloorSmtSctMapper.getAllData8(lineName);
    }

    @Override
    public String getAllData9(String lineName) {
        return autofloorSmtSctMapper.getAllData9(lineName);
    }

    @Override
    public String getAllData10(String lineName) {
        return autofloorSmtSctMapper.getAllData10(lineName);
    }

    @Override
    public String getAllData11(String lineName) {
        return autofloorSmtSctMapper.getAllData11(lineName);
    }

    @Override
    public String getAllData12(String lineName) {
        return autofloorSmtSctMapper.getAllData12(lineName);
    }

    @Override
    public String getAllData13(String lineName) {
        return autofloorSmtSctMapper.getAllData13(lineName);
    }

    @Override
    public String getFejectData1(String lineName) {
        return autofloorSmtSctMapper.getFejectData1(lineName);
    }

    @Override
    public String getFejectData2(String lineName) {
        return autofloorSmtSctMapper.getFejectData2(lineName);
    }

    @Override
    public String getFejectData3(String lineName) {
        return autofloorSmtSctMapper.getFejectData3(lineName);
    }

    @Override
    public String getFejectData4(String lineName) {
        return autofloorSmtSctMapper.getFejectData4(lineName);
    }

    @Override
    public String getFejectData5(String lineName) {
        return autofloorSmtSctMapper.getFejectData5(lineName);
    }

    @Override
    public String getFejectData6(String lineName) {
        return autofloorSmtSctMapper.getFejectData6(lineName);
    }

    @Override
    public String getFejectData7(String lineName) {
        return autofloorSmtSctMapper.getFejectData7(lineName);
    }

    @Override
    public String getFejectData8(String lineName) {
        return autofloorSmtSctMapper.getFejectData8(lineName);
    }

    @Override
    public String getFejectData9(String lineName) {
        return autofloorSmtSctMapper.getFejectData9(lineName);
    }

    @Override
    public String getFejectData10(String lineName) {
        return autofloorSmtSctMapper.getFejectData10(lineName);
    }

    @Override
    public String getFejectData11(String lineName) {
        return autofloorSmtSctMapper.getFejectData11(lineName);
    }

    @Override
    public String getFejectData12(String lineName) {
        return autofloorSmtSctMapper.getFejectData12(lineName);
    }

    @Override
    public String getFejectData13(String lineName) {
        return autofloorSmtSctMapper.getFejectData13(lineName);
    }



    @Override
    public String getOffNormal1(String lineName) {
        return autofloorSmtSctMapper.getOffNormal1(lineName);
    }

    @Override
    public String getOffNormal2(String lineName) {
        return autofloorSmtSctMapper.getOffNormal2(lineName);
    }

    @Override
    public String getOffNormal3(String lineName) {
        return autofloorSmtSctMapper.getOffNormal3(lineName);
    }

    @Override
    public String getOffNormal4(String lineName) {
        return autofloorSmtSctMapper.getOffNormal4(lineName);
    }

    @Override
    public String getOffNormal5(String lineName) {
        return autofloorSmtSctMapper.getOffNormal5(lineName);
    }

    @Override
    public String getOffNormal6(String lineName) {
        return autofloorSmtSctMapper.getOffNormal6(lineName);
    }

    @Override
    public String getOffNormal7(String lineName) {
        return autofloorSmtSctMapper.getOffNormal7(lineName);
    }

    @Override
    public String getOffNormal8(String lineName) {
        return autofloorSmtSctMapper.getOffNormal8(lineName);
    }

    @Override
    public String getOffNormal9(String lineName) {
        return autofloorSmtSctMapper.getOffNormal9(lineName);
    }

    @Override
    public String getOffNormal10(String lineName) {
        return autofloorSmtSctMapper.getOffNormal10(lineName);
    }

    @Override
    public String getOffNormal11(String lineName) {
        return autofloorSmtSctMapper.getOffNormal11(lineName);
    }

    @Override
    public String getOffNormal12(String lineName) {
        return autofloorSmtSctMapper.getOffNormal12(lineName);
    }

    @Override
    public String getOffNormal13(String lineName) {
        return autofloorSmtSctMapper.getOffNormal13(lineName);
    }




    @Override
    public String getAllDataY1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataY1(lineName,time1,time2);
    }
    @Override
    public String getAllDataY2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataY2(lineName,time1,time2);
    }
    @Override
    public String getAllDataY11(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataY11(lineName,time1,time2);
    }
    @Override
    public String getAllDataY12(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataY12(lineName,time1,time2);
    }

    @Override
    public String getAllDataYAll1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataYAll1(lineName,time1,time2);
    }
    @Override
    public String getAllDataYAll2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getAllDataYAll2(lineName,time1,time2);
    }



    @Override
    public String getFejectDataY1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataY1(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataY2(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY11(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataY11(lineName,time1,time2);
    }
    @Override
    public String getFejectDataY12(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataY12(lineName,time1,time2);
    }

    @Override
    public String getFejectDataYAll1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataYAll1(lineName,time1,time2);
    }
    @Override
    public String getFejectDataYAll2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getFejectDataYAll2(lineName,time1,time2);
    }






    @Override
    public String getOffNormalY1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalY1(lineName,time1,time2);
    }
    @Override
    public String getOffNormalY2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalY2(lineName,time1,time2);
    }
    @Override
    public String getOffNormalY11(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalY11(lineName,time1,time2);
    }
    @Override
    public String getOffNormalY12(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalY12(lineName,time1,time2);
    }



    @Override
    public String getOffNormalYAll1(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalYAll1(lineName,time1,time2);
    }
    @Override
    public String getOffNormalYAll2(String lineName, String time1, String time2) {
        return autofloorSmtSctMapper.getOffNormalYAll2(lineName,time1,time2);
    }


    @Override
    public String getAllDataSeven(String time,String lineName) {
        return autofloorSmtSctMapper.getAllDataSeven(time,lineName);
    }

    @Override
    public String getFejectDataSeven(String time,String lineName) {
        return autofloorSmtSctMapper.getFejectDataSeven(time,lineName);
    }

    @Override
    public String getOffNormalSeven(String time,String lineName) {
        return autofloorSmtSctMapper.getOffNormalSeven(time,lineName);
    }

}
