package com.fly_fly.fly_flyhouse.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavScreen {
    @Serializable
    data object Home : NavScreen()

    @Serializable
    data object UserProfile : NavScreen()

    @Serializable
    data object Search : NavScreen()

    @Serializable
    data object MapObjects : NavScreen()

    @Serializable
    data object Events : NavScreen()

    @Serializable
    data object Entertainments : NavScreen()

    @Serializable
    data object Restaurants : NavScreen()

    @Serializable
    data class SpecialOfferPage(val offerId: Int) : NavScreen()
}