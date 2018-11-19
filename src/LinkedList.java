// Given a singly-linked node, write a function to find the nth-to-last element of the list.

import java.util.Scanner;

public class LinkedList {
	
	private static class Node {
		private int value;
		private Node next;
		
		public Node(int v, Node n) {
			value = v;
			next = n;
		}
	}
	
	private static Node helperPtr;
	private static Node nthToLast;
	
	public static Node findNthToLastNode(Node node, int n) {
		helperPtr = node;
		nthToLast = node;
		for(int i = 0; i < n; i++) {
			helperPtr = helperPtr.next;
			if(helperPtr == null)
				return null;
		}
		while(helperPtr.next != null) {
			helperPtr = helperPtr.next;
			nthToLast = nthToLast.next;
		}
		return nthToLast;
	}

	public static void main(String[] args) {
		// create some nodes
		Node n1 = new Node(5, null);
		Node n2 = new Node(3, null);
		Node n3 = new Node(7, null);
		Node n4 = new Node(6, null);
		Node n5 = new Node(4, null);
		Node n6 = new Node(8, null);
		// link the nodes
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		//display linked list
		System.out.printf("%d ", n1.value);
		System.out.printf("%d ", n2.value);
		System.out.printf("%d ", n3.value);
		System.out.printf("%d ", n4.value);
		System.out.printf("%d ", n5.value);
		System.out.printf("%d\n", n6.value);
		
		// test
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		Node target = findNthToLastNode(n1, n);
		
		if(target != null)
			System.out.println(target.value);
		else
			System.out.println("Out of Bound");
		
		input.close();

	}

}
