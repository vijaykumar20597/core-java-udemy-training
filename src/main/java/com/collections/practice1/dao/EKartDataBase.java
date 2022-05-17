package com.collections.practice1.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.collections.practice1.sorting.model.Customer;

public class EKartDataBase {

	public static List<Customer> getAll() {

		return Stream
				.of(new Customer(101, "john", "john@gmail.com", Arrays.asList("998877", "9900886")),
						new Customer(102, "mike", "mike@gmail.com", Arrays.asList("98754", "9900886")),
						new Customer(103, "james", "james@gmail.com", Arrays.asList("996677", "9900886")),
						new Customer(103, "stark", "stark@gmail.com", Arrays.asList("998877", "9900886")))
				.collect(Collectors.toList());

	}
}
