package com.addressbook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipNumber;
    private String phoneNum;
    private String emailId;

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
}