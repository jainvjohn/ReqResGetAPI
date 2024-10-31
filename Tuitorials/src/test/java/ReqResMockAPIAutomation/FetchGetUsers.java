package ReqResMockAPIAutomation;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import io.restassured.matcher.RestAssuredMatchers;



public class FetchGetUsers {
		
	@Test(priority=1)
	public void getUsersList()
	{
//	System.out.println("API Auto");
		baseURI="https://reqres.in/api/";
		basePath="users?page=2";

	Response res=given()
	.contentType("application/json")
	
	.when()
	.get();
	
	System.out.println(res.getStatusCode());
	System.out.println(res.getStatusLine());
	System.out.println(res.getBody().toString());
	System.out.println(res.getTime());
	
	System.out.println("\n\nEnd of Test 1\n\n");
	}
	
	@Test (priority=2)
	public void getUsersList2()
	{
		
		RestAssured.baseURI="https://reqres.in/api/";
		RestAssured.basePath="{mypath}/";
		
		Response res=given()
		.pathParam("mypath", "users")
		.queryParam("page", "1")
		.contentType("application/json")
		
		.when()
		.get()
		
		.then()
		.log().all()
//		.body("page", equalTo(1))
//		.body("data[0].email", equalTo("michael.lawson@reqres.in"));
		.extract().response();
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");
		
		JSONObject jo=new JSONObject(res.asString());
		
		
		for(int i=0;i<jo.getJSONArray("data").length();i++)
		{
		String userEmail=	jo.getJSONArray("data").getJSONObject(i).get("email").toString();
		System.out.println(userEmail);
		}
		
		System.out.println("\n\n End of Test 2\n\n");
	}
	
	@Test (priority=3)
	public void getUsersList3()
	{
		
		RestAssured.baseURI="https://reqres.in/api/";
		RestAssured.basePath="{mypath}/";
		
	Response res=	given()
		.pathParam("mypath", "users")
		
		.queryParam("page", "3")
		.contentType("application/json")
		
		.when()
		.get()
		
		.then()
		.header("Content-Type", "application/json; charset=utf-8")
		.assertThat().statusCode(200)
		//.assertThat().body("data[0].email","george.bluth@reqres.in")
		.body("page", equalTo(3))
		.body("per_page", equalTo(6))
		.log().all()
		.extract().response();
		
	
		
	
	//res.jsonPath().get(data[0].email).toString();
	
}
	}

