package api;


public class Staff extends User{

	private String department;

	public Staff(String email, String password) {
		super(email, password, UserType.STAFF);
	}
}
