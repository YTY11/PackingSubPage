package com.packing.agv.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AgvExvhangeCostCount {
    private Short id;

    private String floor;

    private String workstation;

    private String loader;

    private String ldrtoagv;

    private String agvtoldr;

    private String cost;

    private String count;

    private String cycleType;

    private Date starttime;

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    @Override
    public String toString() {
        return "AgvExvhangeCostCount{" +
                "id=" + id +
                ", floor='" + floor + '\'' +
                ", workstation='" + workstation + '\'' +
                ", loader='" + loader + '\'' +
                ", ldrtoagv='" + ldrtoagv + '\'' +
                ", agvtoldr='" + agvtoldr + '\'' +
                ", cost='" + cost + '\'' +
                ", count='" + count + '\'' +
                ", cycleType='" + cycleType + '\'' +
                ", starttime=" + starttime +
                ", sTime='" + sTime + '\'' +
                ", endtime=" + endtime +
                ", updateTime=" + updateTime +
                '}';
    }

    private String sTime;

    private Date endtime;

    private Date updateTime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation == null ? null : workstation.trim();
    }

    public String getLoader() {
        return loader;
    }

    public void setLoader(String loader) {
        this.loader = loader == null ? null : loader.trim();
    }

    public String getLdrtoagv() {
        return ldrtoagv;
    }

    public void setLdrtoagv(String ldrtoagv) {
        this.ldrtoagv = ldrtoagv == null ? null : ldrtoagv.trim();
    }

    public String getAgvtoldr() {
        return agvtoldr;
    }

    public void setAgvtoldr(String agvtoldr) {
        this.agvtoldr = agvtoldr == null ? null : agvtoldr.trim();
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost == null ? null : cost.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType == null ? null : cycleType.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}