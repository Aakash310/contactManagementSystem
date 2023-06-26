package com.cms.contactmanagementsystem.repository;

import com.cms.contactmanagementsystem.entity.ContactEntity;
import com.cms.contactmanagementsystem.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

    ContactEntity findByFirstname(String firstName);

    ContactEntity findByLastname(String lastName);

    ContactEntity findByEmail(String email);
}
