package hackerrank.queueandstack;

public class Stack<T> {

	private static class Node<T>{
		T data;
		Node<T> next;
		private Node(T data){
			this.data = data;
		}
	}

	private Node<T> top;

	public boolean isEmpty(){
		return top == null;
	}

	public T peek(){
		T data = top.data;
		return data;
	}

	public void push(T data){
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public T pop(){
		T data = null;
		if(top != null){
			data = top.data;
			top = top.next;
		}
		return data;
	}
}
