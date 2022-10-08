package com.rest.clients;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rest.main.Reqres;

import io.restassured.response.Response;

public class ReqresClient {

	Reqres req;

	@BeforeMethod
	public void init() {
		req = new Reqres();
		req.initClient();
	}

	@Test
	public void getAllUsers() {

		Response response = given()
				.queryParam("page", 2)
				.spec(req.reqSpec)
				.when().log().all()
				.get("users")
				.then().log().all()
				.extract().response();
	}
	
	@Test
	public void getSingleUsers() {

		Response response = given()
				.pathParam("user", 2)
				.spec(req.reqSpec)
				.when().log().all()
				.get("users/{user}")
				.then().log().all()
				.extract().response();
	}

}
