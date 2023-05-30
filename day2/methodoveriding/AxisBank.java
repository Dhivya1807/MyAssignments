package week3.day2.methodoveriding;

//Class     :AxisBank

public class AxisBank {
//    Methods :deposit()
	
	public void deposit() {
	System.out.println("Deposit of Axis Bank");
	}

//You have to override the method deposit in AxisBank.
	
	public static void main(String[] args) {
		BankInfo details = new BankInfo();
		details.deposit();
	}


	

}
