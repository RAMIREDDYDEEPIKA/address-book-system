package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacts> addressBook = new ArrayList<>();  
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
 
                addressBook.add(contact);
                contactCount++;
                System.out.println("Contact added: " + contact);

            } 
            else if (option == 2) { 
                System.out.print("Enter the First Name of the contact to edit: ");
                String editFirstName = sc.nextLine();
                System.out.print("Enter the Last Name of the contact to edit: ");
                String editLastName = sc.nextLine();

                boolean contactFound = false;
                for (Contacts contact : addressBook) {
                    if (contact.getFirstName().equalsIgnoreCase(editFirstName) && contact.getLastName().equalsIgnoreCase(editLastName)) {
                        contactFound = true;
                        System.out.println("Editing contact: " + contact);
 
                        System.out.print("New First Name: ");
                        contact.setFirstName(sc.nextLine());
                        System.out.print("New Last Name: ");
                        contact.setLastName(sc.nextLine());
                        System.out.print("New Address: ");
                        contact.setAddress(sc.nextLine());
                        System.out.print("New City: ");
                        contact.setCity(sc.nextLine());
                        System.out.print("New State: ");
                        contact.setState(sc.nextLine());
                        System.out.print("New Zip Code: ");
                        contact.setZipNumber(sc.nextLine());
                        System.out.print("New Phone Number: ");
                        contact.setPhoneNum(sc.nextLine());
                        System.out.print("New Email ID: ");
                        contact.setEmailId(sc.nextLine());

                        System.out.println("Contact updated: " + contact);
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
                for (int i = 0; i < addressBook.size(); i++) {
                    Contacts contact = addressBook.get(i);
                    if (contact.getFirstName().equalsIgnoreCase(deleteFirstName) && contact.getLastName().equalsIgnoreCase(deleteLastName)) {
                        contactFound = true;
                        System.out.println("Deleting contact: " + contact);
 
                        addressBook.remove(i);
                        contactCount--; 
                        System.out.println("Contact deleted.");
                        break;
                    }
                }

                if (!contactFound) {
                    System.out.println("Contact with name " + deleteFirstName + " " + deleteLastName + " not found.");
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
 
            System.out.println("\nAll Contacts:");
            for (Contacts contact : addressBook) {
                System.out.println(contact);
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
