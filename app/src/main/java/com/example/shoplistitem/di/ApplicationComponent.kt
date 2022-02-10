package com.example.shoplistitem.di

import android.app.Application
import com.example.shoplistitem.presentation.MainActivity
import com.example.shoplistitem.presentation.ShopItemActivity
import com.example.shoplistitem.presentation.ShopItemFragment
import com.example.shoplistitem.presentation.ShopListApp
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(fragment: ShopItemFragment)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}