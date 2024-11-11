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

class PersonDetails {
    
    public static Contacts AddingDetails() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first name = ");
        String firstname = scanner.nextLine();
        System.out.print("Enter the last name = ");
        String lastname = scanner.nextLine();
        System.out.print("Enter the Address = ");
        String address = scanner.nextLine();
        System.out.print("Enter the city = ");
        String city = scanner.nextLine();
        System.out.print("Enter the state = ");
        String state = scanner.nextLine();
        System.out.print("Enter the zip code = ");
        String zipNumber = scanner.nextLine();
        System.out.print("Enter the Phone number = ");
        String phoneNum = scanner.nextLine();
        System.out.print("Enter the Email Id = ");
        String emailId = scanner.nextLine();

        return new Contacts(firstname, lastname, address,city,state,zipNumber,phoneNum,emailId);
    }
}
