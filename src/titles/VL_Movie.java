package titles;

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
	
	@Override
	public String toString() {
		return super.toString();
	}

}
