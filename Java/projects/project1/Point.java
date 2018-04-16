package src.com.csc205.projects.project1;
/**
 * 
 * <h1>
 * Point Class
 * </h1>
 *<p>
 *In this project I am creating a way that you can set points and you can shift them, rotate them,
 *and compare the distance of different points
 *</p>
 *<p>
 *
 *Possible ideas for improvement would be to create a grid to show each point and then would print
 *out a idea of what your graph would look like.
 *</p>
 * 
 * @author Shelby King 1/25/2018
 *
 */


public class Point {
	
	private double x;
	private double y;
	/**
	 * Constructor setting values to zero
	 */
	public Point() 
	{
		this.x = 0;
		this.y = 0;
	}
	/**
	 * Constructor with Params for X and Y for user to set
	 * @param x X Value
	 * @param y Y Value
	 */
	public Point(double x, double y) 
	{
		this.x = x;
		this.y = y;	
	}
	/**
	 * Gives you X value
	 * @return Returning X 
	 */
	public double getX() 
	{
		return x;
		
	}
	/**
	 * Gives you Y Value
	 * @return Returning Y
	 */
	public double getY() 
	{
		return y;	
	}
	/**
	 * Setting x Value
	 * @param x X Value
	 */
	public void setX(double x) 
	{
		this.x = x;
	}
	/**
	 * Setting y Value
	 * @param y Y Value
	 */
	public void setY(double y) 
	{
		this.y = y;
	}
	/**
	 * Shifting X value
	 * @param n Number of Shifts
	 */
	public void shiftX(double n) 
	{
		this.x += n;
	}
	/**
	 * Shifting Y Value
	 * @param n Number of shifts
	 */
	public void shiftY(double n) 
	{
		this.y += n;
	}
	/**
	 * Setting Points
	 * @param x X Value
	 * @param y Y Value
	 */
	public void setPoint(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}
	/**
	 * Creating a distance check to return the distance from both points
	 * @param p2 Second Point
	 * @return Returning the distance Number
	 */
	public double distance(Point p2)
	{
		return Math.sqrt((Math.pow((p2.x - this.x),2) + Math.pow((p2.y - this.y),2)));	
	}
	/**
	 * Rotating the angle of value by using the rotate forumla
	 * @param angle Angle of shift
	 */
	public void rotate(double angle) 
	{
		double tempX = this.x;
		double tempY = this.y;
		
		this.x = (tempX * Math.cos(angle)) - (tempY * Math.sin(angle));
		this.y = (tempX * Math.sin(angle)) + (tempY *Math.cos(angle));
	}
	/**
	 * ToString method using String Builder.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

}
//