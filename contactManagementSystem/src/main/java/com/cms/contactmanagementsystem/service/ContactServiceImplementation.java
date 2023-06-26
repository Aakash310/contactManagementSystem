package com.cms.contactmanagementsystem.service;

import com.cms.contactmanagementsystem.entity.ContactEntity;
import com.cms.contactmanagementsystem.model.Contact;
import com.cms.contactmanagementsystem.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImplementation implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImplementation(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public Contact saveContact(Contact contact) {
        ContactEntity contactEntity = new ContactEntity();
        BeanUtils.copyProperties(contact, contactEntity);
        contactRepository.save(contactEntity);
        return contact;
    }

    @Override
    public List<Contact> fetchAllContacts() {
        List<ContactEntity> contactEntities = contactRepository.findAll();

        List<Contact> contacts = contactEntities
                .stream()
                .map(contactEntity -> new Contact(
                        contactEntity.getId(),
                        contactEntity.getFirstname(),
                        contactEntity.getLastname(),
                        contactEntity.getEmail(),
                        contactEntity.getMobile()
                )).collect(Collectors.toList());
        return contacts;
    }

    @Override
    public Contact fetchContactById(Long id) {
        ContactEntity contactEntity = contactRepository.findById(id).get();
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactEntity, contact);
        return contact;
    }

    @Override
    public Contact fetchContactByFirstName(String firstName) {
        ContactEntity contactEntity = contactRepository.findByFirstname(firstName);
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactEntity, contact);
        return contact;
    }

    @Override
    public Contact fetchContactByLastName(String lastName) {
        ContactEntity contactEntity = contactRepository.findByLastname(lastName);
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactEntity, contact);
        return contact;
    }

    @Override
    public Contact fetchContactByEmail(String email) {
        ContactEntity contactEntity = contactRepository.findByEmail(email);
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactEntity, contact);
        return contact;
    }


    @Override
    public boolean deleteContactUsingId(Long id) {
        ContactEntity contact = contactRepository.findById(id).get();
        contactRepository.delete(contact);
        return false;
    }

    @Override
    public boolean deleteContactUsingFirstName(String firstname) {
        ContactEntity contact = contactRepository.findByFirstname(firstname);
        contactRepository.delete(contact);
        return false;
    }

    @Override
    public boolean deleteContactUsingLastName(String lastname) {
        ContactEntity contact = contactRepository.findByLastname(lastname);
        contactRepository.delete(contact);
        return false;
    }

    @Override
    public boolean deleteContactUsingEmail(String email) {
        ContactEntity contact = contactRepository.findByEmail(email);
        contactRepository.delete(contact);
        return false;
    }

    @Override
    public Contact updateContactUsingId(Long id, Contact contact) {
        ContactEntity contactEntity = contactRepository.findById(id).get();
        contactEntity.setFirstname(contact.getFirstname());
        contactEntity.setLastname(contact.getLastname());
        contactEntity.setEmail(contact.getEmail());
        contactEntity.setMobile(contact.getMobile());
        contactRepository.save(contactEntity);
        return contact;
    }

    @Override
    public Contact updateContactUsingFirstName(String firstname, Contact contact) {
        ContactEntity contactEntity = contactRepository.findByFirstname(firstname);
        contactEntity.setFirstname(contact.getFirstname());
        contactEntity.setLastname(contact.getLastname());
        contactEntity.setEmail(contact.getEmail());
        contactEntity.setMobile(contact.getMobile());
        contactRepository.save(contactEntity);
        return contact;
    }

    @Override
    public Contact updateContactUsingLastName(String lastname, Contact contact) {
        ContactEntity contactEntity = contactRepository.findByLastname(lastname);
        contactEntity.setFirstname(contact.getFirstname());
        contactEntity.setLastname(contact.getLastname());
        contactEntity.setEmail(contact.getEmail());
        contactEntity.setMobile(contact.getMobile());
        contactRepository.save(contactEntity);
        return contact;
    }

    @Override
    public Contact updateContactUsingEmail(String email, Contact contact) {
        ContactEntity contactEntity = contactRepository.findByEmail(email);
        contactEntity.setFirstname(contact.getFirstname());
        contactEntity.setLastname(contact.getLastname());
        contactEntity.setEmail(contact.getEmail());
        contactEntity.setMobile(contact.getMobile());
        contactRepository.save(contactEntity);
        return contact;
    }


}
