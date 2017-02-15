package mike.learning.com.data;
import java.util.*;

public class Professor extends Person{
	private Vector<Integer> courseIDs;
	private int professorID;
	private static int professorIDCount = 0;
	
	public Professor(){ professorID = professorIDCount++;}
	public Professor(String fname, String lname, int age, String phone, String address,
				String birthday, String ssn, Vector<Integer> courseIDs){
		super(fname, lname, age, phone, address, birthday, ssn);
		
		this.courseIDs = courseIDs;
		this.professorID = professorIDCount++;
	}

	@Override
	String getOccupation() {
		return "Professor";
	}
	public String toString() {
		String result = "\nProfessor\n";
		result += "First Name: " + this.getFname() + "\n";
		result += "Last Name: " + this.getLname() + "\n";
		result += "Age: " + this.getAge() + "\n";
		result += "Phone Number: " + this.getPhone() + "\n";
		result += "Address: " + this.getAddress() + "\n";
		result += "Birthday: " + this.getBirthday() + "\n";
		result += "Social Security Number: " + this.getSsn() + "\n";
		result += "Teaching Course IDs: ";
		
		Vector<Integer> temp = this.getCourseIDs();
		
		for(int i = 0; i<temp.size(); i++) {
			if(i != temp.size()-1)
				result += temp.get(i) + ", ";
			else
				result += temp.get(i) + "\n\n";
		}
		
		return result;
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
	public Vector<Integer> getCourseIDs() {
		return courseIDs;
	}
	public void setCourseIDs(Vector<Integer> courseIDs) {
		this.courseIDs = courseIDs;
	}
}
