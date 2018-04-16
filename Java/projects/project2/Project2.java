package src.com.csc205.projects.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 * <p>
 * Do NOT modify this driver.  Use as-is.
 * Use the example output as a guide to implement your classes and methods.
 * <p>
 * Example output...
 *
 * <pre>
 * Sphere{radius=10.0}
 * Cube{width=10.0}
 * Cylinder{radius=2.0, height=5.0}
 *
 * Sphere
 * Surface Area: 1256.6370614359173
 * Volume: 4188.790204786391
 *
 * Cube
 * Surface Area: 600.0
 * Volume: 1000.0
 *
 * Cylinder
 * Surface Area: 87.96459430051421
 * Volume: 62.83185307179586
 * </pre>
 * <p>
 * Paste your output here...
 * <pre>
 * Sphere [radius=10.0
 * Cube [width=10.0
 * Cylinder [radius=2.0, height=5.0
 *
 * Sphere
 * Surface Area: 1256.6370614359173
 * Volume: 3141.592653589793
 *
 * Cube
 * Surface Area: 600.0
 * Volume: 1000.0
 *
 * Cylinder
 * Surface Area: 87.96459430051421
 * Volume: 62.83185307179586
 * </pre>
 */
public class Project2 {

    public static void main(String[] args) {

        Shape sphere = new Sphere(10.0);
        Shape cube = new Cube(10.0);
        Shape cylinder = new Cylinder(2.0, 5.0);

        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach((s) -> {

            System.out.println();
            System.out.println(s.getClass().getSimpleName());
            System.out.println("Surface Area: " + s.surfaceArea());
            System.out.println("Volume: " + s.volume());

        });
        


    }

}
