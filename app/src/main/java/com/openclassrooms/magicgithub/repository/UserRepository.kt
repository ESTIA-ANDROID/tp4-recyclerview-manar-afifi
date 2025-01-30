package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.api.FakeApiService
import com.openclassrooms.magicgithub.model.User
import java.util.Collections

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

    fun deleteUser(username: User) {
       // TODO("Should remove the user")
        apiService.deleteUser(username)
    }
    // Etape3
    fun swapUsers(fromPosition: Int, toPosition: Int) {
        val users = apiService.getUsers().toMutableList()
        Collections.swap(users, fromPosition, toPosition)
        (apiService as FakeApiService).setUsers(users)
    }

    fun toggleUserActiveState(user: User) {
        val users = apiService.getUsers().toMutableList()
        val index = users.indexOfFirst { it.id == user.id }

        if (index != -1) {
            users[index].isActive = !users[index].isActive
        }
    }

}