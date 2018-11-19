// Write a function to find a factorial to a given number
// using both iterative and recursive approach.

public class Factorial {

	public int recursiveFact(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * recursiveFact(n-1);
		}
	}
	
	public int iterativeFact(int n) {
		int factorial = 1;
		for(int i = n; i >= 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		
		Factorial test = new Factorial();
		
		final int TESTING_VAL = 5;
		
		System.out.println(test.recursiveFact(TESTING_VAL));
		System.out.println(test.iterativeFact(TESTING_VAL));

	}

}
