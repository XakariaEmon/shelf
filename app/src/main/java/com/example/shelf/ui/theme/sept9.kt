package com.example.shelf.ui.theme

fun progressStatus(progress: Int): String {
    return when (progress){
        0 -> "not started"
        in 1..99 -> "In Progress"
        100 -> "Completed"
        else -> "Invalid progress"
    }
}
fun main(){
    val progressValues = listOf(-10, 0, 20, 30, 40, 100, 110)

    for(progress in progressValues){
        println("$progress% -> ${progressStatus(progress)}")
    }
}