package src.com.csc205.projects.project5;
/**
 * Interface to create a layout and API for MyBag.
 * @author Shelby King
 *
 * @param <T>
 */
public interface Bag<T> extends Iterable<T> {
	public boolean isEmpty();

	public int size();

	public void add(T item);
}
