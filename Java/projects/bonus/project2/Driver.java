package src.com.csc205.projects.bonus.project2;

public class Driver {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addFirst(1);
		list.addFirst(2);
		
		System.out.println(list.first());
		System.out.println(list.getFirst());
		
		list.getFirst();
		//list.getFirst();
		
		list.addLast(3);
		System.out.println(list.first());

	}

}
