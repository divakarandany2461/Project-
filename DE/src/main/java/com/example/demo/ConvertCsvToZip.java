//$Id$
package com.example.demo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ConvertCsvToZip {
	
	 public void zipFiles(ArrayList<String> files){
         
	        FileOutputStream fos = null;
	        ZipOutputStream zipOut = null;
	        FileInputStream fis = null;
	        try {
	            fos = new FileOutputStream("/home/local/ZOHOCORP/divakar-pt5261/Downloads/demo/test.zip");
	            zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
	            for(String filePath:files){
	                File input = new File(filePath);
	                fis = new FileInputStream(input);
	                ZipEntry ze = new ZipEntry(input.getName());
	                System.out.println("Zipping the file: "+input.getName());
	                zipOut.putNextEntry(ze);
	                byte[] tmp = new byte[4*1024];
	                int size = 0;
	                while((size = fis.read(tmp)) != -1){
	                    zipOut.write(tmp, 0, size);
	                }
	                zipOut.flush();
	                fis.close();
	            }
	            zipOut.close();
	            System.out.println("Done... Zipped the files...");
	           
	        } catch (FileNotFoundException e) {
	           
	            e.printStackTrace();
	        } catch (IOException e) {
	            
	            e.printStackTrace();
	        } finally{
	            try{
	                if(fos != null) fos.close();
	            } catch(Exception ex){
	                 
	            }
	        }
			
	    }
	     
}
