package com.innopolis.trashrecycle.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.innopolis.trashrecycle.R
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true
        webView.settings.domStorageEnabled = true

        webView.loadUrl("https://recyclemap.ru/kazan")
    }
}