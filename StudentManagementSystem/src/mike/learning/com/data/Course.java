package mike.learning.com.data;

import java.util.ArrayList;

public class Course {
	private Professor teacher = new Professor();
	private String name;
	private int grade;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Course(){}
	public Course(Professor teacher, String name, int grade, ArrayList<Student> students){
		this.teacher = teacher;
		this.name = name;
		this.grade = grade;
		this.students = students;
	}
	public Professor getTeacher() {
		return teacher;
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
