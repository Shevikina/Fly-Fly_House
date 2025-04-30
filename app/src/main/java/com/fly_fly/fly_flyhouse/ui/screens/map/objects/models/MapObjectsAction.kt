package com.fly_fly.fly_flyhouse.ui.screens.map.objects.models

sealed class MapObjectsAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : MapObjectsAction()
}