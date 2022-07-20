package Lab1;
import java.util.Random;


public class NonPlayerCharacter extends GameCharacter {
	
	private boolean active;
	private String intelligenceType;

	public NonPlayerCharacter()
	{
	super();
	setActive(false);
	setIntelligenceType("Average");
	}

	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
	super(uniqueID, personality);
	this.active = active;
	this.intelligenceType = intelligenceType;
	}

	public String introduce()
	{
	
	return "Hello, my name is "+super.uniqueID;
	}
	
	public String exclaim()
	{
	String[] strArray= {" Dag Gummit"," Doggone it"," Holy cow"," Jeez"," Well cheese and crackers"};
	Random r =new Random();
	int randomId=r.nextInt(4);
	return strArray[randomId];
	}

	public void setActive(boolean active) {
	this.active = active;
	}

	public void setIntelligenceType(String intelligenceType) {
	this.intelligenceType = intelligenceType;
	}

	public String reportStructure()
	{
	StringBuilder str=new StringBuilder();
	str.append(super.reportStructure()).append("\n=============================\n").append("Active: ").append(active).append("\n").append("Intelligence: ").append(intelligenceType);
	str.append("\n=============================");
	return str.toString();
	}

	}