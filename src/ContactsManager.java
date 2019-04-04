import util.Input;

import java.sql.SQLOutput;

public class ContactsManager {


    static Input input;

    public static void main(String[] args) {


        input = new Input();

        Contact content = new Contact("contacts.txt");

        System.out.println(" ");
        System.out.println("----------------------------------------------------");
        System.out.println("|        ADRIEN'S CRAZY CONTACTS MANAGER            |");
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        while(true) {


            System.out.print(" \n" +
                    "1. View contacts\n" +
                    "2. Add a new contact\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5): ");


            int choice = input.getInt();


            if (choice == 1) {
                System.out.println(" ");
                content.viewFile();

            } else if (choice == 2) {
                System.out.println(" ");
                System.out.println("Please input the contact's first name: ");
                String firstName = input.getString();
                System.out.println("Please input the contact's last name: ");
                String lastName = input.getString();
                String firstLast = firstName + " " + lastName;
                System.out.println("Please input the contact's phone number: ");
                String phoneNumber = input.getString();
                content.addContact(firstLast, phoneNumber);
                System.out.println(" ");


            } else if (choice == 3) {
                System.out.println(" ");
                System.out.println("Please search for contact: ");
                String search = input.getString();
                content.searchContact(search);


            } else if (choice == 4) {
                System.out.println(" ");
                System.out.println("Who would you like to remove from your contacts? ");
                String deleteContact = input.getString();
                content.deleteContact(deleteContact);

            } else if (choice == 5) {
                System.out.println(" ");
                System.out.println("Goodbye! Have a nice day.");
                break;

            } else {
                System.out.println(" ");
                System.out.println("Invalid input, try again.");
            }

        }
    }
}
