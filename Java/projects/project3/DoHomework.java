package src.com.csc205.projects.project3;

public class DoHomework extends Task implements PrioritizedTask{

	/**
	 * Overriding ExcuteTask from Task
	 * Printing out "Doing Homework..."
	 */
	@Override
	public void executeTask() {
		System.out.println("Doing homework...");
		
	}



}
