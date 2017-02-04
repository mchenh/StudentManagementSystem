package mike.learning.com.data;
import java.util.*;

public class Professor extends Person{
	private ArrayList<Integer> courseIDs;
	private int professorID;
	private static int professorIDCount = 0;
	
	public Professor(){ professorID = professorIDCount++;}
	public Professor(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, ArrayList<Integer> courseIDs){
		super(fname, lname, age, phone, address, birthday, ssn);
		
		this.courseIDs = courseIDs;
		this.professorID = professorIDCount++;
	}
	

	public static Professor createProfessor(Person person) {
		Professor creation = new Professor(person.getFname(), person.getLname(), person.getAge(), person.getPhone(),
				person.getAddress(), person.getBirthday(), person.getSsn(), null);
		creation.setProfessorID(professorIDCount);
		professorIDCount++;
		return creation;		
	}
	public int getProfessorID() {
		return professorID;
	}
	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}
	public ArrayList<Integer> getCourseIDs() {
		return courseIDs;
	}
	public void setCourseIDs(ArrayList<Integer> courseIDs) {
		this.courseIDs = courseIDs;
	}
}
