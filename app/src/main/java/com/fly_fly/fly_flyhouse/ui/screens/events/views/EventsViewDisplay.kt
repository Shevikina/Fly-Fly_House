package com.fly_fly.fly_flyhouse.ui.screens.events.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.events.models.EventsEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun EventsViewDisplay(dispatcher: (EventsEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(EventsEvent.CloseScreen)
}

@Preview
@Composable
private fun EventsViewDisplayPreview() {
    FlyFlyHouseTheme { EventsViewDisplay {} }
}