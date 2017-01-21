package mike.learning.com.data;

public class Person {
	private String fname = "N/A";
	private String lname = "N/A";
	private String fullname = "N/A";
	private int age = 0;
	private String phone = "N/A";
	private String address = "N/A";
	private String birthday = "N/A";
	private String ssn = "N/A";

	public Person() {
	}

	public Person(String first, String last, int years, String phoneNum, String addy, String birth, String social) {
		this.fname = first;
		this.lname = last;
		this.fullname = first + " " + last;
		this.age = years;
		this.phone = phoneNum;
		this.address = addy;
		this.birthday = birth;
		this.ssn = social;
	}

	public String toString() {
		String info = "First Name: " + this.fname + "\nLast Name: " + this.lname + "\nFull Name: " + this.fullname
				+ "\nAge: " + this.age + "\nPhone Num: " + this.phone + "\nAddress: " + this.address + "\nBirthday: "
				+ this.birthday + "\nSSN: " + this.ssn;
		return info;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
		this.fullname = this.fname + " " + this.lname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
		this.fullname = this.fname + " " + this.lname;
	}

	public String getFullname() {
		return fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
