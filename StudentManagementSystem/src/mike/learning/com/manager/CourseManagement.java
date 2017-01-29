package mike.learning.com.manager;
import mike.learning.com.data.*;
import java.util.*;

public class CourseManagement {
	
	public static void main(String args[]) {
		School school = new School();
	}

	public boolean isRegistered(School school, int studentID, int courseID, String errorMsg) {
		ArrayList<Course> course = school.getCourses();
		
		if(course == null){
			errorMsg += "Courses not found";
			return false;
		}
		
		ArrayList<Student> students = null;
		boolean check1 = false, check2 = false;
		
		for(int i = 0; i<course.size(); i++) {
			if(course.get(i).getCourseID() == courseID) {
				check1 = true;
				students = course.get(i).getStudents();
				break;
			}
		}
		
		if(students != null)
			for(int i = 0; i<students.size(); i++) {
				if(students.get(i).getStudentID() == studentID) {
					check2 = true;
					break;
				}
			}
		
		if(check1 && check2)
			return true;
		else
			return false;
	}
	
	public boolean register(School school, int studentID, int courseID, String errorMsg) {
		ArrayList<Course> course = school.getCourses();
		if(course == null){
			errorMsg += "Courses Missing";
			return false;
		}
		
		ArrayList<Student> students = null;
		int numStudents = 0, maxStudents = 0;
		boolean check1 = false, check2 = true, check3 = false;
		int temp = 0;
		
		for(int i = 0; i<course.size(); i++) {
			if(course.get(i).getCourseID() == courseID) {
				check1 = true;
				temp = i;
				students = course.get(i).getStudents();
				maxStudents = course.get(i).getMaxStudents();
				numStudents = students.size();
				break;
			}
		}
		
		if(check1 == false){
			errorMsg += "wrong courseID";
			return false;
		}
		
		if(students == null){
			Student newStudent = new Student();

			for(int i = 0; i < school.getStudents().size(); i++)
			{
				if(school.getStudents().get(i).getStudentID() == studentID)
				{
					newStudent = school.getStudents().get(i);
					break;
				}
			}
			
			if(newStudent == null){
				errorMsg += "student doesn't exist";
				return false;
			}
				
			ArrayList<Student> newList = new ArrayList<Student>();
			newList.add(newStudent);
			course.get(temp).setStudents(newList);
		}
		else	
			for(int i = 0; i<students.size(); i++) {
				if(students.get(i).getStudentID() == studentID) {
					check2 = false;
					break;
				}
			}
		
		if(numStudents < maxStudents)
			check3 = true;
		
		if(check1 && check2 && check3) {
			errorMsg = "Can Register";
			return true;
		}
		if(check1 == false)
			errorMsg += "Course not in database";
		if(check2 == false)
			errorMsg += "Student already registered to course";
		if(check3 == false)
			errorMsg += "Course at capacity";
		
		return false;
	}
}
