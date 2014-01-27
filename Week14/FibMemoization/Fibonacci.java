public class Fibonacci{
	
	private static long[] precalculated = null;
	
	

	public static long fib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			long result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
		return result;
		}
	}
	
	private static void initPrecalculatedArray(int size) {
		precalculated = new long[size];
		
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}

}