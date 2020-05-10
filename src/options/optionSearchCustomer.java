package options;
import java.util.Scanner;
/**
 * this class is a prompt on the console that asks what the user wants to do: search a customer by name or return to the previous prompt
 * @author Glauco
 *
 */

public class optionSearchCustomer {
	
	Scanner sc = new Scanner(System.in);
	int number = -1;
	
		public optionSearchCustomer() {
			
			System.out.println( "(1) - Search Customer by name\r" +
								"(2) - Return");
			
			try {
				number = sc.nextInt();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		//a switch that works with the user's input
		switch(number) {
		case 1:
			System.out.println("searching customer by name...");
			break;
		case 2:
			new moreOptions();
			break;
		default:
			System.out.println("Please select a VALID option (1) or (2)");
			new optionSearchCustomer();
			break;
		}
		
	}	

}
