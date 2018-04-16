package src.com.csc205.projects.project2;

public class Cylinder extends Shape {

	private double radius;
	private double height;
	/**
	 * Constructor (Taking no parameters
	 * setting Radius and Height
	 */
	public Cylinder()
	{
		this(0,0);
	}
	/**
	 * Constructor taking radius, height
	 * @param radius Radius of the class Cylinder
	 * @param height Height of the class Cylinder
	 */
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	/**
	 * Finding the Volume for the Cylinder
	 * @return PI * Radius Squared * Height
	 */
	public double volume()
	{
		return Math.PI*Math.pow(radius, 2)* height;
	}
	/**
	 * Finding the surface area for the Cylinder
	 * @return 2 * PI * Radius * Height + 2 * PI * Radius Squared
	 */
	public double surfaceArea()
	{
		return (2*Math.PI*radius*height) + 2*Math.PI*Math.pow(radius, 2);
	}
	/**
	 * Creating to string method for Cylinder
	 * @return returns StringBuilder for class
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cylinder [radius=");
		builder.append(radius);
		builder.append(", height=");
		builder.append(height);
		return builder.toString();
	}

}
