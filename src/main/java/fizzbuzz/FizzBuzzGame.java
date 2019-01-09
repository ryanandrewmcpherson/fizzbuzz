package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzGame {

	public static void main(String[] args) {

		boolean replay = true;

		while (replay) {

			System.out.println("Welcome to FizzBuzz!");
			System.out.println("FizzBuzz is a Guessing Game.");
			System.out.println("Please Enter a positive Number to Begin:");
			Scanner input = new Scanner(System.in);
			int seedNumber = input.nextInt();
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

			while (!isFizzBuzz) {
				int numEntered = 0;
				if (input.hasNextInt()) {
					numEntered = input.nextInt();
					FizzBuzz fizzBuzzGame = new FizzBuzz();
					System.out.println(fizzBuzzGame.fizzBuzz(numEntered, fizzValue, buzzValue));
					if (fizzBuzzGame.fizzBuzz(numEntered, fizzValue, buzzValue).equals("FizzBuzz!")) {
						isFizzBuzz = true;
					}
				} else if (input.hasNext() && input.next().equalsIgnoreCase("q")) {
					System.exit(0);
				} else {
					System.out.print("Please Enter a Valid Guess or Press Q to quit!");
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
