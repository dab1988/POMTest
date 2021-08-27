package restAPI;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RESTapi 
{

@Test
@Parameters({"Southcity","URI"})
public void add(String Southcity, String URI)
	{
	 System.out.println("REST API");	
     
	 try
	 {
	 RestAssured.baseURI =URI;
    
     RequestSpecification request=  RestAssured.given(); //get the specification of request
       
     Response response= request.request(Method.GET, Southcity);
 	System.out.println("This Response is for SOUTH City");
     String body= response.getBody().asString();
     
     System.out.println(body);
   int code=  response.getStatusCode();
   String statusLine= response.getStatusLine();
   String cookie= response.getCookie("");
   System.out.println("Status Code Is:"+code+"<--StausLine is :"+ statusLine);
   
	 
	 
	 Assert.assertEquals(code, 200);
	 }
	 
	 catch(java.lang.ExceptionInInitializerError e)
	 {
		 e.printStackTrace();
	 }
	}
	
	
}
