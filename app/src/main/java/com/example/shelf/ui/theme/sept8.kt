package com.example.shelf.ui.theme

import androidx.compose.animation.core.spring

data class Book(
    val title: String,
    val pages: Int
)
fun main(){
    val books = listOf(
        Book("The Thirty-Nine Steps", 138),
        Book("The Prime of Miss Jean Brodie", 150),
        Book("A Single Man", 152),
        Book("Murphy", 158),
        Book("A Clockwork Orange", 160),
        Book("Strange Case of Dr Jekyll and Mr Hyde", 161),
        Book("The Alchemist", 167),
        Book("Mrs Dalloway", 172),
        Book("Animal Farm", 112),
        Book("The Old Man and the Sea", 127),
        Book("The Great Gatsby", 180),
        Book("Fahrenheit 451", 194),
        Book("Of Mice and Men", 107),
        Book("The Little Prince", 96),
        Book("The Metamorphosis", 55)
    )
    val longestThree = books
        .sortedBy{ it.pages }
        .takeLast(3)
        .reversed()
    println("longest three books: ")
    longestThree.forEach{
        println("${it.title} - ${it.pages}) pages")
    }
    val totalPages = books.sumOf { it.pages }
    println("\nTotal pages: $totalPages")
    val groupedBooks = books.groupBy {
        it.title.first().uppercaseChar()
    }
    println("Books grouped by first letter:")
    groupedBooks.forEach { (letter, bookList) ->
        println("$letter:")
        bookList.forEach { println(" -${it.title}") }
    }
}