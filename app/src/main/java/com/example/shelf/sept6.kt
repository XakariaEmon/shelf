package com.example.shelf

fun formatDuration(minutes: Int): String {
    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    return "${hours}h ${remainingMinutes}m"
}

fun main() {
    println(formatDuration(0))
    println(formatDuration(60))
    println(formatDuration(160))
    println(formatDuration(360))
    println(formatDuration(135))
}