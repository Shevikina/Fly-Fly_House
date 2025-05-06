package com.fly_fly.fly_flyhouse.data.local.repository

import com.fly_fly.fly_flyhouse.data.local.entity.UserDetails

class UserRepository {
    fun getUserDetails() =
        UserDetails(fullName = "Иван Иванов", qrCode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ")
}