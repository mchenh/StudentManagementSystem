package mike.learning.com.data;

import java.util.*;

public class Student extends Person {
	private float gpa;
	private ArrayList<Grade> current = new ArrayList<Grade>();
	private ArrayList<Grade> previous = new ArrayList<Grade>();
	private int studentID;
	private static int studentIDCount = 0;

	public Student(){studentID = studentIDCount++;}
	public Student(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, ArrayList<Grade> current, ArrayList<Grade> previous){
		super(fname, lname, age, phone, address, birthday, ssn);
		this.current = current;
		this.previous = previous;
		this.studentID = studentIDCount++;
	}

	public String graduate() {
		double temp = 0;
		for(int i=0; i<this.getPrevious().size(); i++) {
			temp += this.getPrevious().get(i).getScore();
		}
		if(temp >= 30)
			return "Yes";
		return "No";
	}
	
	String getOccupation() {
		return "Student";
	}
	public String toString() {
		String result = "\nStudent\n";
		result += "First Name: " + this.getFname() + "\n";
		result += "Last Name: " + this.getLname() + "\n";
		result += "Age: " + this.getAge() + "\n";
		result += "Phone Number: " + this.getPhone() + "\n";
		result += "Address: " + this.getAddress() + "\n";
		result += "Birthday: " + this.getBirthday() + "\n";
		result += "Social Security Number: " + this.getSsn() + "\n";
		result += "Graduation Requirements: " + this.graduate() + "\n";
		result += "Current Classes: \n";
		
		ArrayList<Grade> temp = this.getCurrent();
		
		for(int i=0; i<temp.size(); i++) {
			result += "\tCourse ID: " + temp.get(i).getCourseID() + "\tGrade: " + temp.get(i).getScore() + "\n";
		}
		
		result += "Previous Classes: \n";
		
		temp = this.getPrevious();
		if(temp == null)
			result += "\tNo Classes";
		else
			for(int i=0; i<temp.size(); i++) {
				result += "\tCourse ID: " + temp.get(i).getCourseID() + "\tGrade: " + temp.get(i).getScore() + "\n";
			}
		
		return result;
	}
	public static Student createStudent(Person person) {
		Student creation = new Student(person.getFname(), person.getLname(), person.getAge(), person.getPhone(),
				person.getAddress(), person.getBirthday(), person.getSsn(), null, null);
		creation.setStudentID(studentIDCount);
		studentIDCount++;
		return creation;		
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public float getGpa() {
		float average = 0;
		if(previous == null)
			return 0;
		for(int i = 0; i < previous.size(); i++)
		{
			average += previous.get(i).getScore();
		}
		gpa = average/previous.size();
		return gpa;
	}
	public ArrayList<Grade> getCurrent() {
		return current;
	}
	public void setCurrent(ArrayList<Grade> current) {
		this.current = current;
	}
	public ArrayList<Grade> getPrevious() {
		return previous;
	}
	public void setPrevious(ArrayList<Grade> previous) {
		this.previous = previous;
	} 
}
