import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ReadingWriting {
    //for reading/writing to files
// from curriculum read the contents of a file // created a get all method with our file path.

    public static List<String> getAllContacts() throws IOException {
        Path filePath = Paths.get("src", "contacts.txt");
        return Files.readAllLines(filePath);
    }
    public static boolean printAllContacts() throws IOException {
        List<String> file = getAllContacts();
        for (int i = 0; i < file.size(); i++) {
            System.out.println(file.get(i));
        }
        return false;
    }
    // create another method for writing to our filepath
    public static String createNew() throws IOException { // declaring method , if there are any errors it will throw exception
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = scan.nextLine();
        System.out.println("Enter your Last Name");
        String lastName = scan.nextLine();

        String phoneNumber = "";
        String formattedPhoneNumber = "";
        //found solution regex on the interweb
        while(phoneNumber.length() != 10) {
            System.out.println("Enter your 9 digit phone number and don't put dashes");
            phoneNumber = scan.nextLine();
            formattedPhoneNumber = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
            System.out.println(formattedPhoneNumber);
        }

        //New object that sets contact information equal
        Contacts newContact = new Contacts(firstName, lastName, formattedPhoneNumber);
        // from curriculum add a line to an existing file
        Files.write(
                Paths.get("src", "contacts.txt"), // declaring where the file is located, from this directory we are getting info from contacts.txt
                Arrays.asList(firstName + " " + lastName +  " | " + formattedPhoneNumber), // list with one item, achieving values
                StandardOpenOption.APPEND //By using StandardOpenOption.APPEND, we are able to add lines to the existing file(contacts.txt), instead of overwriting its contents. // adds to arraylist
        );
        return  "Contact " + firstName + " " + lastName + " Created!";
    }

    public static String searchByName() throws IOException {

        List<String> file = getAllContacts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String usersSearchText = scanner.nextLine();

        //intellij told me to do an enhanced for loop
        for (String contact : file) {
            if (contact.toLowerCase().contains(usersSearchText.toLowerCase())) {
                return contact;
            }
        }
        return "Contact not found";
    }

    public static String deleteContact() throws IOException {

            List<String> file = getAllContacts();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of contact to delete");
            String usersSearchText = scanner.nextLine();

        for (String contact : file) {
            if (contact.toLowerCase().contains(usersSearchText.toLowerCase())) {
                System.out.println("Before delete==========>" + file);
                //temporarily removes contact before you write it
                file.remove(contact);
                System.out.println("after delete==========>" + file);
                //after the file.remove you must write to the contacts to make it permanent
                Files.write(Paths.get("src", "contacts.txt"), file);
             return contact + " deleted";
            }
        }
        return "User Not Found";
    }
}
