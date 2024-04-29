package shenefelt.libraryManager;

import java.util.ArrayList;


public class BookShelf {
    private final int CAPACITY = 200;
    private ArrayList<Book> books = new ArrayList<>();
    private int shelfID;

    public BookShelf() {

    }

    public BookShelf(ArrayList<Book> book_list) {
        if (book_list != null && book_list.size() <= CAPACITY) {
            books.addAll(book_list);
        } else {

        }
    }

    public void setID(int id) {
        if (id <= 0)
            shelfID = 1;

        shelfID = id;
    }

    public Book searchBooks(int searchType, String title)
    {
        Book b = null;

        switch (searchType) {
            case 1:
                for (Book book : books) {
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        return book;
                    }
                }
                break;
            case 2:


        }

        return b;
    }
}
