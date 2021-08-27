package RequestUtility;

import static io.restassured.RestAssured.given;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class getResponseUtil 
{

	public static ExtractableResponse<Response> response(String id)
	{
	
	  return given().queryParam("id", id).when().get("/public/v1/users")
		.then()
		.log().all()
		.extract();
	}
	
}
