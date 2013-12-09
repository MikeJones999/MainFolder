
public class Comparator 
{
	public int getMax(int n, int m)
	{		
		double newN = (double) n;
		double newM = (double) m;
		double holder = getMax(newN, newM);
		return (int) holder;
	
	}
	
		public double getMax(double d1, double d2) 
		{
			if (d1 > d2)
			{
				return d1;
			} 
			else 
			{
				return d2;
			}
		}
		
			public String getMax(String number1, String number2) 
			{
				double n1 = Double.parseDouble(number1);
				double n2 = Double.parseDouble(number2);				
				return String.valueOf(getMax(n1, n2));

			}
			
			
			
			
			
}

