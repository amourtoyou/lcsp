package com.yx.lcsp.rsp;

public class RspClass<E>  extends RspBase{
    private E items;

    public E getItems() {
        return items;
    }

    public void setItems(E items) {
        this.items = items;
    }

    public RspClass() {
    }

    public RspClass(E items) {
        this.items = items;
    }

    public RspClass(String code, String flag, String msg, E items) {
        super(code, flag, msg);
        this.items = items;
    }

    @Override
    public String toString() {
        return "RspMuti{" +
                "items=" + items + "->" +
                super.toString() +
                '}';
    }
}
