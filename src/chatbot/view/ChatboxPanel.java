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
	private JButton saveButt;
	private JButton loadButt;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatScroll;
	private JTextArea textArea;
	
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
		saveButt = new JButton("Click the button... Save!");
		loadButt = new JButton("Click the button... Load!");
		baseLayout = new SpringLayout();
		textArea = new JTextArea(1, 20);
		chatArea = new JTextArea(10, 45);
		chatScroll = new JScrollPane(chatArea);
		
		setPane();
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	/**
	 * The looks of the pop-up.
	 * 
	 * @param setPane()
	 *            is used to help give restrictions on the chat field.
	 * @version 1.1 10/23/2014
	 * @author Brennan Litster
	 */
	private void setPane()
	{
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setBackground(Color.ORANGE);
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
		this.add(textArea);
		this.add(chatScroll);
		this.add(saveButt);
		this.add(loadButt);
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
		baseLayout.putConstraint(SpringLayout.WEST, firstButt, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButt, -117, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButt, -54, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButt, 237, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 0, SpringLayout.WEST, firstButt);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -6, SpringLayout.NORTH, firstButt);
		baseLayout.putConstraint(SpringLayout.SOUTH, loadButt, 0, SpringLayout.SOUTH, saveButt);
		baseLayout.putConstraint(SpringLayout.EAST, loadButt, -6, SpringLayout.WEST, saveButt);
		baseLayout.putConstraint(SpringLayout.SOUTH, saveButt, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, saveButt, -10, SpringLayout.EAST, this);
	}
	
	/**
	 * The task is defined for the button.
	 * 
	 * @param heyListen()
	 *            is used to give a task to the computer using a button.
	 * @version 1.0 10/21/2014
	 * @author Brennan Litster
	 */
	private void heyListen()
	{
		firstButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput = textArea.getText();
				String result = baseController.getChatBoxBot(currentInput);
				doesStuff(currentInput);
				doesStuff(result);
				textArea.setText("");
			}
		});
		
		saveButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chat = textArea.getText();
				baseController.saveText(chat, true);
			}
		});
		
		loadButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String savedChat = baseController.readTextFromFile();
				if(savedChat.length()<1)
				{
					chatArea.setText("No text in file");
				}
				else
				{
					chatArea.setText(savedChat);
				}
			}
		});
	}
	
	/**
	 * The input now goes into the Chatbot
	 * 
	 * @param doesStuff()
	 *            is used to make the panel pop-up be the input for Chatbot.
	 * @version 1.1 11/7/2014
	 * @author Brennan Litster
	 */
	public void doesStuff(String userInput)
	{
		chatArea.append("\n" + userInput);
	}
}
