package section8.ArrayList;

import java.util.Scanner;

public class MobilePhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("98765432");

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void startPhone(){
        System.out.println("Starting phone...");
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - To search if a contact exists.");
        System.out.println("\t 6 - To show available actions.");
    }

    public static void printContacts(){
        mobilePhone.printContacts();
    }

    public static void addContact(){
        System.out.println("Enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the new contact phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(Contact.createContact(name, phoneNumber));
    }

    public static void updateContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if(existingContact != null){
            System.out.println("Enter the new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("enter the new contact phone number: ");
            String newPhoneNumber = scanner.nextLine();
            mobilePhone.updateContact(existingContact, Contact.createContact(newName, newPhoneNumber));

            System.out.println("Contact updated successfully");
        }
        else{
            System.out.println("Contact not found.");
        }
    }

    public static void removeContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(contactName);
        if(contact != null){
            if(mobilePhone.removeContact(contact))
                System.out.println("Contact deleted successfully");
            else
                System.out.println("Could not delete contact");
        }
        else
            System.out.println("Contact name not found in the agenda");
    }

    public static void queryContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(contactName);
        if(contact != null)
            System.out.println("Contact found with phone number: " + contact.getPhoneNumber());
        else
            System.out.println("Contact not found in your agenda");
    }
}
