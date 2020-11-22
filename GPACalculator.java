/**
 * 
 */
package edu.gsu.csc1301.gpacalculator;

import java.util.Scanner;

/**
 * This program creates a GPA calculator by creating letter grades each semester on a 4.0 scale
 * 
 * @author Harsh Patel
 * @version 07/12/2019
 *
 */
public class GPACalculator
{

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); //Declares and initializes Scanner object
		giveIntro();
		String name =getName(console);
		String Semester =getSemester(console);
		
	}  
		
		 private static double getGradePoints(Scanner console) {
		// TODO Auto-generated method stub
		return 0;
	}

		// This will introduce the program to the user
	    public static void giveIntro()
	    {
		System.out.println("Welcome to the GPA Calculator!");
		System.out.println("");
        System.out.println("This program will input your letter grades for");
        System.out.println("each semester and calculate your GPA on a 4.0 scale.");
        System.out.println("");
	    }
	    
	    //This will give the first and last name of the user 
	    public static String getName(Scanner console) {
	    System.out.print("Please enter your first and last name:");
	    String name = console.next();
	    System.out.println();
	    return name;
	    }
	    
	    //This will give the number of Semesters user has completed
	    public static String getSemester(Scanner console) {
	    	System.out.print("please enter the number of semesters completed:");
	    	String Semester = console.next();
	    	return Semester;
	    }
	    
	    //This prompts the user to type which grade they received and the credit hours received
	    public static getGradePoints (string Letter, double Hours); {
	    if (Hours <=0 || Hours>4) 
	    {
    		throw new Exception("does not compute"); 
    		}
    	if (Hours > 3.0 && Hours <=4.0)
    	{
    		then (Letter = A.equalsIgnoreCase);
    		}
    	
    	else if (Hours > 2.0 && Hours <=3.0)
    	{
    	then (Letter = B.equalsIgnoreCase);
    	}
    	else if (Hours > 1.0 && Hours <=2.0)
    	{
    	then (Letter = C.equalsIgnoreCase);
    	}
    	else if (Hours > 0.0 && Hours <=1.0)
    	{
    	then (Letter = D.equalsIgnoreCase);
    	}
    	else (Letter = F.equalsIgnoreCase);
    	{
    	throw new Exception("does not compute")
    	if (Grade > F)
    }
    		return getGradePoints;
	    }
    }	

	   
	    	
	    	

	    




	    	
	    	
	    


	   