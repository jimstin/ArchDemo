package com.jim.archdemo.app.redpack;

import com.jim.archdemo.app.redpack.digiccy.BaseDigiccy;
import com.jim.archdemo.app.redpack.greeting.BaseGreeting;
import com.jim.archdemo.app.redpack.type.BaseRedPacketType;

public class RedPacket {


    /**
     * 红包类型：个人红包或群红包
     */
    private BaseRedPacketType type;
    /**
     * 币种
     */
    private BaseDigiccy digiccy;


    private BaseGreeting greeting;

    /**
     * 构造方法
     *
     * @param type 红包类型
     * @param digiccy 数字货币种类
     * @param greeting 问候语
     */
    public RedPacket(BaseRedPacketType type, BaseDigiccy digiccy, BaseGreeting greeting) {
        this.type = type;
        this.digiccy = digiccy;
        this.greeting = greeting;
    }

    public BaseDigiccy getDigiccy() {
        return digiccy;
    }

    public void setDigiccy(BaseDigiccy digiccy) {
        this.digiccy = digiccy;
    }


    public BaseRedPacketType getType() {
        return type;
    }

    public void setType(BaseRedPacketType type) {
        this.type = type;
    }

    public BaseGreeting getGreeting() {
        return greeting;
    }

    public void setGreeting(BaseGreeting greeting) {
        this.greeting = greeting;
    }
}
