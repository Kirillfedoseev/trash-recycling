package com.innopolis.trashrecycle.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.innopolis.trashrecycle.R
import com.innopolis.trashrecycle.codesOfType
import com.innopolis.trashrecycle.data.entity.RecycleItem
import com.innopolis.trashrecycle.presentation.MainViewModel
import kotlinx.android.synthetic.main.activity_item_description.*
import org.koin.android.viewmodel.ext.android.viewModel

class ItemDescriptionActivity : AppCompatActivity() {
    private val mainVM: MainViewModel by viewModel()
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
        intent?.apply {
            if (extras != null) {
                //RecycleItem
                val recycleItem = extras!!["item"] as RecycleItem

                if (recycleItem.resId != 0) {
                    sign.setImageResource(recycleItem.resId)
                } else {
                    val resID: Int = applicationContext.resources.getIdentifier(
                        "item" + codesOfType(recycleItem.type)[0].toString(),
                        "drawable",
                        applicationContext.packageName
                    )
                    sign.setImageResource(resID)
                }
                titleItem.text = recycleItem.name
//                description.text = mainVM.getDescriptionForType(recycleItem.type)
            }
        }
    }
}
