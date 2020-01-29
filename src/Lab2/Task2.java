package Lab2;
//Student Name: Christopher Kelly
//Student Number: 134358183

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get Rows and Columns
		System.out.print("Enter the rows in the array: ");
		int rows = input.nextInt();
		while(rows < 0) {
			System.out.print("Please enter a positive int: ");
			rows = input.nextInt();
		}
		System.out.print("Enter the columns in the array: ");
		int columns = input.nextInt();
		while(columns < 0) {
			System.out.print("Please enter a positive int: ");
			columns = input.nextInt();
		}
		
		double[][] values = new double[rows][columns];
		
		//Have user input data
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < columns; c++) {
				System.out.print("Enter row [" + (r + 1) + "] column [" + (c + 1) + "]");
				values[r][c] = input.nextDouble();
			}
		}
		
		/* There are many ways to do this.
		 * Originally I had put the entire function in as a constructor for Location.
		 * Since the lab asked for the public static method, I created the method inside of the Location class
		 * I had also created the function inside of the Task2 class as well but figured it would be pointless
		 * Because the purpose of Location is just to find the max value, and the main method does all the tests
		 * it would make most sense to make the constructor for Location the same as the method locateLargest() and
		 * remove the method all together.*/
		
		Location location = Location.locateLargest(values);
		
		System.out.println("Largest value is: " + location.maxValue
				+ " at row[" + (location.row + 1) + "] column [" + (location.column + 1) + "]");

	}

}

	class Location{
	public int row = 0;
	public int column = 0;
	public double maxValue = 0;
	
	public static Location locateLargest(double[][] values) {
		Location loc = new Location();
		loc.maxValue = values[0][0];
		
		for(int r = 0; r < values.length; r++) {
			for(int c = 0; c < values[r].length; c++) {
				if(loc.maxValue < values[r][c]) {
					loc.maxValue = values[r][c];
					loc.row = r;
					loc.column = c;
				}
			}
		}
		
		return loc;
	}
}