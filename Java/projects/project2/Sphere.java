package src.com.csc205.projects.project2;

public class Sphere extends Shape {

	private double radius;
	/**
	 * Creating a constructor that takes parameters
	 * 
	 */
	public Sphere()
	{
		this(0);
	}
	/**
	 * Creating a constructor taking in radius 
	 * @param radius Radius of a Sphere
	 */
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	/**
	 * Gives volume of Sphere
	 * @return 4 / 3 * PI * radius Cubed
	 */
	public double volume()
	{
		return ((4/3)*Math.PI)*Math.pow(radius, 3);
	}
	/**
	 * Gives surface area of a sphere
	 * @return 4 * PI * radius Squared
	 */
	public double surfaceArea()
	{
		return 4* Math.PI * Math.pow(radius, 2);
	}
	/**
	 * ToString Class for Sphere
	 * @return StringBuilder
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sphere [radius=");
		builder.append(radius);
		return builder.toString();
	}

}
