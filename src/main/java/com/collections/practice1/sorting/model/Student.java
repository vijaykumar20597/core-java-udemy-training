package com.collections.practice1.sorting.model;

public class Student {

	private String name;
	private String id;
	private int marks;
	private String mail;
	private Address address;

	public Student() {

	}

	public Student(String name, String id, int marks, String mail, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.mail = mail;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", mail=" + mail + ", address=" + address
				+ "]";
	}

//	@Override
//	public int compareTo(Student student) {
//		
//		return this.getId().compareTo(student.getId());
//	}

}
