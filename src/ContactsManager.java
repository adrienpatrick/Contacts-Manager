import util.Input;

public class ContactsManager {


    static Input input;

    public static void main(String[] args) {


        input = new Input();

        Contact content = new Contact("contacts.txt");


        content.addContact("Jeremy","232323332");
        content.addContact("Adrien","232323332");
//
//        System.out.println(" ");
//        System.out.println("Search a contact by name");
//
//       String contactSearch = input.getString();
//
//        content.searchContact(contactSearch);


        System.out.println(" ");
        System.out.println("Delete a contact by name: ");
        String deleteContactSearch = input.getString();

        content.deleteContact(deleteContactSearch);
        System.out.println(" ");
        content.viewFile();

        content.addContact("John","232323332");
        content.viewFile();




    }
}
