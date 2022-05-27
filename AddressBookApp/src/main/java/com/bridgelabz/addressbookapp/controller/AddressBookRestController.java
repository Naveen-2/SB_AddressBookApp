package com.bridgelabz.addressbookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookRestController {
	
	
	@Autowired
	private IAddressBookService iAddressBookService;
	
	 	@RequestMapping(value = {"", "/"})
	    public ResponseEntity<ResponseDTO> getAddressBookData() {
	        List<AddressBookData> addressBookDataList = iAddressBookService.getAddressBookData();
	        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookDataList);
	        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	    }

	    @GetMapping("/get/{contactId}")
	    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("contactId") int contactId) {
	        AddressBookData addressBookData = iAddressBookService.getAddressBookDataById(contactId);
	        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for Id", addressBookData);
	        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	    }

	    @PostMapping("/create")
	    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
	        AddressBookData addressBookData = iAddressBookService.createAddressBookData(addressBookDTO);
	        ResponseDTO responseDTO = new ResponseDTO("Created Address Book data", addressBookData);
	        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	    }

	    @PutMapping("/update/{contactId}")
	    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId,
	                                                             @RequestBody AddressBookDTO addressBookDTO) {
	        AddressBookData addressBookData = iAddressBookService.updateAddressBookData(contactId, addressBookDTO);
	        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book data for Id", addressBookData);
	        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{contactId}")
	    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId) {
	        iAddressBookService.deleteAddressBookData(contactId);
	        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted Id : " + contactId);
	        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	    }
    
}
