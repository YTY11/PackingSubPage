package com.packing.agv.mapper;

import com.packing.agv.entity.AgvException;

import java.util.List;

public interface AgvExceptionMapper {
    List<AgvException> getChance();//獲取機故數據
}