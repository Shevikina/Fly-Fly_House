package com.fly_fly.fly_flyhouse.data.local.repository

import com.fly_fly.fly_flyhouse.data.local.entity.OfferDetails
import com.fly_fly.fly_flyhouse.data.local.entity.OfferPreview

class OffersRepository {

    private val offers = listOf(
        OfferDetails(
            id = 1,
            name = "Скидка на билеты",
            description = "Получите скидку 20% на билеты на концерт. Предложение действительно до 31 декабря 2023 года.",
            imagePath = "",
            price = 10
        ),
        OfferDetails(
            id = 2,
            name = "Бесплатная доставка",
            description = "",
            imagePath = "",
            price = 10
        )
    )

    fun getOffers(): List<OfferPreview> =
        offers.map { OfferPreview(it.id, it.name, it.imagePath, it.description, it.price) }

    fun getOfferDetails(id: Int): OfferDetails =
        offers.find { it.id == id } ?: throw Exception("No offer with id $id ")
}