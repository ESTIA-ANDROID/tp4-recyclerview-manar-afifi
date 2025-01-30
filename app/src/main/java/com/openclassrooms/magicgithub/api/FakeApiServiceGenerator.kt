package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://robohash.org/jake.png"),
        User("002", "Paul", "https://robohash.org/paul.png"),
        User("003", "Phil", "https://robohash.org/phil.png"),
        User("004", "Guillaume", "https://robohash.org/guillaume.png"),
        User("005", "Francis", "https://robohash.org/francis.png"),
        User("006", "George", "https://robohash.org/george.png"),
        User("007", "Louis", "https://robohash.org/louis.png"),
        User("008", "Mateo", "https://robohash.org/mateo.png"),
        User("009", "April", "https://robohash.org/april.png"),
        User("010", "Louise", "https://robohash.org/louise.png"),
        User("011", "Elodie", "https://robohash.org/elodie.png"),
        User("012", "Helene", "https://robohash.org/helene.png"),
        User("013", "Fanny", "https://robohash.org/fanny.png"),
        User("014", "Laura", "https://robohash.org/laura.png"),
        User("015", "Gertrude", "https://robohash.org/gertrude.png"),
        User("016", "Chloé", "https://robohash.org/chloe.png"),
        User("017", "April", "https://robohash.org/april17.png"),
        User("018", "Marie", "https://robohash.org/marie.png"),
        User("019", "Henri", "https://robohash.org/henri.png"),
        User("020", "Rémi", "https://robohash.org/remi.png")
    )

    @JvmField
    var FAKE_USERS_RANDOM = listOf(
        User("021", "Lea", "https://robohash.org/lea.png"),
        User("022", "Geoffrey", "https://robohash.org/geoffrey.png"),
        User("023", "Simon", "https://robohash.org/simon.png"),
        User("024", "André", "https://robohash.org/andre.png"),
        User("025", "Leopold", "https://robohash.org/leopold.png")
    )
}
