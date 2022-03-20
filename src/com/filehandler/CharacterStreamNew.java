package com.filehandler;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamNew {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("D://abc.txt");
			FileWriter g = new FileWriter("D://copy.txt");
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
