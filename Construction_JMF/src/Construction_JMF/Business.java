/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Business.java
 */
package Construction_JMF;

public class Business extends Building {
	
	/**
	 * numRentableUnits for the number of available rentable units
	 */
	protected int numRentableUnits;

	/**
	 * empty argument constructors
	 */
	public Business() {
	super();
	numRentableUnits = 0;
	}

	/**
	 * preferred argument constructors
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numRentableUnits) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	this.numRentableUnits = numRentableUnits;
	}

	/**
	 * getters and setters for the class
	 * @return
	 */
	public int getNumRentableUnits() {
	return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
	}

	/**
	 * toString to print out all the values in the application
	 */
	public String toString() {
	return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
	}

}
