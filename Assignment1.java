import java.util.*;
public class Assignment1 {
	public static void main(String[] args) {
		String name = "";
		Scanner input = new Scanner(System.in);
		while (name.length() == 0) {
			System.out.println("What is your name?");
			name = input.nextLine();

						
		}
		System.out.println("Hello "+ name);
	}
	
}
