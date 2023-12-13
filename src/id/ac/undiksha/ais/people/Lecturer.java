package id.ac.undiksha.ais.people;

public class Lecturer {
	
	private String Lectureid;
	private String Lecturename;
	private boolean Lecturegender;
	private String Lectureaddress;
	private String Lecturebirthdate;
	private String LectureFaculty;
	private String LectureDepartement;
	private String Lecturestudyprogram;
	
	public Lecturer () {
		this.Lectureid = "<input your id>";
		this.Lecturename ="<Input your name>";
		this.Lectureaddress = "<input your address>";
		this.Lecturebirthdate = "<when your birthdate>";
		this.LectureFaculty = "<input your faculty>";
		this.LectureDepartement = "<input your depart>";
		this.Lecturestudyprogram = "insert your SP>";
	}
	
	public Lecturer(String lectureid, String lecturename, boolean lecturegender, String lectureaddress,
			String lecturebirthdate, String lectureFaculty, String lectureDepartement, String lecturestudyprogram) {
		super();
		Lectureid = lectureid;
		Lecturename = lecturename;
		Lecturegender = lecturegender;
		Lectureaddress = lectureaddress;
		Lecturebirthdate = lecturebirthdate;
		LectureFaculty = lectureFaculty;
		LectureDepartement = lectureDepartement;
		Lecturestudyprogram = lecturestudyprogram;
	}



	public String getLectureid() {
		return Lectureid;
	}
	public void setLectureid(String lectureid) {
		Lectureid = lectureid;
	}
	public String getLecturename() {
		return Lecturename;
	}
	public void setLecturename(String lecturename) {
		Lecturename = lecturename;
	}
	public boolean isLecturegender() {
		return Lecturegender;
	}
	
	public String getLecturegender() {
		if (this.isLecturegender()) {
			return "male";
			
		}
		else{
			return "female";
		}
	}
	
	public void setLecturegender(boolean lecturegender) {
		Lecturegender = lecturegender;
	}
	public String getLectureaddress() {
		return Lectureaddress;
	}
	public void setLectureaddress(String lectureaddress) {
		Lectureaddress = lectureaddress;
	}
	public String getLecturebirthdate() {
		return Lecturebirthdate;
	}
	public void setLecturebirthdate(String lecturebirthdate) {
		Lecturebirthdate = lecturebirthdate;
	}
	public String getLectureFaculty() {
		return LectureFaculty;
	}
	public void setLectureFaculty(String lectureFaculty) {
		LectureFaculty = lectureFaculty;
	}
	public String getLectureDepartement() {
		return LectureDepartement;
	}
	public void setLectureDepartement(String lectureDepartement) {
		LectureDepartement = lectureDepartement;
	}
	public String getLecturestudyprogram() {
		return Lecturestudyprogram;
	}
	public void setLecturestudyprogram(String lecturestudyprogram) {
		Lecturestudyprogram = lecturestudyprogram;
	}

	
	public	void printAll() {
		System.out.println(this.Lecturename);
		System.out.println(this.Lectureid);
		
		if (this.Lecturegender)
			System.out.println("male");
		else 
			System.out.println("female");
		
		System.out.println(this.Lectureaddress);
		System.out.println(this.Lecturebirthdate);
		System.out.println(this.LectureFaculty);
		System.out.println(this.LectureDepartement);
		System.out.println(this.Lecturestudyprogram);
	}
	
}