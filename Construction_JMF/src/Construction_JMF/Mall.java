package Construction_JMF;

public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	public Mall() {
	super();
	numParkingSpaces = 0;
	numRentableUnits = 0;
	medianUnitSize = 0.0;
	}

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);
	this.medianUnitSize = medianUnitSize;
	this.numParkingSpaces = numParkingSpaces;
	}

	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	public String displayData() {
	String str = "";
	str += super.toString() + "\n Number of Rented Units: " + numRentedUnits + "\n Median Unit Size: "
	+ medianUnitSize + "\n Number of Parking Spaces: " + numParkingSpaces;
	return str;
	}

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

	}
