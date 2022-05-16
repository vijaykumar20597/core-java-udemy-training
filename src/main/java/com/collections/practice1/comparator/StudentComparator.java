package com.collections.practice1.comparator;

import java.util.Comparator;

import com.collections.practice1.sorting.model.Student;

public class StudentComparator implements Comparator<Student> {

	
	//Ascending
//	@Override
//	public int compare(Student o1, Student o2) {
//		
//		return (o1.getMarks()-o2.getMarks());
//	}

	//Descending
	@Override
	public int compare(Student o1, Student o2) {
		
		return (o2.getMarks()-o1.getMarks());
	}
	
}
