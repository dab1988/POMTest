package RequestPackage;

import org.testng.annotations.Test;

import RequestUtility.JSonReading;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getRequestTest 
{

	@Test
	public void getRequest()
	{
		RestAssured.baseURI="https://reqres.in";
		String getResponse=RequestUtility.getRequest.getRequest(2);
		
		//System.out.print(getResponse);
		
		
		//JsonPath json= new JsonPath(getResponse);
		
		JsonPath json=JSonReading.rowToJdon(getResponse);
		String firstname=  json.getString("data[0].first_name");
		System.out.println(firstname);
	}
	
	
	
}
