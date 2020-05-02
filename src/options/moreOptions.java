package options;
import java.util.Scanner;


/**
 * This class will work with the class moreOptions the User chooses in the previous class
 * six options are displayed in the console, all of them redirects the user to a different class
 * or return to the previous class, if they choose the option (6) Return, printing again the previous options
 */
public class moreOptions {
	
	Scanner sc = new Scanner(System.in);
	int number;
	
	
	
	
	//constructor
	public moreOptions() {
		
		System.out.println("What would you like to do?\r\n" + 
							"(1) Search Titles\r\n" +
							"(2) Search Customer\r\n" +
							"(3) Add New Titles\r\n" +
							"(4) Add New Customer\r\n" +
							"(5) Update Customer Profile\r\n" +
							"(6) Return\r\n");
		
		try{
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please select an option between 1-6");
			
		}
		
		
		/*
		 * switch using the <number> variable
		 * option 1 creates a new searchTitles class
		 * option 2 creates a new seachCustomer class
		 * option 3 creates a new addNewTitles class
		 * option 4 creates a new newCustomer class
		 * option 5 creates a new newCustomer class likewise option 4, as the new information will overwrite the previous one
		 * option 6 creates a new options class, returning back to the previous options in the console
		 * default is dealing with any mistyped command, creating a new moreOptions class
		 */
		switch (number) {
		case 1:
			System.out.println("search titles");
			new searchTitles();
			break;
		case 2:
			System.out.println("seach customer");
			new searchCustomer();
			break;
		case 3:
			System.out.println("add new titles");
			new addNewTitles();
			break;
		case 4:
			System.out.println("add new customer");
			new newCustomer();
			break;
		case 5:
			System.out.println("update customer profile");
			new newCustomer();
			break;
		case 6:
			System.out.println("Guess who's back");
			new firstPrompt();
			break;
		default:
			System.out.println("Please select a valid option");
			new moreOptions();
			break;
		}
		
	}

}
