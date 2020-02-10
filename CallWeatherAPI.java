
import java.util.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.gson.*;
import com.google.gson.reflect.*;


public class CallWeatherAPI
{
	private static HttpURLConnection connection;
	
	public static Map<String, Object> jsonToMap(String str)
	{
		Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType()
				);
		return map;
	}
	
	public static String callFunction(String location)
	{
		
		BufferedReader reader; 
		String line; 
		String apiKey = "db91465d4085d15144004ba25f0fdf8b"; //the API key gathered from the weather website
		
		try
		{
			StringBuilder result = new StringBuilder();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&APPID=" + apiKey + "&units=imperial");
			//url location of the weather website
			URLConnection conn =(HttpURLConnection) url.openConnection(); 
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
			
			while((line = reader.readLine()) != null)
			{
				result.append(line);
			}
			reader.close();
			
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
			
			Object mainMap1 = mainMap.get("temp"); //this over here will gather the temperature
			
			
			System.out.println("Current Temperature: " + mainMap1);
			
			
			String map1 = mainMap1.toString();
			
			
			callFunction2(location);
			
			return map1;
		}	
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return apiKey;


	}
	
	public static String callFunction2(String location)
	{
		
		BufferedReader reader; 
		String line; 
		String KeyAPI = "db91465d4085d15144004ba25f0fdf8b"; 

		try
		{
			
			StringBuilder result = new StringBuilder();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&APPID=" + KeyAPI + "&units=imperial");
			
			URLConnection conn =(HttpURLConnection) url.openConnection(); 
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
			
			while((line = reader.readLine()) != null)
			{
				result.append(line);
			}
			reader.close();
			
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
			

			Object mainMap2 = mainMap.get("Humidity");

			

			System.out.println(" Humidity: " + mainMap2);

			

			String map2 = mainMap2.toString();

			
			
			return map2;
		}	
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return KeyAPI;


	}
	
	public static String callFunction3(String location)
	{
		String line;
		BufferedReader reader; 
		String KeyAPI = "db91465d4085d15144004ba25f0fdf8b"; 

		try
		{
			
			StringBuilder result = new StringBuilder();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&APPID=" + KeyAPI + "&units=imperial");
			
			URLConnection conn =(HttpURLConnection) url.openConnection(); 
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
			
			while((line = reader.readLine()) != null)
			{
				result.append(line);
			}
			reader.close();
			
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
			

			Object windMap1 = windMap.get("speed");

			

			System.out.println(" Humidity: " + windMap1);

			

			String map3 = windMap1.toString();

			
			
			return map3;
		}	
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return KeyAPI;


	}
	
	public static String callFunction4(String location)
	{
		
		BufferedReader reader; 
		String line; 
		String KeyAPI = "db91465d4085d15144004ba25f0fdf8b"; 

		try
		{
			StringBuilder result = new StringBuilder();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + location + "&APPID=" + KeyAPI + "&units=imperial");
			
			URLConnection conn =(HttpURLConnection) url.openConnection(); 
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
			
			while((line = reader.readLine()) != null)
			{
				result.append(line);
			}
			reader.close();
			
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("Main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("Wind").toString());
			

			Object windMap2 = windMap.get("Deg");

			

			System.out.println(" Humidity: " + windMap2);

			

			String map3 = windMap2.toString();

			
			
			return map3;
		}	
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return KeyAPI;


	}
	
	
}
