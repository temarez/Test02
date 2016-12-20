package com.github.temarez.test02.utils;

public class Utils {

	/** Lazy implementation of palindrome checking */
	public static boolean isPalindromeLazy(String str) {
		String reverseStr = new StringBuilder(str).reverse().toString();
		return str.equals(reverseStr);
	}

	/** Efficient implementation of palindrome checking */
	public static boolean isPalindromeEfficient(String str) {
		try {
			for (int index = 0; index < (str.length() / 2) + 1; ++index) {
				if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
					return false;
				}
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.err.println(str);
			return false;
		}

		return true;
	}

}
