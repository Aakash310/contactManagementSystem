package com.cms.contactmanagementsystem.controller;

import com.cms.contactmanagementsystem.model.Contact;
import com.cms.contactmanagementsystem.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("cms/api/v1")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/saveContact")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    @GetMapping("/")
    public String hello() {
        return ("<h1>Welcome Here</h1>");
    }

    @GetMapping("/fetchContacts")
    public List<Contact> fetchAllContacts() {
        return contactService.fetchAllContacts();
    }

    @GetMapping("/fetchUser/{id}")
    public ResponseEntity<Contact> fetchContactById(@PathVariable("id") Long id) {
        Contact contact =  contactService.fetchContactById(id);
        return ResponseEntity.ok(contact);
    }

    @GetMapping("/fetchUser/{firstname}")
    public ResponseEntity<Contact> fetchContactByFirstName(@PathVariable("firstname") String firstname) {
        Contact contact =  contactService.fetchContactByFirstName(firstname);
        return ResponseEntity.ok(contact);
    }

    @GetMapping("/fetchUser/{lastname}")
    public ResponseEntity<Contact> fetchContactByLastName(@PathVariable("lastname") String lastname) {
        Contact contact =  contactService.fetchContactByLastName(lastname);
        return ResponseEntity.ok(contact);
    }

    @GetMapping("/fetchUser/{email}")
    public ResponseEntity<Contact> fetchContactByEmail(@PathVariable("email") String email) {
        Contact contact =  contactService.fetchContactByEmail(email);
        return ResponseEntity.ok(contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteContact(@PathVariable("id") Long id) {
        boolean deleted = false;
        deleted = contactService.deleteContactUsingId(id);
        Map<String,Boolean > response = new HashMap<>();
        response.put("Contact deleted successfully", deleted = true);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deleteContact/{firstname}")
    public ResponseEntity<Map<String, Boolean>> deleteContactUsingFirstName(@PathVariable("firstname") String firstname) {
        boolean deleted = false;
        deleted = contactService.deleteContactUsingFirstName(firstname);
        Map<String,Boolean > response = new HashMap<>();
        response.put("Contact deleted successfully", deleted = true);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deleteContact/{lastname}")
    public ResponseEntity<Map<String, Boolean>> deleteContactUsingLastName(@PathVariable("lastname") String lastname) {
        boolean deleted = false;
        deleted = contactService.deleteContactUsingLastName(lastname);
        Map<String,Boolean > response = new HashMap<>();
        response.put("Contact deleted successfully", deleted = true);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deleteContact/{email}")
    public ResponseEntity<Map<String, Boolean>> deleteContactUsingEmail(@PathVariable("email") String email) {
        boolean deleted = false;
        deleted = contactService.deleteContactUsingEmail(email);
        Map<String,Boolean > response = new HashMap<>();
        response.put("Contact deleted successfully", deleted = true);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateContact/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable("id") Long id, @RequestBody Contact contact){
        contact = contactService.updateContactUsingId(id, contact);
        return ResponseEntity.ok(contact);
    }

    @PutMapping("/updateContact/{firstname}")
    public ResponseEntity<Contact> updateContactUsingFirstName(@PathVariable("firstname") String firstname, @RequestBody Contact contact){
        contact = contactService.updateContactUsingFirstName(firstname, contact);
        return ResponseEntity.ok(contact);
    }

    @PutMapping("/updateContact/{lastname}")
    public ResponseEntity<Contact> updateContactUsingLastName(@PathVariable("lastname") String lastname, @RequestBody Contact contact){
        contact = contactService.updateContactUsingLastName(lastname, contact);
        return ResponseEntity.ok(contact);
    }

    @PutMapping("/updateContact/{email}")
    public ResponseEntity<Contact> updateContactUsingEmail(@PathVariable("email") String email, @RequestBody Contact contact){
        contact = contactService.updateContactUsingEmail(email, contact);
        return ResponseEntity.ok(contact);
    }
}
