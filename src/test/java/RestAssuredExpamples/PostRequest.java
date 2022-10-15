package RestAssuredExpamples;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {
	@Test
	public void Post() {
		baseURI="https://reqres.in/api";
		JSONObject req= new JSONObject();
		req.put("name", "morpheus");
		req.put("job", "leader");
		
		given().
			body(req).
		when().
			post("/users")
		.then().
			statusCode(201)
		.log().all();
		
		
		
		
	}

}
