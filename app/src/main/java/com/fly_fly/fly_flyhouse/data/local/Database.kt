package com.fly_fly.fly_flyhouse.data.local

import com.fly_fly.fly_flyhouse.data.local.entity.OfferDetails

object Database {
    val offerList = listOf(
        OfferDetails(
            id = 0,
            name = "Экскурсия по крейсеру “Альт”",
            description = "Десятки палуб, секретные лаборатории и технологичные дроиды уже ждут Вас на незабываемой экскурсии по современному крейсу галактической армии.",
            imagePath = "file:///android_asset/App4_Image2.jpg",
            price = 1500
        )
    )
}