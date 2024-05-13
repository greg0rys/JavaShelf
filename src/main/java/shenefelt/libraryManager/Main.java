package shenefelt.libraryManager;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

public class Main
{
    public static class Driver
    {
        private final Library SESSION_LIBRARY = new Library();

        public Driver()
        {
        }

        private final Scanner scanner = new Scanner(System.in);

        public void start()
        {
            out.println("Welcome to the library!");
            menu();
        }

        private void menu()
        {
            boolean run = true;
            printChoices();

            out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

            choice = validateChoice(choice);

            switch (choice)
            {
                case 1:
                    out.println("The total number of books is: " + SESSION_LIBRARY.getTotalBooks());
                    break;
                case 2:
                    break;
                case 3:
                    out.println("LOL");
                    break;
                case 0:
                    out.println("Goodbye!");
                    break;
                case 16:
                    out.println("Not a valid choice, try again");
                    printChoices();
                    break;
                default:
                    out.println("Invalid choice. Try again.");
                    break;
            }
        }

        private int validateChoice(int choice)
        {
            if (choice < 1 || choice > 3)
                return 16;

            return choice;
        }

        private void printChoices()
        {
            out.println("0. Exit");
            out.println("1. Get Book Count");
            out.println("2. Get Book by Title");
            out.println("3. Add a new book");
            out.println("4. Delete a existing book");

        }

    }

    public static void main(String[] args)
    {

        new Driver().start();

        exit(0);
    }

}
