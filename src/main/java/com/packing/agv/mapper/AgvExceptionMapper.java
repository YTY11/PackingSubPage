package com.packing.agv.mapper;

import com.packing.agv.entity.AgvException;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface AgvExceptionMapper {
    List<AgvException> getChance();//獲取機故數據 白天
    List<AgvException> getChance2();//獲取機故數據 夜晚 00:00 ~ 08:30
    List<AgvException> getChance3();//獲取機故數據 夜晚 20:30 ~ 00:00
    String getJiGuTime1(@Param("sTime") String sTime);//获取机故故障时间 白天
    String getJiGuTime21(@Param("sTime") String sTime);//获取机故故障时间 晚上1
    String getJiGuTime22(@Param("sTime") String sTime);//获取机故故障时间 晚上2
    AgvException getChanceSeven(@Param("sTime") String sTime);//获取机故前7天数据


    ArrayList<AgvException> getErrorMsg1(@Param("sTime") String sTime);//白天异常数据
    ArrayList<AgvException> getErrorMsgAll1();//白天异常数据
    ArrayList<AgvException> getErrorMsg21(@Param("sTime") String sTime);//夜晚异常数据1
    ArrayList<AgvException> getErrorMsgAll21();//夜晚异常数据1
    ArrayList<AgvException> getErrorMsg22(@Param("sTime") String sTime);//夜晚异常数据2
    ArrayList<AgvException> getErrorMsgAll22();//夜晚异常数据2
}