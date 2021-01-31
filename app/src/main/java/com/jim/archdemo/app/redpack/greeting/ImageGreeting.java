package com.jim.archdemo.app.redpack.greeting;

import com.jim.lib_common.utl.LogUtil;

public class ImageGreeting extends GreetingDecorator {

    public ImageGreeting(BaseGreeting greeting) {
        super(greeting);
    }

    @Override
    public void showGreeting() {
        super.showGreeting();

        addImage();
    }

    private void addImage() {
        LogUtil.d("添加一个图片表情");
    }
}
