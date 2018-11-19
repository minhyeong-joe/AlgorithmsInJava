// Design a program to print out all fibonacci sequence up to Nth term.
// fibonacci sequence begins with 1, 1 followed by the sum of two previous terms.
// ex) 1 1 2 3 5 8 13 21 34 55 ...

import java.util.Scanner;

public class FibonacciSequence {
	
	public static void main(String[] args) {
		
		int n = 0;
		Scanner input = new Scanner(System.in);
		while (n >= 0) {
			n = input.nextInt();
			printFibonacci(n);			
		}
		input.close();
		System.out.println("GOODBYE.");
	}
	
	public static void printFibonacci(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}
		System.out.println("");
	}
	
	// return Nth fibonacci number.
	public static int fib(int n) {
		if(n == 1) {
			return 1;
		} else if(n == 0) {
			return 0;
		} else {
			return fib(n-2) + fib(n-1);
		}
	}
}
