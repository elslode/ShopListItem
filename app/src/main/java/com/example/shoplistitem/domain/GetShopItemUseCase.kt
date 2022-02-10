package com.example.shoplistitem.domain

import com.example.shoplistitem.domain.ShopItem
import com.example.shoplistitem.domain.ShopListRepository
import javax.inject.Inject

class GetShopItemUseCase @Inject constructor(
    private val shopListRepository: ShopListRepository
    ) {

    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
