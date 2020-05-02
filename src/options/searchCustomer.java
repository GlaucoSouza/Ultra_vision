package options;
import java.util.Scanner;


public class searchCustomer {
	
	Scanner sc = new Scanner(System.in);
	int number = -1;
	
		public searchCustomer() {
			
			System.out.println( "(1) - Search Customer by name\r" +
								"(2) - Return");
			
			try {
				number = sc.nextInt();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		switch(number) {
		case 1:
			System.out.println("searching title by name...");
			break;
		case 2:
			new moreOptions();
			break;
		default:
			System.out.println("Please select a VALID option (1) or (2)");
			new searchCustomer();
			break;
		}
		
	}	

}
