package shenefelt.libraryManager;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;
public class Main
{

    public static void main(String[] args)
    {
        class Driver
        {
            private final Library SESSION_LIBRARY = new Library();
            public Driver(){}

            public void start()
            {
                out.println("Welcome to the library!");
                menu();
            }

            private void menu()
            {
                boolean run = true;
                Scanner scanner = new Scanner(System.in);

                do
                {
                    printChoices();

                    out.print("Please enter your choice: ");
                    int choice = scanner.nextInt();

                    switch(choice)
                    {
                        case 1:
                            out.println("The total number of books is: " + SESSION_LIBRARY.getTotalBooks());
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            out.println("Goodbye!");
                            run = false;
                            break;
                        default:
                            out.println("Invalid choice. Try again.");
                            break;
                    }
                } while(run);
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

        new Driver().start();
    }

}
