package com.example.devbook

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Splash_Screen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)
        val top = AnimationUtils.loadAnimation(this, R.anim.top) as Animation
        val centre = AnimationUtils.loadAnimation(this, R.anim.centre) as Animation
        val bottom = AnimationUtils.loadAnimation(this, R.anim.bottom) as Animation
        val firstC = findViewById<ImageView>(R.id.Java_Circle)
        val secondC = findViewById<ImageView>(R.id.Android_Circle)
        val thirdC = findViewById<ImageView>(R.id.Competitive_Circle)
        val logo = findViewById<ImageView>(R.id.Logo_view)
        val textView = findViewById<TextView>(R.id.Text_view)
        firstC.animation = top
        secondC.animation = top
        thirdC.animation = top
        logo.animation = centre
        textView.animation = bottom
        Handler().postDelayed({
            val i = Intent(this@Splash_Screen, MainActivity::class.java)
            startActivity(i)
            finish()
        }, SPLASH_TIMER.toLong())
    }

    companion object {
        private const val SPLASH_TIMER = 5000
    }
}