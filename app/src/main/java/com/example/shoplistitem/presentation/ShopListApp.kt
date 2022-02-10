package com.example.shoplistitem.presentation

import android.app.Application
import com.example.shoplistitem.di.DaggerApplicationComponent

class ShopListApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}