package api;


import java.util.*;

public class Faculty extends User {
	
	private Map<String , String > courses=new HashMap<String, String>();


	public Faculty(String email, String password) {
		super(email, password, UserType.FACULTY);
	}

	public Map<String,String> getCourses(){
		return this.courses;
	}
}
