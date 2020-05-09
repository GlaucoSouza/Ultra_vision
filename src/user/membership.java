package user;
import creation.newCustomer;
import options.subscription;

/**
 * this is the last class related to the creation of a new account 
 * the validation method works with the boolean ismember which starts at false and goes to true when the creation of the new account is successful
 * customer gets 100 points and is eligible to rent one title for free
 * the countingPoints method will set the customer points to 0, so next time the customer rents anything he will have 0 starting points, but will get more eventually as they rent titles
 * @author Glauco
 *
 */

public class membership {
	
	public int points = 100;
	
	public membership() {
		
		validation(false);
		countingPoints();
		
		
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	


	public boolean validation(boolean ismember) {
		
		if(!ismember) {
			System.out.println( "You were not a member, You are a member now");
			ismember = true;
			
		}else{
			ismember = true;
			System.out.println("Ok, you were already a member");
		}
		System.out.println("You are entitled to rent one title for free");
		return ismember = true;
		
	}
	
	public void countingPoints() {
		points -=100;
	}

}
