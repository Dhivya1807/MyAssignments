package week1.day2.assignments;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Declare your input as 5
		        int a=5;
		
// Declare an integer variable fact as 1
		        int fact=1;
				

// Iterate from 1 to your input (tip: using loop concept)		        
// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable
				for ( int i=1;i<=a;i++) {
					fact=fact*i;
				}
// Print factorial (fact)						
		
					System.out.println(fact);

		

				
			
	}

}
