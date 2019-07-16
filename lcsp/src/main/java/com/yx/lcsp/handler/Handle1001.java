package com.yx.lcsp.handler;

import com.yx.lcsp.modal.ResultItem;
import com.yx.lcsp.modal.ZdItem;
import com.yx.lcsp.rqt.Rqt1001;
import com.yx.lcsp.rqt.Rqt9002;
import com.yx.lcsp.rsp.Rsp9002;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Handle1001 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt1001 rqt = parseRqt(jsonStr, Rqt1001.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }

        //得到用户基本信息
        RspBase rsp;
        try {
            ResultItem items = userMapper.login(rqt);
            rsp = new RspClass<ResultItem>(rqt.getCode(), FuncCode.OK,null, items);
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "1001数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
