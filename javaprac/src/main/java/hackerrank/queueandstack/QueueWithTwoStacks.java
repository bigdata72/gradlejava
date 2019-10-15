package hackerrank.queueandstack;

import java.util.Stack;

public class QueueWithTwoStacks {

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(10);
		queue.enqueue(12);
		queue.enqueue(14);
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
	}

	static class MyQueue<T>{
		private Stack<T> stackNewestOnTop = new Stack<>();
		private Stack<T> stackOldestOnTop = new Stack<>();

		public void enqueue(T value){
			// Add item
			stackNewestOnTop.push(value);
		}

		public T peek(){
			// get oldest
			shiftStacks();
			return stackOldestOnTop.peek();
		}

		private void shiftStacks(){
			if(stackOldestOnTop.isEmpty()){
				while(!stackNewestOnTop.isEmpty()){
					stackOldestOnTop.push(stackNewestOnTop.pop());
				}
			}
		}

		public T dequeue(){
			// get oldest and remove
			shiftStacks();
			return stackOldestOnTop.pop();
		}
	}
}
