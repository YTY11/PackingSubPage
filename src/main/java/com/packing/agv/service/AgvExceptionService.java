package com.packing.agv.service;

import com.packing.agv.entity.AgvException;

import java.util.List;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-17 15:53
 */
public interface AgvExceptionService {
    List<AgvException> getChance();//獲取機故數據
}
