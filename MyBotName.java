

public class MyBotName {

	public static void main(String[] args) throws Exception {

		// Now start our bot up.
		MyBot bot = new MyBot();

		// Enable debugging output.
		bot.setVerbose(true);

		// Connect to the IRC server.
		bot.connect("irc.freenode.net");

		// Join the #pircbot channel.
		bot.joinChannel("#AjayPalankar");

		 bot.sendMessage("#AjayPalankar ",
	                "Hey! Enter any message with the keyword -weather- along with a zip-code and I can tell you the weather!");
	}

}
