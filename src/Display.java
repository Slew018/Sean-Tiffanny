import java.io.IOException;

public class Display {
    //for displaying the menu and writing to the console
    public static String menu() throws IOException {
            System.out.println("1. View contacts");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit");
            System.out.println("Enter an option (1, 2, 3, 4 or 5)");
            UserInput.userChoice();
        return "------------------";
    }
}
