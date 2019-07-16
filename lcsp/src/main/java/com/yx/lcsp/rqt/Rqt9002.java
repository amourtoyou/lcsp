package com.yx.lcsp.rqt;

/**
 * @desc : 用户端得到医院列表
 */
public class Rqt9002 extends RqtBase {
    private String gltj;

    public Rqt9002() {
    }

    public Rqt9002(String code, String gltj) {
        super(code);
        this.gltj = gltj;
    }

    public String getGltj() {
        return gltj;
    }

    public void setGltj(String gltj) {
        this.gltj = gltj;
    }
}
