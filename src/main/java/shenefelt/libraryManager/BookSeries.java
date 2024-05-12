package shenefelt.libraryManager;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Date;

/**
 * An object to encapsulate a collection of books that are considered a series - e.g. Harry Potter
 * All methods must protect against null values.
 * @author Greg Shenefelt
 * @version 05.04.24
 *
 *
 */
public class BookSeries
{
   private ArrayList<Book> collection;
   private final int SERIES_ID = Library.IDManager.generateId();
   private String author;
   private int releaseYear;
   private int userRating;

   public BookSeries ()
   {
       collection = null;
       author = null;
       releaseYear = 0;
       userRating = 0;
   }

   public BookSeries (ArrayList<Book> newCollection, int yearReleased, int userRate)
   {
       if (newCollection == null)
           collection = null;
       else
           collection = new ArrayList<>(newCollection);

       releaseYear = yearReleased;
       userRating = userRate;
   }

    public BookSeries (ArrayList<Book> newCollection)
    {

        if (newCollection == null)
            collection = null;
        else
            collection = new ArrayList<>(newCollection);
    }

   public int getSeriesLength()
   {
       if (collection == null)
           return 0;

       return collection.size();
   }

    public ArrayList<Book> getCollection ()
    {
        return new ArrayList<>(collection); // protect against getting a null array list returned to you
    }

    public int getSeriesId()
    {
        return SERIES_ID;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        if (author == null)
            return "NULL";

        return author;
    }

    public boolean addBook (Book newBook)
    {
        if (collection == null)
            collection = new ArrayList<>();

        return collection.add(newBook);
    }


}
