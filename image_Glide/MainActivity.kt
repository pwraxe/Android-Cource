package com.example.app_sample

import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.webkit.URLUtil
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(){


    private var et_url : EditText? = null
    private var btn_loadUrl : Button? = null
    private var img_image : ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_url = findViewById(R.id.id_imageUrl)
        btn_loadUrl = findViewById(R.id.id_btn_load)
        img_image = findViewById(R.id.loaded_image)

        btn_loadUrl?.setOnClickListener {
            val url = et_url?.text.toString().trim()
            if(TextUtils.isEmpty(url)) {
                et_url?.error = "w/o url cannot load image"
                return@setOnClickListener
            }
            if(!URLUtil.isValidUrl(url)){
                et_url?.error = "Invalid URL Entered"
                return@setOnClickListener
            }

            Glide.with(this).load(url).into(img_image!!)

        }
    }
}