package com.example.calcintentweb

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebActivity : AppCompatActivity() {
    lateinit var mywebview:WebView
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        mywebview=findViewById(R.id.webView2)
        //calling the function..click on the torch then select surpress
        webview()
    }
     @RequiresApi(Build.VERSION_CODES.O)
     private fun webview(){
         mywebview.webViewClient= WebViewClient()
//linking the home page url
         mywebview.apply {
             loadUrl("https://www.google.com/search?q=emobilis&sxsrf=ALiCzsZc40sg5PffCGyevLBP5JWSKiYzkg%3A1669013268933&ei=FB97Y-isOLubkdUP_uWIoAQ&gs_ssp=eJzj4tFP1zfMSDbOjY8vNDRgtFI1qDC0MEozNDcxTDGySDMzNze3MqhItrBMTUoyNbVMMkhJtDQ08uJIzc1PyszJLAYAKEgSCA&oq=emob&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgBMgQIIxAnMg0ILhCvARDHARCABBBDMggIABDjBBDpBDIICAAQ4wQQ6QQyCAgAEOMEEOkEMggIABDjBBDpBDIICAAQ4wQQ6QQyCAgAEOMEEOkEMgQIABBDMgQIABBDOgoIABBHENYEELADOgcIABCwAxBDOhIILhDHARCvARDIAxCwAxBDGAE6EgguEMcBENEDEMgDELADEEMYAToHCCMQ6gIQJzoHCC4Q6gIQJzoKCC4QxwEQrwEQQzoKCC4QrwEQxwEQQ0oECEEYAEoECEYYAFCSpwFYvK8BYIDDAWgDcAF4AIABogSIAbwKkgEJMi0yLjEuMC4xmAEAoAEBsAEKyAENwAEB2gEECAEYCA&sclient=gws-wiz-serp")

             settings.javaScriptEnabled=true
             //click on the torch then select the first function
             settings.safeBrowsingEnabled=true

             //then go to the manifest ((users permision...
         }

    }
// going back to the previous web site
    @SuppressLint("SuspiciousIndentation")
    override fun onBackPressed() {
        if (mywebview.canGoBack())mywebview.goBack()else
        super.onBackPressed()
    }
}