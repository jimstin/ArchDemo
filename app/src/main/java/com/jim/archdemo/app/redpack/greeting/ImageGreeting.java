package com.jim.archdemo.app.redpack.greeting;

public class ImageGreeting extends GreetingDecorator {

    public ImageGreeting(BaseGreeting greeting) {
        super(greeting);
    }

    @Override
    public String getGreeting() {
        return super.getGreeting()+ addImage();
    }

    private String addImage() {
        return "添加一个图片表情";
    }
}
