package RequestUtility;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.Headers;

public class getRequest 
{

	
	public static String getRequest(int id)
	{
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract().response().asString();
	}
	
	public static Headers getHeaderst(int id)
	{
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract().response().headers();
	}
}
