package com.openclassrooms.magicgithub

import com.openclassrooms.magicgithub.api.FakeApiService
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM
import com.openclassrooms.magicgithub.di.Injection
import com.openclassrooms.magicgithub.model.User
import com.openclassrooms.magicgithub.repository.UserRepository
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

import org.junit.runners.JUnit4

/**
 * Unit test, which will execute on a JVM.
 * Testing UserRepository.
 */
@RunWith(JUnit4::class)
class UserRepositoryTest {
    private lateinit var userRepository: UserRepository

    @Before
    fun setup() {
        userRepository = Injection.getRepository()
    }
    // Etape2
/*
    @Test
    fun getUsersWithSuccess() {
        val usersActual = userRepository.getUsers()
        val usersExpected: List<User> = FAKE_USERS
        assertEquals(
            usersActual,
            usersExpected
        )
    }

    @Test
    fun generateRandomUserWithSuccess() {
        val initialSize = userRepository.getUsers().size
        userRepository.addRandomUser()
        val user = userRepository.getUsers().last()
        assertEquals(userRepository.getUsers().size, initialSize + 1)
        assertTrue(
            FAKE_USERS_RANDOM.filter {
                it.equals(user)
            }.isNotEmpty()
        )
    }

    @Test
    fun deleteUserWithSuccess() {
        val userToDelete = userRepository.getUsers()[0]
        userRepository.deleteUser(userToDelete)
        Assert.assertFalse(userRepository.getUsers().contains(userToDelete))
    }
    */

// Etape 3
    @Test
    fun toggleUserActiveState_changesUserState() {
        val repository = UserRepository(FakeApiService())
        val user = repository.getUsers().first()

        repository.toggleUserActiveState(user)
        val updatedUser = repository.getUsers().first { it.id == user.id }
        assertFalse(updatedUser.isActive)

        repository.toggleUserActiveState(user)
        val reUpdatedUser = repository.getUsers().first { it.id == user.id }
        assertTrue(reUpdatedUser.isActive)
    }


    @Test
    fun swapUsers_changesOrder() {
        val repository = UserRepository(FakeApiService())
        val users = repository.getUsers().toMutableList()

        val firstUser = users[0]
        val secondUser = users[1]

        repository.swapUsers(0, 1)

        val updatedUsers = repository.getUsers()
        assertEquals(secondUser, updatedUsers[0])
        assertEquals(firstUser, updatedUsers[1])
    }



}