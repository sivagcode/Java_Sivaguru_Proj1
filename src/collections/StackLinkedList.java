package collections;

public class StackLinkedList {
	Node head;

	//Create an inner-class with value and next for the node
	class Node{
		int value;
		Node next;	
	}
	
	StackLinkedList(){
		//head = null;
	}
	
public void push (int value) {
	
//assigning null value from the head to the extranode.
		Node extraHead = head;  
//The statement below will Instantiate/create object-ref for Node and it creates 1st node when this method called 1st time and subsequent nodes will get created based on the no. of times this method is called. The head points to the node.
		head = new Node();
//assigning the value/data to the node
		head.value = value;
//assigning the value/data to the next from the extrahead which is Null for the 1st time and the value in the temp.next will get updated when new node created and data is pushed one by one  
		head.next = extraHead;
		
}

public int pop() {
	
	if(head==null) {
		System.out.println("The stack is empty");
	}
	
	int returnvalue = head.value;
	head = head.next;
	return returnvalue;

}

public void printStack() {
	while(head !=null) {
		System.out.print(head.value + "-->");
		head = head.next; 
	}
}

	public static void main(String[] args) {
		StackLinkedList sll = new StackLinkedList();
		try {
			//System.out.println(sll.pop());
			sll.push(10);
			sll.push(20);
			sll.push(30);
			sll.push(40);
			sll.push(50);
			System.out.println(sll.pop());
			System.out.println(sll.pop());
			sll.printStack();
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}

}
