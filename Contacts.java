package com.addressbook;

public class Contacts {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipNumber;
    public String phoneNum;
    public String emailId;

    public Contacts(String firstName, String lastName, String address, String city, String state, String zipNumber, String phoneNum, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipNumber = zipNumber;
        this.phoneNum = phoneNum;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipNumber='" + zipNumber + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacts contacts = (Contacts) obj;
        return firstName.equals(contacts.firstName) && lastName.equals(contacts.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}