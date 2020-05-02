package options;

import java.util.Scanner;

public class newTitle {
	
	int optNum = -1;
	Scanner sc = new Scanner(System.in);
	
	public newTitle() {
		System.out.println( "The title you want to add belongs to which Access Level?"+
							"(1) - ML -> Music Lovers: CDs or LIVE Concert Videos (CD or DVD and Blue-Ray\r" +
							"(2) - VL -> Video Lovers (DVD and Blue-Ray)\r" +
							"(3) - TV -> TV Lover: Box Set (DVD and Blue-Ray)\r");
		
		switch(optNum) {
		case 1:
			System.out.println("ML");
			break;
		case 2:
			System.out.println("VL");
			break;
		case 3:
			System.out.println("TV");
			break;
		default:
			new newTitle();
			break;
		}
	}

}
