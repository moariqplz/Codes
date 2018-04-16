package src.com.csc205.projects.project3;

public interface PrioritizedTask {
	/**
	 * Creating a interface for polymorphism
	 * Get Priority is created to set the priority of tasks
	 * @return Returns the priority of the task
	 */
	abstract int getPriority();
	/**
	 * Setting the priority of the task
	 * @param value takes Priority
	 */
	abstract void setPriority(int value);
}
