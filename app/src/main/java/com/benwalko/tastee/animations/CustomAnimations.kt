package com.benwalko.tastee.animations

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.benwalko.tastee.R

class CustomAnimations(private var context: Context) {

    fun bounceAnimation(): Animation {
        return AnimationUtils.loadAnimation(context, R.anim.bounce)
    }

    fun fadeOutAnimation(): Animation {
        return AnimationUtils.loadAnimation(context, R.anim.fadeout)
    }

    fun fadeInAnimation(): Animation {
        return AnimationUtils.loadAnimation(context, R.anim.fadein)
    }

    fun blinkAnimation(): Animation {
        return AnimationUtils.loadAnimation(context, R.anim.blink_anim)
    }

    fun slideInTop(): Animation {
        return AnimationUtils.loadAnimation(context, R.anim.slide_in_top)
    }
}