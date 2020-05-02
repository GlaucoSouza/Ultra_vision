package titles;

public class TV_Box_Set extends Media {
	
	private int season;

	public TV_Box_Set(String YearOfRelease, String Type, String Title, boolean Rent, int season) {
		super(YearOfRelease, Type, Title, Rent);
		// TODO Auto-generated constructor stub
		
		
		this.season = season;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
