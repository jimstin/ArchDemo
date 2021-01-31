package com.jim.archdemo.app.redpack.type;

/**
 * 个人红包（好友红包）
 */
public class PersonalRedPacketType extends BaseRedPacketType {
    /**
     * 构造方法，默认红包数量为1
     * @param sum 总金额
     */
    public PersonalRedPacketType(float sum) {
        super(1, sum);
    }

    @Override
    public String getTypeName() {
        return "好友红包";
    }
}
