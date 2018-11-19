// write a function to print out the next prime number after the given number N.

public class NextPrime {
	
	private boolean isPrime(int n) {
		if(n == 2)
			return true;
		if(n % 2 == 0 || n == 1)
			return false;
		else {
			for(int i = 3; i < n; i += 2) {
				if(n != i && n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public int nextPrime(int n) {
		for(int i = n + 1; i < 2 * n; i++) {
			if (isPrime(i)) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		NextPrime tester = new NextPrime();
		System.out.println(tester.nextPrime(61));
		
	}

}
