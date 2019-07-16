package com.yx.lcsp.handler;

import com.yx.lcsp.modal.Tbdz;
import com.yx.lcsp.modal.UnionAll;
import com.yx.lcsp.rqt.Rqt1004;
import com.yx.lcsp.rqt.Rqt2001;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Handle2003 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt2001 rqt = parseRqt(jsonStr, Rqt2001.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }
        //得到用户基本信息
        RspBase rsp;
        try {
            List<UnionAll> items = userMapper.getAllOrder(rqt);
            rsp = new RspClass<List<UnionAll>>(rqt.getCode(), FuncCode.OK, null,items);
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
