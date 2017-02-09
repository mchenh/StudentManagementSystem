package mike.learning.com.data;

import java.util.ArrayList;

public class Course {
	private int teacherID;
	private String name;
	private int grade;
	private ArrayList<Integer> studentIDs;
	private int credit;
	private int maxStudents;
	private int courseID;
	private static int courseIDCount = 0;
	
	public Course(){this.courseID = courseIDCount++;}
	public Course(int teacher, String name, int grade, ArrayList<Integer> students, int credit, int maxStudents){
		this.teacherID = teacher;
		this.name = name;
		this.grade = grade;
		this.studentIDs = students;
		this.credit = credit;
		this.maxStudents = maxStudents;
		this.courseID = courseIDCount++;
	}

	public String toString() {
		String result = "\nCourse\n";
		result += "Teacher ID: " + this.getTeacherID() + "\n";
		result += "Name: " + this.getName() + "\n";
		result += "Average Grade: " + this.getGrade() + "\n";
		result += "Credit Value: " + this.getCredit() + "\n";
		result += "Maximum Students: " + this.getMaxStudents() + "\n";
		result += "Course ID: " + this.getCourseID() + "\n\n";
		
		return result;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public ArrayList<Integer> getStudentIDs() {
		return studentIDs;
	}
	public void setStudentIDs(ArrayList<Integer> studentIDs) {
		this.studentIDs = studentIDs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
