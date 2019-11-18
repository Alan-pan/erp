package com.zgjy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer oid;

    private Date createtime;

    private Date checktime;

    private Date starttime;

    private Date endtime;

    private String type;

    private Integer creater;

    private String creatername;

    private Integer checker;

    private String checkername;

    private Integer starter;

    private String startername;

    private Integer ender;

    private String endername;

    private Integer supplier;

    private String suppliername;

    private BigDecimal totalmoney;

    private Integer state;

    private Integer waybillsno;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public String getCreatername() {
        return creatername;
    }

    public void setCreatername(String creatername) {
        this.creatername = creatername == null ? null : creatername.trim();
    }

    public Integer getChecker() {
        return checker;
    }

    public void setChecker(Integer checker) {
        this.checker = checker;
    }

    public String getCheckername() {
        return checkername;
    }

    public void setCheckername(String checkername) {
        this.checkername = checkername == null ? null : checkername.trim();
    }

    public Integer getStarter() {
        return starter;
    }

    public void setStarter(Integer starter) {
        this.starter = starter;
    }

    public String getStartername() {
        return startername;
    }

    public void setStartername(String startername) {
        this.startername = startername == null ? null : startername.trim();
    }

    public Integer getEnder() {
        return ender;
    }

    public void setEnder(Integer ender) {
        this.ender = ender;
    }

    public String getEndername() {
        return endername;
    }

    public void setEndername(String endername) {
        this.endername = endername == null ? null : endername.trim();
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getWaybillsno() {
        return waybillsno;
    }

    public void setWaybillsno(Integer waybillsno) {
        this.waybillsno = waybillsno;
    }
}