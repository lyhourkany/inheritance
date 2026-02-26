package edu.handong.csee.java.example.inheritance;
/**
 * The InheritanceDemonstrator class demonstrates
 * how to create and use a Student object.
 *
 * It sets the student's name and student number
 * and then displays the student's information.
 *
 * @author kanylyhour
 * @version 1.0
 */
public class InheritanceDemonstrator {
/**
     * The main method creates a Student object,
     * assigns values to it, and prints the result.
     */
	public static void main(String[] args) {  
		 Student s = new Student();  //create a new student obeject
		 s.setName("Warren Peace");  //Set the student's name to "Warren Peace"
		 s.setStudentNumber(1234);  //Set the student's student number to 123
		 s.writeOutput();  //output
	}

}
