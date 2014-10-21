package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotControl;

public class ChatbotFrame extends JFrame
{
	private ChatboxPanel basePanel;
	
	public ChatbotFrame(ChatBotControl baseController)
	{
		basePanel = new ChatboxPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}
	
}
