/*
 * Lab: 1
 * Student Name: Christopher Kelly
 * Student ID : 134358183
 * Date: 17/01/2020 
*/
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get Values from the user
		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();
		while (loanAmount < 1) {
			System.out.print("Please enter an amount greater than 1: ");
			loanAmount = sc.nextDouble();
		}
		
		System.out.print("Number of Years: ");
		int numberOfYears = sc.nextInt();
		while (numberOfYears < 1) {
			System.out.print("Please enter an amount greater than 1: ");
			numberOfYears = sc.nextInt();
		}
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = sc.nextDouble();
		while (annualInterestRate < .01 || annualInterestRate > 100) {
			System.out.print("Please enter an amount between 0.01 - 100: ");
			annualInterestRate = sc.nextDouble();
		}
		//Calculate monthly interest and monthly payments
		double monthlyInterest = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, numberOfYears * 12));
		
		System.out.printf("\n\tMonthly Payment is %.2f\n", monthlyPayment);
		System.out.printf("\tTotal Payment is %.2f\n\n", monthlyPayment * 12 * numberOfYears);
		
		//Create Table payment table
		double interest, principal, balance = loanAmount;
		System.out.println("Payment#	Interest	Principal	Balance");
		System.out.println("");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterest * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
		}
	}

}
