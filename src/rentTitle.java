import java.util.Scanner;

public class rentTitle {
	
	Scanner sc;
	int number;
	
	public rentTitle(){
		
		
		System.out.println( "Please choose the correspondent number:\r\n" + 
							"(1) - New Customer (Create New Account)\r" + 
							"(2) - Already Member/Registered Customer");
		//try catch triggers if input is not 1 or 2 
		try {
			sc = new Scanner(System.in);
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please choose a number between (1) | (2)");
		}
		
		/*switch with two cases
		case 1 goes to a new class called <newCustomer>
		user will be able to input customer's personal information
		-
		case 2 goes to a new class called <registeredCustomer>
		if customer is already registered, goes to the <subscribed> class
		*/
		
		switch(number) {
		case 1:
			System.out.println("new customer");
			//goes somewhere else
			break;
			
		case 2:
			System.out.println( "welcome back\r\n" + 
								"You are subscribed to the" + " <ARRAYLIST OF SUBSCRIPTION GOES HERE>" + "\r\n" + 
								"Which title would you like to rent?\r\n" +
								"<ARRAYLIST OF TITLES GOES HERE>");
			//goes to somewhere else
			break;
			
		}
	}

}
