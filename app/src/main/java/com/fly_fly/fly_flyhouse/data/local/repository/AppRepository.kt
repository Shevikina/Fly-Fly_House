package com.fly_fly.fly_flyhouse.data.local.repository

import com.fly_fly.fly_flyhouse.data.local.entity.AppConfig

class AppRepository {
    private val services = listOf("Аналитика", "Уведомления")

    fun getConfig() = AppConfig(services)
}