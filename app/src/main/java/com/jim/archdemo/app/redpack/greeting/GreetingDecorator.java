package com.jim.archdemo.app.redpack.greeting;

/**
 * 问候语装饰者
 */
class GreetingDecorator extends BaseGreeting {

    private BaseGreeting greeting;

    public GreetingDecorator(BaseGreeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public String getGreeting() {
       return greeting.getGreeting();
    }
}
