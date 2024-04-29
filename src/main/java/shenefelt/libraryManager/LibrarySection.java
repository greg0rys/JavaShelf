package shenefelt.libraryManager;

import java.util.ArrayList;

public class LibrarySection
{
    private final int SECTION_NUMBER = Library.IDManager.generate_section_number();
    private String sectionName;
    private ArrayList<BookShelf> shelves = new ArrayList<>();


}
