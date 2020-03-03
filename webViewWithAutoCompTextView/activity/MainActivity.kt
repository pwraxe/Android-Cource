package com.example.pract_widgets

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    private var et_url : AutoCompleteTextView? = null
    private var btn_search : ImageButton? = null
    private var webView : WebView? = null
    private var progress : ProgressBar? = null


    var suggestionList = arrayOf("apple.com","google.com","youtube.com",
        "play.google.com","docs.google.com", "support.google.com", "www.blogger.com",
        "microsoft.com", "adobe.com", "wordpress.org", "mozilla.org", "en.wikipedia.org", "linkedin.com",
        "accounts.google.com", "plus.google.com", "vimeo.com", "github.com", "maps.google.com",
        "youtu.be", "drive.google.com", "bp.blogspot.com", "sites.google.com",
        "cloudflare.com", "googleusercontent.com", "istockphoto.com", "amazon.com", "dailymotion.com",
        "medium.com", "facebook.com", "developers.google.com", "whatsapp.com", "feedburner.com",
        "hugedomains.com", "w3.org", "myspace.com", "translate.google.com", "search.google.com",
        "youronlinechoices.com", "hatena.ne.jp", "aliexpress.com", "code.google.com",
        "soundcloud.com", "android.com", "sciencedirect.com", "quora.com", "sciencedaily.com",
        "gamespot.com", "lonelyplanet.com", "allrecipes.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_url = findViewById(R.id.id_url)
        btn_search = findViewById(R.id.id_searchButton)
        webView = findViewById(R.id.id_webView)
        progress = findViewById(R.id.id_progress)

        val myAdapt  = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestionList)
        et_url?.setAdapter(myAdapt)
        et_url?.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus){
                et_url?.showDropDown()
            }
        }
        btn_search?.setOnClickListener {

            val url = et_url?.text.toString()
            if(TextUtils.isEmpty(url)){
                et_url?.error = "Enter URL,Please"
                return@setOnClickListener
            }
            if(!URLUtil.isValidUrl("https://www.$url")){
                et_url?.error = "Invalid URL \nPlease Enter Ex. google.com"
                return@setOnClickListener
            }
            webView?.loadUrl("https://www.$url")
            webView?.webViewClient = CustomWebView(progress!!,webView!!)
        }


    }


}