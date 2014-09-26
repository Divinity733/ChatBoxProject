package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotControl;

public class ChatboxView
{
	
	private ChatBotControl baseControl;
	
	/**
	 * Gains control to Chat.
	 * 
	 * @param baseControl
	 *            is called.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public ChatboxView(ChatBotControl baseControl)
	{
		this.baseControl = baseControl;
	}
	
	/**
	 * Makes chat box pop-up.
	 * 
	 * @param showChatBotBox
	 *            has information.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public String showChatBotBox(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello, " + currentInput);
		result = JOptionPane.showInputDialog(null, "are you done?");
		return result;
	}
}
