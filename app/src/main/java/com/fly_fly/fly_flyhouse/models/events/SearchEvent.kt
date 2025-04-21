package com.fly_fly.fly_flyhouse.models.events

sealed class SearchEvent {
    data class ChangeQuery(val newValue: String) : SearchEvent()
    data object ReloadScreen : SearchEvent()
}