package com.packing.agv.mapper;

import com.packing.agv.entity.AgvException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgvExceptionMapper {
    List<AgvException> getChance();//獲取機故數據 白天
    List<AgvException> getChance2();//獲取機故數據 夜晚 00:00 ~ 08:30
    List<AgvException> getChance3();//獲取機故數據 夜晚 20:30 ~ 00:00

    AgvException getChanceSeven(@Param("sTime") String sTime);//获取机故前7天数据
}