package src.com.csc205.projects.project6;

import java.util.Scanner;

public class Project6Sample {
/**
 * Created By Shelby King
 * 
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = "";
		
		while (!line.equalsIgnoreCase("y")) {
			System.out.print("Enter a line of text (y to quit): ");
			line = scan.nextLine();
			
			if (!line.equalsIgnoreCase("y")) {
			Project6.changeIt(line);
			}
			
		}
		
	}	

}
	

