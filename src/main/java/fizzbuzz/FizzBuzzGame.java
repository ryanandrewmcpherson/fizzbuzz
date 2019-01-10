package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzGame {

	public static void main(String[] args) {

		boolean replay = true;

		while (replay) {

			System.out.println("Welcome to FizzBuzz!");
			System.out.println("FizzBuzz is a Guessing Game.");
			System.out.println("Please Enter a positive Number to Begin or Enter Q to quit:");
			Scanner input = new Scanner(System.in);
			int seedNumber = 0;
			int numInvalidResponses = 1;

			while (seedNumber == 0) {

				if (input.hasNextInt()) {
					seedNumber = input.nextInt();
					if (seedNumber < 0) {
						if (numInvalidResponses > 3) {
							System.out.println("Quit Messing Around!");
						}
						System.out.println("Please enter a  whole number value great than 0!");
						seedNumber = 0;
						numInvalidResponses++;
					}
				} else if (input.next().equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (!input.nextLine().equalsIgnoreCase("q")) {
					if (numInvalidResponses >= 3)
						System.out.println("Quit Messing Around!");
					System.out.println("Please enter a whole number value greater than 0!");
					numInvalidResponses++;
				}
			}
			int fizzValue = (int) (Math.random() * seedNumber + 1);
			int buzzValue = (int) (Math.random() * 2 * seedNumber + 1);
			boolean isFizzBuzz = false;
			System.out.println("Your number was used to generate two positive numbers.");
			System.out.println("The first number is beteween 1 and your number.");
			System.out.println("The second number is between 1 and two times your number.");
			System.out.println("You have to print FizzBuzz to win te game.");
			System.out.println("FizzBuzz somehow relates to the numbers!");
			System.out.println("The rest of the rules will be up to you to learn!");
			System.out.println("Please press enter after each guess!");
			System.out.println("Press Q to quit at any time!");
			System.out.println("You may start guessing now!");
			
			numInvalidResponses = 1;

			while (!isFizzBuzz) {
				int numEntered = 0;
				if (input.hasNextInt()) {
					numEntered = input.nextInt();
					if (numEntered < 0) {
						if (numInvalidResponses >= 3) {
							System.out.println("Quit Messing Around!");
						}
						System.out.println("Please enter a  whole number value great than 0!");
						seedNumber = 0;
						numInvalidResponses++;
						continue;
					}
					FizzBuzz fizzBuzzGame = new FizzBuzz();
					System.out.println(fizzBuzzGame.fizzBuzz(numEntered, fizzValue, buzzValue));
					if (fizzBuzzGame.fizzBuzz(numEntered, fizzValue, buzzValue).equals("FizzBuzz!")) {
						isFizzBuzz = true;
					}
				} else if (input.next().equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (!input.nextLine().equalsIgnoreCase("q")) {
					if (numInvalidResponses >= 3) {
						System.out.println("Quit Messing Around!");
					}
					System.out.println("Please Enter a Valid Guess or Press Q to quit!");
					numInvalidResponses++;
				}

			}

			System.out.println("Congratulations you have won the game!");

			System.out.println("Press Q to quite or any other key and enter to play again!");
			if (input.next().equalsIgnoreCase("q")) {
				input.close();
				replay = false;
				System.exit(0);
			}

		}

	}

}
