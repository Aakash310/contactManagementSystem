package com.cms.contactmanagementsystem.service;

import com.cms.contactmanagementsystem.model.Contact;

import java.util.List;


public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> fetchAllContacts();

    Contact fetchContactById(Long id);

    Contact fetchContactByFirstName(String firstName);

    Contact fetchContactByLastName(String lastName);

    Contact fetchContactByEmail(String email);

    boolean deleteContactUsingId(Long id);

    boolean deleteContactUsingFirstName(String firstname);

    boolean deleteContactUsingLastName(String lastname);

    boolean deleteContactUsingEmail(String email);

    Contact updateContactUsingId(Long id, Contact contact);

    Contact updateContactUsingFirstName(String firstName, Contact contact);

    Contact updateContactUsingLastName(String lastName, Contact contact);

    Contact updateContactUsingEmail(String email, Contact contact);
}
