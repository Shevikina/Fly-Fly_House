package com.fly_fly.fly_flyhouse.models.view_states

sealed class EntertainmentsViewState {
    data object Loading : EntertainmentsViewState()
    data class Error(val message: String, val icon: Int) : EntertainmentsViewState()
    data class Display(val activities: List<String>) : EntertainmentsViewState()
}