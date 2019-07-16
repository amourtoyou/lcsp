package com.yx.lcsp.rqt;

public class Rqt1011 extends RqtBase{
   private String key;
   private String xh;
   private String xm;
   private String xb;
   private String csrq;
   private String yxxx;
   private String sqdz;
   private String yysj;

    public Rqt1011() {
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

    public String getCqdz() {
        return sqdz;
    }

    public void setCqdz(String sqdz) {
        this.sqdz = sqdz;
    }

    public String getYysj() {
        return yysj;
    }

    public void setYysj(String yysj) {
        this.yysj = yysj;
    }

    public Rqt1011(String key, String xh, String xm, String xb, String csrq, String yxxx, String sqdz, String yysj) {
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.xb = xb;
        this.csrq = csrq;
        this.yxxx = yxxx;
        this.sqdz = sqdz;
        this.yysj = yysj;
    }

    public Rqt1011(String code, String key, String xh, String xm, String xb, String csrq, String yxxx, String sqdz, String yysj) {
        super(code);
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.xb = xb;
        this.csrq = csrq;
        this.yxxx = yxxx;
        this.sqdz = sqdz;
        this.yysj = yysj;
    }
}
