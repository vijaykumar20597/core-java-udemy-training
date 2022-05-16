package com.collections.practice1.sorting.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return " Hi Welcome..! ";
	}

	public static void main(String[] args) {

//============================================ Normal Approach =========================================
		Supplier<String> supplier = new SupplierDemo();

		System.out.println(supplier.get());

//============================================ Lambda Basic Approach =========================================
		Supplier<String> supplierLambda = () -> {

			return "Hi Welcome Lambda Basic Approach ..!";
		};
		System.out.println(supplierLambda.get());

//============================================ Lambda Advanced Approach =========================================
		Supplier<String> supplierLambda1 = () -> "Hi Welcome Lambda Advanced Approach ..!";

		System.out.println(supplierLambda1.get());

//============================================ Lambda Approach Using find and orElse ~ 1 =========================================
		Supplier<String> supplierLambda2 = () -> "Here list1 contains a and b , so based on condition it will print : b";

		System.out.println(supplierLambda2.get());

		List<String> list1 = Arrays.asList("b", "a");

		System.out.println(list1.stream().findAny().orElseGet(supplierLambda2));

//============================================ Lambda Approach Using find and orElse ~ 2 =========================================
		Supplier<String> supplierLambda3 = () -> "Here the emptyList doesn't exist any values so it will print supplierLambda3";

		List<String> emptyList = Arrays.asList();

		System.out.println(emptyList.stream().findAny().orElseGet(supplierLambda3));

//============================================ Lambda Approach Using find and orElse ~ 2 =========================================

		List<String> emptyList1 = Arrays.asList();

		System.out.println(emptyList1.stream().findAny().orElseGet(() -> "Hi Lambda Expression ..!"));
	}

}
