package com.rest.main;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Reqres {

	public RequestSpecification reqSpec;
	RequestSpecBuilder spec = new RequestSpecBuilder();

	public void initClient() {
		spec.setBaseUri("https://reqres.in/");
		spec.setBasePath("/api/");
		spec.setContentType(ContentType.JSON);
		reqSpec = spec.build();
	}

}
