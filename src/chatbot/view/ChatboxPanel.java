package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import chatbot.controller.ChatBotControl;

public class ChatboxPanel extends JPanel
{
	private ChatBotControl baseController;
	
	private JButton firstButt;
	private JTextField firstText;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatScroll;
	
	/**
	 * Makes pop-up.
	 * 
	 * @param ChatboxPanel()
	 *            is used to create the pop-up.
	 * @version 1.0 10/21/2014
	 * @author Brennan Litster
	 */
	public ChatboxPanel(ChatBotControl baseController)
	{
		this.baseController = baseController;
		
		firstButt = new JButton("Click the button... Strike me down!");
		firstText = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5, 20);
		chatScroll = new JScrollPane(chatArea);
		
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	/**
	 * The looks of the pop-up.
	 * 
	 * @param setupPanel()
	 *            is used to create the look of the pop-up.
	 * @version 1.0 10/21/2014
	 * @author Brennan Litster
	 */
	private void setupPanel()
	{
		this.setBackground(Color.black);
		this.setSize(400, 400);
		this.setLayout(baseLayout);
		this.add(firstButt);
		this.add(firstText);
		this.add(chatScroll);
	}
	
	/**
	 * The placement of the pop-up.
	 * 
	 * @param setupLayout()
	 *            is used to dictate where things need to go.
	 * @version 1.0 10/21/2014
	 * @author Brennan Litster
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 38, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, 126, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, 338, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstText, 359, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstText, 111, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstText, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstText, -88, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButt, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButt, -117, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButt, -54, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButt, 237, SpringLayout.WEST, this);
	}
	
	private void heyListen()
	{
		firstButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstText.setText(firstText.getText()+ " :) ");
			}
		});
	}
}
