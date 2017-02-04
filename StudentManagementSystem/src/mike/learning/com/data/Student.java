package mike.learning.com.data;

import java.util.*;

public class Student extends Person {
	private float gpa;
	private ArrayList<Course> current = new ArrayList<Course>();
	private ArrayList<Course> previous = new ArrayList<Course>();
	private int studentID;
	private static int studentIDCount = 0;

	public Student(){studentID = studentIDCount++;}
	public Student(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, ArrayList<Course> current, ArrayList<Course> previous){
		super(fname, lname, age, phone, address, birthday, ssn);
		this.current = current;
		this.previous = previous;
		this.studentID = studentIDCount++;
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
			average += previous.get(i).getGrade();
		}
		gpa = average/previous.size();
		return gpa;
	}
	public ArrayList<Course> getCurrent() {
		return current;
	}
	public void setCurrent(ArrayList<Course> current) {
		this.current = current;
	}
	public ArrayList<Course> getPrevious() {
		return previous;
	}
	public void setPrevious(ArrayList<Course> previous) {
		this.previous = previous;
	} 
}
