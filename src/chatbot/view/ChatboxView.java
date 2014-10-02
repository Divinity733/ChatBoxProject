package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotControl;

/**
 * Shows a String from the Chatbot as a popup
 * 
 * @param currentInput
 *            The string from the Chatbot.
 * @version 1.3 10/2/2014
 * @author Brennan Litster
 */
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
		
		result = JOptionPane.showInputDialog(null, baseControl.getMySillyChatBotBox() + " says: " + currentInput);
		
		return result;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup.
	 * 
	 * @param currentInput
	 *            The string from the Chatbot.
	 * @version 1.3 10/2/2014
	 * @author Brennan Litster
	 */
	public void showChatBoxBot(String currentInput)
	{
		JOptionPane.showMessageDialog(null, currentInput);
	}
}
