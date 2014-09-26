package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotBox;
import chatbot.view.ChatboxView;

public class ChatBotControl
{
	private ChatboxView appView;
	private ChatBotBox mySillyChatBotBox;
	
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
		mySillyChatBotBox = new ChatBotBox("blah");
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
		String result = appView.showChatBotBox("blah");
		
		if (mySillyChatBotBox.quitChecker(result))
		{
			quit();
		}
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
		JOptionPane.showMessageDialog(null, "good bye cruel world");
		System.exit(0);
	}
}
