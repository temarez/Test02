import java.util.ArrayList;

import com.github.temarez.test02.Utils;

public class Test02Main {
	
	public static void main(String[] args) {
		ArrayList<String> testStrings = new ArrayList<String>();
		testStrings.add("1221");
		testStrings.add("1121");
		testStrings.add("TENET");
		
		for(String curString : testStrings) {
			System.out.println(curString + " " + Utils.isPalindrome1(curString));
		}
	}
	
}
