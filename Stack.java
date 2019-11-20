/**
 * class Stack consists of a class
 * that pushes words in a Stack and 
 * pops words out from a Stack. These 
 * words are specified by the 
 * ArrayBasedDataStructuresDriver.
 * In addition, this class also has various other 
 * methods such as (resize, equals, isEmpty,
 * toString,size). 
 * 
 * @author (Sambhavi Pandey)
 * @version (Last modified April 20, 2018)
 */
public class Stack {
	// Declaring instance variables
	private Object array[];
	private int topOfStack;

	/**
	 * A Stack constructor that takes no arguments.
	 */
	public Stack() {
		// Initializing
		array = new Object[100];
		topOfStack = 0;
	}

	/**
	 * push is a void method that takes an argument
	 * corresponding to the Object class. The purpose
	 * of this method is to to enter values into a Stack.
	 * 
	 * @param o
	 */
	public void push(Object o) {
		//System.out.println("Pushing");
		array[topOfStack] = o;
		topOfStack++;
	}

	/**
	 * pop is a method that takes no arguments and 
	 * returns a value corresponding to the Object class. 
	 * The purpose of this method is to remove values out 
	 * of the stack.
	 */
	public Object pop() {
		return array[--topOfStack];
	}

	/**
	 * size is a method that returns an int value. 
	 * The purpose of this method is to determine
	 *  the size of the Stack.
	 */
	public int size() {
		return topOfStack;
	}
	
	/**
	 * isEmpty method is a method of type boolean. 
	 * The purpose of this method is to determine 
	 * if the Stack is empty.
	 */
	public boolean isEmpty() {
		return topOfStack == 0;
	}
	/**
	 * equals method is a method that takes 
	 * an argument corresponding to the Object class and 
	 * returns a value of type boolean. The purpose
	 * of this method is to check if both Stack 
	 * objects contain the same elements.
	 * 
	 * @param other
	 */
	public boolean equals(Object other) {
	    if((other == null) || !(other instanceof Stack)) {
			return false;
		} else {
			return this.toString().equals(other.toString());
		}
	}
	/**
	 * resize method is void and takes no arguments. The 
	 * purpose of this method is to resize the array.
	 */
	private void resize() {
		//increases the size of the array by doubling it
		Object [] newArray = new Object [array.length * 2];
		//copies the old array into the new array
		System.arraycopy(array,0,newArray,0,array.length);
		array = newArray;
}
	/**
	 * toString method is a method that returns a String value. 
	 * The purpose of this method is to print the values of the
	 * Object.
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < topOfStack; i++) {
			s = s + array[i] + "";
		}
		return "Original word: " + s;
	}
}