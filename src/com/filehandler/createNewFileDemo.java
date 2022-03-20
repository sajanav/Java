package com.filehandler;

import java.io.*;
import java.io.IOException;   
public class createNewFileDemo {

	public static void main(String[] args){
		// It is a reference
		File f = new File("D:/New.text"); // Here new file is not created if already there it will point to that file but not create
       // System.out.println(f.exists()); // Whether that file exist
        //f.createNewFile();// now it is created 
        //System.out.println(f.exists()); // now it exist is true
		try {
			
		
		if(f.createNewFile()) {
			System.out.println("File is created  name is "+f.getName()); // already exist again not created
		}else {
			System.out.println("File not created"); 
		}
			
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
        
	}

}
