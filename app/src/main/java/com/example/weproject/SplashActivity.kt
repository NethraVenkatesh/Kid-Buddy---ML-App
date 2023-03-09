package com.example.weproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

class SplashActivity : AppCompatActivity() {

    private val SPLAH_TIME: Long = 3000



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed( {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        },SPLAH_TIME)

    }
}