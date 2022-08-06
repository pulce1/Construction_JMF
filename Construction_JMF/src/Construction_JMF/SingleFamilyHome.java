/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * SingleFamilyHome.java
 */
package Construction_JMF;

public class SingleFamilyHome extends Residential 
{
	/**
	 * garage determines if there is or isnt a garage for usage
	 */
	private boolean garage;

	/**
	 * empty argument constructor
	 */
	public SingleFamilyHome() {
	super();
	garage = false;
	}
	
	/**
	 * Preferred argument constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.garage = garage;
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
	str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
	return str;
	}

	/**
	 * getters and setters for the class
	 * @return
	 */
	public boolean isGarage() {
	return garage;
	}

	public void setGarage(boolean garage) {
	this.garage = garage;
	}
	
	/**
	 * toString to print out all the values in the application
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	

}

