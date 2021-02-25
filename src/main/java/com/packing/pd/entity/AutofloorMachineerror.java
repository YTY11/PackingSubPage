package com.packing.pd.entity;

import java.util.Date;

public class AutofloorMachineerror {
    private Short id;

    private String area;

    private String floor;

    private String product;

    private String linename;

    private String machinetype;

    private String sn;

    private String exceptionstatus;

    private String exceptionindex;

    private String exceptioninfo;

    private Date exceptionbegintime;

    private Date exceptionendtime;

    private Date updatetime;

    private String workstation;

    private String linename2;

    private String p3;

    private String p4;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getMachinetype() {
        return machinetype;
    }

    public void setMachinetype(String machinetype) {
        this.machinetype = machinetype == null ? null : machinetype.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getExceptionstatus() {
        return exceptionstatus;
    }

    public void setExceptionstatus(String exceptionstatus) {
        this.exceptionstatus = exceptionstatus == null ? null : exceptionstatus.trim();
    }

    public String getExceptionindex() {
        return exceptionindex;
    }

    public void setExceptionindex(String exceptionindex) {
        this.exceptionindex = exceptionindex == null ? null : exceptionindex.trim();
    }

    public String getExceptioninfo() {
        return exceptioninfo;
    }

    public void setExceptioninfo(String exceptioninfo) {
        this.exceptioninfo = exceptioninfo == null ? null : exceptioninfo.trim();
    }

    public Date getExceptionbegintime() {
        return exceptionbegintime;
    }

    public void setExceptionbegintime(Date exceptionbegintime) {
        this.exceptionbegintime = exceptionbegintime;
    }

    public Date getExceptionendtime() {
        return exceptionendtime;
    }

    public void setExceptionendtime(Date exceptionendtime) {
        this.exceptionendtime = exceptionendtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation == null ? null : workstation.trim();
    }

    public String getLinename2() {
        return linename2;
    }

    public void setLinename2(String linename2) {
        this.linename2 = linename2 == null ? null : linename2.trim();
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3 == null ? null : p3.trim();
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4 == null ? null : p4.trim();
    }

    @Override
    public String toString() {
        return "AutofloorMachineerror{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", floor='" + floor + '\'' +
                ", product='" + product + '\'' +
                ", linename='" + linename + '\'' +
                ", machinetype='" + machinetype + '\'' +
                ", sn='" + sn + '\'' +
                ", exceptionstatus='" + exceptionstatus + '\'' +
                ", exceptionindex='" + exceptionindex + '\'' +
                ", exceptioninfo='" + exceptioninfo + '\'' +
                ", exceptionbegintime=" + exceptionbegintime +
                ", exceptionendtime=" + exceptionendtime +
                ", updatetime=" + updatetime +
                ", workstation='" + workstation + '\'' +
                ", linename2='" + linename2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", p4='" + p4 + '\'' +
                '}';
    }
}