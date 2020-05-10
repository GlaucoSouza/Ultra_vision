package titles;
/**
 * VL_Movie class extends the Media class with 4 parameters and the creation of the String genre
 * @author Glauco
 *
 */
public class VL_Movie extends Media{
	
	
	private String genre;
	

	public VL_Movie(String YearOfRelease, TypeEnum Type, String Title,String genre, boolean Rent ) {
		super(YearOfRelease, Type, Title, Rent);
		// TODO Auto-generated constructor stub
		
		this.genre = genre;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	//method toString to translate the object to string in the console
	@Override
	public String toString() {
		return super.toString();
	}

}
