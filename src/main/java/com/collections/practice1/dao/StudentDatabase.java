package com.collections.practice1.dao;

import java.util.ArrayList;
import java.util.List;

import com.collections.practice1.sorting.model.Address;
import com.collections.practice1.sorting.model.Student;

public class StudentDatabase {

	public static List<Student> getStudents() {

		List<Student> studentDataBase = new ArrayList<>();

		studentDataBase.add(new Student("Ashok", "5", 78, "ashok@gmail.com", new Address("kanaparthy", "500005")));
		studentDataBase.add(new Student("Pratap", "10", 86, "pratap@gmail.com", new Address("Hyderabad", "500010")));
		studentDataBase.add(new Student("Vijay", "6", 84, "vijay@gmail.com", new Address("Guntur", "500006")));
		studentDataBase.add(new Student("Sudha", "7", 92, "sudha@gmail.com", new Address("Macharla", "500007")));

		return studentDataBase;

	}
}
