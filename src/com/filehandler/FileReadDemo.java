package com.filehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/Eclips.txt");
		char ch[] = new char[(int)f.length()];//return type of char is int, need to convert char to int
		FileReader fr = new FileReader(f);
		fr.read(ch);// to read to array from array we acess the value
		fr.close();// unused memory so can close
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
	}

}
