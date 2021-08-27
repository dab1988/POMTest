package com.qa.goRestApi;

import io.restassured.path.json.JsonPath;


public class responseGeneral 
{
	
	
	public static JsonPath jsonUtil(String response)
	{
		return new JsonPath(response);
	}
	
	
	public static String responsePayload()
	{
		return "{\r\n" + 
				"    \"meta\": {\r\n" + 
				"        \"pagination\": {\r\n" + 
				"            \"total\": 1978,\r\n" + 
				"            \"pages\": 99,\r\n" + 
				"            \"page\": 1,\r\n" + 
				"            \"limit\": 20,\r\n" + 
				"            \"links\": {\r\n" + 
				"                \"previous\": null,\r\n" + 
				"                \"current\": \"https://gorest.co.in/public/v1/users?page=1\",\r\n" + 
				"                \"next\": \"https://gorest.co.in/public/v1/users?page=2\"\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2150,\r\n" + 
				"            \"name\": \"tst1234\",\r\n" + 
				"            \"email\": \"abc@se2nneer.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2296,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"edeueewBcL@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2297,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"blyebebHvf@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2298,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"vuHewfAfvu@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2299,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"ejBAbeHFey@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2300,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"LfJbwlkbeV@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2301,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"wvHVFBhTgc@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2302,\r\n" + 
				"            \"name\": \"deep dhi\",\r\n" + 
				"            \"email\": \"deep123333@gmail.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2303,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"TdHNHbVubb@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2304,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"bbHHdKVgch@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2305,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"KbFAeeeueJ@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 1696,\r\n" + 
				"            \"name\": \"test\",\r\n" + 
				"            \"email\": \"26a43c58-d747-4aec-9bd2-fd4d44d8cf0d@senndeeeeeer.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 1697,\r\n" + 
				"            \"name\": \"test\",\r\n" + 
				"            \"email\": \"1cf73a49-46e3-4ad0-b7da-8bba40655168@senndeeeeeer.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 1698,\r\n" + 
				"            \"name\": \"test\",\r\n" + 
				"            \"email\": \"02ab8b30-a0a6-4534-864f-b2670dca9eda@senndeeeeeer.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2306,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"cHLKblHgHg@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2308,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"fgeycybcwe@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2309,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"ccKLHubefN@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2310,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"vbbLbyKgBl@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2311,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"TTNFlvweeB@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 2312,\r\n" + 
				"            \"name\": \"test-1\",\r\n" + 
				"            \"email\": \"ebbebBwcjb@abc.com\",\r\n" + 
				"            \"gender\": \"male\",\r\n" + 
				"            \"status\": \"active\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		
	}
}
