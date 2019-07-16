package com.yx.lcsp.rqt;

public class Rqt1014 extends RqtBase{
   private String key;
   private String xh;
   private String xm;
   private String user;
   private String opsd;
   private int type;
   private String npsd;
   private String bz;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getOpsd() {
        return opsd;
    }

    public void setOpsd(String opsd) {
        this.opsd = opsd;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNpsd() {
        return npsd;
    }

    public void setNpsd(String npsd) {
        this.npsd = npsd;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Rqt1014() {
    }

    public Rqt1014(String key, String xh, String xm, String user, String opsd, int type, String npsd, String bz) {
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.user = user;
        this.opsd = opsd;
        this.type = type;
        this.npsd = npsd;
        this.bz = bz;
    }

    public Rqt1014(String code, String key, String xh, String xm, String user, String opsd, int type, String npsd, String bz) {
        super(code);
        this.key = key;
        this.xh = xh;
        this.xm = xm;
        this.user = user;
        this.opsd = opsd;
        this.type = type;
        this.npsd = npsd;
        this.bz = bz;
    }
}
