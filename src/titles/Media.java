package titles;
/**
 * Abstract class that carries four main attributes of the classes in the titles package
 * 
 * Creation of getters and setters in the class for the parameters
 * 
 * @author Glauco
 *
 */
public abstract class Media {
	
	public String YearOfRelease;
	public TypeEnum Type;
	public String Title;
	public boolean Rent;
	
	
	public Media(String YearOfRelease, TypeEnum cd, String Title, boolean Rent) {
		super();
		this.YearOfRelease = YearOfRelease;
		this.Type = cd;
		this.Title = Title;
		this.Rent = Rent;
	}


	public String getYearOfRelease() {
		return YearOfRelease;
	}


	public void setYearOfRelease(String yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}


	public TypeEnum getType() {
		return Type;
	}


	public void setType(TypeEnum type) {
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
