//////////////////////////////////////////////////////////////
// Strings Homework                                         //
// Name: Subhash Tanikella                                  //
// Lab time: Friday 8:00-9:40                               //
// Program description: Strings                             //
//////////////////////////////////////////////////////////////
import java.util.Scanner;

public class StringsHomework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date to be converted by entering the month, the day and separated by a comma the year");
		String date = s.nextLine().trim();
		String Month = date.substring(0, date.indexOf(" "));
		String Day = date.substring(date.indexOf(" ")+1, date.indexOf(","));
		String Year = date.substring(date.indexOf(",")+1,date.length());
		
		
		 
	    System.out.println(Day + " "+ (Month.substring(0,1).toLowerCase()) + Month.substring(1,Month.length()).toUpperCase() +"," + Year);
	}

}
