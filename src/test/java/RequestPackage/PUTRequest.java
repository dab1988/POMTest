package RequestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import RequestUtility.putBody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class PUTRequest 
{

	String putResponse=null;
	@Test
	void putRequest()
	{
		RestAssured.baseURI="https://reqres.in/";
		
		 putResponse=given().log().all().header("Content-Type","application/json")
		.body(putBody.putBody())
		.when().put("/api/users/2") .then().log().all()
		         .assertThat().statusCode(200).extract().response().asString();
		
		
	}
	
	@Test
	void validatePutResponse()
	{
		System.out.println(putResponse);
		
		JsonPath json= new JsonPath(putResponse);
		
		Assert.assertEquals(json.getString("name"), "morpheus", "Name Successfully Validated");
		Assert.assertEquals(json.getString("job"), "zion resident");
	}
	
}
