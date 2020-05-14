package com.innopolis.trashrecycle.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.innopolis.trashrecycle.data.entity.ItemType
import com.innopolis.trashrecycle.data.entity.RecycleItem
import com.innopolis.trashrecycle.domain.ItemsInteractor


class MainViewModel(private val itemsInteractor: ItemsInteractor): ViewModel(){
    val itemsLiveData = MutableLiveData< List<RecycleItem> >()
    fun getData(query: String){
        val result: List<RecycleItem> = if(query.toIntOrNull() != null) {
            itemsInteractor.getItems( query.toLong())
        } else itemsInteractor.getItems(query)

        itemsLiveData.postValue(result)
    }
    fun getDescriptionForType(itemType: ItemType) = itemsInteractor.getDescriptionForType(itemType)
}