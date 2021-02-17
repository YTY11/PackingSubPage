package com.packing.agv.service.impl;

import com.packing.agv.mapper.AgvExvhangeCostCountMapper;
import com.packing.agv.service.AgvExvhangeCostCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;



/**
 * @Description:
 * @create 2021-02-16 14:17
 */
@Primary
@Service
public class AgvExvhangeCostCountServiceImpl implements AgvExvhangeCostCountService {

    @Autowired
    private AgvExvhangeCostCountMapper agvExvhangeCostCountMapper;

    @Override
    public String getLdrtoagv08(String loader) {

        return agvExvhangeCostCountMapper.getLdrtoagv08(loader);
    }

    @Override
    public String getLdrtoagv09(String loader) {

        return agvExvhangeCostCountMapper.getLdrtoagv09(loader);
    }

    @Override
    public String getLdrtoagv10(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv10(loader);
    }

    @Override
    public String getLdrtoagv11(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv11(loader);
    }

    @Override
    public String getLdrtoagv12(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv12(loader);
    }

    @Override
    public String getLdrtoagv13(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv13(loader);
    }

    @Override
    public String getLdrtoagv14(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv14(loader);
    }

    @Override
    public String getLdrtoagv15(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv15(loader);
    }

    @Override
    public String getLdrtoagv16(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv16(loader);
    }

    @Override
    public String getLdrtoagv17(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv17(loader);
    }

    @Override
    public String getLdrtoagv18(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv18(loader);
    }

    @Override
    public String getLdrtoagv19(String loader) {
        return agvExvhangeCostCountMapper.getLdrtoagv19(loader);
    }

    @Override
    public String getTime() {
        return agvExvhangeCostCountMapper.getTime();
    }


}
