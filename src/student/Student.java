package student;

import java.util.*;

public class Student implements StudentInterface{
	private int id;
	private int roll;
	private String firstName;
	private String lastName;
	private String gender;
	private long contactNo;
	
	Student(int roll, String firstName, String lastName, String gender, long contactNo, List<Student> arr){
		this.setId(arr);
		this.roll = roll;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contactNo = contactNo;
	}
	
	private void setId(List<Student> arr) {
		int id;
		
		if (arr.size() == 0) {
			id = 1;
		}else {
			Student last = arr.get(arr.size()-1);
			id = last.id + 1;	
		}
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	private String getFirstName() {
		return this.firstName;
	}
	
	private String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.getFirstName() + " " + this.getLastName();
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public Boolean isMale() {
		return this.gender == "M" ? true : false;
	}
	
	public long getContact() {
		return this.contactNo;
	}
	
	public String getGender() {
		return this.isMale() ? "Male" : "Female";
	}
}
