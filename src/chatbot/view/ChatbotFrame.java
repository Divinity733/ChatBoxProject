package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotControl;
/**
 * Creates Panel Look.
 * 
 * @param ChatbotFrame
 *            is defined.
 * @version 1.0 11/10/2014
 * @author Brennan Litster
 */
public class ChatbotFrame extends JFrame
{
	private ChatboxPanel basePanel;
	
	public ChatbotFrame(ChatBotControl baseController)
	{
		basePanel = new ChatboxPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Defines the frame.
	 * 
	 * @param setupFrame
	 *            is created.
	 * @version 1.0 11/10/2014
	 * @author Brennan Litster
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}
	
}
