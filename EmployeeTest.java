package ch09AssignNo2MarketerEx01P565;

import java.util.Date;

/*
Program name: Employee & Marketer (Exercise #1, page 656)
This the last time I will provide the algorithm to accomplish the coding assignment.
Turn in the Java code and the output screen shot.
Students can't work together anymore. It is OK to ask for help fixing compiling errors.
Do the Exercise #1 on page 656.
Use the following steps to complete the project:
s0. create a file folder called ch09AssignNo2MarketerEx01P565.
s01. The ch09AssignNo2MarketerEx01P565 will be the package name and should be
s02. included in each file.
s1. copy Employee class on page 591.
s2. write a Marketer class that extends Employee
s3. override getSalary from Employee class that
s4. returns $5... (see Exercise #1, p. 656)
s5. add a new method advertise that prints "I'll.... (see Exercise #1, p. 656)
s6. Write a Java Client class called EmployeeTest that has a main method that:
s9. display the run time, author name, and project name.
s10. create an Employee object called john_emp using default constructor
s11. print john_emp's work hours, salary, vacation days, and vocation form.
s12. create an Marketer object called susan_marketer using default constructor
s13. print susan_marketer's work hours, salary, vacation days, vocation form, and advertise
s14. sample output:
Today is Fri Mar 01 19:26:12 EST 2019
My name is John Smith
Program name: Employee & Marketer (Exercise #1, page 656)
john_emp works 40.0 hours, makes $4000.0, has 10 vacations days and uses yellow form.
susan_marketer works 40.0 hours, makes $50000.0, has 10 vacations days and uses yellow form and Act now, while supplies last!

*/
public class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("Today is " + (new Date()));
		System.out.println("My name is John Smith");
		System.out.println("Program name: Employee & Marketer (Exercise #1, page 656)");
		Employee john_emp = new Employee();
		System.out.println("john_emp works " + john_emp.getHours() + " hours, makes $" + john_emp.getSalary() + ", has "
				+ john_emp.getVacationDays() + " vacations days and uses " + john_emp.getVacationForm() + " form.");

		Marketer susan_marketer = new Marketer();
		System.out.println("susan_marketer works " + susan_marketer.getHours() + " hours, makes $"
				+ susan_marketer.getSalary() + ", has " + susan_marketer.getVacationDays() + " vacations days and uses "
				+ susan_marketer.getVacationForm() + " form and her advertise is: " + susan_marketer.advertise());
	}
}
