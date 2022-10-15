package RestAssuredExpamples;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class DeleteRequest {
	@Test
	public void Delete()
	{
		baseURI="https://reqres.in/api";
			given().
		when().
			delete("/users/2").
		then().
			statusCode(204).log().all();
	}

}
