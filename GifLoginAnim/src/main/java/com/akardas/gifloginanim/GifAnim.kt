package com.akardas.gifloginanim


import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout


public class GifAnim : LinearLayout {
    private lateinit var rocketAnimation: AnimationDrawable

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context, attrs, defStyle
    ) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(
        context, attrs
    ) {
        initView(context)
    }

    constructor(context: Context) : super(context) {
        initView(context)
    }

    private fun initView(context: Context) {
        inflate(context, R.layout.gif_layout, this)

        val image:ImageView = rootView.findViewById<ImageView>(R.id.myGif).apply {

            setBackgroundResource(R.drawable.gif_login_animation)
            rocketAnimation = background as AnimationDrawable
        }


        rocketAnimation.start()
    }
}