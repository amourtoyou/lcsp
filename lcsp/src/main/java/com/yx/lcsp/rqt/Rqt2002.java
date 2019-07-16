package com.yx.lcsp.rqt;

public class Rqt2002 extends RqtBase{
    private String key;
    private int id;
    private String sq;

    public Rqt2002(String key, int id, String sq) {
        this.key = key;
        this.id = id;
        this.sq = sq;
    }

    public Rqt2002(String code, String key, int id, String sq) {
        super(code);
        this.key = key;
        this.id = id;
        this.sq = sq;
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

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public Rqt2002() {
    }

}
