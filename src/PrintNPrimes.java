// given a number N, print out all prime numbers up to N.
// Using Sieve of Eratosthenes

public class PrintNPrimes {
	
	public void findPrimes(int n) {
		boolean[] arr = new boolean[n-1];
		for(int i = 0; i < n-1; i++) {
			arr[i] = true;
		}
		
		for(int i = 0; i < n-1; i++) {
			int iValue = i + 2;
			for(int j = i+1; j < n-1; j++) {
				int jValue = j + 2;
				if(jValue % iValue == 0) {
					arr[j] = false;
				}
			}
		}
		
		// print out indices that are true.
		for(int i = 0; i < n-1; i++) {
			if(arr[i]) {
				System.out.printf("%d ", i+2);
			}
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		PrintNPrimes tester = new PrintNPrimes();
		tester.findPrimes(1000);

	}

}
