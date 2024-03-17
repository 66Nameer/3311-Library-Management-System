package src.main.java;

public interface PrivilegedUsers {
    public void AddItem (Item item);
    public void EnableItemForRent(int itemID);
    public void EditItemDetails(int itemID, String updatedDetails);
    public void DisableItemForRent(int itemID);
    public void ValidateRegistration();
    public void DisplayNotification(String message);
}
