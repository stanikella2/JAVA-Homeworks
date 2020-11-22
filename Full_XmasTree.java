import java.util.Scanner;

public class Full_XmasTree {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("How many rows do you want?");
		int inp=input.nextInt();
		  for (int i = 0; i <=inp; i++) {
		   for (int j = 0; j <=(inp-i); j++)
		    System.out.print(" ");
		   for (int k = 1; k <=i; k++)
		    System.out.print(" *");
		   System.out.println();
		  }
		  input.close();
		 }
		}


