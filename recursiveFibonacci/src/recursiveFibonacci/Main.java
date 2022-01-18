package recursiveFibonacci;


/**
 * Implements a Java class that contains two methods: 
 * 
 *   (1) A recursive static method that returns the nth 
 *       term in the Fibonacci sequence. The method should 
 *       accept n as a parameter. 
 *   (2) A main method that calls the first method. Pass in 
 *       10 as an argument. Output the 10th term of the 
 *       Fibonacci sequence along with some descriptive text.
 * 
 * @author nayala2
 * @version 1.0
 */
public class Main {

	/**
	 * Main method that assigns value of 10 to long variable n.
	 * Passes n to fibRecursive method then prints the output.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		long n = 10; 

		long recursiveTerm = fibRecursive(n);

		System.out.println("The " + n + "th term of the Fibonacci sequence is " 
							+ recursiveTerm + ".\n");
	}


	/**
	 * Implements a recursive method for determining the nth
	 * number of the fibonacci sequence. 
	 * 
	 * @param n a long variable passed by the main method
	 * @return the long output of the method
	 */
	public static long fibRecursive(long n) {
		if ((n == 0) || (n == 1)) {
			return n;
		} else {
			return fibRecursive(n - 1) + fibRecursive(n - 2);

		}
	}
}

