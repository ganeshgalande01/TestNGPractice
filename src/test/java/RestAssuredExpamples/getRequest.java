package RestAssuredExpamples;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.response.Response;



public class getRequest {
	
	@Test
	public void getTest()
	{
		RestAssured.baseURI="https://reqres.in/api/";
		 Response res=RestAssured
				 .get("users/2");				 
		 System.out.println(res.getBody().asString());
		 System.out.println(res.getContentType());
		 res.getCookies();
		 res.getStatusCode();
		 res.getTime();
				 
		 Assert.assertEquals(res.getStatusCode(), 200);
		 
		
		 
		 
	}
	
	@Test
	public void getRequestLoginTest()
	{
		
			Response res=RestAssured
					.get("https://reqres.in/api/login");
			System.out.println(res.getStatusCode());
	
		
			
			
	}
	
	

}
