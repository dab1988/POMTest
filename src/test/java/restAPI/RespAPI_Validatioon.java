package restAPI;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RespAPI_Validatioon
{

	@Test
	@Parameters({"Delhi","URI"})
	public void validation(String NCRcity, String URI)
	{
	
		RestAssured.baseURI=URI;
		
		RequestSpecification request= RestAssured.given();
		
		Response response= request.request(Method.GET, NCRcity);
	
		System.out.println("This Response is for NCR City");
		
	    String body=	response.getBody().asString();	
	    
	    System.out.println(body);
	    
	    JsonPath js=response.jsonPath();
		
	    String city= js.get("City");
	    String temprature= js.get("Temperature");
	    String humidity= js.get("Humidity");
		System.out.println(city +"<-->"+temprature+"<-->"+humidity);
	}
}
