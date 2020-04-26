import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class options extends JFrame{
	
	//scanner and int instantiated out of the try catch
	Scanner sc;
	int number;
	
	//constructor
	public options() {
		
		
		//question prompted to the user
		//so they can choose either option they want to select
		System.out.println( "Type a number of what you would like to do\r\n" +
				"(1) - Rent a Title\r\n" +
				"(2) - Return a Title\r\n" +
				"(3) - More Options");
		
		try {
			sc = new Scanner(System.in);
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Choose a possible option(1) | (2) | (3)" + e);
		} 
		
		
		/*switch with 3 cases
		case 1 goes to the rentTitle
		case 2 ends here, with a pop-up message thanking for the title returned
		case 3 goes to a new class called prints out a new range of options to the user
		*/
		switch (number) {
		case 1:
			System.out.println("rent a title");
			new rentTitle();
			break;
		case 2:
			System.out.println("return a title");
			this.setVisible(false);
			this.setSize(300, 300);
			JOptionPane.showMessageDialog(this, "Thanks for returning the title back to Ultra-Vision");
			this.validate();
			this.repaint();
			break;
		case 3:
			System.out.println("more options");
			//goes to somewhere else
			new moreOptions();
			break;
		}
				
	}
	

}
