package com.dan.helloworld


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById<View>(R.id.ivImage) as ImageView

        val url = "https://raw.githubusercontent.com/bumptech/glide/master/static/glide_logo.png"

        Glide
            .with(this)
            .load(url)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(imageView)

    }



}