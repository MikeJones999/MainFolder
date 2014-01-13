public class BookImpl implements Book
{
	
	private String author;
	private String title;
	
	public BookImpl (String author, String name)
	{
		setAuthor(author);
		setTitle(name);	
	}

	private void setAuthor(String name)
	{
		this.author = name;			
	}
		
	private void setTitle(String title)
	{
		this.title = title;	
	}
	
	
	
	@Override
	public String getAuthor()
	{
		return author;
	}
	
	@Override
	public String getTitle()
	{
		return title;
	}


}