package com.jim.archdemo.app.redpack.strategy;

import com.jim.archdemo.app.redpack.RedPacket;

/**
 * 额度策略：手气策略和定额策略
 */
public abstract class AmountStrategy {
    public abstract void sendRedPacket(RedPacket redPacket);
}
