import java.util.Scanner;



public class PracticeJava {

	private int side1; 

	private int side2;

	private int side3;

	

	public PracticeJava() {}



	//Constructor

	public PracticeJava(int sidea, int sideb, int sidec) {

		this.side1 = sidea;

		this.side2 = sideb;

		this.side3 = sidec;

 	}



	public static void main(String[] args ) {

		PracticeJava practice = new PracticeJava();

		

		//Void method takes in the parameter and populates the Sides. 

		practice.getSides();

		

		//Volume method takes in the values and returns the volume.

		int volume = practice.getVolume();



		//Is Large method takes in the volume and determines if it is a large cube. 

		boolean isLarge = practice.isLarge(volume);



		//Void method prints what is the situation.

		practice.printSize(isLarge);



	}



	public void getSides() {



		Scanner input = new Scanner(System.in);

		System.out.println("enter Side 1");



		side1 = input.nextInt();

 		

		System.out.println("Enter side 2");



		side2 = input.nextInt();



		System.out.println("Enter side3");



		side3 = input.nextInt();

		input.close();

	}



	public int getVolume() {

 		int volume = side1* side2* side3;

		return volume;

	}



	



	public boolean isLarge(int volume) {

		return (volume > 4000);

	}



	public void printSize(boolean large) {

		if (large == true) {
			System.out.println("large cube");

		} else {

			System.out.println("small cube");

		}

	}



}	
		
	



	


	


