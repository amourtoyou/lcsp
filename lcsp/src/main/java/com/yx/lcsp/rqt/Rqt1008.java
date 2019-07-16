package com.yx.lcsp.rqt;

public class Rqt1008 extends RqtBase{
   private String key;
   private String xh;
   private String xm;
   private String xb;
   private String csrq;
   private String yxxx;

    public Rqt1008() {
    }

    public Rqt1008(String key, String xh, String xm, String xb, String csrq, String yxxx) {
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.xb = xb;
        this.csrq = csrq;
        this.yxxx = yxxx;
    }

    public Rqt1008(String code, String key, String xh, String xm, String xb, String csrq, String yxxx) {
        super(code);
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.xb = xb;
        this.csrq = csrq;
        this.yxxx = yxxx;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getYxxx() {
        return yxxx;
    }

    public void setYxxx(String yxxx) {
        this.yxxx = yxxx;
    }
}
