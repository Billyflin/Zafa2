package com.example.zafa2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivities(Intent(this, MainActivity::class.java))
    }

    private fun startActivities(intent: Intent) {

    }
}