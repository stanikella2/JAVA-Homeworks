//////////////////////////////////////////////////////////////
// Half Xmas Tree                                           //
// Name: Subhash Tanikella                                  //
// Lab time: Friday 8:00-9:40                               //
// Program description: ICalledyou                          //
//////////////////////////////////////////////////////////////




import java.util.Scanner;

public class Half_XmasTree {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    System.out.println("How many rows do you want?");
	    int input= scan.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input; j >= i; j--) {
                System.out.print("*");
			}
                System.out.println();
        }
		
      scan.close();
	}

}
