package mike.learning.com.data;
import java.util.*;

public class School {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Professor> professors = new ArrayList<Professor>();
	
	public School(){};
	public School(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Professor> professors)
	{
		this.students = students;
		this.courses = courses;
		this.professors = professors;
	}
}
