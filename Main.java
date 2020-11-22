import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
	int number = 64;
	int iterations = 2;
	int n = 3;
	System.out.println(nthRootFinder(number, iterations, n));
	System.out.println(squareRootFinder(number, iterations));
	}
	public static String squareRootFinder(int number, int iterations){
		DecimalFormat mdf = new DecimalFormat("###.0000");
		if(number<0)
			System.out.println("Not a number");
		double min = 0;
		double midddle = 0;
		double max = number;
		double square = 0;
		for(int i = 0; i<iterations; i++) {
			 midddle = (max+min)/2;
			square = midddle*midddle;
			if(number<square) max = midddle;
			else if(number>square) min = midddle;
				
	       }
	       return mdf.format(midddle);
	   
		
		
	  }
	  
	  public static String nthRootFinder(int number, int iterations, int n){
			DecimalFormat mdf = new DecimalFormat("###.0000");
			if(number<0)
				System.out.println("Not a number");
			double min = 0;
			double midddle = 0;
			double max = number;
			double square = 0;
			for(int i = 0; i<iterations; i++) {
				 midddle = (max+min)/2;
				square = 1;
				for(int j = 0; j<n; j++)
				square= square*midddle;
				if(number<square) max = midddle;
				else if(number>square) min = midddle;
					
		       }
		       return mdf.format(midddle);
	    
	  }
}

