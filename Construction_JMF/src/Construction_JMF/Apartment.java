/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Appartment.java
 */
package Construction_JMF;

public class Apartment extends Residential {

	/**
	 * declared new methods
	 * numRentableUnits to find which units are rentable
	 * avgUnitSize is the avg size of each unit
	 * parkingAvailable informs whether or not parking is available on site
	 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	/**
	 * empty argument constructor
	 */
	public Apartment() {
	super();
	numRentableUnits = 0;
	avgUnitSize = 0.0;
	parkingAvailable = false;
	} //end empty constructor

	/**
	 * proffered argument constructors
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
	double avgUnitSize, boolean parkingAvailable) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.numRentableUnits = numRentableUnits;
	this.avgUnitSize = avgUnitSize;
	this.parkingAvailable = parkingAvailable;
	}//end preferred constructor

	/**
	 * draw calls whichever class its displaying its output for beforehand
	 */
	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//end draw

	/**
	 * displays the data required in the application class for the specific variables to this class
	 */
	public String displayData() {
	String str = "";
	str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: "
	+ avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
	return str;
	}//end displayData

	/**
	 * getters and setters for the class
	 * @return
	 */
	public int getNumRentableUnits() {
	return numRentableUnits;
	}// end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
	} //end setNumRentableUnits

	public double getAvgUnitSize() {
	return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
	this.avgUnitSize = avgUnitSize;
	}// end setAvgUnitSize

	public boolean isParkingAvailable() {
	return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
	this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	/**
	 * toString to print out all the values in the application
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	

}
