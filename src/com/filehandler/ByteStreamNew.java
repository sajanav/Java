package com.filehandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ByteStreamNew {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D://abc.png");
			FileOutputStream g = new FileOutputStream("D://copy.png");
			int i=0;
			while((i=f.read())!=-1)
			{
				g.write(i);
			}
			g.flush();
			g.close();
			f.close();
			System.out.println("File copied successfully");
		}catch(Exception e) {
			System.out.println(e);
		}

	}


	}


