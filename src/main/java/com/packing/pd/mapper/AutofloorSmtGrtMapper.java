package com.packing.pd.mapper;

import com.packing.pd.entity.AutofloorSmtGrt;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface AutofloorSmtGrtMapper {
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
    AutofloorSmtGrt getOffNormal1(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal2(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal3(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal4(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal5(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal6(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal7(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal8(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal9(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal10(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal11(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal12(@Param("lineName") String lineName);
    AutofloorSmtGrt getOffNormal13(@Param("lineName") String lineName);


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
    AutofloorSmtGrt getOffNormalY1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    AutofloorSmtGrt getOffNormalY2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //所有的
    AutofloorSmtGrt getOffNormalYAll1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    AutofloorSmtGrt getOffNormalYAll2(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    AutofloorSmtGrt getOffNormalY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    AutofloorSmtGrt getOffNormalY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);



//    前七天日期
    ArrayList<String> getSevenDate();

    //    前七天产量数据
    String getAllDataSeven(@Param("time") String time , @Param("lineName") String lineName);

    //    前七天抛料数据
    String getFejectDataSeven(@Param("time") String time, @Param("lineName") String lineName);


    //    前七天偏位数据
    AutofloorSmtGrt getOffNormalSeven(@Param("time") String time, @Param("lineName") String lineName);
}