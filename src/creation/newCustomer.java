package creation;

import java.util.ArrayList;
import java.util.Scanner;

import options.subscription;

/**
 * this class will store the user's input related to the customer information
 * it is where the system prints out to the console the information it needs to add a new customer to the system
 * getters and setters were created based on the parameters
 * all the information input is stored in an arraylist
 * 
 * @author Glauco
 *
 */
public class newCustomer{
	
	int number;
	Scanner sc = new Scanner(System.in);
	ArrayList<String> myArray;
	
	public String firstName = "";
	public String lastName = "";
	public String creditCard = "";
	public String email = "";
	public String phone = "";
	
	public newCustomer(String firstName, String lastName, String creditCard, String email,
			String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditCard = creditCard;
		this.email = email;
		this.phone = phone;
	}
	
	public newCustomer() {
		customerFirstName();
		customerLastName();
		customerCreditCardNumber();
		customerEmail();
		customerPhoneNumber();
	}	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

		
	
	
		//asks for the first name of the customer
		public void customerFirstName() {
			System.out.println("Please insert your following information:\r\n" +
					"First name:");
			try{
				firstName = sc.next();
				
			}catch(Exception e) {
				System.out.println("Please insert your First Name");
			}
			
		}
		
		
		
		
		
		//asks for the last lame of the customer
		public void customerLastName() {
			System.out.println("Last name:");
			try{
				lastName = sc.next();
			}catch(Exception e) {
				System.out.println("Please insert your Last Name");
			}
		}
		
		
		
		
		//asks for the customer credit card and makes a validation if it is a possible credit card
		//do while loop keeps running until a VALID credit card number is input
		//until there it loops asking for the customer a VALID credit card number
		//shout out to Amilcar who helped me with the regex to validate the credit card number and email
		public void customerCreditCardNumber() {
			System.out.println("Credit Card number: (0000.0000.0000.0000)");
			do {
				
				try {
					creditCard = sc.next();
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(!creditCardValidation(creditCard)) {
					System.out.println("Please insert a VALID Credit Card number, I will NOT use it to buy skins for my champions in League of Legends");
				}
			}while(!creditCardValidation(creditCard));
			
		}
		
		public boolean creditCardValidation(String input) {
			return input.matches("(\\d{4}[-. ]?){4}|\\d{4}[-. ]?\\d{6}[-. ]?\\d{5}");
		}
		
		
		
		
		
		//asks for the customer email
		//in this case the do while loop does the same thing, it keeps running until a valid email is input in the console
		public void customerEmail() {
			System.out.println("Email:");
			do {
				try {
					email = sc.next();
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(!emailValidation(email)) {
					System.out.println("Please inset a valid email:");
				}
				
				}while(!emailValidation(email));
			
		}
		
		public boolean emailValidation(String input) {
			return input.matches("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b");
		}
		
		
		
		
		
		
		
		
		//asks for the customer phone number
		public void customerPhoneNumber() {
			System.out.println("Phone Number: (0xx xxx xxxx)");
			do {
				try {
					phone = sc.next();
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(!phoneNumberValidation(phone)) {
					System.out.println("Please insert a VALID Phone Number");					
				}
					
				}while(!phoneNumberValidation(phone));
			
			storingInArray();
			new subscription();
			
		}
		
		public boolean phoneNumberValidation(String input) {
			return input.matches("|^\\s*\\(?\\s*\\d{1,4}\\s*\\)?\\s*[\\d\\s]{5,10}\\s*$|");
		}
		
		public void subscriptionPlan(int plan) {
		
			String plano = Integer.toString(plan);
			myArray.add(plano);
			
		}
		
		public void storingInArray() {
			myArray = new ArrayList<String>();
			myArray.add(firstName);
			myArray.add(lastName);
			myArray.add(creditCard);
			myArray.add(email);
			myArray.add(phone);
			
			customerList();
		}
		
		public void customerList() {
			System.out.println(myArray);
		}
		
		
//	
		}
		

