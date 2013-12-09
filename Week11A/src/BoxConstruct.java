
public class BoxConstruct 
{

	public static void main (String[]args)
	{
		Box<Integer> integerBox = new Box<Integer>();
		
		integerBox.set(10);
		int newIBox = integerBox.get();
		System.out.println(newIBox);
		
		Box<Double> doubleBox = new Box<Double>();
		
		doubleBox.set(10.00);
		double newDBox = doubleBox.get();
		System.out.println(newDBox);
		
		Box<String> stringBox = new Box<String>();
		
		stringBox.set("10.00");
		String stringBoxR = stringBox.get();
		System.out.println(stringBoxR);
		
	}
	
}
