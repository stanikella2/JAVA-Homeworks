import java.util.*;

public class ArraysHomework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the student's name");
		String Name = s.nextLine();
		double a = 5;
		double total = 0;
		double number [] = new double[(int) a];
		double result = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Grade " + (i+1));
			double b = s.nextInt();
				if (b >= 0 && b <= 100) {
					number[i] = b;
					total+=b;
				}
				else { 
					System.out.println("Invalid Grade, try again");
					i--;
				}
			//total += b;
		}
		result = total/5;
		System.out.println("The average of the student grades is: " + result);
		if (90 < result && result < 100) {
			System.out.println("A");
		}
		if (80 < result && result < 90) {
			System.out.println("B");
		}
		if (70 < result && result < 80) {
			System.out.println("C"); 
			}
		if (60 < result && result < 70) {
			System.out.println("D");	
			}	
		if (0 < result && result < 60) {
				System.out.println("F");
			}
			
	}
	
}

			
	
		 

		
		
	


