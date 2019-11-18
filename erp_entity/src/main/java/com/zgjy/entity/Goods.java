package com.zgjy.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer gid;

    private String gname;

    private String origin;

    private String producter;

    private String unit;

    private BigDecimal inprice;

    private BigDecimal outprice;

    private Integer gcid;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter == null ? null : producter.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    public Integer getGcid() {
        return gcid;
    }

    public void setGcid(Integer gcid) {
        this.gcid = gcid;
    }
}