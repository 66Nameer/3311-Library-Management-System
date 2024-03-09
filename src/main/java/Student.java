package src.main.java;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student extends User {

	private boolean enrolled =false;
	private ArrayList<Date> examDates=new ArrayList<Date>();
	private Map<String , String > courses=new HashMap<String, String>();
}
