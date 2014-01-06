	
public class WhiteSpace	
{	
		
		public static void main(String[] args)
		{
		
			String fullname = "Mike Anthony  Jones";
			String copy = "";
			int copyLength = fullname.length();
			int spaceCount = 0;
			int lastSpaceCount = 0;
			int count = 0;
			
			
			for (int j = 0; j < copyLength; j++)
			{
					if (fullname.charAt(j) != ' ' || (j == copyLength))
					{					
						copy = copy + fullname.charAt(j);
						count = 0;									
					} else {
								System.out.println("Space found at " + j);
								if (fullname.charAt(j) == ' ' && count < 1)
								{
									copy = copy + fullname.charAt(j);
									count = count + 1;
								}
							}
			}
			
			System.out.println("result " + copy);
			String[] words = copy.split(" ");
		
		
		
			String result = "";
			for (int i = 0; i < words.length; i++)
			{
				String nextInitial = "" + words[i].charAt(0);
				//nextInitial = nextInitial.trim();
				result = result + nextInitial.toUpperCase();
			}
			System.out.println(result);
		}
}