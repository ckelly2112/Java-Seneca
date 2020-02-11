package Lab3;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides of a triangle seperated by spaces: ");
		Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		while (triangle.getArea() == 0 || Double.isNaN(triangle.getArea())) {
			System.out.print("Not a valid Triangle. Enter 3 sides: (try 4 15 13 for example) ");
			triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		}
		
		//Sets colour
		System.out.print("Enter a colour: ");
		triangle.setColor(input.next());
		
		//sets fill status
		System.out.print("Is it filled? (true/false): ");
		try {
			triangle.setFilled(input.nextBoolean());
		} catch(Exception e) {
			System.out.println("incorrect input. Filled status set to false");
			triangle.setFilled(false);
		}
		
		System.out.println("Area = " + triangle.getArea());
		System.out.println("Perimeter = " + triangle.getPerimeter());
		System.out.println(triangle);
		
	}

}
