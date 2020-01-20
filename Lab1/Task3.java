/*
 * Lab: 1
 * Student Name: Christopher Kelly
 * Student ID : 134358183
 * Date: 17/01/2020 
*/
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//Create Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Scissors (0), Rock (1), Paper (2): ");
		
		//get player selection
		int selection = sc.nextInt();
		while (selection > 2 || selection < 0) {
			System.out.print("Not a valid selection. Please type 0, 1, 2: ");
			selection = sc.nextInt();
		}
		
		//Get computer selection
		int random = (int)(Math.random() * 3);
		
		String playerChoice = "";
		String computerChoice = "";
		String message = "";
		
		//Switch case for player
		//Includes message for win/loss/draw
		switch(selection) {
		case(0):
			playerChoice = "Scissors";
			if(random == 2)
				message = "You win!";
			else
				message = "You Lose!";
		break;
		case(1):
			playerChoice = "Rock";
		if(random == 0)
			message = "You win!";
		else
			message = "You Lose!";
		break;
		case(2):
			playerChoice = "Paper";
		if(random == 1)
			message = "You win!";
		else
			message = "You Lose!";
		break;
		default:
			System.out.println("Invalid Selection!");
		}
		
		//Show computer selection
		switch (random) {
		case(0):
			computerChoice = "Scissors";
		break;
		case(1):
			computerChoice = "Rock";
		break;
		case(2):
			computerChoice = "Paper";
		break;
		default:
			System.out.println("Invalid Selection!");
		}
		
		//Change message to draw
		if (selection == random)
			message = "You Draw!";
		
		System.out.printf("The computer is %s. You are %s. %s", computerChoice, playerChoice, message);
	}

}
