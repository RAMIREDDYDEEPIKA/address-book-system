package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {  
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Address Book!");
        Contacts contact = AddContacts.AddingDetails();
        if (contact != null) {
            contact.toString();
        }
    }
}
