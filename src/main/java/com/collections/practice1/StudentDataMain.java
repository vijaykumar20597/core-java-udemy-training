package com.collections.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collections.practice1.comparator.StudentComparator;
import com.collections.practice1.dao.StudentDatabase;
import com.collections.practice1.sorting.model.Address;
import com.collections.practice1.sorting.model.Student;

public class StudentDataMain {

	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Vijay", "567", 78, "vijay@gmail.com", new Address("Tenali", "522202")));
		studentList.add(new Student("Bhara", "573", 83, "bhara@gmail.com", new Address("Chintal", "500081")));
		studentList.add(new Student("Poorna", "561", 89, "poorna@gmail.com", new Address("vinukonda", "500043")));
		studentList.add(new Student("Dhana", "5A0", 90, "dhana@gmail.com", new Address("Ranga Reddy", "500021")));

//================================= 1.Using Normal Sorting Approach ========================================		

		System.out.println("===========================================================================================");
		Collections.reverse(studentList);
		// Collections.sort(studentList);
		System.out.println(studentList);

		List<Student> studentSortingData = StudentDatabase.getStudents();

// =============================== 2.Using External Class ====================================
		Collections.sort(studentSortingData, new StudentComparator());
		System.out.println(studentSortingData);

//====================================== 3.Using Annonymous InnerClass ======================================

		Collections.sort(studentSortingData, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getMarks() - o2.getMarks();
			}
		});

// ================================ 4.Using Lambda Expressions ===============================

		Collections.sort(studentSortingData, (o1, o2) -> o2.getMarks() - o1.getMarks());

		System.out.println(studentSortingData);

// =================================== 5.Using Lambda Expressions =====================================

		Collections.sort(studentSortingData, (o1, o2) -> o2.getMarks() - o1.getMarks());

		System.out.println(studentSortingData);

// ================================= 6.Using StreamAPI =========================================

		studentSortingData.stream().sorted((o1, o2) -> o1.getMarks() - o2.getMarks()).forEach(System.out::println);

		studentSortingData.stream().sorted(Comparator.comparing(std -> std.getMarks())).forEach(System.out::println);

		studentList.stream().sorted().forEach(s -> System.out.println(s));// ascending

		// studentList.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//descending

// ============================== Using Method References ================================

// ============================== 8.For Default/Ascending Order ==========================================
		studentSortingData.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);

// ============================== 9.For Reverse/Descending Order ============================================
		
		studentSortingData.stream().sorted(Comparator.comparing(Student::getMarks).reversed())
				.forEach(System.out::println);

	}
}
