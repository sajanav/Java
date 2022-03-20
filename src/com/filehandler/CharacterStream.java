package com.filehandler;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {

	public static void main(String[] args) throws Exception {
		//Creating FileReader object
	      File file = new File("D:/file4.txt");
	      FileReader reader = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	      //Reading data from the file
	      reader.read(chars);
	      //Writing same data to another file
	      File out = new File("D:/CopyOffile.txt");
	      FileWriter writer = new FileWriter(out);
	      //Writing data to the file
	      writer.write(chars);
	      writer.flush();
	      System.out.println("Data successfully written in the specified file");


	}

}