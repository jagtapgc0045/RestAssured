package basicrequest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class swaggerGetReq {
	
	@Test
	public void getUser()
	{
		swaggerPostReq s1=new swaggerPostReq();
		String postmsg=s1.createUser();
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response response=given()
		.when()
		.get("/user/userfive")
		.then()
		.extract()
		.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
		JsonPath jp=response.jsonPath();
		String getmsg=jp.getString("id value from POST request is: "+postmsg);
		System.out.println("id value from GET request is: "+getmsg);
		Assert.assertEquals(postmsg, getmsg);
	}

}
