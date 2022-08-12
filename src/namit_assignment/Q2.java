package namit_assignment;
import java.util.Scanner;

class Student {
	public int id;
	public String name;
	public boolean scholarship;
	public float avg_percentage;
	public String city;
	public String gender;
	
	public Student(int id, String name, float avg_percentage, String city, String gender, boolean scholarship) {
		this.id = id;
		this.name = name;
		this.avg_percentage = avg_percentage;
		this.city = city;
		this.gender = gender;
		this.scholarship = scholarship;
	}
	
	public String toString(){
		return "==============================================================================="+"\nID : "+id+"\nNAME : "+name+"\nAVG PERCENTAGE : "+avg_percentage+"\nCITY : "+city+"\nGENDER : "+gender+"\nSCHOLARSHIP : "+scholarship+"\n===============================================================================";
	}
}
public class Q2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Virat", 84.21f, "BLR", "M", true);
		Student s2 = new Student(2, "Rohit", 80.85f, "MUM", "M", true);
		Student s3 = new Student(3, "Anushka", 65.63f, "DEL", "F", false);
		Student s4 = new Student(4, "Nora", 55.14f, "BLR", "F", false);
		Student s5 = new Student(5, "Jennifer", 76.22f, "KOL", "F", true);
			
		System.out.println();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	
	}
}	
