package com.collections.practice1.sorting.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
//=========================== 1.Normal Approach Using Lambda Expression ==============================
		Consumer<Integer> consumer = t -> System.out.println("Printing Normal : " + t);

		consumer.accept(10);
		
//=========================== 2.Advanced Approach Using Lambda Expression ==============================	
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
		list1.stream().forEach(t->System.out.println("Printing Advanced : " + t));
	}
}
