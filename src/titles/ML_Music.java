package titles;

public class ML_Music extends Media {
	
	private String band;

	public ML_Music(String YearOfRelease, TypeEnum cd, String Title,String band, boolean Rent ) {
		super(YearOfRelease, cd, Title, Rent);
		// TODO Auto-generated constructor stub
		
		this.band = band;
	}
	
	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		band = band;
	}
	
	@Override
	public String toString() {
		return "this song was released in " + this.YearOfRelease  + "\r" +
				"it is " + this.Type + " type\r" +
				"the title is " + this.Title + "\r" +
				"the band is called " + this.band;
	}

}
