package com.yx.lcsp.rqt;

/**
 * @desc : 返回标准单行数据
 */
public class Rqt9001 extends RqtBase {
    private String arg0;
    private String arg1;

    public Rqt9001() {
    }

    public Rqt9001(String code, String arg0, String arg1) {
        super(code);
        this.arg0 = arg0;
        this.arg1 = arg1;
    }

    public String getArg0() {
        return arg0;
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    @Override
    public String toString() {
        return "Rqt9001{" +
                "arg0='" + arg0 + '\'' +
                ", arg1='" + arg1 + '\'' +
                '}';
    }
}
