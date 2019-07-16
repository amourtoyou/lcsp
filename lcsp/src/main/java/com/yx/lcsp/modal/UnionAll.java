package com.yx.lcsp.modal;

public class UnionAll {
    private int iid;
    private String sq;
    private String cxh;
    private String cxm;
    private String dsqsj;
    private String czt;

    public UnionAll() {
    }

    public UnionAll(int iid, String sq, String cxh, String cxm, String dsqsj, String czt) {
        this.iid = iid;
        this.sq = sq;
        this.cxh = cxh;
        this.cxm = cxm;
        this.dsqsj = dsqsj;
        this.czt = czt;
    }

    public int getId() {
        return iid;
    }

    public void setId(int iid) {
        this.iid = iid;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public String getCxh() {
        return cxh;
    }

    public void setCxh(String cxh) {
        this.cxh = cxh;
    }

    public String getCxm() {
        return cxm;
    }

    public void setCxm(String cxm) {
        this.cxm = cxm;
    }

    public String getDsqsj() {
        return dsqsj;
    }

    public void setDsqsj(String dsqsj) {
        this.dsqsj = dsqsj;
    }

    public String getCzt() {
        return czt;
    }

    public void setCzt(String czt) {
        this.czt = czt;
    }
}
