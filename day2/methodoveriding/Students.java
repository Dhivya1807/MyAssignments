package week3.day2.methodoveriding;

//Method Overloading
//Class: Students
public class Students {

//Methods: getStudentInfo()
	
/*Create multiple getStudentInfo() method by passing id argument alone,
by id & name, by email & phoneNumber*/
	
public void getStudentInfo(int id) {
	System.out.println("Student Information1:"+id);
}

public void getStudentInfo (int id, String name) {
	System.out.println("Student Information2:"+id +"\t"+name);
	}
public void getStudentInfo (String email, int phonenumber) {
	System.out.println("Student Information2:"+email+"\t"+phonenumber);
}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(10);
		info.getStudentInfo(8, "Steven Theoddore");
		info.getStudentInfo("Steven0112@gmail.com",987456321);
	}

}
