package com.packing.agv.service;

import com.packing.agv.entity.AgvException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yang TanYing
 * @Description:
 * @create 2021-02-17 15:53
 */
public interface AgvExceptionService {
    List<AgvException> getChance();//獲取機故數據

    AgvException getChanceSeven(String sTime);//获取机故前7天数据

}
