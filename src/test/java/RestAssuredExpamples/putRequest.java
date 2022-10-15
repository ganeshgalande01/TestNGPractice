package RestAssuredExpamples;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class putRequest {
	//@Test
	public void put()
	{
		JSONObject req= new JSONObject();
		req.put("name","morpheus" );
		req.put("job", "zion resident");
		
		baseURI="https://reqres.in/api";
		given().
		body(req).
		when().
		put("/users/2").
		then().
		statusCode(200).
		log().all();
	}
	@Test
	public void patch()
	{
		JSONObject req= new JSONObject();
		req.put("name","morpheus" );
		req.put("job", "zion resident");
		
		baseURI="https://reqres.in/api";
		given().
		body(req).
		when().
		patch("/users/2").
		then().
		statusCode(200).
		log().all();
	}
	

}
