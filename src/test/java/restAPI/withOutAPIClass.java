package restAPI;

import org.testng.annotations.Test;

import com.qa.goRestApi.responseGeneral;

import RequestUtility.getResponseUtil;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Iterator;

public class withOutAPIClass 
{

	@Test
	void readRespons()
	{
		JsonPath json=responseGeneral.jsonUtil(responseGeneral.responsePayload());
		
		System.out.println(json.getString("meta.pagination.total"));
		
		int size= json.getInt("data.size()");
		
		System.out.println(size);
		
		for(int i=0; i< size; i++)
		{
			System.out.println(json.getString("data["+i+"].name"));
		}
		
		System.out.println(json.getString("data[2].email"));
	  /*  ExtractableResponse<Response> response= given().body(responseGeneral.responsePayload()).when().get().then().extract();
		
		int size1=response.headers().getValues("Content-Type").size();
		System.out.println(response.contentType());
		System.out.println(response.statusLine());
		System.out.println(response.statusCode());
		System.out.println(response.header("Content-Type"));*/
		
		RestAssured.basePath="https://gorest.co.in/";
		 ExtractableResponse<Response> resp=given().when().get("/public/v1/users")
		.then()
		.log().all()
		.extract();
		 //System.out.println(resp.jsonPath());
		 
		JsonPath path= resp.jsonPath();
		 
		//String id= path.getString("data[2].id");
		
		
		
		/*Headers header= resp.headers();
		Iterator<Header> head=header.iterator();
		while(head.hasNext())
		{
			System.out.println(head.next());
		}*/
	}	
}