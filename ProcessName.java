import java.util.Scanner;

public class ProcessName {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner s = new Scanner(System.in);
				System.out.println("Please enter your first and last name separated by a sapce");
				String name = s.nextLine();
				String firstname = name.substring(0,name.indexOf(" "));
				String Lastname = name.substring(name.indexOf(" ")+1);
				char lastinitial = Lastname.charAt(0);
				System.out.println(firstname+","+lastinitial);
			}
		}
	


