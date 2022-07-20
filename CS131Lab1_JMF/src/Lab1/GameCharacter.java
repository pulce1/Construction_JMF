package Lab1;
import java.util.*;

public class GameCharacter {

	protected String uniqueID; //unique identifier assigned to each character object.
	protected String personality; //personality data type for the character.
		
	public GameCharacter() {
		
		Random r = new Random();
		r.setSeed(1000);
		int id = r.nextInt(1000);
		setUniqueID(Integer.toString(id));
		setPersonality("Neutral");
			
	}//end empty-argument constructor
	
	public GameCharacter(String uniqueID, String personality) {
		
		setUniqueID(uniqueID);
		setPersonality(personality);
		
	}//end full-argument constructor
	
	public String reportStructure(){
		
		StringBuilder sb = new StringBuilder("=============================\n");
		sb.append("     UniqueID: "+getUniqueID()+"\n");
		sb.append("     Personality: "+getPersonality()+"\n");
		sb.append("=============================\n");
		
		return sb.toString();
		
	}//end reportStats

	public String getUniqueID() {
		return uniqueID;
	}//end getUniqueID

	public void setUniqueID(String name) {
		this.uniqueID = name;
	}//end setUniqueID
	
	public String getPersonality() {
		return personality;
	}//end getPersonality
	
	public void setPersonality(String personality) {
		this.personality = personality;
	}//setPersonality

	@Override
	public String toString() {
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}//end toString

}//end class