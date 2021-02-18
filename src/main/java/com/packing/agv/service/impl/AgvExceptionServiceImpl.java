package com.packing.agv.service.impl;

import com.packing.agv.entity.AgvException;
import com.packing.agv.mapper.AgvExceptionMapper;
import com.packing.agv.service.AgvExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @Description:
 * @create 2021-02-17 15:53
 */
@Primary
@Service
public class AgvExceptionServiceImpl implements AgvExceptionService {
    @Autowired
    private AgvExceptionMapper agvExceptionMapper;


    //獲取機故數據
    @Override
    public List<AgvException> getChance() {
        return agvExceptionMapper.getChance();
    }

    @Override
    public AgvException getChanceSeven(String sTime) {
        return agvExceptionMapper.getChanceSeven(sTime);
    }
}
