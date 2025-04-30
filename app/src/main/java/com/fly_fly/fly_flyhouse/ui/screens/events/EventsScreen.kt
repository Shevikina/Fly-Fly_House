package com.fly_fly.fly_flyhouse.ui.screens.events

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.events.models.EventsEvent
import com.fly_fly.fly_flyhouse.ui.screens.events.views.EventsViewDisplay

@Composable
fun EventsScreen(navController: NavController) {
    EventsViewDisplay { event ->
        when (event) {
            is EventsEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }
    }
}