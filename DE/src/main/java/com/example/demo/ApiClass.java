package com.example.demo;
import java.io.IOException;
import java.net.URISyntaxException;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.apache.http.ParseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiClass {
    String url="http://localhost:8000/";
    String ext=".zip";  
	  @PostMapping(value="/map1") 
	  public String getById(@RequestBody HashMap<String,Integer> requestData) throws ParseException, NoSuchAlgorithmException, IOException, URISyntaxException 
	  { 
		  FieldsMetaData fd=new FieldsMetaData(requestData); 
		  fd.sendfields();
		  
		  return url+"test"+ext; 
	 }
	  
	  
}

