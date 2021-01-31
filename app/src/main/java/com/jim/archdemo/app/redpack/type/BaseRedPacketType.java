package com.jim.archdemo.app.redpack.type;

public abstract class BaseRedPacketType {
    /**
     * 红包数量
     */
    private int amount;

    /**
     * 红包总额
     */
    private float sum;

    BaseRedPacketType(int amount, float sum) {
        this.amount = amount;
        this.sum = sum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
