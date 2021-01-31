package com.jim.archdemo.app.redpack.strategy;

import com.jim.archdemo.app.redpack.RedPacket;
import com.jim.lib_common.utl.LogUtil;

/**
 * 手气策略
 */
public class LuckStrategy extends AmountStrategy {
    @Override
    public void sendRedPacket(RedPacket redPacket) {
        LogUtil.d("发手气红包");
    }
}
