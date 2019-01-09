package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

//	@Test
//	public void shouldReturnDreamBiggerWhenUserEnters1() {
//
//		FizzBuzz underTest = new FizzBuzz();
//		String Output = "" + underTest.fizzBuzz(1);
//		assertEquals("Dream Bigger!", Output);
//	}
//
//	@Test
//	public void shouldReturnDreamBiggerAnd2WhenUserEnters2() {
//
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(2);
//		assertEquals("Dream Bigger!", Output);
//	}
//
//	@Test
//	public void shouldReturnFizzWhenUserEnters3() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(3);
//		assertEquals("Fizz!", Output);
//	}
//
//	@Test
//	public void shouldReturnBuzzWhenUserEnters5() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(5);
//		assertEquals("Buzz!", Output);
//
//	}
//
//	@Test
//	public void shouldReturnFizzFizzWhenUserEnters6() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(6);
//		assertEquals("Fizz!Fizz!", Output);
//	}
//
//	@Test
//	public void shouldReturnBuzzBuzzWhenUserEnters10() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(10);
//		assertEquals("Buzz!Buzz!", Output);
//	}
//
//	@Test
//	public void shouldReturnFizzBuzzWhenUserEnters15() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(15);
//		assertEquals("FizzBuzz!", Output);
//	}
//	
//	@Test
//	public void shouldReturnFizzBuzzFizzBuzzWhenUserEnters30() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(30);
//		assertEquals("FizzBuzz!FizzBuzz!",Output);
//	}
//	
//	@Test
//	public void shouldReturnFizzBuzzFizzWhenUserEnters18() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(18);
//		assertEquals("FizzBuzz!Fizz!",Output);
//	}
//	@Test
//	public void shouldReturnFizzBuzzFizz1RemainingWhenUserEnters19() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(19);
//		assertEquals("FizzBuzz!Fizz!... 1 Remaining!",Output);
//	}
//	public void shouldReturnFizz1RemainingWhenUserEnters4() {
//		FizzBuzz undertest = new FizzBuzz();
//		String Output = "" + undertest.fizzBuzz(4);
//		assertEquals("Fizz!... 1 Remaining!",Output);
//	}
	@Test
	public void shouldReturnBuzzBuzzFizzRemainingWhenUserEnters19() {
		FizzBuzz undertest = new FizzBuzz();
		int fizzValue = 5;
		int buzzValue = 7;
		int numEntered = 19;
		String Output = undertest.fizzBuzz(numEntered,fizzValue,buzzValue);
		assertEquals("Buzz!Buzz!Fizz!", Output);
	}
	@Test
	public void shouldReturnFizzBuzzFizz1RemainingWhenUserEnters87() {
		FizzBuzz undertest = new FizzBuzz();
		int fizzValue = 5;
		int buzzValue = 10;
		int numEntered = 87;
		String Output = undertest.fizzBuzz(numEntered,fizzValue,buzzValue);
		assertEquals("FizzBuzz!Buzz!Buzz!Buzz!Fizz! ... 2 Remaining!", Output);
	}
}
