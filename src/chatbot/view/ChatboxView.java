package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotControl;

public class ChatboxView
{
	
	private ChatBotControl baseControl;
	
	public ChatboxView(ChatBotControl baseControl)
	{
		this.baseControl = baseControl;
	}
	
	public String showChatBotBox(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog (null, "Hello, " + currentInput);
		result = JOptionPane.showInputDialog (null, "are you done?");
		return result;
	}
}
