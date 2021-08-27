package restAPI;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;

public class validateHeaders 
{

	@Test
	@Parameters({"Delhi","URI"})
	public void validateHeaders(String city, String URI)
	{
		System.out.println("Read All Headers");
		Reporter.log("This test is for Validating Header");
		RestAssured.baseURI= URI;
		RequestSpecification request= RestAssured.given();
		System.out.println("Read Response Time:"+request.get(city).getTime());
		Headers header= request.get(city).headers();
		
		for(Header header1: header)
		{
			System.out.println("Header Name is:"+header1.getName()+"Header Value is:"+header1.getValue());
		}
	    System.out.println("Read Individual Headers");
		String ContentTypeHeader= request.get(city).header("Content-Type");	
		Assert.assertEquals(ContentTypeHeader, "application/json; charset=utf-8");
		String serverHeader= request.get(city).header("Server");
		Assert.assertEquals(serverHeader, "nginx/1.17.10 (Ubuntu)", "Header Value Matched");
	}
}