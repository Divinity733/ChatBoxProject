package chatbot.model;

import java.util.ArrayList;

public class ChatBotBox
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCounter;
	
	/**
	 * Creates a Chatbox object with the supplied name and initializes the
	 * current number of chats to zero.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public ChatBotBox(String name)
	{
		this.name = name;
		chatCounter = 0;
	}
	
	/**
	 * Get's the name.
	 * 
	 * @param name
	 *            is returned.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Get's the Chat Count
	 * 
	 * @param chatCounter
	 *            is returned.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public int getChatCounter()
	{
		return chatCounter;
	}
	
	/**
	 * Tells the computer know what name is.
	 * 
	 * @param name
	 *            is defined.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * The chat counter counts up.
	 * 
	 * @param chatCounter
	 *            is added.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	private void updateChatCounter()
	{
		chatCounter++;
	}
	
	/**
	 * Checks if the valid input forces the chat window to quit.
	 * 
	 * @param okToExit
	 *            is defined and checked.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public boolean quitChecker(String input)
	{
		boolean okToExit = false;
		
		if (input.equalsIgnoreCase(".exit"))
		{
			okToExit = true;
		}
		
		return okToExit;
	}
}
