package com.fly_fly.fly_flyhouse.ui.screens.map.objects.models

sealed class MapObjectsViewState {
    data object Loading : MapObjectsViewState()
    data class Error(val message: String, val icon: Int) : MapObjectsViewState()
    data class Display(val objects : List<String>) : MapObjectsViewState()
}