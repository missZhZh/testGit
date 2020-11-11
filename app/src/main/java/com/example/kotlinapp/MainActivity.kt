package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.hello)
        tv.setOnClickListener {
            startActivity(Intent(this,Aactivity::class.java))
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

    override fun onRestart() {
        super.onRestart()
        Log.d("=====","==onRestart");
    }
}
