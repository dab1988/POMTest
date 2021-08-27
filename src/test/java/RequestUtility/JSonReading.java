package RequestUtility;

import io.restassured.path.json.JsonPath;

public class JSonReading 
{

	
	public static JsonPath rowToJdon(String response)
	{
		JsonPath js = new JsonPath(response);
		return js;
	}
	
	
}
