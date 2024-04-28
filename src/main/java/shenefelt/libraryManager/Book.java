package shenefelt.libraryManager;

public class Book {



    // ---- BOOK CLASS START ----

    private String title;
    private String author;
    private String genre;
    private final int book_id = Library.IDManager.generate_id();

    public Book(String title, String author, String genre)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Book()
    {
        this.title = "";
        this.author = "";
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getBook_id() { return book_id; }






}
