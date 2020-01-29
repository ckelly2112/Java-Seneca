package Lab2;
//Student Name: Christopher Kelly
//Student Number: 134358183
import java.util.*;
public class Task1 {
	static final int MAX_GUESS = 5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean reset = false;
		int miss = 0;
		
		do {
			//Resets variables
			miss = 0;
			reset = false;
			//Gets secret word
			char[] answer = getAnswer();
			
			
			//Resets hidden word to all asterisks
			char[] hiddenWord = new char[answer.length];
			for (int i = 0; i < answer.length; i++)
				hiddenWord[i] = '*';
			
			do {
				System.out.print("(Guess) Enter a letter in word ");
				System.out.print(hiddenWord);
				System.out.print(" > ");
				//Get the guess and change the character to lowercase
				char guess = input.next().toLowerCase().charAt(0);
				if(!correctGuess(answer, hiddenWord, guess)) {
					miss++;
					System.out.println(guess + " is not in the word! You have " + (MAX_GUESS - miss) + " tries left");
				}
				
				
			} while(!gameComplete(miss, hiddenWord));
		
			System.out.println("You finished the game with " + miss + " misses");
			System.out.print("Would you like to play again (y or n): ");
			char response = input.next().charAt(0);
			
			if(response == 'y' || response == 'Y') {
				System.out.println("Great Choice! Resetting game...");
				reset = true;
			} else {
				System.out.println("Thanks for playing! Goodbye!");
			}
			
			
		} while(reset == true);
	}

	//Word List
	public static char[] getAnswer() {
		
		String[] words = {"luck", "duck", "tuck", "hello", "blue", "green", "later", "write", "that", "smart", "talk", "monkey"};
		String randomWord = words[(int)(Math.random() * words.length)];
		
		char[] answer = new char[randomWord.length()];
		
		for(int i = 0; i < randomWord.length(); i++)
			answer[i] = randomWord.charAt(i);
		
		return answer;
	}
	
	public static boolean correctGuess(char[] word, char[] hiddenWord, char guess) {
		boolean correct = false;
		for (int i = 0; i < word.length; i++) {
			if(word[i] == guess) {
				correct = true;
				if(hiddenWord[i] == guess) {
					System.out.println(guess + " is already in the word. Try again!");
				}
				else {
					hiddenWord[i] = guess;
				}
			}
		}
		
		return correct;
	}

	public static boolean gameComplete(int miss, char[] hiddenWord) {
		boolean complete = false;
		int lettersRemaining = 0;
		//Check for misses
		if(miss == MAX_GUESS) {
			System.out.println("You made too many mistakes! Game over!");
			complete = true;
		}
		//Check for complete word
		if(complete == false) {
			for (int i = 0; i < hiddenWord.length; i++) {
				if(hiddenWord[i] == '*') {
					lettersRemaining++;
				}
			}
			if(lettersRemaining == 0) {
				System.out.print("You win! The word was ");
				System.out.println(hiddenWord);
				complete = true;
				
			}
		}
		
		return complete;
	}
}
