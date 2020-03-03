package com.example.pract_widgets

import android.app.Activity
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class CustomWebView(var progress : ProgressBar,var webView : WebView) : WebViewClient() {

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
        progress.visibility = View.VISIBLE
        webView.visibility = View.GONE
        Log.e("AXE","onPageStarted")
    }
    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
        progress.visibility = View.GONE
        webView.visibility = View.VISIBLE
        Log.e("AXE","onPageFinish")
    }

}
