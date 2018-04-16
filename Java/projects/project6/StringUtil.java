package src.com.csc205.projects.project6;

import java.util.Stack;

public class StringUtil {

	public static void main(String[] args) {

		// Are we not drawn onward to new era
		String testString = "Are we not drawn onward to new era?:*";
		System.out.println(stripSpaces(testString));
		System.out.println(upperCase(testString));
		System.out.println(lowerCase(testString));
		System.out.println(stripPunctuation(testString));

	}

	public static String stripSpaces(String s) {
		return s.replaceAll("\\s+", "");
	}
	
	public static String upperCase(String s) {
		return s.toUpperCase();
	}
	
	public static String lowerCase(String s) {
		return s.toLowerCase();
	}
	
	public static String stripNonAlpha(String s) {
		return s.replaceAll("\\W+", ""); 
	}
	
	/**
	 * Strips all kinds of stuff.
	 * 
	 * @param s
	 * @return
	 */
	public static String stripPunctuation(String s) {
		return s.replaceAll("[.,<>?';:\"\\]\\[{}!@#$%^&*()_+-=]+", ""); 
	}

}
