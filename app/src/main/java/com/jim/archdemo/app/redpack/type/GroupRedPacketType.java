package com.jim.archdemo.app.redpack.type;

/**
 * 个人红包（好友红包）
 */
public class GroupRedPacketType extends BaseRedPacketType {
    /**
     *
     * @param amount 红包数量
     * @param sum 金额总数
     */
    public GroupRedPacketType(int amount, float sum) {
        super(amount, sum);
    }
}
