package edu.handong.csee.java.example.inheritance;
/**
 * The Undergraduate class extends the Student class.
 * It represents an undergraduate student with a level.
 * 
 * Level values:
 * 1 = Freshman
 * 2 = Sophomore
 * 3 = Junior
 * 4 = Senior
 * 
 * This class demonstrates:
 * - Multi-level inheritance
 * - Constructor chaining
 * - Method overriding
 * - Method overloading
 * - Validation inside setter
 * 
 * @author kanylyhour
 * @version 1.0
 */
public class Undergraduate extends Student {
	private int level; 	//1 for freshman, 2 for sophomore 
						//3 for junior, or 4 for senior. 
/**
	 * Academic level of the undergraduate student.
	 * 1 = Freshman, 2 = Sophomore,
	 * 3 = Junior, 4 = Senior.
	 */
	public Undergraduate()    { // Default constructor
	// Calls Student's default constructor
	// Sets default level to 1 
		super();        
		level = 1;  
	} 
/**
	 * Constructor that initializes name,
	 * student number, and level.
	 * 
	 * @param initialName the student's name
	 * @param initialStudentNumber the student's ID
	 * @param initialLevel the student's academic level (1–4)
	 */
	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) { 
		super(initialName, initialStudentNumber);        
		setLevel(initialLevel); //checks 1 <= initialLevel <= 4    
	}
	/**
	 * Resets the student's information including level.
	 * 
	 * @param newName new name of student
	 * @param newStudentNumber new student ID
	 * @param newLevel new academic level (1–4)
	 */
	public void reset(String newName, int newStudentNumber, int newLevel) { 
		reset(newName, newStudentNumber); //Student's reset        
		setLevel(newLevel); //Checks 1 <= newLevel <= 4    
	}
/**
	 * Returns the academic level.
	 * 
	 * @return level (1–4)
	 */
	public int getLevel() {// Getter for level
		return level;    
	} 
/**
	 * Sets the academic level.
	 * Only values between 1 and 4 are allowed.
	 * 
	 * @param newLevel academic level (1–4)
	 */
	public void setLevel(int newLevel)    {// Setter with validation
		if ((1 <= newLevel) && (newLevel <= 4))           
			level = newLevel;
		else {
			System.out.println("Illegal level!");            
			System.exit(0);       
		}    
	} 
/**
	 * Overrides writeOutput() method from Student.
	 * Prints name, student number, and level.
	 */
	public void writeOutput()    { 
		super.writeOutput();        
		System.out.println("StudentLevel: " + level);    
	} 
/**
	 * Compares this Undergraduate object
	 * with another Undergraduate object.
	 * 
	 * Two undergraduates are equal if:
	 * - They have the same name
	 * - Same student number
	 * - Same academic level
	 * 
	 * @param otherUndergraduate the object to compare
	 * @return true if equal, false otherwise
	 */
	public boolean equals(Undergraduate otherUndergraduate) { 
		return equals((Student)otherUndergraduate) && (this.level == otherUndergraduate.level);    
	} 
}
