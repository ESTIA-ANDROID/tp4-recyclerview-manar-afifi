package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        return apiService.getUsers()
    }

    fun addRandomUser() {
        //TODO("Should add a random user")
        apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
       // TODO("Should remove the user")
        apiService.deleteUser(user)
    }
}