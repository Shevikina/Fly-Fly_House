package com.fly_fly.fly_flyhouse.ui.screens.search.models

import com.fly_fly.fly_flyhouse.ui.navigation.NavScreen

sealed class SearchEvent {
    data class ChangeQuery(val newValue: String) : SearchEvent()
    data object ReloadScreen : SearchEvent()
    data object CloseScreen : SearchEvent()
    data class OpenScreen(val screen: NavScreen) : SearchEvent()
}