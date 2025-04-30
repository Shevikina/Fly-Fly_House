package com.fly_fly.fly_flyhouse.ui.screens.entertainments

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.entertainments.models.EntertainmentsEvent
import com.fly_fly.fly_flyhouse.ui.screens.entertainments.views.EntertainmentsViewDisplay

@Composable
fun EntertainmentsScreen(navController: NavController) {
    EntertainmentsViewDisplay { event ->
        when (event) {
            is EntertainmentsEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }

    }
}