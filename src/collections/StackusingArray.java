package collections;

public class StackusingArray {
	int size;
	int arr[];
	int top;
	
//Create constructor
	StackusingArray(int size){
		this.size = size;
		this.arr = new int [size];
		this.top = -1;
		
	}

// The time complexity is O(1) since there is no for loop or more than one iteration.
	
	//To check whether stack is empty or not. The boolean will return true if empty otherwise return false.
	public boolean isEmpty() {
		return (top == -1);
	}
	
//To check whether stack is full or not 
	public boolean isFull() {
		return (size-1 == top);
				//size of the array is 7 for stack with 6 blocks
	}

//Create push to enter/store the value in the stack.
	public void push(int element) {
		if (!isFull()) {
			top++;
			arr [top] = element;
			System.out.println("Pushing the elements from bottom to top index: " + element);
		}
		else {
			System.out.println("Stack is full");
			
		}
	}
	
//Create pop to remove the value from the stack
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("popped element from the top to bottom of the stack using array index: " + arr[returnedTop]);
			return arr[returnedTop];
		}
		else{
			System.out.println("The stack is full");
			return -1; //since it's a int method we need to return int value
			
		}
	}
	
// Create Peek to get the value from the stack
	public  int peek() {
		if (!isEmpty()) {
			return arr [top]; // get the value from the top of the stack using array and return it
		}
		else {
			System.out.println("Stack is empty");
			return -1; //since it's a int method we need to return int value
		}
	}
	public static void main(String[] args) {
		StackusingArray stackuseArray =  new StackusingArray(10);
		stackuseArray.pop();
		
		System.out.println("------------------");
		
		stackuseArray.push(100);
		stackuseArray.push(200);
		stackuseArray.push(300);
		stackuseArray.push(400);
		
		System.out.println("------------------");
		System.out.println(stackuseArray.peek());
		
		stackuseArray.pop();
		stackuseArray.pop();
		
		System.out.println("Status of empty: " +stackuseArray.isEmpty());
		System.out.println("Status of Full: " +stackuseArray.isFull());
		

	}
	

}
