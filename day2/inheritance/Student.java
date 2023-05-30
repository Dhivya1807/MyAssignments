package week3.day2.inheritance;

public class Student extends Department {

//Class:Student

//Methods :studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("Student Name: Dhivya Selvaraj");
	}
	
	public void studentDept() {
		System.out.println("Student Department: ECE");
	}
	
	public void studentId() {
		System.out.println("Student ID: 10");
	}
	/*create above 3 class and call all your class methods into the Student 
	using multilevel inheritance.*/
	public static void main(String[] args) {
		Student studentinfo = new Student();
		studentinfo.collegeName();
		studentinfo.collegeCode();
		studentinfo.collegeRank();
		studentinfo.deptName();
		studentinfo.studentName();
		studentinfo.studentDept();
		studentinfo.studentId();
		
	}
	}
