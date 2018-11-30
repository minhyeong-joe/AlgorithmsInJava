package reverseLinkedList;

public class ReverseLinkedList {
	
	private static class Node {
		int value;
		Node next;
		
		Node(int v) {
			value = v;
			next = null;
		}
	}
	
	static Node reverse(Node head) {
		if(head.next != null) {
			Node follower = head;
			Node current = head.next;
			while(current.next != null) {
				follower = current;
				current = current.next;
			}
			Node newHead = current;
			while(current != head) {
				while(follower.next != current) {
					follower = follower.next;
				}
				current.next = follower;
				current = follower;
				follower = head;
			}
			head.next = null;
			return newHead;
		} else {
			return head;
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node ptr = n1;
		while(ptr != null) {
			if(ptr.next == null)
				System.out.println(ptr.value);
			else
				System.out.print(ptr.value + " ");
				ptr = ptr.next;
		}
		
		ptr = reverse(n1);
		while(ptr != null) {
			if(ptr.next == null)
				System.out.println(ptr.value);
			else
				System.out.print(ptr.value + " ");
				ptr = ptr.next;
		}
		
		
	}

}
