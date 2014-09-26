package chatbot.controller;

public class ChatBoxRunner
{
	/**
	 * Allows Chat to run.
	 * 
	 * @param main
	 *            is used to get Chat to work.
	 * @version 1.1 9/26/2014
	 * @author Brennan Litster
	 */
	public static void main(String[] args)
	{
		ChatBotControl myControl = new ChatBotControl();
		myControl.start();
	}
}
