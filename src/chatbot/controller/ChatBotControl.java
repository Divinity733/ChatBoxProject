package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotBox;
import chatbot.view.ChatboxView;

public class ChatBotControl
{
	private ChatboxView appView;
	private ChatBotBox mySillyChatBotBox;
	
	public  ChatBotControl()
	{
		appView = new ChatboxView(this);
		mySillyChatBotBox = new ChatBotBox("blah");
	}
	
	public void start()
	{
		String result = appView.showChatBotBox("blah");
		
		if (mySillyChatBotBox.quitChecker(result))
		{
			quit();
		}
	}
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "good bye cruel world");
		System.exit(0);
	}
}
