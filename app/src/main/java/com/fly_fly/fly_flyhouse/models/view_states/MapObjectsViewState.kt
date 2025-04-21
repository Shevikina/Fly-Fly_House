package com.fly_fly.fly_flyhouse.models.view_states

sealed class MapObjectsViewState {
    data object Loading : MapObjectsViewState()
    data class Error(val message: String, val icon: Int) : MapObjectsViewState()
    data class Display(val objects : List<String>) : MapObjectsViewState()
}