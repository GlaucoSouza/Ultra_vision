package creation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import options.firstPrompt;
import titles.ML_Music;
import titles.TypeEnum;

public class musicLover {
	
	Scanner sc;
	String num;
	private String year;
	private String name;
	private String bandName;
	private boolean rent = false;
	private TypeEnum type;
	
	public musicLover() {
		
		try {
			sc = new Scanner(System.in);
			System.out.println( "Please insert the title's information:\r" +
								"Year of release:");
			year = sc.next();
			
			System.out.println("Type of media (1)-CD | (2)-DVD | (3)-Blue-Ray");
			num = sc.next();
			
			System.out.println( "Name of the title:");
			name = sc.next();
			
			System.out.println( "Name of the band:");
			bandName = sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		create();
	}

	private void create() {
		
		if(num=="1") {
			type = TypeEnum.CD;
		}else if(num=="2") {
			type = TypeEnum.DVD;
		}else if(num=="3") {
			type = TypeEnum.BLUE_RAY;
		}
		
		ML_Music m = new ML_Music(year, type, name, bandName, true);
		System.out.println(m);
		
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

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	
	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

}
