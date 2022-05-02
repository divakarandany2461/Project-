
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StorageClass {
	
	HashMap<String, Integer>map1=new HashMap<>();
	ArrayList<String>str=new ArrayList<String>();
	public StorageClass(HashMap<String,Integer>mapper) {
		 for (Entry<String, Integer> entry : mapper.entrySet())
		{
			map1.put(entry.getKey(),entry.getValue());
		}
		 
	}
	public void fun() {
		  for (Entry<String, Integer> entry : map1.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	}
}
