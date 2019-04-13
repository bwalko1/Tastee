package com.benwalko.tastee

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_landing.*

class Landing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        bigButton.setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
        }
    }
}
