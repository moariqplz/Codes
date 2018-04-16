package src.com.csc205.projects.project4;

public class Recursion {

	/**
	 * Creating a power method using Recursion
	 * @param value Value of the number
	 * @param power Power you want it to be  
	 * @return Returns the number to whatever power
	 */
	public static int power(int value, int power)
	{
		if(power == 0)
		{
			return 1;
		}
		else
		{
			return value* power(value, power - 1);
		}
	}
	/**
	 * Ackermann Function created using recursion 
	 * @param m 
	 * @param n
	 * @return Ackermann outputs
	 */
	public static int ack(int m, int n)
	{
		if(m == 0){
			return n + 1;	
		}
		else if(m >= 1)
		{
			if(n == 0)
			{
				return ack(m -1, 1);
			}
			else
			{
				return ack(m - 1, ack(m, n - 1));
			}
		}
		return n;
	
	}
	/**
	 *Chceks the odd value and call the second Odd Function  
	 * @param value 
	 * @return returns odd
	 */
	public static int odd(int value)
	{
		return odd(1, value);
	}
	/**
	 * gives next odd number
	 * @param m
	 * @param n
	 * @return returns odd function
	 */
	private static int odd(int m, int n)
	{
		if(m == (2*n - 1))
			{
			return m;
			}
		else
		{
			return odd(m + 2, n);
		}
	}
}
