package com.example.shoplistitem.domain

import com.example.shoplistitem.domain.ShopItem
import com.example.shoplistitem.domain.ShopListRepository
import javax.inject.Inject

class DeleteShopItemUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
