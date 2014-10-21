package chatbot.view;

import javax.swing.JPanel;

import chatbot.controller.ChatBotControl;

public class ChatboxPanel extends JPanel
{
	private ChatBotControl baseController;
	
	public ChatboxPanel(ChatBotControl baseController)
	{
		this.baseController = baseController;
	}
	
}
