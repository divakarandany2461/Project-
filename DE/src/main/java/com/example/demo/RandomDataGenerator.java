package com.example.demo;
import java.util.ArrayList;
import java.util.Random;
public class RandomDataGenerator {
	
	Random random = new Random();
	ArrayList<String>emails=new ArrayList<>();
	UsersAPIs api= new UsersAPIs();

 public StringBuilder getData(String rb,int len) {
	 if(rb.equals("string"))
	   {
		 StringBuilder str = new StringBuilder();
		 
		   for(int i = 0; i < len; i++) {

			      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			      int index = random.nextInt(alphabet.length());
			      char randomChar = alphabet.charAt(index);
			      str.append(randomChar);
			     
			    }
		   str.append(",");
		 
		 
		   return str;
	   }
	   else if(rb.equals("integer"))
	   {
		   StringBuilder str = new StringBuilder();
		   int randnum=random.nextInt(len+1);
		   str.append(randnum);
		   str.append(",");
		   return str;
	   }
	   else if(rb.equals("double"))
	   {
		   StringBuilder str = new StringBuilder();	   
		  double randnum=random.nextDouble();
		  double randomValue = (double) (len);
		   str.append(randnum*randomValue);
		   str.append(",");
		   return str;
	   }
	  
	 else
	   {
		   StringBuilder str = new StringBuilder();
		  // emails=api.getUsers();
		   //str.append(emails);
		   str.append(" ");
		   str.append(",");
		   return str;
	   }
}
 
}
