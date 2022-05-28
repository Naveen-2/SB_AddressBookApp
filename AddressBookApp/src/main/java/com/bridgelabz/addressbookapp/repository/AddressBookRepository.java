package com.bridgelabz.addressbookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
	@Query(value = "select * from addressbook_table order by city", nativeQuery = true)
    List<AddressBookData> sortByCity();

    @Query(value = "select * from addressbook_table order by state", nativeQuery = true)
    List<AddressBookData> sortByState();
}