package shenefelt.libraryManager;
import static java.lang.System.out;
import java.util.ArrayList;
public class LibraryScanner
{
    private int numberResults = 0; //number of found items
    private ArrayList<Book> discoveredBooks = null;
    private Book singletonBook = null;
    
    // empty constructor the scanner only searches -> keep load light
    public LibraryScanner() {}

    /**
     * Initializes null variables based on the given init type.
     * This is to avoid segfualts
     * @param initType the type of initialization (1 or 2) where 1 = ArrayList<Books> and 2 = singletonBook = new Book()
     */
    private void initNull(int initType)
    {

        if (initType == 1)
        {
            if(discoveredBooks == null)
                discoveredBooks = new ArrayList<>();

        }

        if(initType == 2)
        {
            if (singletonBook == null)
                singletonBook = new Book();
        }

    }

    private void scan (ArrayList<Book> resultList, String identity, Shelf location)
    {

    }

    private ArrayList<Book> resultsList (ArrayList<Book> results)
    {
        return results;
    }


    public Book scanShelf(String identity, BookShelf location)
    {
        Book target = null;

        target = location.findBookByTitle(identity);

        return target;
    }

    public ArrayList<Book> seekCollection(String )

    public static void sayHi()
    {
        out.println("Hi");
    }



}