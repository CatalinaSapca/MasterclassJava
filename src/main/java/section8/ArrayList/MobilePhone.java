package section8.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact){
        if(!contacts.contains(contact)) {
            contacts.add(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        return contacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for(int i=0;i< contacts.size();i++)
            if(contacts.get(i).getName().equals(contactName))
                return i;
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0)
            return contact.getName();
        return null;
    }

    public Contact queryContact(String contactName){
        int position = findContact(contactName);
        if(position >= 0)
            return contacts.get(position);
        return null;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            int position2 = findContact(newContact.getName());
            if(position2 >= 0) {
                System.out.println("Contact with " + newContact.getName() + " already exists.");
                return false;
            }
            else {
                contacts.set(position, newContact);
                System.out.println("Old contact " + oldContact.toString() + " was updated to " + newContact.toString());
                return true;
            }
        }
        else {
            System.out.println("Contact was not found so it was not updated.");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(contacts.contains(contact)) {
            contacts.remove(contact);
            System.out.println("Contact was deleted.");
            return true;
        }
        System.out.println("Contact was not found so it was not deleted.");
        return false;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void printContacts(){
        System.out.println("You have " + contacts.size() + " contacts in your agenda.");
        for(int i=0;i<contacts.size();i++)
            System.out.println(contacts.get(i).toString());
    }


}
