//enter a number - if less then 10 - enters while loop
//int i equals str(parsed)
//i incremented by 1
//input any other nubmer - as long as its not 1 then it will print - if 0 it will break
//depending on what i is equal too - on reaching 10 the while loop will complete



String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) 
{
	i++;
	str = System.console().readLine()
	int j = Integer.parseInt(str)
	if (j == 0) 
	{
		break;
	} 
		else if (j != 1) 
	{
		println j;
	}
}
System.out.println("finished");