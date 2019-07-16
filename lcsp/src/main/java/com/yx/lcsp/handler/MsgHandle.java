package com.yx.lcsp.handler;

/**
 * @desc : 通用消息处理器接口
 */
public interface MsgHandle {
    String handle(String jsonStr);
}
