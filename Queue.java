/**
 * class Queue consists of a class
 * that uses enqueue and dequeue to 
 * add and remove words from a Queue.
 * These words are specified by the 
 * ArrayBasedDataStructuresDriver.
 * In addition, this class also has various other 
 * methods such as (resize, equals, isEmpty,
 * toString,size). 
 * 
 * @author (Sambhavi Pandey)
 * @version (Last modified April 20, 2018)
 */
public class Queue {
	// Declaring instance variables
	private Object array[];
	private int front;
	private int back;

	/**
	 * A Queue constructor that takes no arguments.
	 * It's purpose is to initialize the instance 
	 * variables. 
	 */
	public Queue() {
		// Initializing
		array = new Object[100];
		front = 0;
		back = 0;
	}
	/**
     * enqueue is a void method that takes an argument 
     * corresponding to the Object class. The purpose 
     * of this method is to add to the back of the Queue.
     * 
     * @param o
     */
	public void enqueue(Object o) {
		//back++;
		array[back] = o;
		back++;
	}
	/**
     * pop is a method that takes no arguments 
     * and returns a value of type Object. The 
     * purpose of this method is to remove from the 
     * back of the Queue.
     */
	public Object dequeue() {	
		return (array[front++]);
	}
	/**
     * size is a method that takes no arguments 
     * and returns a value of type int. The purpose
     * of this method is to determine the size of
     * the Queue. 
     */
	public int size() {
		return back - front;
	}
	/**
     * equals method is a method that takes an 
     * argument corresponding to the Object class 
     * and returns a value of type boolean. The 
     * purpose of this method is to check if
     * values of both object array are the same. 
     * 
     * @ param other
     */
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Queue)) {
			return false;
		} else {
			return this.toString().equals(other.toString());
		}
	}
	/**
     * isEmpty method takes no arguments and 
     * returns a value of type boolean. The 
     * purpose of this method is to check if
     * the Queue is empty or not.
     */
	public boolean isEmpty() {
		return front == back;
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
     * toString is a method that takes no arguments 
     * and returns a value of type String. The purpose
     * of this method is to print the output.
     */
	public String toString() {
		String s = new String();
		for (int i = front; i <  back; i++) {
			s = s + array[i] ;
		}
		return s;
	}
}