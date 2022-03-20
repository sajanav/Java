package com.filehandler;

import java.io.*;
import java.io.IOException;

public class FileSize {
    
	public static void main(String[] args) throws IOException {
	File f = new File("D:/check.txt");// just pointing 
	//f.createNewFile();
	
	
	System.out.println("Path is "+f.getAbsolutePath());
    System.out.println("Length is  "+f.length()+" bytes");
    
    
	}

}
