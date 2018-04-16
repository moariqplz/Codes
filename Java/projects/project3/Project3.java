package src.com.csc205.projects.project3;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates using abstract classes with interfaces.
 * <p>
 * Do NOT change this driver.
 * <p>
 * Output should look like...
 * <pre>
 *   Doing homework...
 *   Mowing lawn...
 *   Browsing library...
 *   Reading book...
 * </pre>
 * <p>
 * Output after Coding Project
 * </p>
 * <pre>
 * Doing homework...
 * Mowing lawn...
 * Browsing library...
 * Reading book...
 * </pre>
 * @author Shelby King
 */
public class Project3 {

    public static void main(String[] args) {

        PrioritizedTask homework = new DoHomework();
        PrioritizedTask mowLawn = new MowLawn();
        PrioritizedTask readBook = new ReadBook();

        List<PrioritizedTask> tasks = new ArrayList<>();

        tasks.add(homework);
        tasks.add(mowLawn);
        tasks.add(readBook);

        for (PrioritizedTask task : tasks) {
            if (task instanceof ReadBook) {
                ((ReadBook) task).browseLibrary(); // narrowing cast
            }
            ((Task) task).executeTask();  // polymorphic method call using narrowing cast
        }

    }
}
