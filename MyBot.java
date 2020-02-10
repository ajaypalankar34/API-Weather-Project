import org.jibble.pircbot.PircBot;
import java.util.*;

public class MyBot extends PircBot
{
//constructor 
	public MyBot(){
       		this.setName("TheTemperatureBot"); //this will be the name of the IRC Bot
   	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message)
	{
		Scanner input = new Scanner(System.in);
		
		
		if(message.contains("Kanye")) { //this statement should execute if it contains the word Kanye
			sendMessage(channel, "Please enter Kanye: ");
			String song = input.next();
		}
		if (message.contains("weather")) { //this statement needs to execute if it contains the word weather
			
			sendMessage(channel, "Please enter a desired location: ");
			String location = input.next();
			
			if(location != null)
			{
				String results = CallWeatherAPI.callFunction(location);
				String results2 = CallWeatherAPI.callFunction2(location);
				String results3 = CallWeatherAPI.callFunction3(location);
				String results4 = CallWeatherAPI.callFunction4(location);
				sendMessage(channel, "The temperature is " + results);
				sendMessage(channel, "The humidity is " + results2);
				sendMessage(channel, "The wind speed is " + results3);
				sendMessage(channel, "The wind angle is " + results4);
			}
		

			

		} 
		
		if (message.contains("weather")) { //this message should execute if contains the word weather
			
			sendMessage(channel, "Please enter a location: ");
			String location = input.next();
			
			if(location != null)
			{
				String results = CallWeatherAPI.callFunction(location);
				String results2 = CallWeatherAPI.callFunction2(location);
				String results3 = CallWeatherAPI.callFunction3(location);
				String results4 = CallWeatherAPI.callFunction4(location);
				sendMessage(channel, "The temperature is " + results);
				sendMessage(channel, "The humidity is " + results2);
				sendMessage(channel, "The wind speed is " + results3);
				sendMessage(channel, "The wind angle is " + results4);
				
			}
		

			

		} 
		
		if (message.contains("Hello")) { //the message can still work if it contains the word Hello
			 
			sendMessage(channel, "Hello " + sender + "! ");

			} 
		if (message.contains("hello")) {
			
			sendMessage(channel, "Hello " + sender + "! ");

			} 
		}
	}
