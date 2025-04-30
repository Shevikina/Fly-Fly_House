package com.fly_fly.fly_flyhouse.ui.screens.user.profile.models

sealed class UserProfileViewState {
    data object Loading : UserProfileViewState()
    data class Error(val message: String, val icon: Int) : UserProfileViewState()
    data class Display(
        val name: String,
        val photoUrl: String,
        val checkinDate: String
    ) : UserProfileViewState()
}