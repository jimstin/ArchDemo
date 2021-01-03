package com.jim.module_main

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/module_main/SplashActivity")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_main_activity_splash)
        findViewById<TextView>(R.id.tv_welcome).postDelayed({
            ARouter.getInstance().build("/module_main/MainActivity").navigation()
        },3000)

        Log.i("jim", "SplashActivity onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i("jim", "SplashActivity onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("jim", "SplashActivity onResume")

    }
}