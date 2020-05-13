package com.innopolis.trashrecycle.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.innopolis.trashrecycle.data.entity.ItemType
import com.innopolis.trashrecycle.data.entity.RecycleItem


class MainViewModel(): ViewModel(){
    val itemsLiveData = MutableLiveData< List<RecycleItem> >()
    fun getData(query: String){
    }
    fun getDescriptionForType(itemType: ItemType){}
}