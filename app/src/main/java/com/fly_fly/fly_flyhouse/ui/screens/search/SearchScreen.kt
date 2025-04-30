package com.fly_fly.fly_flyhouse.ui.screens.search

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.search.models.SearchEvent
import com.fly_fly.fly_flyhouse.ui.screens.search.views.SearchViewDisplay

@Composable
fun SearchScreen(navController: NavController) {
    SearchViewDisplay { event ->
        when (event) {
            is SearchEvent.CloseScreen -> {
                navController.popBackStack()
            }

            is SearchEvent.OpenScreen -> {
                navController.navigate(event.screen)
            }

            else -> {}
        }
    }
}