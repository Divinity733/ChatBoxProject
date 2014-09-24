package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.view.ChatboxView;

public class ChatBotControl
{
	private ChatboxView appView;
	
	public  ChatBotControl()
	{
		appView = new ChatboxView(this);
	}
	
	public void start()
	{
		String result = appView.showChatBotBox("blah");
		
		if (result.equalsIgnoreCase("exit"))
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
