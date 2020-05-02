package titles;

public abstract class Media {
	
	private String YearOfRelease;
	private String Type;
	private String Title;
	private boolean Rent;
	
	
	public Media(String YearOfRelease, String Type, String Title, boolean Rent) {
		super();
		this.YearOfRelease = YearOfRelease;
		this.Type = Type;
		this.Title = Title;
		this.Rent = Rent;
	}


	public String getYearOfRelease() {
		return YearOfRelease;
	}


	public void setYearOfRelease(String yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public boolean isRent() {
		return Rent;
	}


	public void setRent(boolean rent) {
		Rent = rent;
	}

}
