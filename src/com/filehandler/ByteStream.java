package com.filehandler;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("my.txt");
			String s="This is an example of Bytestream";
			byte b[]=s.getBytes();
			System.out.println(s.getBytes());
			fout.write(b);
			fout.close();
		}
		catch(IOException e) {
			System.out.println(e);;
		}

	}

}