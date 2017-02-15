package mike.learning.com.manager;
import mike.learning.com.data.*;
import java.util.*;

public class CourseManagement {
	
	public static void main(String args[]) {
		School school = initialize();
		
		ArrayList<Student> temp1 = school.getStudents();
		for(int i=0; i<temp1.size(); i++) {
			System.out.println(temp1.get(i));
		}
		
		ArrayList<Professor> temp2 = school.getProfessors();
		for(int i=0; i<temp2.size(); i++) {
			System.out.println(temp2.get(i));
		}
		
		ArrayList<Course> temp3 = school.getCourses();
		for(int i=0; i<temp3.size(); i++) {
			System.out.println(temp3.get(i));
		}
	}
	
	public static School initialize() {
		School school = new School();
		
		Student mike = new Student("Mike", "Chen", 26, "571-606-0999", "4803 Nash Dr., Fairfax, VA 22032", "4/10/1991", "500010000", null, null);
		Student iris = new Student("Iris", "Chen", 19, "703-894-8855", "11561 clara Barton Dr., Farifax Station, VA 22039", "10/6/1997", "500010001",null,null);
		Student jayden = new Student("Jayden", "Chen", 19, "571-999-0999", "4832 Nash Dr., Fairfax, VA 22032", "8/14/1997", "500010003",null,null);
		Student lucy = new Student("Lucy", "Wang",  20, "408-606-0999", "4807 Nash Dr., Fairfax, VA 22032", "6/10/1996", "500010004",null,null);
		
		Professor susan = new Professor("Susan", "Yin", 53, "703-606-1488", "11561 clara Barton Dr., Farifax Station, VA 22039", "10/27/1963", "500010002",null);
		Professor jim = new Professor("Jim", "Chen", 54, "703-786-6426", "11561 clara Barton Dr., Fairfax Station, VA 22039", "8/6/1962", "500010005", null);
		
		Course english = new Course(0, "English", 0, null, 3, 10);
		Course math = new Course(0, "Math", 0, null, 3, 10);
		Course art = new Course(0, "Art", 0, null, 3, 10);
		Course java = new Course(0, "Java", 0, null, 3, 10);
		Course biology = new Course(0, "Biology", 0, null, 3, 10);
		Course mechanics = new Course(0, "Mechanics", 0, null, 3, 10);
		
		Grade lucyEnglishGrade = new Grade(english.getCourseID(), 0);
		Grade jaydenEnglishGrade = new Grade(english.getCourseID(), 0);
		Grade irisEnglishGrade = new Grade(english.getCourseID(), 0);
		Grade lucyMathGrade = new Grade(math.getCourseID(), 0);
		Grade irisArtGrade = new Grade(art.getCourseID(), 0);
		Grade mikeJavaGrade = new Grade(java.getCourseID(), 0);
		Grade irisBioGrade = new Grade(biology.getCourseID(), 3);
		Grade lucyBioGrade = new Grade(biology.getCourseID(), 2.5);
		Grade mikeBioGrade = new Grade(biology.getCourseID(), 3);
		Grade jaydenMechGrade = new Grade(mechanics.getCourseID(), 2.8);
		Grade mikeMechGrade = new Grade(mechanics.getCourseID(), 2.5);
		
		ArrayList<Grade> irisClass = new ArrayList<Grade>();
		irisClass.add(irisEnglishGrade);
		irisClass.add(irisArtGrade);
		iris.setCurrent(irisClass);
		ArrayList<Grade> irisPrevClass = new ArrayList<Grade>();
		irisPrevClass.add(irisBioGrade);
		iris.setPrevious(irisPrevClass);
		
		ArrayList<Grade> jaydenClass = new ArrayList<Grade>();
		jaydenClass.add(jaydenEnglishGrade);
		jayden.setCurrent(jaydenClass);
		ArrayList<Grade> jaydenPrevClass = new ArrayList<Grade>();
		jaydenPrevClass.add(jaydenMechGrade);
		jayden.setPrevious(jaydenPrevClass);
		
		ArrayList<Grade> lucyClass = new ArrayList<Grade>();
		lucyClass.add(lucyEnglishGrade);
		lucyClass.add(lucyMathGrade);
		lucy.setCurrent(lucyClass);
		ArrayList<Grade> lucyPrevClass = new ArrayList<Grade>();
		lucyPrevClass.add(lucyBioGrade);
		lucy.setPrevious(lucyPrevClass);
		
		ArrayList<Grade> mikeClass = new ArrayList<Grade>();
		mikeClass.add(mikeJavaGrade);
		mike.setCurrent(mikeClass);
		ArrayList<Grade> mikePrevClass = new ArrayList<Grade>();
		mikePrevClass.add(mikeBioGrade);
		mikePrevClass.add(mikeMechGrade);
		mike.setPrevious(mikePrevClass);
		
		ArrayList<Integer> mathStudents = new ArrayList<Integer>();
		mathStudents.add(lucy.getStudentID());
		math.setStudentIDs(mathStudents);
		
		ArrayList<Integer> englishStudents = new ArrayList<Integer>();
		englishStudents.add(iris.getStudentID());
		englishStudents.add(jayden.getStudentID());
		englishStudents.add(lucy.getStudentID());
		english.setStudentIDs(englishStudents);
		
		ArrayList<Integer> artStudents = new ArrayList<Integer>();
		artStudents.add(iris.getStudentID());
		art.setStudentIDs(artStudents);
		
		ArrayList<Integer> javaStudents = new ArrayList<Integer>();
		javaStudents.add(mike.getStudentID());
		java.setStudentIDs(javaStudents);
		
		ArrayList<Integer> bioStudents = new ArrayList<Integer>();
		bioStudents.add(iris.getStudentID());
		bioStudents.add(lucy.getStudentID());
		bioStudents.add(mike.getStudentID());
		biology.setStudentIDs(bioStudents);
		
		ArrayList<Integer> mechStudents = new ArrayList<Integer>();
		mechStudents.add(jayden.getStudentID());
		mechStudents.add(mike.getStudentID());
		
		math.setTeacherID(susan.getProfessorID());
		java.setTeacherID(susan.getProfessorID());
		english.setTeacherID(jim.getProfessorID());
		art.setTeacherID(jim.getProfessorID());
		biology.setTeacherID(susan.getProfessorID());
		mechanics.setTeacherID(jim.getProfessorID());
		
		Vector<Integer> jimClass = new Vector<Integer>();
		jimClass.add(english.getCourseID());
		jimClass.add(art.getCourseID());
		jimClass.add(mechanics.getCourseID());
		jim.setCourseIDs(jimClass);
		
		Vector<Integer> susanClass = new Vector<Integer>();
		susanClass.add(math.getCourseID());
		susanClass.add(java.getCourseID());
		susanClass.add(biology.getCourseID());
		susan.setCourseIDs(susanClass);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(mike);
		students.add(iris);
		students.add(jayden);
		students.add(lucy);
		school.setStudents(students);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(english);
		courses.add(math);
		courses.add(art);
		courses.add(java);
		courses.add(mechanics);
		courses.add(biology);
		school.setCourses(courses);
		
		ArrayList<Professor> professors = new ArrayList<Professor>();
		professors.add(susan);
		professors.add(jim);
		school.setProfessors(professors);
		
		return school;
	}
/*
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
	}*/
}
