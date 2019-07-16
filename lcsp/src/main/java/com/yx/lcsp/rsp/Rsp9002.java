package com.yx.lcsp.rsp;


import com.yx.lcsp.modal.ZdItem;

import java.util.List;

public class Rsp9002 extends RspBase {
    private List<ZdItem> items;

    public Rsp9002() {
    }

    public Rsp9002(String code, String flag, String msg, List<ZdItem> items) {
        super(code, flag, msg);
        this.items = items;
    }

    public List<ZdItem> getItems() {
        return items;
    }

    public void setItems(List<ZdItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Rsp9002{" +
                "items=" + items.size() + "->" +
                super.toString() +
                '}';
    }
}
