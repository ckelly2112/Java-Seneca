package Lab2;
//Student Name: Christopher Kelly
//Student Number: 134358183
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number below:");
		long creditCard = input.nextLong();
		
		System.out.println(creditCard + " is " + (isValid(creditCard) ? "valid" : "invalid"));

	}
	
	//Check if the card number is valid
	public static boolean isValid(long num) {
		
		return (numOfDigits(num) >= 13 && numOfDigits(num) <= 16) &&
				(isPrefix(num, 4) || isPrefix(num, 5) || isPrefix(num, 6) || isPrefix(num, 37)) &&
				((sumOfSingles(num) + oddSum(num)) % 10 == 0);
				
	}

	//Add all single digit numbers
	public static int sumOfSingles(long num) {
		int sum = 0;
		String value = String.valueOf(num);
		for (int i = value.length() - 2; i >= 0; i -= 2) {
			sum += digits(Character.getNumericValue(value.charAt(i)) * 2);
		}
		return sum;
	}
	
	//Multiply digits by 2 and either return sum of two digits or return the digit
	public static int digits(int value) {
		if (value < 9)
			return value;
		else
			return value / 10 + value % 10;
	}
	
	//Find the sum of odd numbers from right to left
	public static int oddSum(long num) {
		int sum = 0;
		String value = String.valueOf(num);
		for (int i = value.length() - 1; i >=0; i -= 2) {
			sum += Character.getNumericValue(value.charAt(i));
		}
		
		return sum;
	}
	
	public static boolean isPrefix(long num, int value) {
		
		return firstK(num, numOfDigits(value)) == value;
	}
	//Returns the number of digits
	public static int numOfDigits(long num) {
		return String.valueOf(num).length();
	}
	//Return first K numbers of number. If there are not enough digits return num
	public static long firstK(long num, int k) {
		String value = String.valueOf(num);
		if(value.length() > k) {
			return Long.parseLong(value.substring(0, k));
		}
		return num;
	}
}
