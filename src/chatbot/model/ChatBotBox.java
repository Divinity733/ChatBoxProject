package chatbot.model;

import java.util.ArrayList;

public class ChatBotBox
{
	private ArrayList<String> memeList;
	private ArrayList<String> userInputList;
	private String name;
	private ChatboxUser myUser;
	private int chatCounter;
	
	/**
	 * Creates a Chatbox object with the supplied name and initializes the current number of chats to zero.
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
		myUser = new ChatboxUser();
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
	 * Get's the User.java file
	 * 
	 * @param myUser
	 *            is returned.
	 * @version 1.4 11/3/2014
	 * @author Brennan Litster
	 */
	public ChatboxUser getMyUser()
	{
		return myUser;
	}

	/**
	 * Tells the computer know what myUser is.
	 * 
	 * @param myUser
	 *            is defined.
	 * @version 1.4 11/3/2014
	 * @author Brennan Litster
	 */
	public void setMyUser(ChatboxUser myUser)
	{
		this.myUser = myUser;
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
		
		if(getChatCounter() < 5)
		{
			result = introUser(currentInput);
		}
		
		else if(getChatCounter() == 0)
		{
			result = randomKhan(currentInput);
		}
		
		else
		{
			result = "use real words!!!!";
			chatCounter--;
		}
		
		updateChatCounter();
		return result;
	}
	
	private String introUser(String input)
	{
		String userQuest = "";
		
		if(getChatCounter() == 0)
		{
			myUser.setUserName(input);
			userQuest = "Great name, " + myUser.getUserName() + ", you are amazing.";
		}
		else if(getChatCounter() == 1)
		{
			int userAge = Integer.parseInt(input);
			myUser.setAge(userAge);
		}
		else if(getChatCounter() == 2)
		{
			if(input.equalsIgnoreCase("yes"))
			{
				myUser.setHasGlasses(true);
				userQuest = "Really?  I didn't know that!";
				
				if(getChatCounter() == 3)
				{
					if(input.equalsIgnoreCase("yes"))
					{
						myUser.setAGamer(true);
						userQuest = "That's awesome!";
					}
					else if(input.equalsIgnoreCase("no"))
					{
						myUser.setAGamer(false);
						userQuest = "They're insane!";
					}
				}
			}
			else if(input.equalsIgnoreCase("no"))
			{
				myUser.setHasGlasses(false);
				userQuest = "Wow!  Didn't know they didn't wear them.";
				
				if(getChatCounter() == 3)
				{
					if(input.equalsIgnoreCase("yes"))
					{
						myUser.setAGamer(true);
						userQuest = "That's crazy!";
					}
					else if(input.equalsIgnoreCase("no"))
					{
						myUser.setAGamer(false);
						userQuest = "LAME!";
					}
				}
			}
		}
		
		return userQuest;
	}
	
	private String randomKhan(String input)
	{
		String Khan = "";
		
		int randomPosition = (int) (Math.random() * 6);
		if (input != null && input.length() > 0)
		{
			if (randomPosition == 0)
			{
				if (stringLengthChecker(input))
				{
					Khan = "too long";
				}
				else
				{
					memeList.add(input);
					Khan = "shorty!";
				}
			}
			else if (randomPosition == 1)
			{
				if (contentChecker(input))
				{
					Khan = "Found it!";
				}
				else
				{
					Khan = "Error404...";
				}
			}
			else if (randomPosition == 2)
			{
				if (memeCheck(input))
				{
					Khan = "Wow, " + input + " is a meme. Yay!";
				}
				else
				{
					Khan = "not a meme, try later!";
				}
			}
			else if (randomPosition == 3)
			{
				//Talk about the user ;)
			}
			else if (randomPosition == 4)
			{
				//add to our list
				userInputList.add(input);
				Khan = "Thank you for the comment.";
			}
			else
			{
				if(userInputCheck(input))
				{
						
				}
				else
				{
						
				}
			}
		}
		else
		{
			Khan = "use real words!!!!";
		}
		updateChatCounter();	
		
		return Khan;
		
	}
	
	private boolean userInputCheck(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		
		return matchesInput;
	}
	
	/**
	 * Shows the content from the Chatbot as a popup
	 * 
	 * @param currentInput
	 *            The content from the Chatbot.
	 * @version 1.3 10/9/2014
	 * @author Brennan Litster
	 */
	private boolean contentChecker(String currentInput)
	{
		boolean containsMedia = false;
		
		if (currentInput.equalsIgnoreCase("Video Games") || currentInput.equalsIgnoreCase("Movies") || currentInput.equalsIgnoreCase("News"))
		{
			containsMedia = true;
		}
		
		return containsMedia;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup
	 * 
	 * @param currentInput
	 *            The string from the Chatbot.
	 * @version 1.3 10/9/2014
	 * @author Brennan Litster
	 */
	private boolean stringLengthChecker(String currentInput)
	{
		boolean isLong = false;
		
		String Str1 = new String(currentInput);
		System.out.print("String Length: ");
		System.out.println(Str1.length());
		
		if (currentInput.length() >= 20)
		{
			isLong = true;
		}
		
		return isLong;
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
		
		return okToExit;
	}
}
