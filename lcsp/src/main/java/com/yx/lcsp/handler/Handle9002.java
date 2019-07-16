package com.yx.lcsp.handler;

import com.yx.lcsp.modal.ZdItem;
import com.yx.lcsp.rqt.Rqt9002;
import com.yx.lcsp.rsp.Rsp9002;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Handle9002 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt9002 rqt = parseRqt(jsonStr, Rqt9002.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }

        //得到用户基本信息
        Rsp9002 rsp;
        try {
            List<ZdItem> zdItems = userMapper.handleMuti(rqt);
            rsp = new Rsp9002(rqt.getCode(), FuncCode.OK, null, zdItems);
        } catch (Exception e) {
            rsp = new Rsp9002(rqt.getCode(), FuncCode.ERR, "处理多行数据失败!", null);
        }

        //返回处理结果
        return getJson(rsp);
    }
}
