package com.example.shoplistitem.presentation

import androidx.lifecycle.ViewModel
import com.example.shoplistitem.data.ShopListRepositoryImpl

import com.example.shoplistitem.domain.DeleteShopItemUseCase
import com.example.shoplistitem.domain.EditShopItemUseCase
import com.example.shoplistitem.domain.GetShopListUseCase
import com.example.shoplistitem.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}