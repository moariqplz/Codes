package src.com.csc205.projects.project6;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Project6 {
	/**
	 * REverses the string by sending it to a stack and queue.
	 * @param s creates a string.
	 */
	public static void changeIt(String s) {
		
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		String str = s.replaceAll("[.,<>?';:\"\\]\\[{}!@#$%^&*()_+-=]+", "").toLowerCase();
		String reverse = "";
		
		if (isPalindrome(s)) {
			
			System.out.println("That is a Palindrome");
			
		}
		
		else if (!isPalindrome(s)) {
			
			for (int x = 0; x < str.length(); x++) {
				stack.push(str.charAt(x));
			}
			
			while (!stack.isEmpty()) {
				queue.add(stack.pop());
			}
			
			while (!queue.isEmpty()) {
				reverse += queue.remove();
			}
			
			System.out.println("This is not a Palindrome");
			System.out.println("This is the reverse order: " + reverse);
			
		}
		
	}
	/**
	 * Checks if it is a palindrome
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		StringUtil SU = new StringUtil();
		String str = "";
		String reverse = "";
			str = s.replaceAll("[ .,<>?';:\"\\]\\[{}!@#$%^&*()_+-=]+", "").toLowerCase();
		
		for (int x = 0; x < str.length(); x++) {
			stack.push(str.charAt(x));
		}
		
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		while (!queue.isEmpty()) {
			reverse += queue.remove();
		}
		
		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
		
	}

}
