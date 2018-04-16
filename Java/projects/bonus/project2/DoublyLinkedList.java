package src.com.csc205.projects.bonus.project2;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> implements LinkedList<E> {
	public enum Iteration{FORWARD, REVERSE};
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	private Iteration direction = Iteration.FORWARD;
	
	/**
	 * Sets the type of iteration whether forward or backwards
	 */
	public void setIteration(Iteration i) {

		direction = i;

	}
	/**
	 * Returns the direction of the iteration
	 * @return Direction
	 */
	public Iteration getIteration() {

		return direction;

	}

	@Override
	/**
	 * Adds to the first of the list by passing in data
	 */
	public void addFirst(E e) {

		// Step 1 and 2
		Node<E> newNode = new Node<>(e);

		if (!isEmpty()) {
			newNode.next = this.head;
			this.head = newNode;
			this.head.prev = newNode.next;
			this.head.prev = tail;
		} else {
			this.head = newNode;
			this.tail = newNode;
			this.head.next = null;
		}

		this.size++;
	}
	/**
	 * Adds to the back of the list by passing in data
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
	 * Gets the first elements and returns it
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
	 * Gets last element and returns it
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
	 * checks first element
	 */
	@Override
	public E first() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		return this.head.element;
	}
	/**
	 * Chesks last element
	 */
	@Override
	public E last() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}

		return this.tail.element;
	}
	/**
	 * checks if it is empty
	 */
	@Override
	public boolean isEmpty() {

		return (this.size == 0);
	}
	/**
	 * checks size
	 */
	@Override
	public int size() {

		return this.size;
	}
	/**
	 * Creats a node
	 * @author shelby King
	 *
	 * @param <E1>
	 */
	private static class Node<E1> {
		// private because only singly linked list can use it
		Node<E1> next;
		Node<E1> prev;
		E1 element;

		Node(E1 e) {
			this.element = e;
		}
	}
	/**
	 * using iterator to go through the list
	 */
	public Iterator<E> iterator() {

		if (this.getIteration() == Iteration.FORWARD) {
			
			return new LinkedListIterator<E>(this.head);
			
		} else {
			
			return new ReverseLinkedListIterator<E>(this.tail);
			
		}
	}
	/**
	 * Uses reverse iterators so starts from the back
	 * @author Shelby King
	 *
	 * @param <E>
	 */
	private class ReverseLinkedListIterator<E> implements Iterator<E> {

		private Node<E> current;

		public ReverseLinkedListIterator(Node<E> start) {
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
			current = current.prev;

			return ret;
		}
	}
/**
 * Iterates through the front of the list
 * @author Shelby King
 *
 * @param <E>
 */
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
