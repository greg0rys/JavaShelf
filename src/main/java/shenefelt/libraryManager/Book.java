package shenefelt.libraryManager;

import java.util.ArrayList;

import static java.lang.System.out;

public class Book
{

    private String title = "";
    private String author = "";
    private String genre = "";
    private final int BOOK_ID = Helpers.getBookID();
    private boolean isSeries = false;
    private ArrayList<Book> booksInSeries = null;

    public Book(String bTitle, String bAuthor, String bGenre, boolean inSeries)
    {
        title = bTitle;
        author = bAuthor;
        genre = bGenre;
        isSeries = inSeries;

        if(isSeries) booksInSeries = new ArrayList<>();
    }

    public Book()
    {
        title = author = " ";
        isSeries = false;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getBook_id() { return BOOK_ID; }

    public boolean aSeries() { return isSeries; }
    public void setSeries (boolean series) { isSeries = series; }


    public void display()
    {

         out.println("Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nID: " + BOOK_ID);
    }

    public void displaySeries()
    {
        if(booksInSeries == null || booksInSeries.isEmpty()) return;
        out.println("Total Books in this series: " + booksInSeries.size());
        if(isSeries)
            for(Book b : booksInSeries)
            {
                b.display();
                out.println("***");
                out.println();
            }

        else
            out.println("This book is not part of a series.");
    }
}
