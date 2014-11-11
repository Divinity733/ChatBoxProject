package chatbot.model;

public class ChatboxUser
{
	// four data members
	// at least two different types (String, int, boolean, double...)
	private String userName;
	private int age;
	private boolean hasGlasses;
	private boolean isAGamer;
	
	public ChatboxUser()
	{
		this.userName = "";
		this.age = 0;
		this.hasGlasses = false;
		this.isAGamer = false;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean isHasGlasses()
	{
		return hasGlasses;
	}
	
	public boolean isAGamer()
	{
		return isAGamer;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setHasGlasses(boolean hasGlasses)
	{
		this.hasGlasses = hasGlasses;
	}
	
	public void setAGamer(boolean isAGamer)
	{
		this.isAGamer = isAGamer;
	}
}
