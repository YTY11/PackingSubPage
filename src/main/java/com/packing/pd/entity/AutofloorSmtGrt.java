package com.packing.pd.entity;

import java.util.Date;

public class AutofloorSmtGrt {
    private Short id;

    private String area;

    private String floor;

    private String product;

    private String linename;

    private String machinetype;

    private Date testtime;

    private String programname;

    private Date updatetime;

    private Short upflag;

    private String uph;

    private String reCheckNg;

    private String throwing;

    private String linename2;

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

    public Date getTesttime() {
        return testtime;
    }

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getUpflag() {
        return upflag;
    }

    public void setUpflag(Short upflag) {
        this.upflag = upflag;
    }

    public String getUph() {
        return uph;
    }

    public void setUph(String uph) {
        this.uph = uph == null ? null : uph.trim();
    }

    public String getReCheckNg() {
        return reCheckNg;
    }

    public void setReCheckNg(String reCheckNg) {
        this.reCheckNg = reCheckNg == null ? null : reCheckNg.trim();
    }

    public String getThrowing() {
        return throwing;
    }

    public void setThrowing(String throwing) {
        this.throwing = throwing == null ? null : throwing.trim();
    }

    public String getLinename2() {
        return linename2;
    }

    public void setLinename2(String linename2) {
        this.linename2 = linename2 == null ? null : linename2.trim();
    }
}