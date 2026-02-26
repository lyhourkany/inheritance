package edu.handong.csee.java.example.inheritance;

/**
 * The Student class extends the Person class.
 * It represents a student with a name and a student number.
 * 
 * This class demonstrates:
 * - Inheritance
 * - Constructor chaining using super
 * - Method overriding
 * - Object comparison
 * 
 * @author kanylyhour
 * @version 1.0
 */
public class Student extends Person{
	private int studentNumber;

	public Student() {
		super();
		studentNumber = 0;
	}
	
	/**
	 * Constructor that initializes name and student number.
	 * 
	 * @param initialName the student's name
	 * @param initialStudentNumber the student's ID number
	 */
	public Student(String initialName, int initialStudentNumber){
		super(initialName);
		studentNumber = initialStudentNumber;
	}
	
	/**
	 * Resets the student's name and student number.
	 * 
	 * @param newName new name of the student
	 * @param newStudentNumber new student ID number
	 */
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber = newStudentNumber;
	}
	
	/**
	 * Returns the student's ID number.
	 * 
	 * @return student number
	 */
	public int getStudentNumber() {
		return studentNumber;
	}
	
	/**
	 * Sets the student's ID number.
	 * 
	 * @param newStudentNumber new student number
	 */
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	
	/**
	 * Overrides the writeOutput method from Person class.
	 * Prints both name and student number.
	 */
	@Override
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber); 
	}
	
	/**
	 * Compares this Student with another Student.
	 * Two students are equal if:
	 * - They have the same name (ignoring case)
	 * - They have the same student number
	 * 
	 * @param otherStudent the student to compare with
	 * @return true if equal, false otherwise
	 */
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) 
				&& (this.studentNumber == otherStudent.studentNumber);
	} 
}