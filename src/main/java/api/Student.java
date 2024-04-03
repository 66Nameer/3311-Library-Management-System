package api;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student extends User {

	private boolean enrolled =false;
	private ArrayList<Date> examDates=new ArrayList<Date>();
	private Map<String , String> courses= new HashMap<>();

	public Student(String email, String password) {
		super(email, password, UserType.STUDENT);
	}

	public boolean getEnrolled(){
		return this.enrolled;
	}

	public ArrayList<Date> getExamDates(){
		return this.examDates;
	}

	public Map<String,String> getCourses(){
		return this.courses;
	}

	public void setEnrolled(boolean enrolled){
		this.enrolled=enrolled;
	}
}
