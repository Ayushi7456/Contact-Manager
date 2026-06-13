package service;

import model.Contact;

import java.util.ArrayList;
import java.util.List;
public class ContactServiceImpl implements ContactService{
     List<Contact> contacts = new ArrayList<>();

     @Override
     public void addContact(Contact contact){
         contacts.add(contact);
         System.out.println("Contact added successfully!");
     }

    @Override
    public void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void searchContact(String name){

         boolean found = false;

         for(Contact contact : contacts){
             if(contact.getName().equalsIgnoreCase(name)){
                 found = true;
             }
         }
         if(!found){
             System.out.println("Contact not found");
         }
         else{
             System.out.println("Contact found");
         }
    }

    @Override
    public void deleteContact(String name){
         Contact contactToDelete = null;

         for(Contact contact : contacts){
             if(contact.getName().equalsIgnoreCase(name)){
                 contactToDelete = contact;
                 break;
             }
         }

         if(contactToDelete != null){
             contacts.remove(contactToDelete);
             System.out.println("Contact deleted successfully!");
         }
         else{
             System.out.println("Contact not found");
         }
    }

    @Override
    public void updateContact(String name, String phone, String email){

         for(Contact contact : contacts){
             if(contact.getName().equalsIgnoreCase(name)) {
                 contact.setNumber(phone);
                 contact.setEmail(email);
                 System.out.println("Contact updated successfully!");
                 return;
             }
         }
         System.out.println("Contact not found");
    }
}
