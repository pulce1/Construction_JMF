/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Building.java
 */
package Construction_JMF;

public class Building 
{
	/**
	 * projectName is the name of the type of building
	 * completeAddress is the full address of the building
	 * totalSquareFeet is the measurement of total square feet
	 * occupancy group is the type of building that it is
	 * subgroup is the buildings declaration code
	 */
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	/**
	 * empty argument constructors
	 */
	public Building() {
	projectName = " ";
	completeAddress = " ";
	totalSquareFeet = 0.0;
	occupancyGroup = " ";
	subgroup = " ";
	}

	/**
	 * Preferred argument constructors
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup) {
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
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
	str += "Project Name: " + projectName + "\n Address: " + completeAddress + "\n Square Feet: " + totalSquareFeet
	+ "\n Occupancy Group: " + occupancyGroup + "\n Occupancy Subgroup: " + subgroup;
	return str;
	}

	/**
	 *getters and setters for the class
	 * @return
	 */
	public String getProjectName() {
	return projectName;
	}

	public void setProjectName(String projectName) {
	this.projectName = projectName;
	}

	public String getCompleteAddress() {
	return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
	this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
	return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
	this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
	return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
	this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
	return subgroup;
	}

	public void setSubgroup(String subgroup) {
	this.subgroup = subgroup;
	}

	/**
	 * toString to print out needed data in the application class
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	
	
	
	
	
	
	
}
