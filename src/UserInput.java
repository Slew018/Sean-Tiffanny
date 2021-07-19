import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    static boolean isExit = false;

    public static void userChoice() throws IOException {

        Scanner scan = new Scanner(System.in);

        //below code makes it to where user is told they must input only a number not a letter or anything else
        if(scan.hasNextInt()) {
            int userChoice = scan.nextInt();

            if (userChoice == 1) {
                System.out.println(ReadingWriting.printAllContacts());
            } else if (userChoice == 2) {
                System.out.println(ReadingWriting.createNew());
            } else if (userChoice == 3) {
                System.out.println(ReadingWriting.searchByName()); // need method
            } else if (userChoice == 4) {
                System.out.println(ReadingWriting.deleteContact()); // need method
            } else if (userChoice == 5) {
                isExit = true;
                System.exit(0);
            } else {
                System.out.println("goodbye");
                userChoice();
            }
        } else {
            System.out.println("Input must be a number");
        }
    }
}