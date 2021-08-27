package com.qa.goRestApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class getCall 
{
	@Test
	void goRestTest()
	{
		RestAssured.baseURI="https://gorest.co.in";
	//send Path Parameters	
	//ExtractableResponse<Response> response=	given().queryParam("id", "123").when().get("/public/v1/users")
	//	.then().log().all().assertThat().statusCode(200).extract();
	
	//send Query Parameters	
		//ExtractableResponse<Response> response=	given().queryParam("id", "26").when().get("/public/v1/posts")
			//.then().log().all().assertThat().statusCode(200).extract();
	
	//Without Path Parameters
		ExtractableResponse<Response> response=	given().when().get("/public/v1/users")
				.then().log().all().assertThat().statusCode(200).extract();
		
	System.out.println(response.asString());
	System.out.println(response.header("Transfer-Encoding"));
	System.out.println(response.header("Server"));
	System.out.println(response.statusLine());
	
	if(response.body().jsonPath().getString("meta.pagination.page").contains("1"))
	{
	System.out.println("Response Body Matches with DesiredString");
		JsonPath json= response.jsonPath();
	  System.out.println(json.getString("meta.pagination.total"));

	Assert.assertEquals("application/json; charset=utf-8",response.header("Content-Type"));
	System.out.println("Test Case Passed Successfully");
	}
	}
}
