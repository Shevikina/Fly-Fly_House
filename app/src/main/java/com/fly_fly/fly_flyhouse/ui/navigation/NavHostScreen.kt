package com.fly_fly.fly_flyhouse.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.fly_fly.fly_flyhouse.ui.screens.entertainments.EntertainmentsScreen
import com.fly_fly.fly_flyhouse.ui.screens.events.EventsScreen
import com.fly_fly.fly_flyhouse.ui.screens.home.HomeScreen
import com.fly_fly.fly_flyhouse.ui.screens.map.objects.MapObjectsScreen
import com.fly_fly.fly_flyhouse.ui.screens.restaurants.RestaurantsScreen
import com.fly_fly.fly_flyhouse.ui.screens.search.SearchScreen
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.SpecialOfferPageScreen
import com.fly_fly.fly_flyhouse.ui.screens.user.profile.UserProfileScreen

@Composable
fun NavHostScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home,
        modifier = modifier.fillMaxSize()
    ) {
        composable<NavScreen.Home> { HomeScreen(navController) }
        composable<NavScreen.UserProfile> { UserProfileScreen(navController) }
        composable<NavScreen.Search> { SearchScreen(navController) }
        composable<NavScreen.MapObjects> { MapObjectsScreen(navController) }
        composable<NavScreen.Events> { EventsScreen(navController) }
        composable<NavScreen.Entertainments> { EntertainmentsScreen(navController) }
        composable<NavScreen.Restaurants> { RestaurantsScreen(navController) }
        composable<NavScreen.SpecialOfferPage> { entry ->
            val id = entry.toRoute<NavScreen.SpecialOfferPage>().offerId
            SpecialOfferPageScreen(id, navController)
        }
    }
}