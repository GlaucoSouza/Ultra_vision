package options;
import java.util.Scanner;

import creation.musicLover;
import searches.searchTitle;
/**
 * this class works similar to the optionSearchCustomer
 * a print.out message will be shown on the console asking the user what they want to do: search a title or return to the previous prompt 
 * @author Glauco
 *
 */
public class optionSearchTitles {
	
	Scanner sc = new Scanner(System.in);
	int number = 0;
	
		public optionSearchTitles() {
			
			System.out.println( "(1) - Search Title by name\r" +
								"(2) - Return");
			
			try {
				number = sc.nextInt();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		//switch statement working with the user's input
		switch(number) {
		case 1:
			System.out.println("searching title by name...");
			new searchTitle();
			break;
		case 2:
			new moreOptions();
			break;
		default:
			System.out.println("Please select a VALID option (1) or (2)");
			new optionSearchTitles();
			break;
		}
		
	}	
}
