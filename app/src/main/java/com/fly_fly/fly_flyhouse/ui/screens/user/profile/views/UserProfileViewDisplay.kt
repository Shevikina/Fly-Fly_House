package com.fly_fly.fly_flyhouse.ui.screens.user.profile.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.user.profile.models.UserProfileEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun UserProfileViewDisplay(dispatcher: (UserProfileEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(UserProfileEvent.CloseScreen)
}

@Preview
@Composable
private fun UserProfileViewDisplayPreview() {
    FlyFlyHouseTheme {
        UserProfileViewDisplay {}
    }
}