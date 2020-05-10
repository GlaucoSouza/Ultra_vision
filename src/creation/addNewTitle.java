package creation;

import java.util.Scanner;

/**
 * 
 * this class will print out to the console 3 options 
 * these options are the access level/subscription
 * movies will be in the VL
 * musics/live concert will be in the ML
 * and box sets will be in the TV
 * 
 * @author Glauco
 *
 */
public class addNewTitle {
	
	int optNum = 0;
	Scanner sc = new Scanner(System.in);
	
	public addNewTitle() {
		System.out.println( "The title you want to add belongs to which Access Level?\r"+
							"(1) - ML -> Music Lovers: CDs or LIVE Concert Videos (CD or DVD and Blue-Ray\r" +
							"(2) - VL -> Video Lovers (DVD and Blue-Ray)\r" +
							"(3) - TV -> TV Lover: Box Set (DVD and Blue-Ray)");
		optNum = sc.nextInt();
		
		
		//a switch statement that checks the user's input and redirects to a different place depending on the input
		switch(optNum) {
		case 1:
			System.out.println("ML");
			new musicLover();
			break;
		case 2:
			System.out.println("VL");
			new videoLover();
			break;
		case 3:
			System.out.println("TV");
			new tvLover();
			break;
		default:
			new addNewTitle();
			break;
		}
	}

}
