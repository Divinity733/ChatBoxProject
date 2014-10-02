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
		memeList = new ArrayList<String>();
		this.name = name;
		chatCounter = 0;
		fillTheMeme();
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
	
	private void fillTheMeme()
	{
		memeList.add("toddler fist");
		memeList.add("doge");
		memeList.add("Shut up and take my money");
		memeList.add("newb");
		memeList.add("yolo");
		memeList.add("keep calm");
	}
	
	/**
	 * Process input from user against all checkers.
	 * 
	 * @param currentInput
	 *            The supplied text.
	 * @return
	 */
	public String processText(String currentInput)
	{
		String result = "";
		
		if (memeCheck(currentInput))
		{
			result = "Wow, " + currentInput + " is a meme. Yay!";
		}
		else
		{
			result = "not a meme, try later!";
		}
		
		return result;
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
	
	private boolean memeCheck(String input)
	{
		boolean isMeme = false;
		
		for (String currentMeme : memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isMeme = true;
			}
		}
		
		for (int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if (input.equalsIgnoreCase(memeList.get(loopCount)))
			{
				isMeme = true;
			}
		}
		
		return isMeme;
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
		
		if (input != null && input.equalsIgnoreCase(".exit"))
		{
			okToExit = true;
		}
		
		/**
		 * Shows a String from the Chatbot as a popup
		 * 
		 * @param currentInput
		 *            The string from the Chatbot.
		 * @version 1.2 9/30/2014
		 * @author Brennan Litster
		 */
		String Str1 = new String(input);
		
		System.out.print("String Length: ");
		
		System.out.println(Str1.length());
		
		if (input.length() > 5)
		{
			okToExit = true;
		}
		
		return okToExit;
	}
}
