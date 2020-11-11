package com.example.kotlinapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * @Description
 * @Author: 张朝
 * @CreateDate: 2020/10/27
 * @UpdateUser
 * @CreateDate
 */
class Aactivity : AppCompatActivity() {
    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("=====","==onCreate");
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.hello)
        tv.setOnClickListener {
            this.finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("=====","==onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d("=====","==onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.d("=====","==onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.d("=====","==onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("=====","==onDestroy");
    }
}