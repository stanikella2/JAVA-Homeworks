//////////////////////////////////////////////////////////////
// Guess Number                                             //
// Name: Subhash Tanikella                                  //
// Lab time: Friday 8:00-9:40                               //
// Program description: ICalledyou                          //
//////////////////////////////////////////////////////////////
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		guessGame();
	}
	public static void guessGame() {
		int success=0;
		int count=1;
		Random d= new Random();
     	Scanner s= new Scanner(System.in);
     	System.out.println("Guess the secret number");
        System.out.print("Enter the maximum range of the number : ");
        int maxNum=s.nextInt();
		int randomNum= d.nextInt(maxNum);
		System.out.println("A new secret number has been chosen");
        while(success==0) {
        		System.out.print("Enter Guess: ");
        		int guess = s.nextInt();
        		if(guess<randomNum) {
        			count++;
        			System.out.println("Too low , try again");
        		} else if(guess>randomNum) {
        			count++;
        			System.out.println("Too high, try again");
        		} else if(guess==randomNum){
        			success++;
        			System.out.println("You win in "+count+" guesses!");
        			System.out.println("Do you want to play again? (Y/N)");
        			String inp= s.next();
        			if(inp.equalsIgnoreCase("Y")){
        				guessGame();
        			} else {
        				System.out.println("BYE");
            	  
              }
              s.close();
        	  }
        }
	}
}

