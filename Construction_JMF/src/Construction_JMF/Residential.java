/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Residential.java
 */
package Construction_JMF;

public class Residential extends Building {

	/**
	 * numBedrooms to determine the number of bedrooms in residential
	 * numBathrooms to determine the number of bathrooms in residential
	 * laundryRoom to determine whether or not residential has a laundry room
	 */
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	/**
	 * empty argument constructors
	 */
	public Residential() {
	super();
	numBathrooms = 0;
	numBedrooms = 0;
	laundryRoom = false;
	}

	/**
	 * proffered argument constructors
	 * @param projectName: what is the buidling called
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup: what type of building is it
	 * @param subgroup: What is the buildings designation
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	this.numBedrooms = numBedrooms;
	this.numBathrooms = numBathrooms;
	this.laundryRoom = laundryRoom;
	}

	/**
	 * getters and setters for the used methods
	 * @return
	 */
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

	/**
	 * toString to print in the application
	 */
	public String toString() {
	return super.displayData() + "\n Number of Bedrooms: " + numBedrooms + "\n Number of Bathrooms: " + numBathrooms
	+ "\n Laundry Room: " + ((laundryRoom == true) ? "Y" : "N");
	}

	}
