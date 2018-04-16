package src.com.csc205.projects.project5;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class MyBag<T> implements Bag<T>{

	int size = 0;
	List<T> bagIterator = new ArrayList<>();
	@Override
	/**
	 * Iterates through the bag array list
	 */
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return bagIterator.iterator();
	}
	/**
	 * Checks if list is empty using Size Function
	 */
	@Override
	public boolean isEmpty() {
		
		return size() != 0;
	}
	/**
	 * Checks size using size Variable
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	/**
	 * Adds to list using arrayList.Add Function
	 */
	@Override
	public void add(T item) {
		bagIterator.add(item);
		size++;
		
	}

}
