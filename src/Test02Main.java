import java.util.ArrayList;

import com.github.temarez.test02.utils.Utils;

public class Test02Main {
	
	public static void main(String[] args) {
		ArrayList<String> testStrings = new ArrayList<String>();
		testStrings.add("1221");
		testStrings.add("1121");
		testStrings.add("TENET");
		testStrings.add("Eye");
		testStrings.add("did");
		testStrings.add("not");
		
		for(String curString : testStrings) {
			System.out.println(curString + " " + Utils.isPalindromeEfficient(curString));
		}
	}
	
}
