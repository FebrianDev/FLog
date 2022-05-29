package com.febrian.flog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Flog.v("Hello Verbose")
        Flog.d("Hello Debug")
        Flog.i("Hello Info")
        Flog.w("Hello Warn")
        Flog.e("Hello Error")

    }
}