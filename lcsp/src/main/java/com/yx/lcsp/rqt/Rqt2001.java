package com.yx.lcsp.rqt;

public class Rqt2001 extends RqtBase{
    private String key;

    public Rqt2001() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Rqt2001(String key) {
        this.key = key;
    }

    public Rqt2001(String code, String key) {
        super(code);
        this.key = key;
    }
}
