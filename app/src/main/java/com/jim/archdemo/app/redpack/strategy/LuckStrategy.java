package com.jim.archdemo.app.redpack.strategy;

import com.jim.archdemo.app.redpack.RedPacket;
import com.jim.lib_common.utl.LogUtil;

/**
 * 手气策略
 */
public class LuckStrategy extends AmountStrategy {
    @Override
    public void sendRedPacket(RedPacket redPacket) {
        StringBuffer sb = new StringBuffer();
        sb.append("红包策略："+"手气红包");
        sb.append("币种："+redPacket.getDigiccy().getName());
        sb.append("红包类型："+redPacket.getType().getTypeName() +
                " 数量："+redPacket.getType().getAmount() +
                " 总金额："+redPacket.getType().getSum());
        sb.append("问候语："+redPacket.getGreeting().getGreeting());
        LogUtil.d(sb.toString());
    }
}
