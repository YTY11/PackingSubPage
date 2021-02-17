package com.packing.agv.mapper;

import com.packing.agv.entity.AgvExceptionCostCount;

public interface AgvExceptionCostCountMapper {
    int insert(AgvExceptionCostCount record);

    int insertSelective(AgvExceptionCostCount record);
}