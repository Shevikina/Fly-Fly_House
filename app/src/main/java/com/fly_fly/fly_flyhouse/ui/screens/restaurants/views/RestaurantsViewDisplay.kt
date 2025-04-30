package com.fly_fly.fly_flyhouse.ui.screens.restaurants.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.restaurants.models.RestaurantsEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun RestaurantsViewDisplay(dispatcher: (RestaurantsEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(RestaurantsEvent.CloseScreen)
}

@Preview
@Composable
private fun RestaurantsViewDisplayPreview() {
    FlyFlyHouseTheme { RestaurantsViewDisplay {} }
}