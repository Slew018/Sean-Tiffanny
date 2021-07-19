import java.io.IOException;


public class ContactsManagerApp {
   // got our path

    public static void main(String[] args) throws IOException {
        //added do while so it does not exit unless told to by selecting option 5
        do {
            System.out.println(Display.menu());
        } while(!UserInput.isExit);
    }
}
