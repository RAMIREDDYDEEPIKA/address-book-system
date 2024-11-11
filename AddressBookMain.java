package com.addressbook;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AddressBookMain {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Address Book!");
        Scanner sc = new Scanner(System.in);

        ArrayList<Contacts> list = new ArrayList();
        while (true) {
            System.out.println("Enter 1-> adding persons contact.");
            System.out.println("Enter 2-> Edit contact using name.");
            System.out.println("Enter 3-> Display contacts.");
            System.out.println("Enter 4-> Exit.");
            System.out.println("Enter the choice=");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Adding contact details..");
                    Contacts newcontacts = PersonDetails.AddingDetails();
                    list.add(newcontacts);
                    break;
                case 2:
                    if (list.stream().count() > 0) {
                        PersonDetails.EditingContacts(list);
                    } else {
                        System.out.println("Address book is empty !,please add contacts !");
                        break;
                    }
                case 3:
                    System.out.println("Display the Contacts");
                    for (Contacts item : list) {
                        item.toString();
                    }
                    break;
                default:
                    System.out.println("Invalid input,Enter value between 1 to 4");
                    break;
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

            return new Contacts(firstname, lastname, address, city, state, zipNumber, phoneNum, emailId);
        }

        public static void EditingContacts(ArrayList<Contacts> list) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Editing Contacts");
            System.out.println("Enter the First Name: ");
            String firstname = sc.nextLine();
            System.out.println("Enter the Last Name: ");
            String lastname = sc.nextLine();

            if (firstname.isEmpty() || lastname.isEmpty()) {
                System.out.println("Name cannot be null");
                return;
            }
            for (Contacts item : list) {
                if (item.firstName.equals(firstname) && item.lastName.equals(lastname)) {
                    while (true) {
                        AddingDetails();
                    }
                }
            }
        }
    }
}
