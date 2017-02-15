package mike.learning.com.data;

public class Grade {
	private int courseID;
	private double score;
	
	public Grade() {}
	public Grade(int courseID, double score) {
		this.courseID = courseID;
		this.score = score;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public double getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
