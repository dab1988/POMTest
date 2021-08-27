package restAPI;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import okhttp3.Response;

public class nestedJSONValdiation 
{

	@Test
	private void testNestedJson()
	{
	
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/users";
		RequestSpecification request= RestAssured.given();
		io.restassured.response.Response response= request.queryParam("id", "1").queryParam("id", "2").request(Method.GET);
	    System.out.println(response.getBody().asString()); 		
	    
	}
	
	@Test
	private void Authenticate()
	{
		//Username: ToolsQA

		//Password: TestPassword
		RestAssured.baseURI= "https://restapi.demoqa.com/authentication/CheckForAuthentication";
	
		RequestSpecification request = RestAssured.given();
		
		request.auth().basic("ToolsQA", "TestPassword");
		
		String auth= request.get().body().asString();
		
		System.out.println(auth);
	}
}	