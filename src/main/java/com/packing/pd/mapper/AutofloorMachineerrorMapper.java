package com.packing.pd.mapper;

import com.packing.pd.entity.AutofloorMachineerror;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface AutofloorMachineerrorMapper {
    String getTimeJiGe1();//系统时间 yyyy-mm-dd HH:mm:ss 白天
    String getTimeJiGe2();//系统时间 yyyy-mm-dd HH:mm:ss 晚上


//    pd2机故时间
    String getPd2JiGuTime1(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
//    pd2机故时间 晚上0点前 23：30~00：30
    String getPd2JiGuTimeY11(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
//    pd2机故时间 晚上0点后 23：30~00：30
    String getPd2JiGuTimeY12(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);



    //    pd2机故个数
    String getPd2JiGuGeShu1(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd2机故个数 晚上0点前 23：30~00：30
    String getPd2JiGuGeShuY11(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd2机故个数 晚上0点后 23：30~00：30
    String getPd2JiGuGeShuY12(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);

//    pd2机故前七天数据
    String getPd2JiGuSeven(@Param("time") String time , @Param("lineName") String lineName);

    ArrayList<AutofloorMachineerror> getPd2JiGuSeven1(@Param("lineName") String lineName,@Param("time1") String time1
            ,@Param("time2") String time2,@Param("time3") String time3
            ,@Param("time4") String time4,@Param("time5") String time5
            ,@Param("time6") String time6,@Param("time7") String time7);












    //    pd1机故时间
    String getPd1JiGuTime1(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd2机故时间 晚上0点前 23：30~00：30
    String getPd1JiGuTimeY11(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd1机故时间 晚上0点后 23：30~00：30
    String getPd1JiGuTimeY12(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);



    //    pd1机故个数
    String getPd1JiGuGeShu1(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd1机故个数 晚上0点前 23：30~00：30
    String getPd1JiGuGeShuY11(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);
    //    pd1机故个数 晚上0点后 23：30~00：30
    String getPd1JiGuGeShuY12(@Param("lineName") String lineName, @Param("time1") String time1, @Param("time2") String time2);

    //    pd1机故前七天数据
    String getPd1JiGuSeven(@Param("time") String time , @Param("lineName") String lineName);

    ArrayList<AutofloorMachineerror> getPd1JiGuSeven1(@Param("lineName") String lineName,@Param("time1") String time1
            ,@Param("time2") String time2,@Param("time3") String time3
            ,@Param("time4") String time4,@Param("time5") String time5
            ,@Param("time6") String time6,@Param("time7") String time7);


//    pd1异常信息
    ArrayList<AutofloorMachineerror> getPd1ErrorMsg1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
//    pd1异常信息 夜晚 0点前 23：30~00：30
    ArrayList<AutofloorMachineerror> getPd1ErrorMsgY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
//    pd1异常信息 夜晚 0点后 23：30~00：30
    ArrayList<AutofloorMachineerror> getPd1ErrorMsgY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);



    //    pd2异常信息
    ArrayList<AutofloorMachineerror> getPd2ErrorMsg1(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //    pd2异常信息 夜晚 0点前 23：30~00：30
    ArrayList<AutofloorMachineerror> getPd2ErrorMsgY11(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);
    //    pd2异常信息 夜晚 0点后 23：30~00：30
    ArrayList<AutofloorMachineerror> getPd2ErrorMsgY12(@Param("lineName") String lineName,@Param("time1") String time1,@Param("time2") String time2);

}