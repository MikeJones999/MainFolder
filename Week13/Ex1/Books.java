public class Books implements BookInterface
{
	
	private author;
	private title;
	
	public Books (String author, String name)
	{
		setAuthor(author);
		setTitle(name);	
	}

	@Override
	private void setAuthor(String name)
	{
		this.author = name;			
	}
	
	@Override
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