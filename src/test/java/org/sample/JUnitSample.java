package org.sample;

import java.net.URI;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JUnitSample {
	
	@Test
	public void tc01() throws ParseException {
		//get metho
		
		//URL---->https://reqres.in/api/users/2
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");

		//To get the response code
		
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		
		//To get response body
		
		String string = response.getBody().asString();
		
		System.out.println(string);
		
		//To read JSON file==We need lib called simpleJSON
		
		//By using JSONParse class to read
		
		JSONParser parser=new JSONParser();
		
		Object parse = parser.parse(string);// ParseException
		
		//convert Object to JSONObject
		
		JSONObject ob=(JSONObject) parse;
		
		String string2 = ob.get("total").toString();
		
		System.out.println(string2);
	
		
	}

}
