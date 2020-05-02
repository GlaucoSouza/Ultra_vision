package options;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * the first print shows 3 options: rent a title, return a title and more options
 * 
 * switching the user's input with 3 cases
 * case 1 goes to the rentTitle
 * case 2 ends here, with a pop-up message thanking for the title returned
 * case 3 goes to a new class called prints out a new range of options to the user
 * 
 * 
 * 
 * 
 * 
 * @author Glauco
 *
 */
public class firstPrompt{
	
	
	
	
	//scanner and int instantiated out of the try catch
	Scanner sc = new Scanner(System.in);
	int number;
	
	//constructor
	public firstPrompt() {
		
		
		//question prompted to the user
		//so they can choose either option they want to select
		System.out.println( "Type a number of what you would like to do\r\n" +
				"(1) - Rent a Title\r\n" +
				"(2) - Return a Title\r\n" +
				"(3) - More Options");
		
		try {
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please choose a possible option (1) | (2) | (3)");
		} 
		
		
		/*switch with 3 cases
		case 1 goes to the rentTitle
		case 2 ends here, with a pop-up message thanking for the title returned
		case 3 goes to a new class called prints out a new range of options to the user
		*/
		switch (number) {
		case 1:
			new rentTitle();
			break;
		case 2:
			System.out.println("return a title");
			new firstPrompt();
			break;
		case 3:
			new moreOptions();
			break;
		
		default:
			new firstPrompt();
		}
				
	}
	

}
