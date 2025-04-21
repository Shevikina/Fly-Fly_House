package com.fly_fly.fly_flyhouse.models.view_states

sealed class HomeViewState {
    data object Loading : HomeViewState()
    data class Error(val message: String, val icon: Int) : HomeViewState()
    data class Display(
        val upcomingEvent: String,
        val topDeals: List<String>
    ) : HomeViewState()
}