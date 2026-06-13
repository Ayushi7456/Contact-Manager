package service;

import model.Contact;

public interface ContactService {
    void addContact(Contact contact);
    void viewContacts();
    void searchContact(String name);
    void deleteContact(String name);
    void updateContact(String name, String phone, String email);

}
