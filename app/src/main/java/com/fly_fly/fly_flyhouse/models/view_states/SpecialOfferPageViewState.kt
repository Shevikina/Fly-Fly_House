package com.fly_fly.fly_flyhouse.models.view_states

sealed class SpecialOfferPageViewState {
    data object Loading : SpecialOfferPageViewState()
    data class Error(val message: String, val icon: Int) : SpecialOfferPageViewState()
    data class Display(
        val title: String,
        val price: Double,
        val imageUrl: String,
        val description: String
    ) : SpecialOfferPageViewState()
}