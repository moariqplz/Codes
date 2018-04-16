package src.com.csc205.projects.bonus.project2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements LinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	/**
	 * Adds element to the front using data
	 */
	@Override
	public void addFirst(E e) {

		// Step 1 and 2
		Node<E> newNode = new Node<>(e);

		if (!isEmpty()) {
			newNode.next = this.head;
			this.head = newNode;
		} else {
			this.head = this.tail = newNode;
			this.head.next = null;
		}

		this.size++;
	}
	/**
	 * Adds an element to back of the list using data
	 */
	@Override
	public void addLast(E e) {
		// Pretty much the opposite of addFirst
		Node<E> newNode = new Node<>(e);

		if (!isEmpty()) {
			this.tail.next = newNode;
			this.tail = newNode;
		} else {
			this.tail = this.head = newNode;
			this.tail.next = null;
		}

		this.size++;

	}
	/**
	 * Gets the first element and removes it
	 */
	@Override
	public E getFirst() {
		// (is empty) is a corner case/happens on one or two occasions
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}

		E returnValue = this.head.element;

		this.head = this.head.next;
		this.size--;

		if (isEmpty()) {
			this.tail = null;

		}

		if (this.size == 1) {
			this.tail = this.head;
		}

		return returnValue;
	}
	/**
	 * Gets last element and removes it
	 */
	@Override
	public E getLast() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}

		E returnValue = this.tail.element;

		if (this.size == 1) {
			return getFirst();
		} else {
			Node<E> newLast = this.head;
			while (newLast.next != this.tail) {
				newLast = newLast.next;
			}

			this.tail = newLast;
			this.tail.next = null;

			this.size--;

		}

		return returnValue;
	}
	/**
	 * gets first element but does not remove it
	 */
	@Override
	public E first() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		return this.head.element;
	}
	/**
	 * Gets last element but does not remove it
	 */
	@Override
	public E last() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}

		return this.tail.element;
	}
	/**
	 * Checks if it is empty
	 */
	@Override
	public boolean isEmpty() {

		return (this.size == 0);
	}
	/**
	 * Checks the size of the list
	 */
	@Override
	public int size() {

		return this.size;
	}
/**
 * Creates a node
 * @author Shelby King
 *
 * @param <E1>
 */
	private static class Node<E1> {
		// private because only singly linked list can use it
		Node<E1> next;
		E1 element;

		Node(E1 e) {
			this.element = e;
		}
	}
	/**
	 * Creates a iterator to go from the front of the list towards the back
	 */
	public Iterator<E> iterator() {
		return new LinkedListIterator<E>(this.head);
	}
	
	private class LinkedListIterator<E> implements Iterator<E> {
		
		private Node<E> current;
		
		public LinkedListIterator(Node<E> start) {
			this.current = start;
		}

		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			
			if (!hasNext()) {
				throw new NoSuchElementException("No more elements");
			}
			
			E ret = current.element;
			current = current.next;
			
			return ret;
		}
		
	}

}