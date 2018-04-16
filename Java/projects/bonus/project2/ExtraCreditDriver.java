package src.com.csc205.projects.bonus.project2;

import java.util.Iterator;

/**
 * Driver for the extra credit assignment.  Pay attention to the comments in the code for hints on how to complete
 * the DoublyLinkedList class.  Clear the errors in the driver in order to complete the assignment.  DO NOT CHANGE
 * ANY CODE IN THIS DRIVER.  It should work as-is.
 * <p>
 * Your output should be as follows to get full credit for the assignment.  If you don't complete the challenge
 * section, you may comment out the challenge section.
 * <p>
 * Output with challenge section complete.
 * <p>
 * <pre>
 *    1 2 3 4 5 6
 *    1 2 3 4 5 6
 *    6 5 4 3 2 1
 *    3 4
 *    3 4
 *    3 4
 * </pre>
 * <p>
 * Output if you comment out challenge.
 * <p>
 * <pre>
 *    1 2 3 4 5 6
 *    1 2 3 4 5 6
 *    6
 *    3 4
 *    3 4
 *    3 4
 * </pre>
 */

public class ExtraCreditDriver {

    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {

    	
        LinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        /*
        Will work if your iterator is working correctly - default behavior of iterator is FORWARD
         */
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        /*
        Your forward iterator must work for this section to work using explicit iterator
         */
        Iterator<Integer> forwardIterator = list.iterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();
    /*
        Start Challenge Section

        Look up examples of inner enums for the next line of code to work.  Pay attention to the syntax of how it's
        used to determine how it's defined.
        Modify your iterator() method to test for the state of iteration to get the second line to work properly.
        Assume all setters are using standard naming conventions for field names.
        */
        
       ((DoublyLinkedList) list).setIteration(DoublyLinkedList.Iteration.REVERSE);
        Iterator<Integer> reverseIterator = list.iterator();

        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
        System.out.println();

        ((DoublyLinkedList) list).setIteration(DoublyLinkedList.Iteration.FORWARD);

        // End Challenge Section
       
        // Tests getLast and getFirst methods...
        list.getLast();
        list.getLast();
        list.getFirst();
        list.getFirst();

        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Tests first and last methods...
        System.out.print(list.first() + " ");
        System.out.println(list.last() + " ");

        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
