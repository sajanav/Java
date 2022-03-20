package com.filehandler;

import java.io.*;

public class FileHandlingTest {

	public static void main(String[] args) throws Exception {
		//for creating a file
		FileOutputStream f = new FileOutputStream("ust.txt"); // to write a paper with pointer
		DataOutputStream d = new DataOutputStream(f);
		d.writeUTF("UST is one of the good company");
		
		
		
		//Operation for reading file content
		
		FileInputStream fi = new FileInputStream("ust.txt");
		DataInputStream di = new DataInputStream(fi);
		   String s = di.readUTF(); // UTF is encoding
		   System.out.println(s);
		   

	}

}
