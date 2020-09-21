import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	Solution solution =new Solution();

@Test
public void testNumber1() {
	int num=1;
	String returnedNumber=solution.play(num);
	assertEquals("1", returnedNumber);
	
}
@Test
public void testNumber2() {
	int num=2;
	String returnedNumber=solution.play(num);
	assertEquals("2", returnedNumber);
}
@Test
public void testFizz() {
	int num=6;
	String returnedNumber=solution.play(num);
	assertEquals("Fizz", returnedNumber);
}
@Test
public void testBuzz() {
	int num=10;
	String returnedNumber=solution.play(num);
	assertEquals("Buzz", returnedNumber);
}
@Test
public void testFizzBuzz() {
	int num=30;
	String returnedNumber=solution.play(num);
	assertEquals("FizzBuzz", returnedNumber);
}
}
