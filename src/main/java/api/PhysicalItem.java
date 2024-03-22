package api;

public abstract class PhysicalItem extends Item {
	
	public String location;
	public String ISBN;

	protected PhysicalItem(ItemAttributes builder) {
		super(builder);
	}


	public int getID() {
		return this.ID;
	}
	

}
