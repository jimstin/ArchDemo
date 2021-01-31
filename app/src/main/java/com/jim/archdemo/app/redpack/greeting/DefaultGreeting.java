package com.jim.archdemo.app.redpack.greeting;

import com.jim.lib_common.utl.LogUtil;

/**
 * 默认问候语
 */
public class DefaultGreeting extends BaseGreeting {

    @Override
    public String getGreeting() {
        return "这是默认文本问候语";
    }
}
