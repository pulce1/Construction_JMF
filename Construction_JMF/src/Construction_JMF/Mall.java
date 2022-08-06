/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Mall.java
 */
package Construction_JMF;

public class Mall extends Business {

	/**
	 * numRented units to determine number of units rented
	 * median unit size is the median of available units sizes
	 * numParkingSpaces is the number of parking spaces here
	 */
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	/**
	 * empty argument constructor
	 */
	public Mall() {
	super();
	numParkingSpaces = 0;
	numRentableUnits = 0;
	medianUnitSize = 0.0;
	}

	/**
	 * proferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentedUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);
	this.medianUnitSize = medianUnitSize;
	this.numParkingSpaces = numParkingSpaces;
	}

	/**
	 * draw calls whichever class its displaying its output for beforehand
	 */
	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	/**
	 * displays the data required in the application class for the specific variables to this class
	 */
	public String displayData() {
	String str = "";
	str += super.toString() + "\n Number of Rented Units: " + numRentedUnits + "\n Median Unit Size: "
	+ medianUnitSize + "\n Number of Parking Spaces: " + numParkingSpaces;
	return str;
	}

	/**
	 * getters and setters for all variables and inherited variables
	 * @return
	 */
	public int getNumRentedUnits() {
	return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
	this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
	return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
	return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces = numParkingSpaces;
	}

	/**
	 * toString to print out all the values in the application
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits= 8" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	
}
	
	

