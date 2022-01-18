package recursiveFibonacci;

public class Main {

	public static void main(String[] args) {

		long n = 10; 

		long recursiveTerm = fibRecursive(n);

		System.out.println("The " + n + "th term of the Fibonacci sequence is " 
							+ recursiveTerm + ".\n");
	}


	public static long fibRecursive(long n) {
		if ((n == 0) || (n == 1)) {
			return n;
		} else {
			return fibRecursive(n - 1) + fibRecursive(n - 2);

		}
	}
}
