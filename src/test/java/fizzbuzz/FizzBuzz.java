package fizzbuzz;


public class FizzBuzz {

	public String fizzBuzz(int numEntered, int fizzValue, int buzzValue) {
		String fizzer = "";
		String buzzer = "";
		String fizzBuzzer = "";
		int fizzBuzzValue = fizzValue * buzzValue;

		if (numEntered >= fizzBuzzValue) {
			for (int fizzBuzzCounter = 0; fizzBuzzCounter < numEntered / fizzBuzzValue; fizzBuzzCounter++) {
				fizzBuzzer += "FizzBuzz!";
			}
		}
		if ( numEntered%buzzValue == 0 || (numEntered >= buzzValue && numEntered%fizzValue!=0)) {
			int buzzCounterStop = 0;
			if (fizzBuzzer.length() == 0) {
				buzzCounterStop = numEntered / buzzValue;
			} else {
				buzzCounterStop = numEntered % fizzBuzzValue / buzzValue;
			}
			for (int buzzCounter = 0; buzzCounter < buzzCounterStop; buzzCounter++) {
				buzzer += "Buzz!";
			}
		}
		if (numEntered >= fizzValue || numEntered >= buzzValue) {
			int fizzCounterStop = 0;
			String numRemaining = "";
			if (fizzBuzzer.length() == 0 && buzzer.length() == 0) {
				fizzCounterStop = numEntered / fizzValue;
				numRemaining = numEntered % fizzValue + "";
			} else if (fizzBuzzer.length() == 0 && buzzer.length() != 0) {
				fizzCounterStop = numEntered % buzzValue / fizzValue;
				numRemaining = numEntered % buzzValue % fizzValue + "";
			} else if (fizzBuzzer.length() != 0 && buzzer.length() == 0) {
				fizzCounterStop = numEntered % fizzBuzzValue / fizzValue;
				numRemaining = numEntered % fizzBuzzValue % fizzValue + "";
			} else {
				fizzCounterStop = numEntered % fizzBuzzValue % buzzValue / fizzValue;
				numRemaining = numEntered % fizzBuzzValue % fizzValue + "";
			}
			for (int fizzCounter = 0; fizzCounter < fizzCounterStop; fizzCounter++) {
				fizzer += "Fizz!";
			}
			if (numRemaining.equals("0")) {
				return fizzBuzzer + buzzer + fizzer;
			} else {
				return fizzBuzzer + buzzer + fizzer + " ... " + numRemaining + " Remaining!";	
			}
				
		}

		return "Dream Bigger!";
	}
}
