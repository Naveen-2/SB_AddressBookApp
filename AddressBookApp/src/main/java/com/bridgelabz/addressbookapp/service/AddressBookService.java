package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	@Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Naveen", "Kumar",
					                "New Road st", "Sivakasi", "Tamil Nadu", "contact@naveen.com",
					                "9876543210", "626123")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int contactId) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Naveen", "Kumar",
					                "New Road st", "Sivakasi", "Tamil Nadu", "contact@naveen.com",
					                "9876543210", "626123"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int contactId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(contactId, addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int contactId) {

    }
}
