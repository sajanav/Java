package com.filehandler;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		File f = new File("D:/check.txt");
		File g = new File("D:/love.txt");
		
		boolean value = f.renameTo(g);
		if(true) {
			System.out.println("File renamed successfully");
		}else {
			System.out.println("File was not renamed !...");
		}
		

	}

}
