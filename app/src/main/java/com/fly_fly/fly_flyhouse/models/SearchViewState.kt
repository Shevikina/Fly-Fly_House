package com.fly_fly.fly_flyhouse.models

sealed class SearchViewState {
    data object Loading : SearchViewState()
    data class Error(val message: String, val icon: Int) : SearchViewState()
    data class Display(
        val query: String,
        val events: List<String>
    ) : SearchViewState()
}