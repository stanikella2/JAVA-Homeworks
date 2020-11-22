import java.util.Scanner;

public class ShowmyName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your full name");
		String name = s.nextLine();
		char firstInitial = name.charAt(0);
		String middleInitial = name.substring(name.indexOf(" ")+1);
		char MiddleInitial = middleInitial.charAt(0);
		String lastInitial = name.substring(name.lastIndexOf(" ")+1);
		char LastInitial = lastInitial.charAt(0);
		System.out.println(firstInitial+" "+MiddleInitial+","+LastInitial);
	}

}
