package chatbot.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotBox;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatboxPanel;
import chatbot.view.ChatboxView;

/**
 * Runs the ChatBot
 * 
 * @version 1.3 10/2/2014
 * @author Brennan Litster
 */
public class ChatBotControl
{
	private ChatboxView appView;
	private ChatBotBox mySillyChatBotBox;
	private String startMess;
	private String cleanMess;
	private ChatbotFrame appFrame;
	
	/**
	 * Allows control to Chat.
	 * 
	 * @param ChatBotControl
	 *            is defined.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public ChatBotControl()
	{
		appView = new ChatboxView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatBotBox = new ChatBotBox("blah");
		startMess = "Welcome to the " + mySillyChatBotBox.getName() + " chat.  What is your name?";
		cleanMess = "goodbye you evil user :'(";
	}
	
	/**
	 * Shows a String from the Chatbot as a popup
	 * 
	 * @param ChatBoxBot
	 *            The string from the Chatbot.
	 * @version 1.3 10/2/2014
	 * @author Brennan Litster
	 */
	public ChatBotBox getMySillyChatBotBox()
	{
		return mySillyChatBotBox;
	}
	
	/**
	 * Allows Chat to appear.
	 * 
	 * @param start
	 *            is used to get chat and check for quit.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public void start()
	{
		((ChatboxPanel) appFrame.getContentPane()).doesStuff(startMess);
		
		//ChatboxPanel testPanel = (ChatboxPanel) appFrame.getContentPane();
	}
	
	public String getChatBoxBot(String input)
	{
		String result = "";
		
		if(mySillyChatBotBox.quitChecker(input))
		{
			quit();
		}
		result = mySillyChatBotBox.processText(input);

		return result;
	}
	
	/**
	 * Tells system to quit the Chat.
	 * 
	 * @param quit
	 *            is called.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	private void quit()
	{
		appView.showChatBoxBot(cleanMess);
		System.exit(0);
	}
	
	public void saveText(String conversation, boolean appendToEnd)
	{
		String fileName = "/Users/blit1703/Documents/SavedText.txt";
		PrintWriter outputWriter;
		
		if(appendToEnd)
		{
			try
			{
				outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, appendToEnd)));
				outputWriter.append(conversation);
				outputWriter.close();
			}
			catch(FileNotFoundException noExistingFile)
			{
				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
				JOptionPane.showMessageDialog(appFrame, noExistingFile.getMessage());
			}
			catch(IOException inputOutputError)
			{
				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
				JOptionPane.showMessageDialog(appFrame, inputOutputError.getMessage());
			}
		}
		else
		{
			try
			{
				outputWriter = new PrintWriter(fileName);
				outputWriter.println(conversation);
				outputWriter.close();
				
			}
			catch(FileNotFoundException noFileIsThere)
			{
				JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
				JOptionPane.showMessageDialog(appFrame, noFileIsThere.getMessage());
			}
		}
	}

	public String readTextFromFile()
	{
		String fileText = "";
		String filePath = "/Users/blit1703/Documents";
		String fileName = filePath + "SavedText.txt";
		File inputFile = new File(fileName);
		
		try
		{
			Scanner fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNext())
			{
				fileText += fileScanner.nextLine() + "\n";
			}
		}
		catch(FileNotFoundException fileException)
		{
			JOptionPane.showMessageDialog(appFrame, "There is no file there :(");
		}
		
		return fileText;
	}
}
