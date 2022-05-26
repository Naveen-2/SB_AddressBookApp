package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookRestController {
	
	@RequestMapping(value = {"", "/"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Naveen", "Kumar",
                                                "New Road st", "Sivakasi", "Tamil Nadu", "contact@naveen.com",
                                                  "9876543210", "626123"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("contactId") int contactId) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Naveen", "Kumar",
									                "New Road st", "Sivakasi", "Tamil Nadu", "contact@naveen.com",
									                "9876543210", "626123"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for Id", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book data", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId,
                                                             @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(contactId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book data", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted Id : " + contactId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    
}
