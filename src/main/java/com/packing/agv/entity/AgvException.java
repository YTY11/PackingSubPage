package com.packing.agv.entity;

import java.util.Date;

public class AgvException {
    private Short id;

    private String device;

    private String error;

    private Date starttime;

    private Date endtime;

    private String cost;

    private String workstation;

    private Date updateTime;

    private String floor;

    private String rfid;

    private String timeSlot;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost == null ? null : cost.trim();
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation == null ? null : workstation.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getRfid() {
        return rfid;
    }

    @Override
    public String toString() {
        return "AgvException{" +
                "id=" + id +
                ", device='" + device + '\'' +
                ", error='" + error + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", cost='" + cost + '\'' +
                ", workstation='" + workstation + '\'' +
                ", updateTime=" + updateTime +
                ", floor='" + floor + '\'' +
                ", rfid='" + rfid + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot == null ? null : timeSlot.trim();
    }
}