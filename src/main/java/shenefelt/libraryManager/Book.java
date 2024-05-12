package shenefelt.libraryManager;

public class Book
{

    private String title;
    private String author;
    private String genre;
    private final int BOOK_ID = Library.IDManager.generateId();
    private boolean isSeries;

    public Book(String bTitle, String bAuthor, String bGenre, boolean inSeries)
    {
        title = bTitle;
        author = bAuthor;
        genre = bGenre;
        isSeries = inSeries;
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


    public String display()
    {
    }
}
