package com.fly_fly.fly_flyhouse.data.local.repository

import com.fly_fly.fly_flyhouse.data.local.entity.UpcomingEvent

class EventRepository {
    fun getUpcomingEvent() = UpcomingEvent(name = "Концерт", timestamp = 1658016000000)
}