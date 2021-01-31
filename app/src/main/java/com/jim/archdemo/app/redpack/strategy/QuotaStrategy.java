package com.jim.archdemo.app.redpack.strategy;

import com.jim.archdemo.app.redpack.RedPacket;
import com.jim.lib_common.utl.LogUtil;

/**
 * 定额策略
 */
public class QuotaStrategy extends AmountStrategy {
    @Override
    public void sendRedPacket(RedPacket redPacket) {
        LogUtil.d("发定额红包");

    }
}
