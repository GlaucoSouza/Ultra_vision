package titles;
/**
 * TV_Box_Set class extends the Media class with 4 parameters and the creation of the String season
 * @author Glauco
 *
 */
public class TV_Box_Set extends Media {
	
	private String season;

	public TV_Box_Set(String YearOfRelease, TypeEnum Type, String Title, String season, boolean Rent) {
		super(YearOfRelease, Type, Title, Rent);
		// TODO Auto-generated constructor stub
		
		
		this.season = season;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	//method toString to translate the object to string in the console
	@Override
	public String toString() {
		return "this TV Box was released in " + this.YearOfRelease  + "\r" +
				"it is " + this.Type + " type\r" +
				"the title is " + this.Title + "\r" +
				"this is the season number " + this.season;
	}
	

}
