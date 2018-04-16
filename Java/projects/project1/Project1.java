package src.com.csc205.projects.project1;

/**
 *  * <h1>
 * Point Project
 * </h1>
 * <h2>
 * Tester Class
 * </h2>
 * Driver class used to test Point implementation for Project 1.

 * <p>
 * Do NOT modify this driver.  Use as-is.
 * Use the example output as a guide to implement the Point class.
 * <p>
 * Example output...
 * <pre>
 * Project 1 : Point Tester
 *
 * Point 1: Point{x=3.0, y=0.0}
 * Point 2: Point{x=0.0, y=4.0}
 * Point 3: Point{x=0.0, y=0.0}
 *
 * Distance A to B: 5.0
 * Distance A to C: 3.0
 * Distance B to C: 4.0
 *
 * Rotated a 1.5707963267948966 radians: Point{x=1.8369701987210297E-16, y=3.0}
 * Shifted b 5.656854249492381 away from original position: Point{x=-4.0, y=0.0}
 *
 * Point 1: Point{x=1.8369701987210297E-16, y=3.0}
 * Point 2: Point{x=-4.0, y=0.0}
 * Point 3: Point{x=0.0, y=0.0}
 *
 * Distance A to B: 5.0
 * Distance A to C: 3.0
 * Distance B to C: 4.0
 * </pre>
 
 * <pre>
 *Project 1 : Point Tester
Point 1: Point [x=3.0, y=0.0]
Point 2: Point [x=0.0, y=4.0]
Point 3: Point [x=0.0, y=0.0]

Distance A to B: 5.0
Distance A to C: 3.0
Distance B to C: 4.0

Rotated a 1.5707963267948966 radians: Point [x=1.8369701987210297E-16, y=3.0]
Shifted b 5.656854249492381 away from original position: Point [x=-4.0, y=0.0]

Point 1: Point [x=1.8369701987210297E-16, y=3.0]
Point 2: Point [x=-4.0, y=0.0]
Point 3: Point [x=0.0, y=0.0]

Distance A to B: 5.0
Distance A to C: 3.0
Distance B to C: 4.0

 * </pre>
 *
 * @author Shelby King
 * @version 1.1
 */
public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 0.0);
        Point b = new Point();
        Point c = new Point();
        b.setPoint(0.0, 4.0);
        c.setX(0.0);
        c.setY(0.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);
        System.out.println("Point 3: " + c);
        System.out.println();
        System.out.println("Distance A to B: " + a.distance(b));
        System.out.println("Distance A to C: " + a.distance(c));
        System.out.println("Distance B to C: " + b.distance(c));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + " radians: " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(-4.0);
        b.shiftY(-4.0);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);
        System.out.println();
        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);
        System.out.println("Point 3: " + c);
        System.out.println();
        System.out.println("Distance A to B: " + a.distance(b));
        System.out.println("Distance A to C: " + a.distance(c));
        System.out.println("Distance B to C: " + b.distance(c));

    }
}
