package week1.assignment1;
//Create a class by name : Bike 
public class Bike {	
//  b)Create a method 
//  driveBike->Have a print statement
	
	public void drivebike() {
		System.out.println("DriveBike");
	}
		
	
//  applyBrake->Have a print statement
	 
	public void applybrake() {
		System.out.println("ApplyBrake");
		
	}
//  soundHorn->Have a print statement
	
	public void soundhorn() {
		System.out.println("SoundHorn");
		
	}
//  isPuncture->Have a print statement
	 
	public void isPuncture() {
		System.out.println("ispuncture");
	}
//  c)Create a main method 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//  d)Create an Object
	 
	Bike b=new Bike();
	
//  e)Call the methods using the object
	b.drivebike();
	b.applybrake();
	b.soundhorn();
	b.isPuncture();
	
		//  f)Run and Confirm
	
	}

}
