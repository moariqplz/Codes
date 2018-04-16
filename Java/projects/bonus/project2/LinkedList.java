package src.com.csc205.projects.bonus.project2;

import java.util.Iterator;

public interface LinkedList<E> extends Iterable<E> {
	
	void addFirst(E e);
	void addLast(E e);
	E getFirst();
	E getLast();
	E first();
	E last();
	boolean isEmpty();
	int size();
	
}
