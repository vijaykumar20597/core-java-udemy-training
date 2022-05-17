package com.collections.practice1.sorting.optional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.collections.practice1.dao.EKartDataBase;
import com.collections.practice1.sorting.model.Customer;

public class OptionalDemo {
//====================================== 1.Returning Customer by EmailId =================================================
//	public static Customer getCustomerByEmailId(String email) {
//
//		List<Customer> customerList = EKartDataBase.getAll();
//		
//		return customerList.stream().filter(customer -> customer.getEmail().equals(email)).findAny().get();
//	}
	
//====================================== 2.Returning Customer by EmailId ===============================================
//		public static Customer getCustomerByEmailId1(String email) {
//
//			List<Customer> customerList = EKartDataBase.getAll();
//			
//			return customerList.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElse(new Customer());
//		}	

//====================================== 2.Handling Exception ===============================================

		public static Customer getCustomerByEmailId2(String email) throws Exception {

					List<Customer> customerList = EKartDataBase.getAll();
					
					return customerList.stream().filter(customer -> customer.getEmail()
							.equals(email)).findAny().orElseThrow(() -> new Exception("No customer present with this emailId "));
				}		
		
	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(101, "john", null, Arrays.asList("798969", "987868"));

//================================== Using Optional methods ==============================================		

		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional);

		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
//		System.out.println(emailOptional2.get());

//================================= Handling Null Pointer Exceptions ===================================================

//================================= 1. Using isPresent() and isEmpty() ==========================================	

//		if(emailOptional2.isPresent()) {
//			System.out.println(emailOptional2.get());
//		}

//		if(emailOptional2.isEmpty()) {
//			System.out.println(emailOptional2.get());
//		}

//===================================== 2. Using orElse() ================================================= 

		// System.out.println(emailOptional2.orElse("default@gmail.com"));

//===================================== Handling Exception ==============================================			

		// System.out.println(emailOptional2.orElseThrow(() -> new
		// IllegalArgumentException("email not present")));

//================================= Here map() will convert the String to Uppercase ============================		

		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email..."));
		
		getCustomerByEmailId2("joh@gmail.com");
	}
}
