package com.yx.lcsp.modal;

public class ZdItem {
    private int iid;
    private String cbm;
    private String cmc;
    private String cbz;

    public ZdItem() {
    }

    public ZdItem(int iid, String cbm, String cmc, String cbz) {
        this.iid = iid;
        this.cbm = cbm;
        this.cmc = cmc;
        this.cbz = cbz;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getCbm() {
        return cbm;
    }

    public void setCbm(String cbm) {
        this.cbm = cbm;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getCbz() {
        return cbz;
    }

    public void setCbz(String cbz) {
        this.cbz = cbz;
    }

    @Override
    public String toString() {
        return "ZdItem{" +
                "iid=" + iid +
                ", cbm='" + cbm + '\'' +
                ", cmc='" + cmc + '\'' +
                ", cbz='" + cbz + '\'' +
                '}';
    }
}
