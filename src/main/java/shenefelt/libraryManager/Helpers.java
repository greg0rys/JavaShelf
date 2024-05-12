package shenefelt.libraryManager;
/*
 * This class holds helper functions used throughout the program.
 */

import java.util.Random;

public class Helpers
{
    private static final int MAX_BOOK_ID = 300500;
    private static final int MAX_SHELF_ID = 400567;

    public Helpers() {};

    static public int getBookID()
    {
        return new Random().nextInt(MAX_BOOK_ID);
    }

    static public int getShelfID()
    {
        return new Random().nextInt(MAX_SHELF_ID);
    }
}
