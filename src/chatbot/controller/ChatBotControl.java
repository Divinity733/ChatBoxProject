package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotBox;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatboxPanel;
import chatbot.view.ChatboxView;

/**
 * Runs the ChatBot
 * 
 * @version 1.3 10/2/2014
 * @author Brennan Litster
 */
public class ChatBotControl
{
	private ChatboxView appView;
	private ChatBotBox mySillyChatBotBox;
	private String startMess;
	private String cleanMess;
	private ChatbotFrame appFrame;
	
	/**
	 * Allows control to Chat.
	 * 
	 * @param ChatBotControl
	 *            is defined.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public ChatBotControl()
	{
		appView = new ChatboxView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatBotBox = new ChatBotBox("blah");
		startMess = "Welcome to the " + mySillyChatBotBox.getName() + " chat.  What is your name?";
		cleanMess = "goodbye you evil user :'(";
	}
	
	/**
	 * Shows a String from the Chatbot as a popup
	 * 
	 * @param ChatBoxBot
	 *            The string from the Chatbot.
	 * @version 1.3 10/2/2014
	 * @author Brennan Litster
	 */
	public ChatBotBox getMySillyChatBotBox()
	{
		return mySillyChatBotBox;
	}
	
	/**
	 * Allows Chat to appear.
	 * 
	 * @param start
	 *            is used to get chat and check for quit.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public void start()
	{
		((ChatboxPanel) appFrame.getContentPane()).doesStuff(startMess);
		
		//ChatboxPanel testPanel = (ChatboxPanel) appFrame.getContentPane();
	}
	
	public String getChatBoxBot(String input)
	{
		String result = "";
		
		if(mySillyChatBotBox.quitChecker(input))
		{
			quit();
		}
		result = mySillyChatBotBox.processText(input);

		return result;
	}
	
	/**
	 * Tells system to quit the Chat.
	 * 
	 * @param quit
	 *            is called.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	private void quit()
	{
		appView.showChatBoxBot(cleanMess);
		System.exit(0);
	}
}
