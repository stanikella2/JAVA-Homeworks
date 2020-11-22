import java.util.Scanner;

public class runningSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of numbers need to enter");
		double number = s.nextDouble();
		double sum = 0;
		double numb [] = new double [(int) number];
		double result = 0;
		for (int i = 0; i < numb.length; i++) {
			System.out.println("enter number " + (i+1));
			double a = s.nextDouble();
			
			numb[i] = a;
			sum+=a;
			
				
			}
			
			
				
			result = sum;
			System.out.println("The result is "+ result);
		}
	

	}

