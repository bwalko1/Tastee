package com.benwalko.tastee.activities.landing

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.Button
import com.benwalko.tastee.R
import com.benwalko.tastee.activities.menu.MenuActivity
import kotlinx.android.synthetic.main.content_landing.*

class LandingActivity : AppCompatActivity() {
    var animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
    var menu = MenuActivity.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_landing)
        setButtonClickListener(btn_get_tastee, this.menu)


    }

    private fun setButtonClickListener(button: Button, activity: Activity) {
        button.setOnClickListener {
            startActivity(Intent(this, activity::class.java))
        }
    }
}
