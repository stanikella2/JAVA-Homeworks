
public class Stars {

	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			   for (int j = 0; j < 10 - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
		}
		for (int x = 0; x < 4; x++) {
			for (int j = 0; j < 10 - x; j++)
				    System.out.print(" ");
				   for (int k = 0; k < (2 * x + 1); k++)
				    System.out.print("*");
				   System.out.println();
		}
		for (int y = 0; y < 4; y++) {
			   for (int j = 0; j < 10 - y; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * y + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
			 }
			}