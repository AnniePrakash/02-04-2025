package org.sample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONSample {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//1.To locate the File
		
		File file=new File("C:\\Users\\USER\\eclipse-worknew\\Maven11AMSample\\src\\test\\resources\\NewSample.json");
	
		//2.FileReader==>pass the file as input parameter
		
		FileReader reader=new FileReader(file);//FileNotFoundException 
		
		//3.To read data from JSON,We need to use class called JSONParser
		
		JSONParser parser=new JSONParser();
		
		//By using method called parse(),we are going to read the JSON file
		
		Object parse = parser.parse(reader);// ParseException
		
		//To get data from json we need to type cast Object to JSONObject
		
		JSONObject ob=(JSONObject) parse;
		
		String string = ob.get("Name").toString();
		
		System.out.println(string);
		
		
		
		
	
	}

}
