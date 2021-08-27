package RequestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import RequestUtility.payLoad;
import io.restassured.path.json.JsonPath;

public class mockResponseAPI 
{

	
	
	@Test
	void readResponse()
	{
		JsonPath json= new JsonPath(payLoad.payload());
		System.out.println(json.getInt("courses.size()"));
		int size=json.getInt("courses.size()");
		int totalAmount= json.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		int sum=0;
		
		for(int i=0; i< size; i++)
		{
			System.out.println(json.getInt
					  ("courses["+i+"].price"));
			
			sum=sum+json.getInt("courses["+i+"].price")*json.getInt("courses["+i+"].copies");
			
		}
		System.out.println("Final Price is-->"+sum);
		Assert.assertEquals(totalAmount, sum);
	}
}
