package com.benwalko.tastee.activities.menu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.benwalko.tastee.R
import com.benwalko.tastee.animations.CustomAnimations
import kotlinx.android.synthetic.main.content_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val customAnimations = CustomAnimations(this)
        tv_screee.startAnimation(customAnimations.fadeInAnimation())
    }
}