package com.eightfeature.anonymous.arguments.methods;

public class Runner {

	public static void main(String[] args) {
		
		NonLifeLesson nonLifeLesson=new NonLifeLesson();
	
		College college=new College("JEC", "2236153", "3215");
		college.collegeAndStudentDetails(new Student() {
			
			@Override
			public void studentDetails() {
				College.collegeDetails(college);
				
			}
		});
		
		nonLifeLesson.non_lesson(new LifeLsesson() {
			
			@Override
			public void lesson() {
			
				System.out.println("Welcome to learn lesson");
			}
		});
		
		
	}

}
