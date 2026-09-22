package com.example.shelf.ui.theme

// 1. JavaScript:
// function getName(user) {
//     if (user && user.name) {
//         return user.name;
//     }
//     return "Guest";
// }

data class User(
    val name: String?
)

fun getName(user: User?): String {
    return user?.name ?: "Guest"
}


// 2. JavaScript:
// function getUsername(user) {
//     return user?.profile?.username || "Unknown";
// }

data class Profile(
    val username: String?
)

data class UserWithProfile(
    val profile: Profile?
)

fun getUsername(user: UserWithProfile?): String {
    return user?.profile?.username ?: "Unknown"
}


// 3. JavaScript:
// function getMessage(message) {
//     if (message) {
//         return message.length;
//     }
//     return 0;
// }

fun getMessageLength(message: String?): Int {
    return message?.length ?: 0
}


// 4. JavaScript:
// function getFirstCharacter(text) {
//     if (text) {
//         return text[0];
//     }
//     return "-";
// }

fun getFirstCharacter(text: String?): String {
    return if (text != null && text.isNotEmpty()) {
        text[0].toString()
    } else {
        "-"
    }
}


// 5. JavaScript:
// function getCity(user) {
//     return user?.address?.city || "Unknown City";
// }

data class Address(
    val city: String?
)

data class UserWithAddress(
    val address: Address?
)

fun getCity(user: UserWithAddress?): String {
    return user?.address?.city ?: "Unknown City"
}


// Tests

fun main() {

    // 1. getName()
    println(getName(User("Zakaria")))
    println(getName(null))
    println(getName(User(null)))

    // 2. getUsername()
    println(getUsername(UserWithProfile(Profile("emon"))))
    println(getUsername(null))
    println(getUsername(UserWithProfile(null)))

    // 3. getMessageLength()
    println(getMessageLength("Kotlin"))
    println(getMessageLength(null))

    // 4. getFirstCharacter()
    println(getFirstCharacter("Android"))
    println(getFirstCharacter(""))
    println(getFirstCharacter(null))

    // 5. getCity()
    println(getCity(UserWithAddress(Address("Dhaka"))))
    println(getCity(null))
    println(getCity(UserWithAddress(null)))
}