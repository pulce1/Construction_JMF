package Lab1;

public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		
		NonPlayerCharacter gc=new NonPlayerCharacter("487", "Neutral", false, "Average");
		
		System.out.println(gc.introduce());
		System.out.println("Random String:"+gc.exclaim());

	}//end main

}//end class
