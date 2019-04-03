import util.Input;

public class ContactsManager {


    static Input input;

    public static void main(String[] args) {


        input = new Input();

        RetrieveFileContent content = new RetrieveFileContent("contacts.txt");

//          content.addContact("Jeremy","232323332");
        content.viewFile();

        System.out.println(" ");
        System.out.println("Search a contact by name");

       String contactSearch = input.getString();

        content.searchContact(contactSearch);



    }
}
