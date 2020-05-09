package creation;

import java.util.Scanner;

import options.firstPrompt;
import titles.TypeEnum;
import titles.VL_Movie;

public class videoLover {
	
	Scanner sc;
	String num;
	private String year;
	private TypeEnum type;
	private String name;
	private String genre;
	private boolean rent = false;
	
	public videoLover() {
		
		try {
			sc = new Scanner(System.in);
			System.out.println( "Please insert the title's information:\r" +
								"Year of release:");
			year = sc.next();
			
			System.out.println( "Type of media (1)-DVD | (2)-Blue-Ray");
			num = sc.next();
			
			System.out.println( "Name of the title:");
			name = sc.next();
			
			System.out.println( "Genre:");
			genre = sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		create();
	}

	private void create() {
		if(num=="1") {
			type = TypeEnum.DVD;
		}else if(num=="2") {
			type = TypeEnum.BLUE_RAY;
		}
		
		VL_Movie mv = new VL_Movie(year, type, name, genre, true);
		
		System.out.println(mv);
		
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	

}
