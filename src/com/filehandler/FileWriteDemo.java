package com.filehandler;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo { // In write operation a speciality is their even if we don't create the file it will automatically create the named file and write in it

	public static void main(String[] args) { // inside class w can provide path or file directory to create or write
		try {
		FileWriter fw  = new FileWriter("D:/Eclips.txt");// File to which object point is provided as constructor
		
			fw.write("Iam write date in to file");
			fw.close();// After writing we need to close then only content written to disk, otherwise content will be lost
			
			System.out.println("Content was successfully written to file");
		}catch(IOException e){
			System.out.println("Unexpected error occur");
		}

	}

}
