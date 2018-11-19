// Write a function that prints out all the prime factors of a given number.
// prime factors are the smallest possible prime factors that composite the given number.

import java.util.Scanner;

public class primeFactorization {
	
	void factor(int n) {
		if(n%2 == 0) {
			System.out.print("2 ");
			factor(n/2);
		} else {
			for(int i = 3; i <= n; i += 2) {
				if(n%i == 0) {
					System.out.print(i + " ");
					factor(n/i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		primeFactorization prime = new primeFactorization();
		
		while(n >= 0) {
			n = input.nextInt();
			
			prime.factor(n);
			System.out.println();
		}
		
		System.out.println("GOODBYE");
		input.close();

	}

}
