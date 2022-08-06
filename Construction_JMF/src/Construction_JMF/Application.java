/**
 * @author james Frayser
 * Summer 2022
 * Project 1
 * Application.java
 */
package Construction_JMF;

public class Application {

	/**
	 * building up each building type with their respective needed inputs
	 * @param args
	 */
public static void main(String[] args) {
	
	/**
	 * building up each building type with their respective needed inputs
	 * @param args
	 */
Building r1 = new Building("Gaine's House", "123 Main Street | Louisiville Kentucky 40201", 2540, "Residential",
"R1");
Business b1 = new Business("Ryan's Business", "12804 Left Street | Louisiville Kentucky 40207", 3200, "Business", "B1",
12);
Apartment a1 = new Apartment("Bellow's Apartments", "208 Right Street | Louisiville Kentucky 40059", 15000,
"Apartments", "A1", 22, 16, true, 6, 910, true);
SingleFamilyHome sfh1 = new SingleFamilyHome("Marcus' Single Family Houses",
"3611 Rendable Blvd | Louisiville Kentucky 40098", 1250, "Single Family House", "SFH1", 3, 2, true, true);
Mall m1 = new Mall("Starcourt Mall" , "12212 Rightwing Drive | Louisville Kentucky 44212", 40000, "Mall", "M1", 30, 1250, 350);


/**
 * prints out all the needed data according to each building type
 */
System.out.println("-----Building Details-----\n" + r1.displayData()+"\n");
System.out.println("-----Business Building Details-----\n" + b1.toString()+"\n");
System.out.println("-----Apartment Details-----\n" + a1.displayData()+"\n");
System.out.println("-----SingleFamilyHome Details-----\n" + sfh1.displayData()+"\n");
System.out.println("-----Mall Details-----\n" + m1.toString()+"\n");
System.out.println("-----Apartment Details toString-----\n" + a1.toString()+"\n");
System.out.println("-----SingleFamilyHome Details toString-----\n" + sfh1.toString()+"\n");
System.out.println("-----Building Details toString-----\n" + r1.toString()+"\n");


}

}
