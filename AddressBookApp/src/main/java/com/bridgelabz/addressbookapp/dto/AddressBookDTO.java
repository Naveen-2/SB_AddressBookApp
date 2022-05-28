package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@NotEmpty(message = "First name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Invalid first name")
    public String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Invalid last name")
    public String lastName;

    @NotEmpty(message = "Address cannot be empty")
    @Pattern(regexp = "^[A-Za-z,.0-9\\s]{3,}$", message = "Invalid address")
    public String address;

    @NotEmpty(message = "City cannot be empty")
    @Pattern(regexp = "^[A-Za-z,.0-9\\s]{3,}$", message = "Invalid city")
    public String city;

    @NotEmpty(message = "State cannot be empty")
    @Pattern(regexp = "^[A-Za-z,.0-9\\s]{3,}$", message = "Invalid state")
    public String state;

    @NotEmpty(message = "Email cannot be empty!")
    @Pattern(regexp = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$",
             message = "Invalid email")
    public String email;

    @NotEmpty(message = "Phone number cannot be empty")
    @Pattern(regexp = "((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}", message = "Invalid phone number")
    public String phoneNumber;

    @NotEmpty(message = "Zip code cannot be empty")
    @Pattern(regexp = "^[0-9]{6}$", message = "Invalid zip code")
    public String zipCode;

}
