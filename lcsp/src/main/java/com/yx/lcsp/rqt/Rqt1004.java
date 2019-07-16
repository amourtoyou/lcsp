package com.yx.lcsp.rqt;

public class Rqt1004 extends RqtBase{
   private String key;
   private String cgl1;
   private String cgl2;

    public Rqt1004() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCgl1() {
        return cgl1;
    }

    public void setCgl1(String cgl1) {
        this.cgl1 = cgl1;
    }

    public String getCgl2() {
        return cgl2;
    }

    public void setCgl2(String cgl2) {
        this.cgl2 = cgl2;
    }

    public Rqt1004(String key, String cgl1, String cgl2) {
        this.key = key;
        this.cgl1 = cgl1;
        this.cgl2 = cgl2;
    }

    public Rqt1004(String code, String key, String cgl1, String cgl2) {
        super(code);
        this.key = key;
        this.cgl1 = cgl1;
        this.cgl2 = cgl2;
    }
}
