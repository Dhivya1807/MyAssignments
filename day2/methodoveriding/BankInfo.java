package week3.day2.methodoveriding;

//Class:BankInfo

public class BankInfo {

//	    Methods :saving(),fixed(),deposit()
	
	public void saving() {
		System.out.println("Savings Account");
	}
	
	public void fixed() {
		System.out.println("Fixed Deposit Account");
	}

	public void deposit() {
		System.out.println("Deposit of BankInfo");
	}
	
//	     Class     :AxisBank
//	     Methods :deposit()
//
//	Description:
//	You have to override the method deposit in AxisBank.
}
