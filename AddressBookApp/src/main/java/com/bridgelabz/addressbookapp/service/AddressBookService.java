package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	
	private List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int contactId) {
        return addressBookDataList.get(contactId - 1);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size() + 1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int contactId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(contactId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setEmail(addressBookDTO.email);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setZipCode(addressBookDTO.zipCode);
        addressBookDataList.set(contactId - 1, addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int contactId) {
        addressBookDataList.remove(contactId - 1);
    }
}
