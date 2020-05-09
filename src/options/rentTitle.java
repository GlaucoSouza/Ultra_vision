package options;
import java.util.Scanner;

import creation.newCustomer;
/**
 * simple class with 3 options
 * 1 create a new customer
 * 2 just confirms if the customer is already a member
 * 3 returns to the previous prompt
 * 
 * a try catch is used to deal with the user's input
 * 
 * a switch statement will work with the user's input and send the user to a different class based on the input
 * 
 * 
 * @author Glauco
 *
 */
public class rentTitle {
	
	Scanner sc = new Scanner(System.in);
	int number;
	
	public rentTitle(){
		
		
		System.out.println( "Please choose the correspondent number:\r\n" + 
							"(1) - New Customer (Create New Account)\r" + 
							"(2) - Already Member/Registered Customer\r" +
							"(3) - Return");
		//try catch triggers if input is not 1 or 2 
		try {
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please choose a number between (1) | (2)");
		}
		
		/*switch with two cases
		case 1 goes to newCustomer class
		user will be able to input customer's personal information
		-
		case 2 will send the user to a screen where the customer will be identified by their name
		and then the system will print out the titles of their subscription
		-
		default option deals with any mistyped input and create a new rentTitle()
		*/
		
		switch(number) {
		case 1:
			new newCustomer();
			break;
			
		case 2:
			new identify();
			break;
			
		case 3:
			new firstPrompt();
			break;
			
		default:
			System.out.println("Please select a valid option");
			new rentTitle();
			
		}
	}

}
