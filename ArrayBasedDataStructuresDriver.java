/**
 * class ArrayBasedDataStructuresDriver is a 
 * driver class to test the methods in 
 * the  ArrayList, Stack, and Queue class in 
 * order to ensure that they work properly.  
 * 
 * @author (Sambhavi Pandey)
 * @version (Last modified April 20, 2018)
 */
public class ArrayBasedDataStructuresDriver {
	/**
     * The main method executes the stackTests, 
     * queueTests, and arrayListTests methods 
     * to ensure that the ArrayList, Queue, and 
     * Stack classes are working properly.
     */
	public static void main(String[] args) {
		stackTests();
		queueTests();
		arrayListTests();
	}
	/**
     * arrayListTests method is void. The purpose
     * of this method is to test the methods in the 
     * ArrayList class to check if they are working
     * correctly. 
     */
	private static void arrayListTests() {
		System.out.println("Tests for ArrayList class: ");
        System.out.println("First test (using a object): ");
		System.out.println("Original word: Bat");
		ArrayList a = new ArrayList();
		a.insert('B', 0);
		a.insert('a', 0);
		a.insert('t', 1);
		System.out.println("Size is: " + a.size());
		System.out.println("Empty: " + a.isEmpty());
		System.out.println("Test for get method after inserting "
				            + "words in ArrayList. At index 2: " + 
				             a.get(2));
		System.out.println("Test for indexOf method " +
		                   "for 'a' in a object (after inserting "
		                   + "words in ArrayList): " 
				            + a.indexOf('a'));
		System.out.println();
		
		System.out.println("Second test (using b object): ");
		System.out.println("Original word: Summer");
		ArrayList b = new ArrayList();
		b.insert('S', 0);
		b.insert('u', 1);
		//b.insert(null, 1);
		b.insert('m', 2);
		//b.insert(null,3);
		b.insert('m', 3);
		b.insert('e', 4);
		b.insert('r', 5);
		System.out.println("Size is: " + b.size());
		System.out.println("Empty: " + b.isEmpty());
		System.out.println("Test for get method after inserting "
	                       + "words in ArrayList. At index 1: "  
	                       + b.get(1));
		System.out.println("Test for indexOf method " +
						   "for 'S' in a object (after inserting "
						   + "words in ArrayList): " 
						   + b.indexOf('S'));
		System.out.println();
		
		System.out.println("Third test (using c object): ");
		ArrayList c = new ArrayList();
		c.insert('H', 0);
		c.insert('e',1);
		c.insert('l',2);
		//c.insert(null,3);
		c.insert('l',3);
		c.insert('o', 4);
		System.out.println("Original word: " + c.toString());
		System.out.println("Size is: " + c.size());
		System.out.println("Empty: " + c.isEmpty());
		System.out.println("Test for get method after inserting "
	                        + "words in ArrayList. At index 4: " + 
	                        c.get(4));
         System.out.println("Test for indexOf method " +
        		 		    "for 'f' in a object (after inserting "
        		 		    + "words in ArrayList): " 
        		 		    + a.indexOf('f'));
		System.out.println();
		
		System.out.println("Equality test: ");
		System.out.println("a and b are equal: " + a.equals(b));
		System.out.println("b and c are equal:" + b.equals(c));
		System.out.println("a and c are equal: " + a.equals(c));
		System.out.println();
			 
		 System.out.println("From ArrayList a");
		 while (a.isEmpty() == false) {
			System.out.println(a.remove(0));
		}		
		 System.out.println("From ArrayList b");
		 while (b.isEmpty() == false) {
		    System.out.println(b.remove(0));
		}
		 System.out.println("From ArrayList c");
		  while (c.isEmpty() == false) {
		    System.out.println(c.remove(0));
		}	 
		 System.out.println();
	}
	/**
     * queueTests method is void. The purpose of this
     * method is to test the methods in the Queue class
     * to check if they are working correctly. 
     */
	private static void queueTests() {
		System.out.println("Tests for Queue class:");
		System.out.println("First test(using a object)");
		Queue a = new Queue();
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');

		System.out.println("Original word: " + a.toString());
		System.out.println("Size is: " + a.size());
		System.out.println("Empty: " + a.isEmpty());
		System.out.println();
		
		System.out.println("Second test(using b object)");
	    Queue b = new Queue();
	    b.enqueue('S');
	    b.enqueue('u');
	    b.enqueue('m');
	    //b.enqueue(null);
	    b.enqueue('m');
	    b.enqueue('e');
	    //b.enqueue(null);
	    b.enqueue('r');
	    System.out.println("Original word: " + b.toString());
		System.out.println("Size is: " + b.size());
		System.out.println("Empty: " + b.isEmpty());
		System.out.println();
	    
	    System.out.println("Third test(using c object)");
	    Queue c = new Queue();
	    c.enqueue('H');
	    c.enqueue('e');
	    c.enqueue('l');
	    c.enqueue('l');
	    c.enqueue('o');
	    System.out.println("Original word: " + c.toString());
		System.out.println("Size is: " + c.size());
		System.out.println("Empty: " + c.isEmpty());
		System.out.println();;
	    
		System.out.println("Equality test: ");
		System.out.println("a and b are equal: " + a.equals(b));
		System.out.println("b and c are equal = " + b.equals(c));
		System.out.println("a and c are equal = " + a.equals(c));
		System.out.println();
		
		System.out.println("From Queue a");
		 while (a.isEmpty() == false) {
			System.out.println(a.dequeue());
		}		
		 System.out.println("From Queue b");
		 while (b.isEmpty() == false) {
		    System.out.println(b.dequeue());
		}
		 System.out.println("From Queue c");
		  while (c.isEmpty() == false) {
		    System.out.println(c.dequeue());
		}	 
		 System.out.println();
	}
	/**
	 * stackTests method is void. The purpose of this 
	 * class is to test the methods in the Stack class
	 * to check if they are working properly.
     */
	private static void stackTests() {
		System.out.println("Tests for Stack class:");
		System.out.println("First test (using a object)");
		Stack a = new Stack();
		a.push('B');
		a.push('a');
		a.push('t');
		System.out.println(a.toString());
	    System.out.println("Size is: " + a.size());
		System.out.println("Empty: " + a.isEmpty());
		System.out.println();

		 System.out.println("Second test(using b object)");
		 Stack b = new Stack();
		 b.push('S');
		 b.push('u');
		 b.push('m');
		 //b.push(null);
		 b.push('m');
		 b.push('e');
		 //b.push(null);
		 b.push('r');
		 System.out.println(b.toString());
		 System.out.println("Size is: " + b.size());
		 System.out.println("Empty: " + a.isEmpty());
	     System.out.println();
		    
		 System.out.println("Third test(using c object)");
		 Stack c = new Stack();
		 c.push('H');
		 c.push('e');
		 c.push('l');
		 c.push('l');
		 c.push('o');
		 System.out.println(c.toString());
		 System.out.println("Size is: " + c.size());
		 System.out.println();

		 System.out.println("Equality test: ");
		 System.out.println("a and b are equal: " + a.equals(b));
		 System.out.println("b and c are equal: " + b.equals(c));
		 System.out.println("a and c are equal: " + a.equals(c));
		 System.out.println();
		 
		 System.out.println("From stack a");
		 while (a.isEmpty() == false) {
			System.out.println(a.pop());
		}		
		 System.out.println("From stack b");
		 while (b.isEmpty() == false) {
		    System.out.println(b.pop());
		}
		 System.out.println("From stack c");
		  while (c.isEmpty() == false) {
		    System.out.println(c.pop());
		}	 
		 System.out.println();
	}
}