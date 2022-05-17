package com.collections.practice1.sorting.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.collections.practice1.dao.EKartDataBase;
import com.collections.practice1.sorting.model.Customer;

public class MapVsFlatMapDemo {

	public static void main(String[] args) {

		List<Customer> customers = EKartDataBase.getAll();

		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

		System.out.println(emails);

//=========================================== Scenario why we need flatMap() =================================

		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());

		System.out.println(phoneNumbers);
		
//========================================== Usage of flatMap() ==============================================		
		
		List<String> mobileNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(mobileNumbers);
	}
}
