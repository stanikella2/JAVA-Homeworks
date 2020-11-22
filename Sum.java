import java.util.Scanner;

public class Sum {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius");
		
		double a = s.nextDouble();
		if(a==0) {
			System.out.println("Error message");
		
			
		}
		System.out.println("Enter rec for rectangle cir for circle");

		String d = s.next();
	if(d.equals("rec")) {
			double f = a*a;
			System.out.println("Area of rec ="+ f);
	}
		if(d.equals("cir"))	{		
			double c = 3.14*a*a;
			System.out.println("Area of circle="+c);
			
		}
		
		}
}


