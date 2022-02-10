package com.sumin.shoppinglist.domain

import com.example.shoplistitem.domain.ShopItem
import com.example.shoplistitem.domain.ShopListRepository
import javax.inject.Inject

class EditShopItemUseCase @Inject constructor(
    private val shopListRepository: ShopListRepository) {

    suspend fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
