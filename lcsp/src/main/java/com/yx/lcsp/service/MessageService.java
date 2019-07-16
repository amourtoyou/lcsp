package com.yx.lcsp.service;

import com.alibaba.fastjson.JSONObject;
import com.yx.lcsp.comm.SpringUtil;
import com.yx.lcsp.handler.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    public String handleMsg(String jsonStr) {
        MsgHandle handle = getHandler(jsonStr);
        return handle.handle(jsonStr);
    }

    private MsgHandle getHandler(String jsonStr) {
        MsgHandle msgHandle = SpringUtil.getBean(HandlerDefault.class);

        try {//根据请求功能代码得到对应处理器
            JSONObject jsonObject = JSONObject.parseObject(jsonStr);
            String code = (String) jsonObject.get("code");

            //演示接口
            if (code.equalsIgnoreCase(FuncCode.DEMO_SINGLE))
                msgHandle = SpringUtil.getBean(Handle9001.class);
            if (code.equalsIgnoreCase(FuncCode.DEMO_MUTI))
                msgHandle = SpringUtil.getBean(Handle9002.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_LOGIN))
                msgHandle = SpringUtil.getBean(Handle1001.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GXYK))
                msgHandle = SpringUtil.getBean(Handle1002.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_CXYK))
                msgHandle = SpringUtil.getBean(Handle1003.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_DXYK))
                msgHandle = SpringUtil.getBean(Handle1004.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_AMJK))
                msgHandle = SpringUtil.getBean(Handle1005.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_CMJK))
                msgHandle = SpringUtil.getBean(Handle1006.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_DMJK))
                msgHandle = SpringUtil.getBean(Handle1007.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_AFWQ))
                msgHandle = SpringUtil.getBean(Handle1008.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_CFWQ))
                msgHandle = SpringUtil.getBean(Handle1009.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GFWQ))
                msgHandle = SpringUtil.getBean(Handle1010.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_ADZ))
                msgHandle = SpringUtil.getBean(Handle1011.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_CDZ))
                msgHandle = SpringUtil.getBean(Handle1012.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GDZ))
                msgHandle = SpringUtil.getBean(Handle1013.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_APSD))
                msgHandle = SpringUtil.getBean(Handle1014.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_CPSD))
                msgHandle = SpringUtil.getBean(Handle1015.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GPSD))
                msgHandle = SpringUtil.getBean(Handle1016.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GCOT))
                msgHandle = SpringUtil.getBean(Handle2001.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GXMG))
                msgHandle = SpringUtil.getBean(Handle2002.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GALL))
                msgHandle = SpringUtil.getBean(Handle2003.class);
            if (code.equalsIgnoreCase(FuncCode.LCSP_GFMG))
                msgHandle = SpringUtil.getBean(Handle2004.class);
        } catch (Exception e) {
            log.info(e.getMessage());
        }

        return msgHandle;
    }
}
