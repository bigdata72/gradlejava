package hackerrank.linkedlist;

public class BasicSingleLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Create a new LinkedList with nodes 10, 5 and 12");
		list.append(10);
		list.append(5);
		list.append(12);
		System.out.print("LinkedList created : ");
		list.printNodes();

		// finding the middle of the linked list.
		System.out.println("The middle node is with odd number of nodes = "+list.getMiddle());
		System.out.println("----");

		// prepend node
		System.out.println("prepend one node with value 7");
		list.prepend(7);
		System.out.println("LinkedList after prepend:");
		list.printNodes();

		System.out.println("The middle node now with even number of nodes = "+list.getMiddle());
		System.out.println("----");


		// remove a node
		System.out.println("delete a node with value 5");
		list.deleteWithValue(5);
		list.printNodes();

	}
}

class Node {
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	private Node head;

	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		// go to end and add the node
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void prepend(int data){
		Node newHead = new Node(data);
		// the old head will now be the next node of the newly added node.
		newHead.next = head;
		// the new node will now be the head
		head = newHead;
	}

	public void deleteWithValue(int data){
		if(head == null) return;

		if(head.data == data){// deleting the head
			head = head.next;
			return;
		}

		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public Node getHead(){
		return this.head;
	}

	public void printNodes(){
		Node current = head;
		System.out.print("[");
		while(current!=null){
			if(current.next!=null)
				System.out.print(current.data+"-");
			else
				System.out.println(current.data+"]");
			current = current.next;
		}
		System.out.println("-----");
	}

	/**
	 * 1. Find middle element using two pointer technique.
	 * Take two pointers i.e. fast and slow. Start both pointers from head.
	 * Fast pointer will move double the slow pointer each time till it reaches end.
	 * As soon as fast pointer reaches end , our slow pointer will be on the middle element.
	 * @return
	 */
	public int getMiddle(){
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}


}

/**
 * Given a singly linked list of N nodes. The task is to find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.
 * If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 *
 * Input:
 * First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains data of nodes of linked list.
 *
 * Output:
 * For each testcase, there will be a single line of output containing data of middle element of linked list.
 *
 * User Task:
 * The task is to complete the function getMiddle() which takes head reference as the only argument and should return the data at the middle node of linked list.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 100
 *
 * Example:
 * Input:
 * 2
 * 5
 * 1 2 3 4 5
 * 6
 * 2 4 6 7 5 1
 *
 * Output:
 * 3
 * 7
 */


