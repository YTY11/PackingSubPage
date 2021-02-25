package com.packing.pd.mapper;

import com.packing.pd.entity.AutofloorSmtSct;
import org.apache.ibatis.annotations.Param;

public interface AutofloorSmtSctMapper {
    //    获取现在时间
    String getTime();

    //    白天时间段内的数据
    String getAllData1(@Param("lineName") String lineName);
    String getAllData2(@Param("lineName") String lineName);
    String getAllData3(@Param("lineName") String lineName);
    String getAllData4(@Param("lineName") String lineName);
    String getAllData5(@Param("lineName") String lineName);
    String getAllData6(@Param("lineName") String lineName);
    String getAllData7(@Param("lineName") String lineName);
    String getAllData8(@Param("lineName") String lineName);
    String getAllData9(@Param("lineName") String lineName);
    String getAllData10(@Param("lineName") String lineName);
    String getAllData11(@Param("lineName") String lineName);
    String getAllData12(@Param("lineName") String lineName);
    String getAllData13(@Param("lineName") String lineName);

    //    白天抛料数据
    String getFejectData1(@Param("lineName") String lineName);
    String getFejectData2(@Param("lineName") String lineName);
    String getFejectData3(@Param("lineName") String lineName);
    String getFejectData4(@Param("lineName") String lineName);
    String getFejectData5(@Param("lineName") String lineName);
    String getFejectData6(@Param("lineName") String lineName);
    String getFejectData7(@Param("lineName") String lineName);
    String getFejectData8(@Param("lineName") String lineName);
    String getFejectData9(@Param("lineName") String lineName);
    String getFejectData10(@Param("lineName") String lineName);
    String getFejectData11(@Param("lineName") String lineName);
    String getFejectData12(@Param("lineName") String lineName);
    String getFejectData13(@Param("lineName") String lineName);

    //    白天偏位数据
    String getOffNormal1(@Param("lineName") String lineName);
    String getOffNormal2(@Param("lineName") String lineName);
    String getOffNormal3(@Param("lineName") String lineName);
    String getOffNormal4(@Param("lineName") String lineName);
    String getOffNormal5(@Param("lineName") String lineName);
    String getOffNormal6(@Param("lineName") String lineName);
    String getOffNormal7(@Param("lineName") String lineName);
    String getOffNormal8(@Param("lineName") String lineName);
    String getOffNormal9(@Param("lineName") String lineName);
    String getOffNormal10(@Param("lineName") String lineName);
    String getOffNormal11(@Param("lineName") String lineName);
    String getOffNormal12(@Param("lineName") String lineName);
    String getOffNormal13(@Param("lineName") String lineName);



    //夜晚1
    String getAllDataY1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getAllDataY2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //所有的
    String getAllDataYAll1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getAllDataYAll2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getAllDataY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getAllDataY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);

    //抛料夜晚
    String getFejectDataY1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getFejectDataY2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //所有的
    String getFejectDataYAll1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getFejectDataYAll2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getFejectDataY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getFejectDataY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);


    //偏位夜晚
    String getOffNormalY1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getOffNormalY2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //所有的
    String getOffNormalYAll1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getOffNormalYAll2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getOffNormalY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    String getOffNormalY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);


    //    前七天产量数据
    String getAllDataSeven(@Param("time") String time , @Param("lineName") String lineName);

    //    前七天抛料数据
    String getFejectDataSeven(@Param("time") String time, @Param("lineName") String lineName);


    //    前七天偏位数据
    String getOffNormalSeven(@Param("time") String time, @Param("lineName") String lineName);


}