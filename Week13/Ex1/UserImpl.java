public class UserImpl implements Users
{
	
	private String userName;
	private int userID;
	private Node library;
	
	public UserImpl(String name)
	{
		this.userName = name;	
	}
	
	@Override
	public String getName()
	{
		return userName;
	}
	
	@Override
	public int getID()
	{
		return userID;
	}
	
	@Override
	public void setID(int id)
	{
		this.userID = id; 	
	}
	
	@Override
	public void register(Node libName)
	{
		this.library = libName;
	}
	
	@Override
	public String getLibrary()
	{
		return library.getLibName();
	}
}
