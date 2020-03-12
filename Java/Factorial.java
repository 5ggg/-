import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		
		System.out.println("Please fill in the ending number you need");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		
	    for (int counter = 0; counter <= t; counter++){
	        System.out.printf("%d! = %d\n", counter,
	        factorial(counter));
	    }
	    }
	    public static long factorial(long number) {
	        if (number <= 1)
	            return 1;
	        else
	            return number * factorial(number - 1);
	    }
}
