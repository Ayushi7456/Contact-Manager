
import model.Contact;
import service.ContactService;
import service.ContactServiceImpl;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContactService service = new ContactServiceImpl();

        while(true){
            System.out.println("\n===== CONTACT MANAGER =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("3. Exit");


            System.out.print("Enter your choice: ");

            int choice;
            try {

                choice = Integer.parseInt(sc.nextLine());   //takes input as string and then converts to int

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice){
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    Contact contact = new Contact(name, phone, email);

                    service.addContact(contact);

                    break;

                case 2:
                    service.viewContacts();
                    break;

                case 3:
                    System.out.println("Enter name to search: ");
                    String searchName = sc.nextLine();
                    service.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    service.deleteContact(deleteName);
                    break;

                case 5:
                    System.out.println("Enter name of contact to update: ");
                    name = sc.nextLine();
                    System.out.println("Enter new Phone number: ");
                    String newNumber = sc.nextLine();
                    System.out.println("Enter new Email: ");
                    String newEmail = sc.nextLine();
                    service.updateContact(name, newNumber, newEmail);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
