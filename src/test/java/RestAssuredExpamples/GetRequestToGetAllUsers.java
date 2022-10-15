package RestAssuredExpamples;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GetRequestToGetAllUsers {
	@Test
	public void getAllUsers()
	{
		 baseURI="https://reqres.in/api/";
		given().auth().none().
		when().get("users?page=2");
		
	}

}
