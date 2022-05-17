package com.collections.practice1.sorting.service;

import java.util.List;
import java.util.stream.Collectors;

import com.collections.practice1.dao.StudentDatabase;
import com.collections.practice1.sorting.model.Student;

public class ResultAnalysis {

	//public static List<Student> evaluateResultByMarks(String result) {
		
//======================================== Using if/else Condition =================================================		
//		if (result.equalsIgnoreCase("pass"))
//			return StudentDatabase.getStudents().stream().filter(std -> std.getMarks() > 70)
//					.collect(Collectors.toList());
//		else
//			return StudentDatabase.getStudents().stream().filter(std -> std.getMarks() < 70)
//					.collect(Collectors.toList());
//
//	}
	
//======================================= Using Ternary Operator ====================================================
	public static List<Student> evaluateResultByName(String resultTernary) {
	
		return (resultTernary.startsWith("a"))
				? StudentDatabase.getStudents().stream().filter(std -> std.getName().startsWith("A"))
						.collect(Collectors.toList())
				: StudentDatabase.getStudents().stream().filter(std -> std.getName().startsWith("a"))
				        .collect(Collectors.toList());
	}
	
//======================================= Using Ternary Operator ====================================================
		public static Student evaluateResultById(String resultById) {
		
			return null;//.getStudents().stream().filter(std -> std.getId().equals(resultById)).toString().
					
		}	
	

	public static void main(String[] args) {

		//System.out.println(evaluateResultByMarks("fail"));
		System.out.println(evaluateResultByName("A"));
		System.out.println(evaluateResultById("10"));
	}
}
