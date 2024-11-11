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
}
