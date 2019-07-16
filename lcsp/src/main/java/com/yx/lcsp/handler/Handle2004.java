package com.yx.lcsp.handler;

import com.yx.lcsp.modal.Count;
import com.yx.lcsp.modal.TongJi;
import com.yx.lcsp.rqt.Rqt2001;
import com.yx.lcsp.rqt.RqtBase;
import com.yx.lcsp.rsp.RspBase;
import com.yx.lcsp.rsp.RspClass;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Handle2004 extends HandleBase {
    public String handle(String jsonStr) {
        //解析请求参数
        RqtBase rqt = parseRqt(jsonStr, RqtBase.class);
        if (rqt == null) {
                return getErrJson(FuncCode.DEMO_MUTI);
        }
        //得到用户基本信息
        RspBase rsp;
        try {
            List<TongJi> items = userMapper.gettongji();
            Map<String,Object> map = new HashMap<>();
            for (int i =0;i<items.size();i++){
                Integer[] arr = new Integer[7];
                arr[0] = items.get(i).getZd1();
                arr[1] = items.get(i).getZd2();
                arr[2] = items.get(i).getZd3();
                arr[3] = items.get(i).getZd4();
                arr[4] = items.get(i).getZd5();
                arr[5] = items.get(i).getZd6();
                arr[6] = items.get(i).getZd7();
                map.put(String.valueOf(i),arr);
            }
            rsp = new RspClass<Map<String,Object>>(rqt.getCode(), FuncCode.OK,null, map);
        } catch (Exception e) {
            rsp = new RspBase(rqt.getCode(), FuncCode.ERR, "处理数据失败!");
        }

        //返回处理结果
        return getJson(rsp);
    }
}
