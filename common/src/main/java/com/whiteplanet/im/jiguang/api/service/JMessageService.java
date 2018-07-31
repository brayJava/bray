package com.whiteplanet.im.jiguang.api.service;
/**
 * @author:wuzhiyuan
 * @description: 历史IM消息操作接口
 * @date: Created in 18:39 2018/02/01
 * @modified By:
 */
public interface JMessageService {
    /**
     * 消息同步
     */
    void synchronousJMessage();
    /**
     * IM消息通知
     */
    void adviceJMessage();
}
