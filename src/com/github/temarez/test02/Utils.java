package com.github.temarez.test02;

public class Utils {

	public static boolean isPalindrome1(String str) {
		String reverseStr = new StringBuilder(str).reverse().toString();
		return str.equals(reverseStr);
	}

	public static boolean isPalindrome2(String str) {
		for (int index = 0; index < (str.length() / 2) + 1; ++index) {
			if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
				return false;
			}
		}
		return true;
	}

}
