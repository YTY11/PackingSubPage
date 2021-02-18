package com.packing.agv.mapper;

import com.packing.agv.entity.AgvException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgvExceptionMapper {
    List<AgvException> getChance();//獲取機故數據

    AgvException getChanceSeven(@Param("sTime") String sTime);//获取机故前7天数据
}