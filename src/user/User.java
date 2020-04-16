package user;

public class User {
	
	private String name;
	private String email;
	private String phone;
	private String creditCard;
	private boolean isMember;
	
	public User(String name, String email, String phone, String creditCard, boolean isMember) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.creditCard = creditCard;
		this.isMember = isMember;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

}
