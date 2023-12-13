package id.ac.undiksha.ais.people;

public class Student {

	
	private String Studentid;
	private String name;
	private String birthdate;
	private boolean gender;
	private String address;
	private int smst;
	
	public Student() {
		this.Studentid = "<please insert name>";
		this.name = "<please insert name>";
		this.birthdate = "<please insert name>";
		this.address = "<please insert name>";
		this.smst = 0;
	}
	
	public Student(
			String studentid, 
			String name, 
			String birthdate, 
			boolean gender, 
			String address, 
			int smst) 
	{
		super();
		Studentid = studentid;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.smst = smst;
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

	public int getSmst() {
		return smst;
	}

	public void setSmst(int smst) {
		this.smst = smst;
	}

	public void setStudentid(String studentid) {
		Studentid = studentid;
	}

	
	public String getStudentid() {
		return this.Studentid;
	}
	
	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.Studentid);
		System.out.println(this.birthdate);
		
		if (this.gender)
			System.out.println("male");
		else 
			System.out.println("female");
		
		System.out.println(this.smst);
		System.out.println(this.address);
	}
	
}