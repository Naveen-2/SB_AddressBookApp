package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

public @Data class AddressBookDTO {
	
	public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String email;
    public String phoneNumber;
    public String zipCode;

}
