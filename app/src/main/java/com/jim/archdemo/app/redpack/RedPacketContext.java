package com.jim.archdemo.app.redpack;

import com.jim.archdemo.app.redpack.strategy.AmountStrategy;
import com.jim.archdemo.app.redpack.strategy.LuckStrategy;

public class RedPacketContext {



    /**
     * 发送包
     * @param redPacket 红包实体类
     * @param strategy 额度策略：拼手气或定额
     */
    public static void sendRedPacket(RedPacket redPacket, AmountStrategy strategy) {
        if(strategy == null) {
            strategy = new LuckStrategy();
        }
        strategy.sendRedPacket(redPacket);
    }

    /**
     * 显示在聊天列表总
     */
    public void showOnChatList() {

    }

    /**
     * 显示预览窗口
     */
    public void showPreViewDialog() {

    }

    public void open() {

    }

}
