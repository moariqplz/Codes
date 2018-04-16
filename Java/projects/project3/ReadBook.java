package src.com.csc205.projects.project3;

public class ReadBook extends Task implements PrioritizedTask {

	/**
	 * New Function to show transition
	 * Prints "Browsing Library..."
	 */
	public void browseLibrary() {
		System.out.println("Browsing library...");
		
	}

	/**
	 * Overriding ExcuteTask from Task
	 * Printing out "Reading book..."
	 */
	public void executeTask() {
		System.out.println("Reading book...");
		
	}
}
