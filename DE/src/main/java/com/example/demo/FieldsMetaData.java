package com.example.demo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import Demo.Boot;
@RestController
public class FieldsMetaData 
{
	HashMap<String,Integer>map;
	public FieldsMetaData(HashMap<String,Integer>hashmap){
		map=new HashMap<>(hashmap);
	}
	public void sendfields() throws ParseException, NoSuchAlgorithmException, IOException, URISyntaxException
	{
		ArrayList<String>csvfiles=new ArrayList<>();
		for (Entry<String, Integer> entry : map.entrySet())
			csvfiles.add(getField(entry.getKey(),entry.getValue()));		
		ConvertCsvToZip ctz=new ConvertCsvToZip();
		ctz.zipFiles(csvfiles);		
		
	}
	private static String getField(String field,int length) throws ParseException, IOException, NoSuchAlgorithmException, URISyntaxException
	{
	
			String Filename=field;
			String url="/home/local/ZOHOCORP/divakar-pt5261/Downloads/demo/";
			String ext=".csv";
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			SSLContext sslContext = SSLContext.getDefault();
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
			CloseableHttpClient httpclient = httpClientBuilder.setSSLSocketFactory(sslConnectionSocketFactory).build();
			URIBuilder uriBuilder = new URIBuilder("https://crm.localzoho.com/crm/v2/settings/fields");
			uriBuilder.addParameter("module", Filename);
			HttpUriRequest requestObj = new HttpGet(uriBuilder.build());
			requestObj.addHeader("Authorization", "Zoho-oauthtoken 1000.3f8ad57a20ebc0901f40fb97cc13380d.b4389609cdccda8d0769af6740de4318");
			HttpResponse response = httpclient.execute(requestObj);
			HttpEntity responseEntity = response.getEntity();
			System.out.println("In fields");
			System.out.println("HTTP Status Code : " + response.getStatusLine().getStatusCode());
			if(responseEntity != null)
			{
				Object responseObject = EntityUtils.toString(responseEntity);
				RandomDataGenerator rg=new RandomDataGenerator();
				GetLength l=new GetLength();
				String responseString = responseObject.toString();
				ObjectMapper om = new ObjectMapper();
				HashMap<String,String>map=new HashMap<>();
				HashMap<String,Integer>map1=new HashMap<>();
				 StringBuilder sb = new StringBuilder();
				 BufferedWriter writer = new BufferedWriter(new FileWriter(url+Filename+ext));
				 String rb; 
				 int count=0,ctr=1,len;
				 Boot root = om.readValue(responseString, Boot.class);
				  for(int i=0;i<root.fields.size();i++) {
					 map.put(root.fields.get(i).field_label, root.fields.get(i).json_type);
					 map1.put(root.fields.get(i).field_label, root.fields.get(i).length);
				  }
			
			  if (map.size() > 0) 
			  {
			  for(int i=0;i<(length+1);i++) 
			  { if(count==0) 
			  { 
				  for (Entry<String, String> entry : map.entrySet()) 
					  sb.append(entry.getKey()).append(","); 
				  String name=sb.append("id").toString();
				  writer.write(name); 
				  writer.newLine(); 
				  count++; 
				  } 
			  else 
				  { 
				  StringBuilder Data= new StringBuilder(); 
				  for (Entry<String, String> entry :  map.entrySet())
				  { 
					  rb=entry.getValue();
					  len=l.getlen(map1,entry.getKey());
					  Data.append(rg.getData(rb,len)); 
				  } 
				   Data.append(field+"_"+ctr++); 
				   String type=Data.toString(); writer.write(type);
			       writer.newLine();
			  } 
			  } 
			  writer.close(); 
			  }
			 
		}
		return url+Filename+ext;
}	
}