/**
 * 
 */
package edu.cnm.deepdive.gauss;

/**
 * @author davem
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		assert sum(100) ==5050;
		assert sum(10) ==55;
		assert sum(2,100) ==5049;
		assert sum(2,100, 2) ==2550;
		assert sum(1, 10, 11) == 1;
		System.out.println(sum(Integer.MAX_VALUE));
		System.out.printf("%4.3f seconds %n", (System.currentTimeMillis() - start) / 1000.0d);

	}

	/**
	 * 
	 * @return n Sum
	 *@param n upper limit (inclusive)
	 */
	public static long sum(int n) {
		return sum(1, n);
	}
	/**)
	 * @param m lower limit (inclusive)
	 * @param n upper limit (inclusive)
	 * @return sum of terms in sequence
	 */
	public static long sum(int m, int n) {
		return sum(m, n, 1);
	}
	/**
	 * @param m upper limit (inclusive)
	 * @param n upper limit (inclusive)
	 * @param d difference
	 * 
	 * @return sum of terms in sequence
	 */
	public static long sum(int m, int n, int d) {
//		long runningTotal = 0;
//		for (long i = m; i <= n; i += d) {
//			runningTotal += i;	
//		}
//		return runningTotal;
		long k = ((long) n - m) / d + 1;
		return (k * (2 * (long) m + (k - 1) * (long) d)) /2;
	}
	
	}
	
	

