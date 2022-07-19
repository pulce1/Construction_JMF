package Construction_JMF;

public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	public Residential() {
	super();
	numBathrooms = 0;
	numBedrooms = 0;
	laundryRoom = false;
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	this.numBedrooms = numBedrooms;
	this.numBathrooms = numBathrooms;
	this.laundryRoom = laundryRoom;
	}

	public int getNumBedrooms() {
	return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
	this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
	return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
	this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
	return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
	this.laundryRoom = laundryRoom;
	}

	public String toString() {
	return super.displayData() + "\n Number of Bedrooms: " + numBedrooms + "\n Number of Bathrooms: " + numBathrooms
	+ "\n Laundry Room: " + ((laundryRoom == true) ? "Y" : "N");
	}

	}
