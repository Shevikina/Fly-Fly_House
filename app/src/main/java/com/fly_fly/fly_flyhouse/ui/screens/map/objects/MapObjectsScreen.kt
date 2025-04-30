package com.fly_fly.fly_flyhouse.ui.screens.map.objects

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.map.objects.models.MapObjectsEvent
import com.fly_fly.fly_flyhouse.ui.screens.map.objects.views.MapObjectsViewDisplay

@Composable
fun MapObjectsScreen(navController: NavController) {
    MapObjectsViewDisplay { event ->
        when (event) {
            is MapObjectsEvent.CloseScreen -> {
                navController.popBackStack()
            }

            is MapObjectsEvent.OpenScreen -> {
                navController.navigate(event.screen)
            }

            else -> {}
        }
    }
}