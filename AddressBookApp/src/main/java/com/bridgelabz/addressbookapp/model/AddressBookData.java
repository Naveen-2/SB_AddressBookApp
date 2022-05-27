package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	private int contactId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phoneNumber;
    private String zipCode;

    public AddressBookData() {
    }

    public AddressBookData(int contactId, AddressBookDTO addressBookDTO) {
        this.contactId = contactId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.email = addressBookDTO.email;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.zipCode = addressBookDTO.zipCode;
    }

}
