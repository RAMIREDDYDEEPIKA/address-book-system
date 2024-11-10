package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book!");
        Scanner sc=new Scanner(System.in);
        Contacts[] details = new Contacts[100];   
        int contactCount = 0;
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact by Name");
            System.out.println("3. Delete Contact by Name");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();   

            if (option == 1) { 
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
                } 
                else {
                    System.out.println("Address book is full. Cannot add more contacts.");
                }

            } 
            else if (option == 2) {
                System.out.print("Enter the First Name of the contact to edit: ");
                String editFirstName = sc.nextLine();
                System.out.print("Enter the Last Name of the contact to edit: ");
                String editLastName = sc.nextLine();

                boolean contactFound = false;
                for (int i = 0; i < contactCount; i++) {
                    if (details[i].getFirstName().equalsIgnoreCase(editFirstName) && details[i].getLastName().equalsIgnoreCase(editLastName)) {
                        contactFound = true;
                        System.out.println("Editing contact: " + details[i]);
                        System.out.print("New First Name: ");
                        details[i].setFirstName(sc.nextLine());
                        System.out.print("New Last Name: ");
                        details[i].setLastName(sc.nextLine());
                        System.out.print("New Address: ");
                        details[i].setAddress(sc.nextLine());
                        System.out.print("New City: ");
                        details[i].setCity(sc.nextLine());
                        System.out.print("New State: ");
                        details[i].setState(sc.nextLine());
                        System.out.print("New Zip Code: ");
                        details[i].setZipNumber(sc.nextLine());
                        System.out.print("New Phone Number: ");
                        details[i].setPhoneNum(sc.nextLine());
                        System.out.print("New Email ID: ");
                        details[i].setEmailId(sc.nextLine());

                        System.out.println("Contact updated: " + details[i]);
                        break;
                    }
                }

                if (!contactFound) {
                    System.out.println("Contact with name " + editFirstName + " " + editLastName + " not found.");
                }
            } 
            else if (option == 3) { 
                System.out.print("Enter the First Name of the contact to delete: ");
                String deleteFirstName = sc.nextLine();
                System.out.print("Enter the Last Name of the contact to delete: ");
                String deleteLastName = sc.nextLine();

                boolean contactFound = false;
                for (int i = 0; i < contactCount; i++) {
                    if (details[i].getFirstName().equalsIgnoreCase(deleteFirstName) && details[i].getLastName().equalsIgnoreCase(deleteLastName)) {
                        contactFound = true;
                        System.out.println("Deleting contact: " + details[i]);
 
                        for (int j = i; j < contactCount - 1; j++) {
                            details[j] = details[j + 1];
                        }
                        details[contactCount - 1] = null; 
                        contactCount--; 
                        System.out.println("Contact deleted.");
                        break;
                    }
                }

                if (!contactFound) {
                    System.out.println("Contact with name " + deleteFirstName + " " + deleteLastName + " not found.");
                }
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.println("\nAll Contacts:");
            for (int i = 0; i < contactCount; i++) {
                System.out.println(details[i]);
            }
            System.out.print("\nDo you want to continue? (yes/no): ");
            String continueInput = sc.nextLine();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();
    }
}

