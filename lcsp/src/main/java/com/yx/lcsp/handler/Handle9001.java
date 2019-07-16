package com.yx.lcsp.handler;

import com.yx.lcsp.modal.ResultItem;
import com.yx.lcsp.rqt.Rqt9001;
import com.yx.lcsp.rsp.RspBase;
import org.springframework.stereotype.Component;

@Component
public class Handle9001 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt9001 rqt = parseRqt(jsonStr, Rqt9001.class);
        if (rqt == null) {
            return getErrJson(FuncCode.DEMO_SINGLE);
        }

        //得到用户基本信息
        RspBase rsp;
        try {
            ResultItem resultItem = userMapper.handleSingle(rqt);
            rsp = new RspBase(rqt.getCode(), resultItem.getCbm(), resultItem.getCmsg());
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "处理单个数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
