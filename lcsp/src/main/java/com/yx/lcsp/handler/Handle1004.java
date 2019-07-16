package com.yx.lcsp.handler;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yx.lcsp.modal.ResultItem;
import com.yx.lcsp.modal.Tbxyk;
import com.yx.lcsp.rqt.Rqt1003;
import com.yx.lcsp.rqt.Rqt1004;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Handle1004 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt1004 rqt = parseRqt(jsonStr, Rqt1004.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }
        //得到用户基本信息
        RspBase rsp;
        try {
            List<Tbxyk> items = userMapper.getxyk(rqt);
            if(items.size() == 0){
                rsp = new RspClass<List<Tbxyk>>(rqt.getCode(), FuncCode.OK, null,items);
            }
            else if (!(items.get(0).getIid() == 0)){
                rsp = new RspClass<List<Tbxyk>>(rqt.getCode(), FuncCode.OK, null,items);
            }else{
                rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "登录失效！");
            }
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "获取数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
