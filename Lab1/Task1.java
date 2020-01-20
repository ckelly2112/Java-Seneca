/*
 * Lab: 1
 * Student Name: Christopher Kelly
 * Student ID : 134358183
 * Date: 17/01/2020 
*/
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get User input
		System.out.print("Enter Year (eg. 2010): ");
		int year = sc.nextInt();
		
		System.out.print("Enter Month 1-12: ");
		int month = sc.nextInt();
		
		while(month > 12 || month < 1) {
			System.out.print("Please only enter an interger between 1-12");
			month = sc.nextInt();
		}
		
		//Check for Jan-Feb
		if (month == 1 || month == 2) {
			month += 12;
			--year;
		}
		
		System.out.print("Enter the day of the month 1-31: ");
		int day = sc.nextInt();
		if (day > 31 || day < 1) {
			System.out.print("Please only enter an interger between 1-31");
			day = sc.nextInt();
		}
		
		int century = year / 100;
		int yearOfCentury = year % 100;
		
		int h = (day + ((26 * (month + 1)) / 10) + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
		
		String dayOfWeek = " ";
		//Get day of the week name
		switch(h) {
		case(0):
			dayOfWeek = "Saturday";
			break;
		case(1):
			dayOfWeek = "Sunday";
			break;
		case(2):
			dayOfWeek = "Sunday";
			break;
		case(3):
			dayOfWeek = "Sunday";
			break;
		case(4):
			dayOfWeek = "Sunday";
			break;
		case(5):
			dayOfWeek = "Sunday";
			break;
		case(6):
			dayOfWeek = "Sunday";
			break;
		default:
			System.out.println("Day of the week not valid!");
		}
		
		
		System.out.println("Day of the week is " + dayOfWeek);

	}

}
