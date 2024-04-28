package shenefelt.libraryManager;

import java.util.ArrayList;


public class BookShelf
{
    private final int CAPACITY = 200;
    private ArrayList<Book> books = new ArrayList<>();
    private final int shelf_id = Library.IDManager.generate_id();

    public BookShelf()
    {

    }

    public BookShelf(ArrayList<Book> book_list)
    {
        if(book_list != null && book_list.size() <= CAPACITY)
        {
            books.addAll(book_list);
        }
        else
        {

        }
    }

}
