package com.cms.contactmanagementsystem.model;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
}