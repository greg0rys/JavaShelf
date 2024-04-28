package shenefelt.libraryManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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


        public static int generate_id()
        {
            int new_id = new Random().nextInt(Integer.MAX_VALUE);
            while (usedIDs.contains(new_id))
            {
                new_id = new Random().nextInt(Integer.MAX_VALUE);
            }
            usedIDs.add(new_id);
            return new_id;
        }

        public static int generate_section_number()
        {
            int new_id = new Random().nextInt(900);

            while (usedSectionIDs.contains(new_id)) {
                new_id = new Random().nextInt(900);
            }
            usedSectionIDs.add(new_id);
            return new_id;
        }

    }

    /* ---- BEGIN LIBRARY ----*/
    private HashMap<Integer, BookShelf> ShelfMap = new HashMap<>();
    private final int shelf_id = IDManager.generate_id();


    public void addBookShelf(BookShelf bookShelf)
    {
        ShelfMap.put(shelf_id, bookShelf);
    }

    public BookShelf getBookShelf(int shelfId)
    {
        return ShelfMap.get(shelfId);
    }

    public void print_shelf_map()
    {
        for(Map.Entry<Integer, BookShelf> shelf : ShelfMap.entrySet())
            out.println("Shelf ID: " + shelf.getKey() + ", Book Shelf: " + shelf.getValue());
    }
}
