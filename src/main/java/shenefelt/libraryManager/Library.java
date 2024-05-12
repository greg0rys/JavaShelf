package shenefelt.libraryManager;

import java.util.*;

import static java.lang.System.out;

public class Library
{

    /* ---- BEGIN LIBRARY ----*/
    private HashMap<Integer, BookShelf> shelfMap = null;

    public Library() {}


    public void addBookShelf(BookShelf bookShelf)
    {
        if (shelfMap == null)
            shelfMap = new HashMap<>();

        shelfMap.put(bookShelf.getID(), bookShelf);
    }

    public BookShelf getBookShelf(int shelfId)
    {
        return shelfMap.get(shelfId);
    }

    public void printShelfMap()
    {
        for(Map.Entry<Integer, BookShelf> shelf : shelfMap.entrySet())
            out.println("Shelf ID: " + shelf.getKey() + ", Book Shelf: " + shelf.getValue());
    }


    public void open()
    {
        menu();
    }

    public void close()
    {
        out.println("Thanks for visiting the library");
    }

    private void menu()
    {
        // .... rest of the menu method implementation comes here
    }


    private boolean searchLibraryForTitle (ArrayList<Book> resultList, String identity,
                                           Hashtable<Integer, BookShelf> shelfCollection)
    {
        boolean found = false;
        Book result = null;
        int shelfID = 0;

        for(BookShelf s : shelfCollection.values())
        {
            result = s.findBookByTitle(identity);
            shelfID = s.getID(); // I want the search results to display what shelf a book was found on
            if (result != null)
            {
                resultList.add(result);
                found = true;
            }
        }

        return found;
    }

    public int getTotalBooks()
    {
        int totalBooks = 0;

        for (BookShelf shelf : shelfMap.values())
            totalBooks += shelf.getNumberOfBooks();

        return totalBooks;
    }
}