package com.filehandler;

import java.io.*;

public class Makediectory {
	public static void main(String args[]) {
		
	
 File f = new File("D:\\Directorynew"); //point to" // if no directory then directory will be created
 	boolean value = f.mkdir();
 	if(value==true) {
 		System.out.println("Directory is created");
 	}else {
 		System.out.println("Directory not created");
 	}
}
}