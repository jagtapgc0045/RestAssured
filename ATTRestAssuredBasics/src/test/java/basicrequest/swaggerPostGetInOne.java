package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;


public class swaggerPostGetInOne {
	static String postmsg;
	@Test(priority=1)
	public void postUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp=given()
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"meTester3\",\r\n"
				+ "  \"firstName\": \"vickyy\",\r\n"
				+ "  \"lastName\": \"pote\",\r\n"
				+ "  \"email\": \"vp@gmail.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9988776655\",\r\n"
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
		  postmsg=jp.getString("message");
		 System.out.println("Message value from post req :"+postmsg);
	}
	
	@Test(priority=2)
	public void getUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp=given()
		.when()
		.get("/user/meTester3")
		.then()
		.extract()
		.response();
		String response1=resp.asPrettyString();
		System.out.println(response1);
		JsonPath jp1=resp.jsonPath();
		String getid=jp1.getString("id");
		System.out.println("id value from get req :"+getid);
		System.out.println("Done the Testing");;
		Assert.assertEquals(getid,postmsg);
	}

}
