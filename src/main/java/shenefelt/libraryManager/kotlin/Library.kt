package shenefelt.libraryManager.kotlin

import shenefelt.libraryManager.BookShelf
import java.util.*

class Library
{


    private var shelfMap: MutableMap<Int, BookShelf>? = null
    private val books = mutableSetOf(Book())


    val hasBooks: Boolean
        get() = !shelfMap.isNullOrEmpty()

    fun addBookShelf(bookShelf: BookShelf) {
        if (shelfMap == null)
            shelfMap = HashMap()
        shelfMap?.put(bookShelf.getID(), bookShelf)


    }

    fun addBook(newBook: Book): Boolean {
        val book = Book()
        book.setTotalPages(1500)
        println(book.getGenre())

        val shelf = if(shelfMap.isNullOrEmpty())
            null
        else
            getOpenShelf()

        return if (shelf !== null) {
            shelf.addBook(newBook)
        } else {
            false
        }

    }

    private fun getOpenShelf(): BookShelf? {
        shelfMap?.values?.forEach { bookShelf ->
            if (bookShelf.hasCapacity())
                return bookShelf
        }
        return null
    }

    fun getBookShelf(shelfId: Int): BookShelf? = shelfMap?.get(shelfId)

    fun printShelfMap() = shelfMap?.entries?.forEach { shelf ->
        println("Shelf ID: $${shelf.key}, Book Shelf: $${shelf.value}")
    }

    fun displayTotals() {
        if (shelfMap == null)
            return

        println("Total Books: $${getTotalBooks()}")
        println("Total Shelves: $${shelfMap?.size}")
        println()
    }

    fun listAllBooks()
    {
        if (shelfMap!!.isEmpty()) {
            println("No books found in the library :(")
        }
        // loop through shelves and list books
    }

    fun getTotalBooks(): Int = countBooksR(ArrayList(shelfMap!!.values), 0, 0)

    private fun countBooksR(shelves: List<BookShelf>,
                            index: Int,
                            sum: Int): Int {
        return if (shelves.isEmpty() || index < 0)
            0
        else if (index >= shelves.size)
            sum
        else
            countBooksR(shelves, index + 1,
                sum + shelves[index].getNumberOfBooks())
    }

    private fun searchLibraryForTitle(resultList: ArrayList<Book>,
                                      identity: String,
                                      shelfCollection: Hashtable<Int, BookShelf>): Boolean {

        var found = false
        var result: Book?
        var shelfID: Int

        for (s in shelfCollection.values) {
            result = s.findBookByTitle(identity)
            shelfID = s.getID()
            if (result != null) {
                resultList.add(result)
                found = true
            }
        }

        return found
    }
}