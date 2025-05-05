package com.fly_fly.fly_flyhouse.data.local

import com.fly_fly.fly_flyhouse.data.local.ui.models.SpecialOfferInfo

object Database {
    val offerList = listOf(
        SpecialOfferInfo(
            id = 0,
            title = "Экскурсия по крейсеру “Альт”",
            description = "Десятки палуб, секретные лаборатории и технологичные дроиды уже ждут Вас на незабываемой экскурсии по современному крейсу галактической армии.",
            imagePath = "file:///android_asset/App4_Image2.jpg",
            price = 1500
        )
    )
}