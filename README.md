##A Simple Contact management Application implemented using Spring Boot & Spring Data JPA

This Application is built for learning Spring boot , Hibernate with Spring Data JPA , Spring Security.It doesn't concentrate much on UI part.

It uses only three tables

User - to manage login
Contact - to Store User's contact information like name , Email id (Like Contacts in Phone) and it has unidirectional many to one mapping with User .
ContactPhone - to Store Phone numbers(yes! can store more phone number for each contact) information for each contact and it has unidirectional many to one mapping with Contact.

As part of Spring MVC , this application implements

Request Mapping using annotations and usage of Controller,Repository annotations
Front End Forms to Back End DataBinding
Autowiring of required objects
Redirection from one controller to another using flashattributes

As part of Spring Security, this application implements

Username - aakash
Password - aakash

As part of Spring Data JPA

Usage of CRUD repository
Usage of findBy and delete methods using different name patterns

Updates:
In order to have easy development , created branch h2_database which uses in memory h2 database .

h2-database & aop-brach has following updates

Aspectj is used for implementing cross cutting concern like logging and session checker
As part of Aspectj , we can learn usage of annotation like Aspect,Point Cut expression,Around & Before advice types.
