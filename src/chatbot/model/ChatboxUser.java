package chatbot.model;

public class ChatboxUser
{
	// four data members
	//at least two different types (String, int, boolean, double...)
	private String userName;
	private int age;
	private boolean hasGlasses;
	
	public ChatboxUser()
	{
		this.userName = "";
		this.age = 0;
		this.hasGlasses = false;
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
}
