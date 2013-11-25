public class Calculator
{
  private int sum1;
  private int sum2;

	public Calculator(int sum1, int sum2)
	{
		this.sum1 = sum1;
		this.sum2 = sum2;
	}


	public int add(Calculator cal)
	{
	   this.sum1 = cal.sum1;
	   this.sum2 = cal.sum2;
	   int total = this.sum1 + this.sum2;
	   return total;
	}

	public int sub(Calculator cal)
	{
		   this.sum1 = cal.sum1;
		   this.sum2 = cal.sum2;
		   int total = this.sum1 - this.sum2;
		   return total;
	}

	public int multi(Calculator cal)
	{
		   this.sum1 = cal.sum1;
		   this.sum2 = cal.sum2;
		   int total = this.sum1 * this.sum2;
		   return total;
	}

	public double div(Calculator cal)
	{
		   this.sum1 = cal.sum1;
		   this.sum2 = cal.sum2;

		   double div1 = (double)this.sum1;
		   double div2 = (double)this.sum2;
		   double total = div1/div2;
		   return total;
	}

	public int mod(Calculator cal)
	{
		   this.sum1 = cal.sum1;
		   this.sum2 = cal.sum2;
		   int total = this.sum1 % this.sum2;
		   return total;
	}

}