import java.io.IOException;
import java.util.Scanner;

public class UserInput   {
    static boolean isExit = false;

    public static void userChoice() throws IOException {

        Scanner scan = new Scanner(System.in);

        //below code makes it to where user is told they must input only a number not a letter or anything else
        if(scan.hasNextInt()) {
            int userChoice = scan.nextInt();

            if (userChoice == 1) {
                ReadingWriting.printAllContacts(); // took out sout to remove false from coming on the console
            } else if (userChoice == 2) {
                System.out.println(ReadingWriting.createNew());
            } else if (userChoice == 3) {
                System.out.println(ReadingWriting.searchByName());
            } else if (userChoice == 4) {
                System.out.println(ReadingWriting.deleteContact());
            } else if (userChoice == 5) {
                isExit = true;
                System.exit(0);
            } else {
                System.out.println("Enter a number only 1-5");
                userChoice();
            }
        } else {
            System.out.println("Input must be a number");
        }
    }
}