package titles;

public class ML_Live_Concert_Videos extends Media{
	
	 private String Band;
	

	public ML_Live_Concert_Videos(String YearOfRelease, String Type, String Title, boolean Rent, String Band) {
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
		return super.toString();
	}

	

}
