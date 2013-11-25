
String str = buggyMethod(6)
println str


String buggyMethod(int n) 
{
	if (n == 0)
	{
	return "";
	} 
	
	return n + " " + buggyMethod(n - 2) + " " + n
}