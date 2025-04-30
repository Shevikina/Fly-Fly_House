package com.fly_fly.fly_flyhouse.ui.screens.search.models

sealed class SearchEvent {
    data class ChangeQuery(val newValue: String) : SearchEvent()
    data object ReloadScreen : SearchEvent()
}