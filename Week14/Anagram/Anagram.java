import java.util.ArrayList;

public class Anagram {
		public ArrayList<String> anagramList = new ArrayList<String>();
	
	public void anag(String s1, String s2)	{
		if(s1.length() == 0)	{
			anagramList.add(s2);
			
		}
		for(int i = 0; i < s1.length(); i++)	{
			anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
		}
	}
	
	
	
	public static void main(String[] args)	{
		String userInput = args[0];
		new Anagram().launch(userInput);
	}
	
	private void launch(String userInput)	{
		anag(userInput, "");
		System.out.println(anagramList);
	}
}