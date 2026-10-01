package com.example.shelf.ui.theme

data class Book(
    val id: Int,
    var title: String,
    var pages: Int
)

val books = mutableListOf<Book>()
var nextId = 1

fun addBook() {
    print("Enter book title: ")
    val title = readLine()?.trim()

    if (title.isNullOrEmpty()) {
        println("Title cannot be empty.")
        return
    }

    print("Enter number of pages: ")
    val pages = readLine()?.toIntOrNull()

    if (pages == null || pages <= 0) {
        println("Invalid page number.")
        return
    }

    books.add(Book(nextId, title, pages))
    println("Book added successfully. ID: $nextId")
    nextId++
}

fun listBooks() {
    if (books.isEmpty()) {
        println("No books found.")
        return
    }

    println("\n--- Books ---")

    for (book in books) {
        println("${book.id}. ${book.title} - ${book.pages} pages")
    }
}

fun updateBook() {
    if (books.isEmpty()) {
        println("No books to update.")
        return
    }

    print("Enter book ID to update: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Invalid ID.")
        return
    }

    val book = books.find { it.id == id }

    if (book == null) {
        println("Book not found.")
        return
    }

    print("Enter new title: ")
    val newTitle = readLine()?.trim()

    if (newTitle.isNullOrEmpty()) {
        println("Title cannot be empty.")
        return
    }

    print("Enter new page count: ")
    val newPages = readLine()?.toIntOrNull()

    if (newPages == null || newPages <= 0) {
        println("Invalid page number.")
        return
    }

    book.title = newTitle
    book.pages = newPages

    println("Book updated successfully.")
}

fun deleteBook() {
    if (books.isEmpty()) {
        println("No books to delete.")
        return
    }

    print("Enter book ID to delete: ")
    val id = readLine()?.toIntOrNull()

    if (id == null) {
        println("Invalid ID.")
        return
    }

    val book = books.find { it.id == id }

    if (book == null) {
        println("Book not found.")
        return
    }

    books.remove(book)

    println("Book deleted successfully.")
}

fun main() {
    while (true) {
        println(
            """
            What do you want?
            1. Add book
            2. List all books
            3. Update book
            4. Delete book
            5. Quit
            """.trimIndent()
        )

        print("Choose an option: ")

        when (readLine()?.trim()) {
            "1" -> addBook()
            "2" -> listBooks()
            "3" -> updateBook()
            "4" -> deleteBook()
            "5" -> {
                println("Goodbye!")
                break
            }
            else -> println("Invalid option. Please choose 1-5.")
        }
    }
}
