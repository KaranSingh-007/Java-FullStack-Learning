package com.project1.PracticeProject;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private PhoneNo phoneno;
	
	public Student() {
		super();
	}
	public Student(PhoneNo phoneno) {
		super();
		this.phoneno = phoneno;
	}
	public PhoneNo getPhoneNo() {
		return phoneno;
	}
	public void setPhoneNo(PhoneNo phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Student [Phoneno" +phoneno+"]";
	}
}
