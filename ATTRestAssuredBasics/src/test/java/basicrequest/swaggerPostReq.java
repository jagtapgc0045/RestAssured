package basicrequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class swaggerPostReq {
	
	@Test
	public String createUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp=given()
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"userfive\",\r\n"
				+ "  \"firstName\": \"prashant\",\r\n"
				+ "  \"lastName\": \"tambe\",\r\n"
				+ "  \"email\": \"pt@gmail.com\",\r\n"
				+ "  \"password\": \"Test@123\",\r\n"
				+ "  \"phone\": \"1122334455\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		.header("Content-Type","application/json")
		.when()
		.post("/user")
		.then()
		.extract()
		.response();
		String response=resp.asPrettyString();
		System.out.println(response);
		
		JsonPath jp=resp.jsonPath();
		int codevalue=jp.getInt("code");
		System.out.println(codevalue);
		
		String a=jp.getString("message");
		System.out.println(a);
		return a;
		
	}

}
