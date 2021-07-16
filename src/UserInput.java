import java.io.IOException;
import java.util.Scanner;

public class UserInput {

    public static void userChoice() throws IOException {

        Scanner scan = new Scanner(System.in);


        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println(ReadingWriting.getAll());
        } else if (choice == 2) {
            System.out.println(ReadingWriting.createNew());


        } else if (choice == 3) {
            System.out.println("Searching"); // need method


        } else if(choice == 4){
            System.out.println("Delete"); // need method
        } else if(choice == 5){
            System.exit(0);
        } else {
            System.out.println("goodbye");
            userChoice();
        }
    }
}