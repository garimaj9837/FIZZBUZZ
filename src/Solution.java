
public class Solution {
public static void main(String arg[]) {
	
	for(int i=1;i<=100;i++) {
		
		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz");
		} else if(i%3==0){
			System.out.println("Fizz");
		} else if(i%5==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(i);
		}
	}
}
public String play(int i) {
		if(i%3==0 && i%5==0) {
			return "FizzBuzz";
		} else if(i%3==0){
			return "Fizz";
		} else if(i%5==0) {
			return "Buzz";
		}else {
			return String.valueOf(i);
		}
	}
}

