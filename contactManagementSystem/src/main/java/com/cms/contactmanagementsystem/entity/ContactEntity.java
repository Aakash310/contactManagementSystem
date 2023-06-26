package com.cms.contactmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Contacts")
public class ContactEntity {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
}
