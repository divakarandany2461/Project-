package Demo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
  public static void main(String[]args) throws IOException
  {
	 String jsonstring="";
	  ObjectMapper om = new ObjectMapper();
	  Boot root = om.readValue(jsonstring, Boot.class);
	  HashMap<String,String>map=new HashMap<>();
	  for(int i=0;i<root.fields.size();i++)
	  {
		  map.put(root.fields.get(i).field_label, root.fields.get(i).json_type);
		  System.out.println("success");
	  }
		
		 
		 
		
	  
		  }
  }
	  
 

