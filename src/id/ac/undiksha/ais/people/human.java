package id.ac.undiksha.ais.people;

public class human {
	private String name;
	private String birthdate;
	private boolean gender;
	private String address;
	
	public human () {
		this.name = "<please insert name>";
		this.birthdate = "<please insert name>";
		this.address = "<please insert name>";
	}
	
	public human(String name, String birthdate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public boolean isGender() {
		return gender;
	}
	public String getGender() {
		if (this.isGender()) {
			return "male";
			
		}
		else{
			return "female";
		}
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}