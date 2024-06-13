package com.eightfeature.anonymous.arguments.methods;

public class College {
	
	public void collegeAndStudentDetails(Student student) {
		student.studentDetails();
	}
	
	private String name;
	private String college_id;
	private String college_code;
	
	public College() {
		super();
	}

	public College(String name, String college_id, String college_code) {
		this.name = name;
		this.college_id = college_id;
		this.college_code = college_code;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollege_id() {
		return college_id;
	}


	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}


	public String getCollege_code() {
		return college_code;
	}


	public void setCollege_code(String college_code) {
		this.college_code = college_code;
	}


	public void student_College(Student student) {
		student.studentDetails();
		
	}
	
	public static void collegeDetails(College colleges) {
	
		colleges.getName();
		colleges.getCollege_id();
		colleges.getCollege_code();
		System.out.println("Runner non interface" +colleges);

		
		
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", college_id=" + college_id + ", college_code=" + college_code + "]";
	}

}
