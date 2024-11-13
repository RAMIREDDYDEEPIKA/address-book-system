package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book!");

        Scanner sc = new Scanner(System.in);
        HashSet<Contacts> list=new HashSet<>();

        while (true) {
            System.out.println("Enter 1-> adding persons contact.");
            System.out.println("Enter 2-> Edit contact using name.");
            System.out.println("Enter 3-> Delete contacts using name");
            System.out.println("Enter 4-> Display contacts.");
            System.out.println("Enter 5-> Exit.");
            System.out.println("Enter the choice=");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Adding contact details..");
                    Contacts newcontacts = PersonDetails.addingDetails();
                    list.add(newcontacts);
                    break;
                case 2:
                    if (list.stream().count() > 0) {
                        PersonDetails.editingContacts(list);
                    } else {
                        System.out.println("Address book is empty !,please add contacts !");
                        break;
                    }
                case 3:
                    if(list.stream().count()>0)
                    {
                        PersonDetails.deleteContacts(list);
                    }
                    else
                    {
                        System.out.println("Address book is empty !,please add contacts !");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Display the Contacts");
                    for(Contacts item:list)
                    {
                        item.toString();
                    }
                    break;
                default:System.out.println("Invalid input,Enter value between 1 to 4");
                    break;
            }
        }
    }

    class PersonDetails {

        public static Contacts addingDetails() {

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

        public static void editingContacts(HashSet<Contacts> list) {
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
                        addingDetails();
                    }
                }
            }
        }
        public static void deleteContacts(HashSet<Contacts> list)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Deleting Contacts");
            System.out.print("Enter the First Name: ");
            String firstname = sc.nextLine();
            System.out.print("Enter the Last Name: ");
            String lastname = sc.nextLine();

            if (firstname.isEmpty() || lastname.isEmpty()) {
                System.out.println("Name cannot be null");
                return;
            }

            boolean contactFound = false;
            Iterator<Contacts> iterator = list.iterator();
            while (iterator.hasNext()) {
                Contacts item = iterator.next();
                if (item.firstName.equals(firstname) && item.lastName.equals(lastname)) {
                    System.out.println("Confirm deletion!");
                    System.out.print("Press Y or y for YES: ");
                    char decision = sc.next().charAt(0);

                    if (decision == 'Y' || decision == 'y') {
                        iterator.remove();
                        System.out.println("Successfully deleted!");
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                    contactFound = true;
                    break;
                }
            }
            if (!contactFound) {
                System.out.println("Entered name is not in the Address Book!");
            }
        }
    }
}