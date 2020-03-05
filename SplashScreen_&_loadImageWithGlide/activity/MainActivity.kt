package com.example.app_sample

import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.webkit.URLUtil
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(){


    private var et_url : EditText? = null
    private var btn_loadUrl : Button? = null
    private var img_image : ImageView? = null

    private var toolbar : Toolbar?  = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Home"
        et_url = findViewById(R.id.id_imageUrl)
        btn_loadUrl = findViewById(R.id.id_btn_load)
        img_image = findViewById(R.id.loaded_image)
        toolbar = findViewById(R.id.id_toolbar)
        setSupportActionBar(toolbar)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_mylist,menu)
        return super.onCreateOptionsMenu(menu)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item1 -> showToast("${item.title}")
            R.id.item2 -> showToast("${item.title}")
            R.id.item3 -> showToast("${item.title}")
            R.id.item4 -> showToast("${item.title}")
            R.id.item5 -> showToast("${item.title}")
            R.id.item6 -> showToast("${item.title}")
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showToast(str : String){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show()
    }
}