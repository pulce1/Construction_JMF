package Construction_JMF;

public class SingleFamilyHome extends Residential 
{
	private boolean garage;

	public SingleFamilyHome() {
	super();
	garage = false;
	}
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.garage = garage;
	}
	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	public String displayData() {
	String str = "";
	str += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
	return str;
	}

	public boolean isGarage() {
	return garage;
	}

	public void setGarage(boolean garage) {
	this.garage = garage;
	}

}

