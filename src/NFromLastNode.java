package nthFromLastNode;

public class NFromLastNode {
	
	static class Node {
		int value;
		Node next;
		
		Node(int v) {
			value = v;
			next = null;
		}
	}
	
	static Node findNthFromLast(Node head, int n) {
		if(head.next != null) {
			Node helper = head;
			Node follower = head;
			for(int i = 1; i < n; i++) {
				if(helper.next != null)
					helper = helper.next;
				else 
					return null;
			}
			while(helper.next != null) {
				helper = helper.next;
				follower = follower.next;
			}
			return follower;
		} else if (head.next == null && n == 1)
			return head;
		else
			return null;
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node ptr = findNthFromLast(n1,3);
		if(ptr != null)
			System.out.println(ptr.value);
		else
			System.out.println("Invalid parameters");

	}

}
