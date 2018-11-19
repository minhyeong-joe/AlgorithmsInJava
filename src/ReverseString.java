import java.util.Stack;

// Write functions using iterative, recursive, and stack approaches to reverse the given string.
// Ex. Given "Hello" -> "olleH"

public class ReverseString {
	
	// iterative approach
	public String iterativeReverse(String str) {
		String reversed = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
	
	// recursive approach
	public String recursiveReverse(String str) {
		if(str.length() == 0) {
			return "";
		} else {
			return str.charAt(str.length() - 1) + recursiveReverse(str.substring(0, str.length()-1));
		}
	}
	
	// Stack approach
	public String stackReverse(String str) {
		Stack<Character> stack = new Stack<>();
		String reversed = "";
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			reversed += stack.pop();
		}
		return reversed;
	}

	public static void main(String[] args) {
		
		String testStr = "This is a test string";
		String reversed = "";
		ReverseString tester = new ReverseString();
		// iterative approach test
		reversed = tester.iterativeReverse(testStr);
		System.out.println(reversed);
		// recursive approach test
		reversed = "";
		reversed = tester.recursiveReverse(testStr);
		System.out.println(reversed);
		// stack approach test
		reversed = "";
		reversed = tester.stackReverse(testStr);
		System.out.println(reversed);
			
	}

}
