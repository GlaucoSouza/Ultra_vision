package titles;

public class ML_Live_Concert_Videos extends Media{
	
	 private String Band;
	

	public ML_Live_Concert_Videos(String YearOfRelease, TypeEnum Type, String Title, String Band ,boolean Rent) {
		super(YearOfRelease, Type, Title, Rent);
		// TODO Auto-generated constructor stub
		
		
		this.Band = Band;		

	}

	public String getBand() {
		return Band;
	}

	public void setBand(String band) {
		Band = band;
	}
	
	@Override
	public String toString() {
		return "this song was released in " + this.YearOfRelease  + "\r" +
				"it is " + this.Type + " type\r" +
				"the title is " + this.Title + "\r" +
				"the band is called " + this.Band;
	}

	

}
