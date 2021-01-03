package com.jim.module_main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jim.lib_common.app.global.ActivityRouterUrl

@Route(path = ActivityRouterUrl.ROUTE_MODULE_MAIN_MAIN_ACTIVITY)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_main_activity_main)
        findViewById<TextView>(R.id.tv_main).setOnClickListener {
            ARouter.getInstance().build(ActivityRouterUrl.ROUTE_MODULE_NEWS_NEWS_ACTIVITY).navigation()
        }
    }
}