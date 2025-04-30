package com.fly_fly.fly_flyhouse.ui.screens.search.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.search.models.SearchEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun SearchViewDisplay(dispatcher: (SearchEvent) -> Unit) {
    // TODO: figma макет на этот экран пока не готов
    // TODO: Добавить dispatcher.invoke(SearchEvent.OpenScreen(NavScreen.*))
    // TODO: Добавить dispatcher.invoke(SearchEvent.CloseScreen)
}

@Preview
@Composable
private fun SearchViewDisplayPreview() {
    FlyFlyHouseTheme { SearchViewDisplay {} }
}