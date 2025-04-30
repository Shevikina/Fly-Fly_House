package com.fly_fly.fly_flyhouse.ui.screens.restaurants

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.restaurants.models.RestaurantsEvent
import com.fly_fly.fly_flyhouse.ui.screens.restaurants.views.RestaurantsViewDisplay

@Composable
fun RestaurantsScreen(navController: NavController) {
    RestaurantsViewDisplay { event ->
        when (event) {
            is RestaurantsEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }

    }
}