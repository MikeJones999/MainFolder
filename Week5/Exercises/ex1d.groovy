int res = mcCarthy91(95)
print res


int mcCarthy91(int n)
{
println n
	if (n > 100) 
	{
	return n - 10;
	} else 
		{
		println n
		return mcCarthy91(mcCarthy91(n+11));
		}
}