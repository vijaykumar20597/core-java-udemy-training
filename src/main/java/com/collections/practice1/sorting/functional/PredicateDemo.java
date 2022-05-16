package com.collections.practice1.sorting.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

//================================= 1.Normal Approach ========================================================	

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(4));

//================================= 2.Anonymous Approach ========================================================			

		Predicate<Integer> predicateAnonymous = (t) -> {
			if (t % 2 == 0)
				return true;
			else
				return false;
		};
		System.out.println(predicateAnonymous.test(7));

//================================= 2.Lambda Approach ~ 1 ========================================================		
		Predicate<Integer> predicateLambda1 = t -> t % 2 == 0;
		System.out.println(predicateLambda1.test(10));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream().forEach(t -> System.out.println("Printing Lambda Approach ~ 1 : " + t));

//================================= 2.Lambda Approach Using Filter ~ 1 ========================================================		
		Predicate<Integer> predicateLambda2 = t -> t % 2 == 0;
		
		list1.stream().filter(predicateLambda2)
				.forEach(t -> System.out.println("Printing Lambda Approach Using Filter EVEN : " + t));

//================================= 2.Lambda Approach Using Filter ========================================================		

		list1.stream().filter(t -> t % 2 != 0)
				.forEach(t -> System.out.println("Printing Lambda Approach Using Filter ODD : " + t));
	}
}
