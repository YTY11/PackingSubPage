package com.packing.pd.service;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-23 9:26
 */
public interface AutofloorSmtSctService {
    //    获取现在时间
    String getTime();

    //    白天时间段内的数据
    String getAllData1(String lineName);
    String getAllData2(String lineName);
    String getAllData3(String lineName);
    String getAllData4(String lineName);
    String getAllData5(String lineName);
    String getAllData6(String lineName);
    String getAllData7(String lineName);
    String getAllData8(String lineName);
    String getAllData9(String lineName);
    String getAllData10(String lineName);
    String getAllData11(String lineName);
    String getAllData12(String lineName);
    String getAllData13(String lineName);

    //    白天抛料数据
    String getFejectData1(String lineName);
    String getFejectData2(String lineName);
    String getFejectData3(String lineName);
    String getFejectData4(String lineName);
    String getFejectData5(String lineName);
    String getFejectData6(String lineName);
    String getFejectData7(String lineName);
    String getFejectData8(String lineName);
    String getFejectData9(String lineName);
    String getFejectData10(String lineName);
    String getFejectData11(String lineName);
    String getFejectData12(String lineName);
    String getFejectData13(String lineName);

    //    白天偏位数据
    String getOffNormal1(String lineName);
    String getOffNormal2(String lineName);
    String getOffNormal3(String lineName);
    String getOffNormal4(String lineName);
    String getOffNormal5(String lineName);
    String getOffNormal6(String lineName);
    String getOffNormal7(String lineName);
    String getOffNormal8(String lineName);
    String getOffNormal9(String lineName);
    String getOffNormal10(String lineName);
    String getOffNormal11(String lineName);
    String getOffNormal12(String lineName);
    String getOffNormal13(String lineName);



    //夜晚1
    String getAllDataY1(String lineName,String time1,String time2);
    String getAllDataY2(String lineName,String time1,String time2);
    //所有的
    String getAllDataYAll1(String lineName,String time1,String time2);
    String getAllDataYAll2(String lineName,String time1,String time2);
    String getAllDataY11(String lineName,String time1,String time2);
    String getAllDataY12(String lineName,String time1,String time2);


    //抛料夜晚
    String getFejectDataY1(String lineName,String time1,String time2);
    String getFejectDataY2(String lineName,String time1,String time2);
    //所有的
    String getFejectDataYAll1(String lineName,String time1,String time2);
    String getFejectDataYAll2(String lineName,String time1,String time2);
    String getFejectDataY11(String lineName,String time1,String time2);
    String getFejectDataY12(String lineName,String time1,String time2);



    //偏位夜晚
    String getOffNormalY1(String lineName,String time1,String time2);
    String getOffNormalY2(String lineName,String time1,String time2);
    //所有的
    String getOffNormalYAll1(String lineName,String time1,String time2);
    String getOffNormalYAll2(String lineName,String time1,String time2);
    String getOffNormalY11(String lineName,String time1,String time2);
    String getOffNormalY12(String lineName,String time1,String time2);


    //    前七天产量数据
    String getAllDataSeven(String time,String lineName);

    //    前七天抛料数据
    String getFejectDataSeven(String time,String lineName);


    //    前七天偏位数据
    String getOffNormalSeven(String time,String lineName);
}
