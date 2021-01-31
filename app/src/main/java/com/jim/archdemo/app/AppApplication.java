package com.jim.archdemo.app;

import com.jim.archdemo.app.redpack.RedPacket;
import com.jim.archdemo.app.redpack.RedPacketContext;
import com.jim.archdemo.app.redpack.digiccy.AITDDigiccy;
import com.jim.archdemo.app.redpack.digiccy.BaseDigiccy;
import com.jim.archdemo.app.redpack.greeting.BaseGreeting;
import com.jim.archdemo.app.redpack.greeting.DefaultGreeting;
import com.jim.archdemo.app.redpack.greeting.ImageGreeting;
import com.jim.archdemo.app.redpack.strategy.AmountStrategy;
import com.jim.archdemo.app.redpack.strategy.LuckStrategy;
import com.jim.archdemo.app.redpack.type.BaseRedPacketType;
import com.jim.archdemo.app.redpack.type.GroupRedPacketType;
import com.jim.lib_common.app.BaseApplication;

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void testSendRedPacket() {
        //发群红包，10个，共100元
        BaseRedPacketType type = new GroupRedPacketType(10, 100);

        //币种：aitd
        BaseDigiccy aitd = new AITDDigiccy();

        //问候语：图片表情问候语
        BaseGreeting greeting = new DefaultGreeting();
        ImageGreeting imageGreeting = new ImageGreeting(greeting);

        //创建红包
        RedPacket redPacket = new RedPacket(type, aitd, imageGreeting);
        //额度策略：拼手气红包
        AmountStrategy strategy = new LuckStrategy();

        //发送红包
        RedPacketContext.sendRedPacket(redPacket, strategy);
    }
}
