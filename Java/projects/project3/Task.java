package src.com.csc205.projects.project3;

public abstract class Task implements  PrioritizedTask{

	int priority;
	/** getter
	 * @return priority returns the priority of the task
	 */
	public int getPriority() {
		return priority;
		
	}
	/**
	 * Setter
	 * @param priority sets the priority of the task
	 */
	public void setPriority(int priority) {
		this.priority = priority;
		
	}
	/**
	 * Creating a excute function for polymorphism.
	 */
	public abstract void executeTask();
	

}
