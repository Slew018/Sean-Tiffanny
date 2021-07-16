import java.io.IOException;


public class ContactsManagerApp {
   // got our path

    public static void main(String[] args) throws IOException {
        System.out.println(ReadingWriting.getAll());
        System.out.println(ReadingWriting.createNew());
    }
}
