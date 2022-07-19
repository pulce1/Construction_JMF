package Construction_JMF;

public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	public Building() {
	projectName = " ";
	completeAddress = " ";
	totalSquareFeet = 0.0;
	occupancyGroup = " ";
	subgroup = " ";
	}

	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup) {
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	}

	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	public String displayData() {
	String str = "";
	str += "Project Name: " + projectName + "\n Address: " + completeAddress + "\n Square Feet: " + totalSquareFeet
	+ "\n Occupancy Group: " + occupancyGroup + "\n Occupancy Subgroup: " + subgroup;
	return str;
	}

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
	
	
	
	
	
	
	
}
