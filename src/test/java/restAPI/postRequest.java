package restAPI;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest
{
	
	@Test
	private void post() throws JSONException
	{
	    RestAssured.baseURI="https://reqres.in";
        RequestSpecification request= RestAssured.given();	
        JSONObject  requestParams = new JSONObject();
		requestParams.put("name", "Test");
		requestParams.put("job", "Engineer");	
		
		request.header("Content-Type", "application/json");
		
		request.body(requestParams.toString());
		
		Response response= request.post("/api/users");
		
	    String body=	 response.body().asString();
		
	    System.out.println(body);
		  
	}
}