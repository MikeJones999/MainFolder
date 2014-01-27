public class FibLaunch{
	
	public static void main(String[] args){
		int fibNo = Integer.parseInt(args[0]);
		new FibLaunch().launch(fibNo);
	}
	
	private void launch(int fibNo){
		System.out.println(Fibonacci.fib(fibNo));
	}

	

}