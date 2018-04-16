package src.com.csc205.projects.project4;


/**
 * Example output...
 * <pre>
 * Project 4:
 * Power Tests:
 * 1^1 = 1     	1^2 = 1     	1^3 = 1     	1^4 = 1     	1^5 = 1
 * 2^1 = 2     	2^2 = 4     	2^3 = 8     	2^4 = 16    	2^5 = 32
 * 3^1 = 3     	3^2 = 9     	3^3 = 27    	3^4 = 81    	3^5 = 243
 * 4^1 = 4     	4^2 = 16    	4^3 = 64    	4^4 = 256   	4^5 = 1024
 * 5^1 = 5     	5^2 = 25    	5^3 = 125   	5^4 = 625   	5^5 = 3125
 * 6^1 = 6     	6^2 = 36    	6^3 = 216   	6^4 = 1296  	6^5 = 7776
 * 7^1 = 7     	7^2 = 49    	7^3 = 343   	7^4 = 2401  	7^5 = 16807
 * 8^1 = 8     	8^2 = 64    	8^3 = 512   	8^4 = 4096  	8^5 = 32768
 * 9^1 = 9     	9^2 = 81    	9^3 = 729   	9^4 = 6561  	9^5 = 59049
 *
 *
 * Ackerman Tests:
 * Ackerman (1,1) = 3  	Ackerman (1,2) = 4  	Ackerman (1,3) = 5  	Ackerman (1,4) = 6
 * Ackerman (2,1) = 5  	Ackerman (2,2) = 7  	Ackerman (2,3) = 9  	Ackerman (2,4) = 11
 * Ackerman (3,1) = 13 	Ackerman (3,2) = 29 	Ackerman (3,3) = 61 	Ackerman (3,4) = 125
 *
 *
 * Odd Tests:
 * Odd (1) = 1 	    Odd (2) = 3 	Odd (3) = 5 	Odd (4) = 7 	Odd (5) = 9
 * Odd (6) = 11	    Odd (7) = 13	Odd (8) = 15	Odd (9) = 17	Odd (10) = 19
 * Odd (11) = 21	Odd (12) = 23	Odd (13) = 25	Odd (14) = 27	Odd (15) = 29
 * Odd (16) = 31	Odd (17) = 33	Odd (18) = 35	Odd (19) = 37	Odd (20) = 39
 * </pre>
 * <pre>
 * Project 4:
Power Tests:
1^1 = 1     	1^2 = 1     	1^3 = 1     	1^4 = 1     	1^5 = 1     	
2^1 = 2     	2^2 = 4     	2^3 = 8     	2^4 = 16    	2^5 = 32    	
3^1 = 3     	3^2 = 9     	3^3 = 27    	3^4 = 81    	3^5 = 243   	
4^1 = 4     	4^2 = 16    	4^3 = 64    	4^4 = 256   	4^5 = 1024  	
5^1 = 5     	5^2 = 25    	5^3 = 125   	5^4 = 625   	5^5 = 3125  	
6^1 = 6     	6^2 = 36    	6^3 = 216   	6^4 = 1296  	6^5 = 7776  	
7^1 = 7     	7^2 = 49    	7^3 = 343   	7^4 = 2401  	7^5 = 16807 	
8^1 = 8     	8^2 = 64    	8^3 = 512   	8^4 = 4096  	8^5 = 32768 	
9^1 = 9     	9^2 = 81    	9^3 = 729   	9^4 = 6561  	9^5 = 59049 	


Ackerman Tests:
Ackerman (1,1) = 3  	Ackerman (1,2) = 4  	Ackerman (1,3) = 5  	Ackerman (1,4) = 6  	
Ackerman (2,1) = 5  	Ackerman (2,2) = 7  	Ackerman (2,3) = 9  	Ackerman (2,4) = 11 	
Ackerman (3,1) = 13 	Ackerman (3,2) = 29 	Ackerman (3,3) = 61 	Ackerman (3,4) = 125	


Odd Tests:
Odd (1) = 1 	Odd (2) = 3 	Odd (3) = 5 	Odd (4) = 7 	Odd (5) = 9 	
Odd (6) = 11	Odd (7) = 13	Odd (8) = 15	Odd (9) = 17	Odd (10) = 19	
Odd (11) = 21	Odd (12) = 23	Odd (13) = 25	Odd (14) = 27	Odd (15) = 29	
Odd (16) = 31	Odd (17) = 33	Odd (18) = 35	Odd (19) = 37	Odd (20) = 39
 * </pre>
 * @author Shelby King
 */
public class Project4 {

    public static void main(String[] args) {

        System.out.println("Project 4:");
        System.out.println("Power Tests:");
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y <= 5; y++) {
                String value = x + "^" + y + " = " + Recursion.power(x, y);
                System.out.print(padRight(value, 12) + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\nAckerman Tests:");
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 4; y++) {
                String value = "Ackerman (" + x + "," + y + ") = " + Recursion.ack(x, y);
                System.out.print(padRight(value, 20) + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\nOdd Tests:");
        for (int x = 1; x <= 20; x++) {
            String value = "Odd (" + x + ") = " + Recursion.odd(x);
            System.out.print(padRight(value, 12) + "\t");
            if (x % 5 == 0) {
                System.out.println();
            }
        }

    }
    

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

}
