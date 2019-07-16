package com.yx.lcsp.handler;

import com.yx.lcsp.modal.ResultItem;
import com.yx.lcsp.rqt.Rqt1002;
import com.yx.lcsp.rqt.Rqt1014;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

@Component
public class Handle1014 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt1014 rqt = parseRqt(jsonStr, Rqt1014.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }
        //得到用户基本信息
        RspBase rsp;
        try {
            ResultItem items = userMapper.addpsd(rqt);
            rsp = new RspClass<ResultItem>(rqt.getCode(), FuncCode.OK, null,items);
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "1001数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
