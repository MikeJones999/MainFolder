
public class Word 
{

	public String theWord;
	
	public Word next; //its next word
	
	public Word (String theWord)
	{
		this.theWord = theWord;
		
	}
	
	
}



class WordList
{
	
	public Word lastWordIn = null;
	
	public void insert (Word newWord)
	{
		Word previous = null;
		Word current = lastWordIn;			
	}


}