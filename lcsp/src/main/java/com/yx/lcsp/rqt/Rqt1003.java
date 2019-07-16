package com.yx.lcsp.rqt;

public class Rqt1003 extends RqtBase{
   private String key;
   private int id;
   private String zt;
   private String msg;

    public Rqt1003() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Rqt1003(String key, int id, String zt, String msg) {
        this.key = key;
        this.id = id;
        this.zt = zt;
        this.msg = msg;
    }

    public Rqt1003(String code, String key, int id, String zt, String msg) {
        super(code);
        this.key = key;
        this.id = id;
        this.zt = zt;
        this.msg = msg;
    }
}
