package com.yx.lcsp.handler;

import com.yx.lcsp.modal.*;
import com.yx.lcsp.rqt.Rqt2001;
import com.yx.lcsp.rqt.Rqt2002;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

@Component
public class Handle2002 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        Rqt2002 rqt = parseRqt(jsonStr, Rqt2002.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }
        //得到用户基本信息
        RspBase rsp;
        try {
            if (rqt.getSq().equals("xyk")){
                Tbxyk items = userMapper.getxykid(rqt);
                rsp = new RspClass<Tbxyk>(rqt.getCode(), FuncCode.OK,null, items);
            }else if (rqt.getSq().equals("mjk")){
                Tbmjk items = userMapper.getmjkid(rqt);
                    rsp = new RspClass<Tbmjk>(rqt.getCode(), FuncCode.OK, null, items);
            }
            else if (rqt.getSq().equals("dz")){
                Tbdz items = userMapper.getdzid(rqt);
                    rsp = new RspClass<Tbdz>(rqt.getCode(), FuncCode.OK, null, items);
            }
            else if (rqt.getSq().equals("fwq")){
                Tbfwq items = userMapper.getfwqid(rqt);
                    rsp = new RspClass<Tbfwq>(rqt.getCode(), FuncCode.OK, null, items);

            }
            else if (rqt.getSq().equals("psd")){
                Tbpsd items = userMapper.getpsdid(rqt);
                    rsp = new RspClass<Tbpsd>(rqt.getCode(), FuncCode.OK, null, items);
            }else {
                rsp = new RspBase(rqt.getCode(), FuncCode.ERR,"没有此类型");
            }
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "处理数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
