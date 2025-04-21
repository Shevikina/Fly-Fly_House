package com.fly_fly.fly_flyhouse.ui.screens.home.models.actions

sealed class UserProfileAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : UserProfileAction()
}