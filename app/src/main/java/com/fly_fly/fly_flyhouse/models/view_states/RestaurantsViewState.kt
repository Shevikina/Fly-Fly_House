package com.fly_fly.fly_flyhouse.models.view_states

sealed class RestaurantsViewState {
    data object Loading : RestaurantsViewState()
    data class Error(val message: String, val icon: Int) : RestaurantsViewState()
    data class Display(val restaurants: List<String>) : RestaurantsViewState()
}