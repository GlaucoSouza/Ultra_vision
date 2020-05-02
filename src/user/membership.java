package user;
import options.subscription;

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
			System.out.println("You were not a member, You are a member now");
			ismember = true;
			
		}else{
			ismember = true;
			System.out.println("Ok, you were already a member");
		}
		System.out.println("You are entitled to rent one title for free");
		points -= 100;
		return ismember = true;
		
	}
	
	public void countingPoints() {
		points -=100;
	}

}
