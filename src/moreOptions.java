import java.util.Scanner;

public class moreOptions {
	
	Scanner sc;
	int number;
	
	public moreOptions() {
		
		System.out.println("What would you like to do?" + 
							"(1) Search Titles" +
							"(2) Search Customer" +
							"(3) Add New Titles" +
							"(4) Add New Customer" +
							"(5) Update Customer Profile" +
							"(6) Return");
		
		try{
			sc = new Scanner(System.in);
			number = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Please select an option between 1-6");
			
		}
		
		switch (number) {
		case 1:
			System.out.println("search titles");
			
		case 2:
			System.out.println("seach customer");
			
		case 3:
			System.out.println("add new titles");
			
		case 4:
			System.out.println("add new customer");
			
		case 5:
			System.out.println("update customer profile");
		
		case 6:
			System.out.println("Guess who's back");
		}
		
	}

}
