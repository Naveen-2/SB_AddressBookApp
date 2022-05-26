package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
	
	public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String email;
    public String phoneNumber;
    public String zipCode;

    public AddressBookDTO(String firstName, String lastName, String address, String city,
                          String state, String email, String phoneNumber, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
