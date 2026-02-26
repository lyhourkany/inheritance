package edu.handong.csee.java.example.inheritance;
/**
 * The PolymorphismDemonstrator class demonstrates
 * inheritance, polymorphism, upcasting, and downcasting
 * in Java.
 * 
 * It shows how:
 * - A Person reference can store Student and Undergraduate objects.
 * - instanceof is used before downcasting.
 * - Upcasting works automatically.
 * 
 * @author kanylyhour
 * @version 1.0
 */
public class PolymorphismDemonstrator {
	/**
	 * Main method that runs the polymorphism demonstration.
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		// Create an array of Person type
		// Polymorphism: Person reference can store Student or Undergraduate objects
		Person[] people = new Person[4];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people) {// Loop through each Person object
			System.out.println("Student Name: " + p.getName());
			
			// we can call getLevel only in Undergraduate by casting p (Person).
			// However, before cating we need to check if p is actually Undergraduate type by using 'instanceof'
			if(p instanceof Undergraduate){ 
				Undergraduate studentObj = (Undergraduate) p;
				System.out.println("Student Level: " + studentObj.getLevel());
			}
			System.out.println();
		}
		// Demonstrating upcasting
		Undergraduate ug = new Undergraduate("Nam, JC", 1111, 4);
		Student st = ug;
		Person ps = ug;
		Object obj = ug;
		
		st.writeOutput();
		ps.writeOutput();
		System.out.println(obj.toString());

	}
}