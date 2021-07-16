import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadingWriting {
    //for reading/writing to files
// from curriculum read the contents of a file // created a get all method with our file path.
    public static List<String> getAll() throws IOException {
        Path filePath = Path.of("/Users/tiffannyhadden/IdeaProjects/Sean-Tiffanny/src/contacts.txt");
        List<String> file = Files.readAllLines(filePath);
        return file;
    }
    // create another method for writing to our filepath
    public static void createNew() throws IOException { // declaring method , if there are any errors it will throw exception
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = scan.nextLine();
        System.out.println("Enter your Last Name");
        String lastName = scan.nextLine();
        System.out.println("Enter your phone number");
        String phoneNumber = scan.nextLine();
        // from curriculum add a line to an existing file
        Files.write(
                Paths.get("src", "contacts.txt"), // declaring where the file is located, from this directory we are getting info from contacts.txt
                Arrays.asList(firstName + " " + lastName +  " | " + phoneNumber), // list with one item, achieving values
                StandardOpenOption.APPEND //By using StandardOpenOption.APPEND, we are able to add lines to the existing file(contacts.txt), instead of overwriting its contents. // adds to arraylist
        );
    }
}
