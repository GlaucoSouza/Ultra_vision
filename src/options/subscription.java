package options;
import java.util.Scanner;
import javax.swing.JOptionPane;
import user.membership;

/**
 * 
 * this class prints out 4 options to the user related to the subscription
 * either one the user chooses, goes to the membership class and carry out the customer's information + their choice of subscription
 * @author Glauco
 *
 */

public class subscription {
	
	public int number = -1;
	Scanner sc = new Scanner(System.in);
		
	public subscription() {
		
		
		System.out.println();
		
		
		System.out.println( "Subscribe to one of the Access Level, remember that each Access contains different type of titles:\r" +
							"(1) - ML -> Music Lovers: CDs or LIVE Concert Videos (CD or DVD and Blue-Ray\r" +
							"(2) - VL -> Video Lovers (DVD and Blue-Ray)\r" +
							"(3) - TV -> TV Lover: Box Set (DVD and Blue-Ray)\r" +
							"(4) - PR -> Premium");
				
		try {
			number = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//switch with the user's input and redirects to the membership class with the input stored
		switch (number) {
		case 1:
			System.out.println("Music Lovers: CDS or Live Concert Videos (CD, DVD, Blue-Ray");
			new membership();
			break;
			
		case 2:
			System.out.println("Video Lovers: Movies (DVD, Blue-Ray");
			new membership();
			break;
			
		case 3:
			System.out.println("TV Lovers (DVD, Blue-Ray");
			new membership();
			break;
			
		case 4:
			System.out.println("Premium: Rent any title (CD, DVD, Blue-Ray");
			new membership();
			break;
			
		default:
			System.out.println("Please select a valid option");
			new subscription();
		}
		
				
	}
	
	//getters and setters for the user's input

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
