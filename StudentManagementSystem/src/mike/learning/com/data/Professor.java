package mike.learning.com.data;
import java.util.*;

public class Professor extends Person{
	private ArrayList<Course> teaching = new ArrayList<Course>();
	
	public Professor(){}
	public Professor(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, ArrayList<Course> course){
		super(fname, lname, age, phone, address, birthday, ssn);
		
		this.teaching = course;
	}
	public ArrayList<Course> getTeaching() {
		return teaching;
	}
	public void setTeaching(ArrayList<Course> teaching) {
		this.teaching = teaching;
	}
	
}
