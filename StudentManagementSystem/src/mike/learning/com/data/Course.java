package mike.learning.com.data;

import java.util.ArrayList;

public class Course {
	private Professor teacher = new Professor();
	private String name;
	private int grade;
	private ArrayList<Student> students = new ArrayList<Student>();
	private int credit;
	private int maxStudents;
	private int courseID;
	
	public Course(){}
	public Course(Professor teacher, String name, int grade, ArrayList<Student> students, int credit, int maxStudents, int courseID){
		this.teacher = teacher;
		this.name = name;
		this.grade = grade;
		this.students = students;
		this.credit = credit;
		this.maxStudents = maxStudents;
		this.courseID = courseID;
	}
	public Professor getTeacher() {
		return teacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
