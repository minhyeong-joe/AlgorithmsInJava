// write a function to check if a word is a palindrome
// palindrome: a word, phrase, or sequence that reads the same backward as forward

import java.util.Scanner;

public class PalindromeCheck {
	
	public boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length()-1;
		while(right > left) {
			if(word.charAt(left) != word.charAt(right)) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		
		PalindromeCheck checker = new PalindromeCheck();
		if (checker.isPalindrome(userInput))
			System.out.printf("'%s' is a palindrome.\n", userInput);
		else
			System.out.printf("'%s' is not a palindrome.\n", userInput);
		
		input.close();
		
	}

}
