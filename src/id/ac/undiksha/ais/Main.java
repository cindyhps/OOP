package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Lecturer;
import id.ac.undiksha.ais.people.Student;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student();
		
		student1.setStudentid("2215101032");
		student1.setName("Cindy");
		student1.setBirthdate("6 Agustus 2004");
		student1.setGender(true);
		student1.setAddress("Bekasi, Jawa Barat");
		student1.setSmst(3);
		
		student1.printAll();
		
		System.out.println("------------");
		
		Student student2 = new Student("21213", "agus", "25 April 2023", true, "penglatan", 5);
		student2.printAll();
		
		
		System.out.println();
		
		
		Lecturer lecturer1 = new Lecturer();
		
		lecturer1.setLectureid("6789");
		lecturer1.setLecturename("chiko");
		lecturer1.setLecturegender(true);
		lecturer1.setLectureaddress("singaraja");
		lecturer1.setLecturebirthdate("29 februari 2023");
		lecturer1.setLectureFaculty("FTK");
		lecturer1.setLectureDepartement("TI");
		lecturer1.setLecturestudyprogram("ILKOM");
		
		lecturer1.printAll();
		
		Lecturer lecturer2 = new Lecturer(null, null, false, null, null, null, null, null);
		lecturer2.printAll();
		
//		student1.name = "Defry";
//		student1.Studentid = "1234";
//		student1.name = "Defry";
//		student1.name = "Defry";
//		student1.name = "Defry";
//		student1.name = "Defry";
//		
//		System.out.println(student1.name);
//		System.out.println(student1.name);
//		System.out.println(student1.name);
//		System.out.println(student1.name);
//		if (student1.gender)
//			System.out.println("mael");
//		else 
//			System.out.println("female");
//		System.out.println(student1.name);
//		System.out.println(student1.name);
//		System.out.println(student1.name);
	}

}