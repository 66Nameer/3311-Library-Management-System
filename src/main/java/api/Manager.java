package api;

public class Manager extends User implements PrivilegedUsers {


	public Manager(String email, String password) {
		super(email, password);
	}

	@Override
	public void AddItem(Item item) {
		
	}

	@Override
	public void EnableItemForRent(int itemID) {

	}

	@Override
	public void EditItemDetails(int itemID, String updatedDetails) {

	}

	@Override
	public void DisableItemForRent(int itemID) {

	}

	@Override
	public void ValidateRegistration() {

	}

	@Override
	public void DisplayNotification(String message) {

	}
}
