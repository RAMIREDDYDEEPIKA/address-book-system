package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book!");
        Scanner sc=new Scanner(System.in);
        Contacts[] details = new Contacts[100];  // Array to hold contacts
        int contactCount = 0;
        while(true){
            System.out.println("Enter contact details:");
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("State: ");
            String state = sc.nextLine();
            System.out.print("Zip Code: ");
            String zipNumber = sc.nextLine();
            System.out.print("Phone Number: ");
            String phoneNum = sc.nextLine();
            System.out.print("Email ID: ");
            String emailId = sc.nextLine();

            Contacts contact = new Contacts(firstName, lastName, address, city, state, zipNumber, phoneNum, emailId);

            if (contactCount < details.length) {
                details[contactCount] = contact;
                contactCount++;
                System.out.println("Contact added: " + contact);
            } else {
                System.out.println("Address book is full. Cannot add more contacts.");
            }

            System.out.print("Do you want to add another contact? (yes/no): ");
            String continueInput = sc.nextLine();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("All Contacts:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println(details[i]);
        }
    }
}

