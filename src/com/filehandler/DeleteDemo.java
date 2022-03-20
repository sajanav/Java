package com.filehandler;

import java.io.File;

public class DeleteDemo {

	public static void main(String[] args) {
		File f = new File("D:/love.txt");
		if(f.delete()) {
          System.out.println("The file deleted successfully "+f.getName());
	}else {
		System.out.println("Sorry the file not deleted");
	}
	}
}
