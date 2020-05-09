package creation;

import java.util.Scanner;

import options.firstPrompt;
import titles.TV_Box_Set;
import titles.TypeEnum;

public class tvLover {
	
	Scanner sc;
	String num;
	private String year;
	private TypeEnum type;
	private String name;
	private String season;
	private boolean rent = false;
	
	public tvLover() {
		
		try {
			sc = new Scanner(System.in);
			System.out.println( "Please insert the title's information:\r" +
								"Year of release:");
			year = sc.next();
			
			System.out.println( "Type of media (1)-DVD | (2)-Blue-Ray");
			num = sc.next();
			
			System.out.println( "Name of the title:");
			name = sc.next();
			
			System.out.println( "Season:");
			season = sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		create();
	}

	private void create() {
		
		if(num =="1") {
			type = TypeEnum.DVD;
		}else if(num =="2") {
			type = TypeEnum.BLUE_RAY;
		}
		
		TV_Box_Set bs = new TV_Box_Set(year, type, name, season, true);
		System.out.println(bs);
		
		new firstPrompt();
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	

}
