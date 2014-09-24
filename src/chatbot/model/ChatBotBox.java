package chatbot.model;

public class ChatBotBox
{
	private String name;
	private int chatCounter;
	
	public ChatBotBox(String name)
	{
		this.name = name;
		chatCounter = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getChatCounter()
	{
		return chatCounter;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void updateChatCounter()
	{
		chatCounter++;
	}
}
