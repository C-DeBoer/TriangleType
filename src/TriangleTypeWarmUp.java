import java.util.*;
public class TriangleTypeWarmUp {
	public static void main(String[]args) {
		int sideOne = 0, sideTwo = 0, sideThree = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("What is the first side length of your triangle?");
		sideOne = s.nextInt();
		System.out.println("What is the second side length of your triangle?");
		sideTwo = s.nextInt();
		System.out.println("What is third side length of your triangle?");
		sideThree = s.nextInt();
		
		if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
		
					if (sideOne == sideTwo && sideTwo == sideThree) {
						System.out.println("You have an equilateral triangle.");
					}
					else if (sideOne == sideTwo && sideTwo != sideThree) {
						System.out.println("You have an isosceles triangle.");
					}
					else if (sideOne == sideThree && sideOne != sideTwo) {
						System.out.println("You have an isosceles triangle.");
					}
					else if (sideThree == sideTwo && sideOne != sideThree) {
						System.out.println("You have an isoscelese triangle.");
					}
					else if (sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree) {
						System.out.println("You have a scalene triangle");
				    }
		}
		else {
			System.out.println("That cannot be a triangle. Please try again.");
		}
		
	}

}
 