//$Id$
package com.example.demo;

import java.util.HashMap;

public class GetLength {

	public int getlen(HashMap<String,Integer> map,String key)
	{
		int len=0;
		 if(map.containsKey(key))
		 {
			 len=map.get(key).intValue();
			 return len;
		 }
		return 0;
		
	}
}
