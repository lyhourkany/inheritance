package edu.handong.csee.java.example.inheritance;
/**
 * The Person class represents a basic person with a name.
 * It provides methods to set, retrieve, print, and compare names.
 * 
 * This class can be extended by other classes 
 * such as Student or Employee.
 * 
 * @author kanylyhour
 * @version 1.0
 */
public class Person {  // Person class represents a basic person object
	private String name;  // Instance variable to store person's name
/**
	 * Default constructor.
	 * Sets the name to "No name yet".
	 */
	public Person() {   // Default constructor
		name = "No name yet";// Sets name to default value
	}
	/**
	 * Constructor that initializes the person’s name.
	 * 
	 * @param initialName the initial name of the person
	 */
	public Person(String initialName)    {  // Constructor with parameter
		name = initialName;    }           // Allows setting initial name
/**
	 * Sets the name of the person.
	 * 
	 * @param newName the new name to assign
	 */
	public void setName(String newName) { // Setter method to change name
		name = newName;    
	} 
/**
	 * Returns the name of the person.
	 * 
	 * @return the person's name
	 */
	public String getName() { // Getter method to return name
		return name;
	} 
/**
	 * Prints the person's name to the console.
	 */
	public void writeOutput() {
		System.out.println("Name: " + name); // Prints the person's name
	} 
/**
	 * Compares this person's name with another person's name.
	 * The comparison ignores uppercase and lowercase differences.
	 * 
	 * @param otherPerson the person to compare with
	 * @return true if both names are the same (ignoring case), false otherwise
	 */
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	} // Compares this person's name with another person's name
	// Ignores uppercase/lowercase differences
}
