/**
 * class ArrayList consists of a class
 * that inserts words in an ArrayList and 
 * removes words from an ArrayList. These 
 * words are specified by the 
 * ArrayBasedDataStructuresDriver.
 * In addition, this class also has various other 
 * methods such as (resize, equals, isEmpty,
 * toString,indexOf).  
 * 
 * @author (Sambhavi Pandey)
 * @version (Last modified April 20, 2018)
 */
public class ArrayList {
	//Declaring instance variables
	Object[] array;
	private int numberOfElements;
	
	/**
	 * An ArrayList constructor that takes no arguments.
	 * It's purpose is to initialize the instance
	 * variables. 
	 */
	public ArrayList() {
		// Initializing
		array = new Object[100];
		numberOfElements = 0;
	}
	/**
	 * insert method is a void method that takes
	 * two arguments, one of type Object and one of 
	 * type int. The purpose of this method is to 
	 * add an object at the specified index. 
	 * 
	 * @param o
	 * @param index
	 */
	public void insert(Object o, int index) {
		if (index > numberOfElements) {
			System.out.println("Index Out of Bounds");
		}
		//Resizes array 
		if (o != null) {
			if (index == numberOfElements) {
				resize();
			}
            //It copies values to an array
			System.arraycopy(array, index, array, 
					         index + 1, array.length - 1 - index);
			array[index] = o;
			numberOfElements++;
		}
		else {
			System.out.println("Not valid");
		}
	}
	/**
	 * remove method is a method that takes an int 
	 * argument and returns a value of type Object.
	 * The purpose of this method is to remove and 
	 * return the object at a specified index.
	 */
	public Object remove(int index) {
        //Checks if the index is greater than the 
		//number of elements in array
		if (index >= numberOfElements) {
			System.out.println("Index Out of Bounds");
			return null;
		}
        //Passing element from array at index to a new 
		//Object type
		Object obj = array[index];
		numberOfElements--;
        //It copies values to an array
		System.arraycopy(array, index + 1, 
				        array, index, numberOfElements - index);
		return obj;
	}
	/**
	 * size method is a method that takes no arguments and 
	 * returns a value of type int. The purpose of this method 
	 * is to check the size of the ArrayList. 
	 */
	public int size() {

		return numberOfElements;
	}
	/**
	 * isEmpty is a method that takes no arguments and 
	 * returns a value of type boolean. The purpose of 
	 * this method is to check if the ArrayList is empty.
	 */
	public boolean isEmpty() {
		for (int i = 0; i < numberOfElements; i++) {
			if (array[i] != null) {
				return false;
			}
		}
		return true;
	}
	/**
	 * indexOf is a method that takes an argument 
	 * corresponding to the Object class and returns
	 * an int value. The purpose of this method is 
	 * to determine the index of the object and 
	 * return -1 if the index is not found.
	 * 
	 * @param o
	 */
	public int indexOf(Object o) {
		int index = -1;
		for (int i = 0; i < numberOfElements; i++) {
			if (array[i].equals(o)) {
				index = i;
			}
		}
		return index;
	}
	/**
	 * equals is a method that takes an argument of the 
	 * Object class and returns a boolean value. The purpose 
	 * of this method is to compare sizes and elements in the
	 * data structure.
	 * 
	 * @param obj
	 */
	public boolean equals(Object o) {
		boolean check = false;
		if ((o != null) && (o instanceof ArrayList == true)) {
			ArrayList object = (ArrayList) o;
			if (this.array.length == object.array.length) {
				for (int i = 0; i < numberOfElements; i++) {
					if (this.array[i].equals(object.array[i])) {
						check = true;
					} else {
						check = false;
						break;
					}
				}
			}
		}
		return check;
	}
	/**
	 * get is a method that takes an int value and 
	 * returns a value of type Object. The purpose 
	 * of this method is to return the object at the 
	 * specified index. 
	 * 
	 * @param index
	 */
	public Object get(int index) {
		if (index > numberOfElements) {
			System.out.println("Index Out of Bounds");
			return null;
		}
		return array[index];
	}

	private void resize() {

		// increases the size of the array by doubling it
		Object[] arr = new Object[array.length * 2];
		// copies the old array into the new array
		System.arraycopy(array, 0, arr, 0, array.length);
		array = arr;
	}
	/**
	 * toString is a method that takes no arguments 
	 * and returns a value of type String. The purpose of 
	 * this method is to print the output.
	 */
	public String toString() {
		String s = "";
		//prints array
		for (int i = 0; i < numberOfElements; i++) {
			if (array[i] == null) {
				continue;
			}
			//if it is the last element then array is printed
			else if (i == (numberOfElements - 1)) {
				s = s + array[i];
			}
			//if it is not the last element of the array
			else {
				s = s + array[i] + " ";
			}
		}
		return s;
	}
}