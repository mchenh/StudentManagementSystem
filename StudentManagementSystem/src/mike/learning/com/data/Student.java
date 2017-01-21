package mike.learning.com.data;

import java.util.*;

public class Student extends Person {
	private float gpa;
	private ArrayList<Course> current = new ArrayList<Course>();
	private ArrayList<Course> previous = new ArrayList<Course>();

	public Student(){}
	public Student(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, ArrayList<Course> current, ArrayList<Course> previous){
		super(fname, lname, age, phone, address, birthday, ssn);
		this.current = current;
		this.previous = previous;
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
