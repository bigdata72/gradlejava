package hackerrank.queueandstack;

public class Queue<T> {

	private Node<T> head; // remove from here
	private Node<T> tail; // add here

	public boolean isEmpty(){
		return head == null;
	}

	public void add(T data){
		Node node = new Node(data);
		if(tail != null){
			tail.next = node;
		}
		tail = node;
		// special case when queue is empty
		if(head == null){
			head = node;
		}
	}

	public T peek(){
		return head.data;
	}

	public T remove(){
		T data = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return data;
	}

	private static class Node<T>{
		private T data;
		private Node next;
		private Node(T data){
			this.data = data;
		}
	}
}
