
import java.util.*;
// Shelby King
// Project 1
// Using Sublime 3 and CMD
public class Project
{
	public static void main(String[] arg)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Today we are going to work with control operators.");
		System.out.println("We are going to make a rectangle.");
		boolean again = true;
		while(again == true)
		{
			System.out.println("What do you want the height of the rectangle to be?");
			int height = reader.nextInt();
			System.out.println("What do you want the legnth of the rectangle to be ");
			int length = reader.nextInt();
			for(int j = 0; j < (height); j++) //printing out the square
			{
				if (j == 0 || j == (height - 1))
				{
					for (int k = 0; k < (length); k++)
					{
						System.out.print("*");

					}
					System.out.print("\n");
				}
				else
				{
					System.out.print("*");
					for (int k = 0; k < (length - 2); k++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.print("\n");
				}

			}
			System.out.println("Would you like to go again");
			System.out.println("1 if you would like to go agian 2 if you would like to stop ");
			int doAgain = reader.nextInt();
			if(doAgain == 1)
			{
				again = true;
			}
			else
			{
				again = false;
			}
		}
	}
}