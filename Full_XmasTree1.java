//////////////////////////////////////////////////////////////
// Full Xmas Tree                                           //
// Name: Subhash Tanikella                                  //
// Lab time: Friday 8:00-9:40                               //
// Program description: ICalledyou                          //
//////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Full_XmasTree1 {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many rows you want");
		int input = s.nextInt();
		
		for(int i=0; i<input; i++) {
			System.out.print(" ");
			int spaceCount = input -(1+i);
			//   *
			//  * *
			// * * *
			for(int j =0; j<spaceCount; j++) {
				System.out.print(" ");
				
			}
			int starCount = i+1;
			for(int k=0; k<starCount; k++) {
				System.out.print("* ");
				
			}
			System.out.print("\n");
			
			
		}
		s.close();
		
	}
}
