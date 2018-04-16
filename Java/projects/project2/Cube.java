package src.com.csc205.projects.project2;

public class Cube extends Shape{
	
	private double width;
	/**
	 * Constructor for Cube Class(Generic)
	 */
	public Cube()
	{
		this(0);
	}
	/**
	 * Constructor for Cube Class(Passing Width)
	 * @param width Width of the Cube
	 */
	public Cube(double width)
	{
		this.width = width;
	}
	/**
	 * Created to get volume of a cube
	 * @return Returns width(of cube) Cubed
	 */
	public double volume()
	{
		return Math.pow(width, 3);
	}
	/**
	 * Returns the surface area of a cube
	 * @return Returns 6* width squared 
	 */
	public double surfaceArea()
	{
		return 6* Math.pow(width, 2);
	}
	/**
	 * Printing out the Width of the cube.
	 * @return Returns the toString method
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cube [width=");
		builder.append(width);
		return builder.toString();
	}

		
}
