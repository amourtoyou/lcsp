package com.yx.lcsp.modal;

public class Count {
    private int xyk;
    private int mjk;
    private int dz;
    private int fwq;
    private int psd;

    public Count() {
    }

    public Count(int xyk, int mjk, int dz, int fwq, int psd) {
        this.xyk = xyk;
        this.mjk = mjk;
        this.dz = dz;
        this.fwq = fwq;
        this.psd = psd;
    }

    public int getXyk() {
        return xyk;
    }

    public void setXyk(int xyk) {
        this.xyk = xyk;
    }

    public int getMjk() {
        return mjk;
    }

    public void setMjk(int mjk) {
        this.mjk = mjk;
    }

    public int getDz() {
        return dz;
    }

    public void setDz(int dz) {
        this.dz = dz;
    }

    public int getFwq() {
        return fwq;
    }

    public void setFwq(int fwq) {
        this.fwq = fwq;
    }

    public int getPsd() {
        return psd;
    }

    public void setPsd(int psd) {
        this.psd = psd;
    }
}
