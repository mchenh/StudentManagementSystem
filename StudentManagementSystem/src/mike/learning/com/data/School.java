package mike.learning.com.data;
import java.util.*;

public class School {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Professor> professors = new ArrayList<Professor>();
	private Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
	
	public School(){};
	public School(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Professor> professors)
	{
		this.students = students;
		this.courses = courses;
		this.professors = professors;
		
		for(int i=0; i<this.students.size(); i++){
			this.studentMap.put(this.students.get(i).getStudentID(), this.students.get(i));
		}
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public ArrayList<Professor> getProfessors() {
		return professors;
	}
	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}
}
