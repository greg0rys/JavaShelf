package shenefelt.libraryManager;

import java.util.*;

import static java.lang.System.out;

public class Library
{

    /**
     * Generate a random id up to the safe integer max value
     * Ensure that the ID isn't already in use, and then store the newly assigned ID
     * If the ID is found in use - loop until the random number generated is no longer in the
     * arraylist.
     */
    public static class IDManager
    {
        // tell the compiler to ignore these warnings for now
        @SuppressWarnings("FieldMayBeFinal")
        private static ArrayList<Integer> usedIDs = new ArrayList<>();
        private static ArrayList<Integer> usedSectionIDs = new ArrayList<>();


        public static int generateId()
        {
            int newId = new Random().nextInt(Integer.MAX_VALUE);
            while (usedIDs.contains(newId))
            {
                newId = new Random().nextInt(Integer.MAX_VALUE);
            }
            usedIDs.add(newId);
            return newId;
        }

        public static int generateSectionNumber()
        {
            int newId = new Random().nextInt(900);

            while (usedSectionIDs.contains(newId)) {
                newId = new Random().nextInt(900);
            }
            usedSectionIDs.add(newId);
            return newId;
        }

    }

    /* ---- BEGIN LIBRARY ----*/
    private HashMap<Integer, BookShelf> shelfMap;
    private LibraryScanner scanner;

    public Library()
    {
        shelfMap = null;
        scanner = null;
    }


    public void addBookShelf(BookShelf bookShelf)
    {
        if (shelfMap == null)
            shelfMap = new HashMap<>();

        bookShelf.setID(IDManager.generateId());
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

    public Book findBook (String identity)
    {
        Book result = null;

        if (scanner == null)
            scanner = new LibraryScanner();

        for(Integer id : shelfMap.keySet())
        {
            result = scanner.scanShelf (identity, shelfMap.get(id));
        }

        scanner = null;

        return result;
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
}