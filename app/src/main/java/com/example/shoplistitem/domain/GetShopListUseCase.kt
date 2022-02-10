package com.example.shoplistitem.domain

import androidx.lifecycle.LiveData
import com.example.shoplistitem.domain.ShopItem
import com.example.shoplistitem.domain.ShopListRepository
import javax.inject.Inject

class GetShopListUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}
