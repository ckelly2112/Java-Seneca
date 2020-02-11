package Lab4;
import java.util.*;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] random = new int[100];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * 100);
		}
		System.out.print("Enter index 0-99: ");
		
		int pick = 100;
		do {
			pick = 100;
			try {
				pick = input.nextInt();
				if (pick > 99 || pick < 0)
					System.out.print("Out of Bounds! Try again: ");
				} catch(Exception e) {
				if (input.hasNextBigInteger())
					System.out.print("Not a valid integer! Try again: ");
				else
					System.out.print("Enter numbers only! Try again: ");
				input.nextLine();
				}
			
			} while (pick > 99 || pick < 0);
		
		System.out.println("Your number is: " + random[pick]);
		input.close();
	}

}
