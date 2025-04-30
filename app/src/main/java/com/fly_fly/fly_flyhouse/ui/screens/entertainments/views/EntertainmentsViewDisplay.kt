package com.fly_fly.fly_flyhouse.ui.screens.entertainments.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.entertainments.models.EntertainmentsEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun EntertainmentsViewDisplay(dispatcher: (EntertainmentsEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(EntertainmentsEvent.CloseScreen)
}

@Preview
@Composable
private fun EntertainmentsViewDisplayPreview() {
    FlyFlyHouseTheme { EntertainmentsViewDisplay {} }
}