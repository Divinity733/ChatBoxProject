package chatbot.model;

public class ChatBotBox
{
	private String name;
	private int chatCounter;
	//public int lengthCounter;
	
	
	/**
	 * Creates a Chatbox object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
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
	
	public boolean quitChecker(String input)
	{
		boolean okToExit = false;
		
		if (input.equalsIgnoreCase(".exit"))
		{
			okToExit = true;
		}
		
		return okToExit;
	}
	
	//public int lengthCounter()
	//{
	//	return lengthCounter;
	//}
}
