package com.innopolis.trashrecycle.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.innopolis.trashrecycle.R
import kotlinx.android.synthetic.main.activity_item_description.*

class ItemDescriptionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_description)
        initInfo()
        initListeners()
    }
    private fun initListeners() {
        showOnMapButton.setOnClickListener {
        }
    }
    private fun initInfo() {
    }
}
