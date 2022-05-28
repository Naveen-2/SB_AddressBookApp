package com.bridgelabz.addressbookapp.model;

import javax.persistence.*;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="addressbook_table")
public @Data class AddressBookData {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int contactId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "zip_code")
    private String zipCode;

    public AddressBookData() {
    }

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
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
