package com.innopolis.trashrecycle.di


import com.innopolis.trashrecycle.data.ItemsRepository
import com.innopolis.trashrecycle.domain.ItemsInteractor
import com.innopolis.trashrecycle.presentation.MainViewModel
import org.koin.dsl.module

fun createAppModule() = module {
    single { ItemsRepository() }
    single { ItemsInteractor(get(), get()) }
    single { MainViewModel(get()) }
}