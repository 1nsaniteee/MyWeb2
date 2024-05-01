package com.pickersoft.myweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWeb = findViewById<WebView>(R.id.MyWebView)

        myWeb.webViewClient = WebViewClient()

        // change lang and link
        myWeb.apply {
            loadUrl("https://www.youtube.com")
            settings.javaScriptEnabled = true
        }
    }
}