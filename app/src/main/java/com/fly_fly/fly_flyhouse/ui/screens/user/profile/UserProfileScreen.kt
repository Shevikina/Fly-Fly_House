package com.fly_fly.fly_flyhouse.ui.screens.user.profile

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.user.profile.models.UserProfileEvent
import com.fly_fly.fly_flyhouse.ui.screens.user.profile.views.UserProfileViewDisplay

@Composable
fun UserProfileScreen(navController: NavController) {
    UserProfileViewDisplay { event ->
        when (event) {
            is UserProfileEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }
    }
}