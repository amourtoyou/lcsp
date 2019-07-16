package com.yx.lcsp.rqt;

public class Rqt1001 extends RqtBase{
    private int type;
    private String usr;
    private String pwd;

    public Rqt1001() {
    }

    public Rqt1001(int type, String usr, String pwd) {
        this.type = type;
        this.usr = usr;
        this.pwd = pwd;
    }

    public Rqt1001(String code, int type, String usr, String pwd) {
        super(code);
        this.type = type;
        this.usr = usr;
        this.pwd = pwd;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
