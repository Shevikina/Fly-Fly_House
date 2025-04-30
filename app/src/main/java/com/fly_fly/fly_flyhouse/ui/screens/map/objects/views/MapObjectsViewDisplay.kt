package com.fly_fly.fly_flyhouse.ui.screens.map.objects.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.map.objects.models.MapObjectsEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun MapObjectsViewDisplay(dispatcher: (MapObjectsEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(MapObjectsEvent.OpenScreen(NavScreen.*))
    // TODO: Добавить dispatcher.invoke(MapObjectsEvent.CloseScreen)
}

@Preview
@Composable
private fun MapObjectsViewDisplayPreview() {
    FlyFlyHouseTheme { MapObjectsViewDisplay {} }
}