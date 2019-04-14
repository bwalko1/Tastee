package com.benwalko.tastee.activities.menu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.benwalko.tastee.R

class MenuActivity : AppCompatActivity() {
    companion object Factory {
        fun create(): MenuActivity =
            MenuActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
}