package com.practice.PakageTest;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_data_from_json_Test {
	public static void main(String[] args) throws IOException, ParseException
	{
		FileReader filepat = new FileReader("C:\\Users\\SHRU\\eclipse-workspace\\com.realestate.spotpotter\\src\\test\\resources\\jdata.json");
		JSONParser json = new JSONParser();
		Object obj = json.parse(filepat);
		
		 JSONObject map = (JSONObject)obj;
		 
		 System.out.println(map.get("browser"));
		 System.out.println(map.get("url"));
		 System.out.println(map.get("username"));
		 System.out.println("password");
		
	
	}

}
