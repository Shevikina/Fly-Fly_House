package com.fly_fly.fly_flyhouse.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.home.models.HomeEvent
import com.fly_fly.fly_flyhouse.ui.screens.home.views.HomeViewDisplay

@Composable
fun HomeScreen(navController: NavController) {
    HomeViewDisplay { event ->
        when (event) {
            is HomeEvent.OpenScreen -> {
                navController.navigate(event.screen)
            }

            else -> {}
        }
    }
}