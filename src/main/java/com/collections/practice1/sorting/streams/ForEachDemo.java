package com.collections.practice1.sorting.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Vijay");
		list.add("Ashok");
		list.add("Pratap");
		list.add("Gopi");
//==================== Normal Approach of Printing Data Using forEach =================================		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("====================================================================");
//==================== Using Lambda Expression ========================================
		list.stream().forEach(t -> System.out.println(t));

//=================================== Sorting List Name Starts with 'P' using normal for loop============================		
		
		for(String s : list) {
			
			if(s.startsWith("P")) {
				System.out.println("Printing Name Starts with P is : "+s);
			}
		}
		
//=================================== Sorting List Name Starts with 'P' using streams ==============================
		
		list.stream().filter((t -> t.startsWith("P"))).forEach(t -> System.out.println(t));
		
//============================= Using Map =============================================		
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Abhinav");
		map.put(2, "Mohan");
		map.put(3, "Tarun");
		map.put(4, "Santosh");

		map.forEach((key, value) -> System.out.println(key + ": " + value));//Normal Usage
		
//=============================== Printing Even keys ===============================================
		
		map.entrySet().stream().filter(k -> k.getKey()%2 == 0).forEach(obj -> System.out.println(obj));//using streams
		
//====================================== forEach() internal Structure ==============================================
		
		Consumer<String> consumer = (t)->System.out.println(t);
		for(String s1 : list) {
			consumer.accept(s1);
		}
	}
}
