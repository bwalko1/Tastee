package com.benwalko.tastee.activities.landing

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.benwalko.tastee.R
import com.benwalko.tastee.activities.menu.MenuActivity
import com.benwalko.tastee.animations.CustomAnimations
import kotlinx.android.synthetic.main.content_landing.*

class LandingActivity : AppCompatActivity() {
    private var customAnimations = CustomAnimations(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        btn_get_tastee.startAnimation(customAnimations.fadeInAnimation())
        setButtonClickListener(btn_get_tastee)
    }

    private fun setButtonClickListener(button: Button) {
        button.setOnClickListener {
            openMenuActivity()
        }
    }

    private fun openMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}
