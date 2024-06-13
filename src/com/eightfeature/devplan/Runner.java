package com.eightfeature.devplan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Student> eList=getListOfStudents();
		Map<String , Integer> mapNameToAgeMap=eList.stream().collect(Collectors.toMap(Student::getName, Student::getAge,(oldValue,newValue)->oldValue));
		System.out.println(mapNameToAgeMap);
	}

	private static List<Student> getListOfStudents() {
		List<Student> listOfStudents=new ArrayList<Student>();
		
		Student student=new Student("Stenny", 24);
		Student student1=new Student("Rucha", 22);
		Student student2=new Student("vihaan", 21);
		Student student3=new Student("Stenny", 22);
		
		listOfStudents.add(student);
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		return listOfStudents;
	}

}
