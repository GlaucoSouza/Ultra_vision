package options;
import creation.newCustomer;
/**
 * this class will question the user who wants to rent a title 
 * the user should then input the customer's email to be checked
 * if the customer really exists, a range of their subscription's titles will be printed in the console
 * @author Glauco
 *
 */

import java.util.Scanner;

public class identify {
	
	Scanner sc;
	String em;
	
	public identify() {
		
		
		sc = new Scanner(System.in);
		System.out.println("Email please:");
		em = sc.next();
	
		
	}
}
