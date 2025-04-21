package com.fly_fly.fly_flyhouse.ui.screens.home.models.view_states

sealed class EventsViewState {
    data object Loading : EventsViewState()
    data class Error(val message: String, val icon: Int) : EventsViewState()
    data class Display(
        val currentEvents: List<String>,
        val upcomingEvents: List<String>
    ) : EventsViewState()
}