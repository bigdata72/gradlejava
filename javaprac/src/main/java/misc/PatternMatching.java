package misc;

import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("teststr*ng",
				"teststrrng"));
		System.out.println (Pattern.matches("geeksforge*ks",
				"geeksforgeeks"));
	}
}
