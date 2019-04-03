import util.Input;

public class ContactsManager {


    static Input input;

    public static void main(String[] args) {


        input = new Input();

        RetrieveFileContent content = new RetrieveFileContent("contacts.txt");

          content.addContact("Jeremy","232323332");
        content.viewFile();



    }
}
