package shenefelt.libraryManager.kotlin

class Book(private var title: String = "",
           private var author: String = "",
           private var genre: String = "",
           private var price: Double = 0.00,
           private var series: Boolean = false,
           private var totalPages: Int = 0,
           )
{
    private var seriesList: MutableList<Book>? = null

    init
    {
        println("New book created")
    }


    fun getTitle(): String
    {
        return title;
    }

    fun getAuthor(): String
    {
        return author;
    }

    fun getGenre(): String
    {
        return genre;
    }

    fun getPrice(): Double
    {
        return price;
    }

    fun getSeries(): Boolean
    {
        return series;
    }

    fun getTotalPages(): Int
    {
        return totalPages;
    }

    fun setTitle(newTitle: String)
    {
        title = newTitle;
    }

    fun setAuthor(newAuthor: String)
    {
        author = newAuthor;
    }

    fun setGenre(newGenre: String)
    {
        genre = newGenre;
    }

    fun setPrice(newPrice: Double)
    {
        price = newPrice;
    }

    fun setSeries(newSeries: Boolean)
    {
        if(newSeries) collectSeriesInfo()
        series = newSeries;
    }

    fun setTotalPages(newTotalPages: Int)
    {
        totalPages = newTotalPages;
    }

    fun displayBook()
    {
        println("Title: $title")
        println("Author: $author")
        println("Genre: $genre")
        println("Price: $price")
        println("Series: $series")
    }

    private fun collectSeriesInfo()
    {
        if(seriesList == null) seriesList = mutableListOf();

        println("Book Title: ")

    }
}