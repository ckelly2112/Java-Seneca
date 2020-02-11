package Lab3;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
import java.util.*;
public class Task2 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter numbers seperated by a space: ");
		
		String nums = input.nextLine();
		String[] arr = nums.split(" ");
		
	
		int[] iArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			try {
			iArr[i] = Integer.parseInt(arr[i]);
			}
			catch(Exception e) {
				iArr[i] = 0;
			}
		}
		System.out.println(getRandom(iArr));
		
		
	}
	
	public static int getRandom(int... numbers) {
		
		int index = (int)(Math.random() * numbers.length);
		
		int num = numbers[index];
		
		return num;
	}

}
