package shenefelt.libraryManager;
import static java.lang.System.exit;
import static java.lang.System.out;

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        library.open();
        library.close();
        exit(0);
    }
}
