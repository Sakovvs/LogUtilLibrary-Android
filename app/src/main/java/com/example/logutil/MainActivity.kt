package com.example.logutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logutillibrary.LogDebug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

LogDebug.d("adsa")
    }

}
