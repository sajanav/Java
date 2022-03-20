package com.filehandler;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileAttribute {

	public static void main(String[] args) throws IOException {
		Scanner KB = new Scanner(System.in);

	    // enter path here.
	    System.out.print("Enter the file path : ");
	    String A = KB.next();
	    Path path = FileSystems.getDefault().getPath(A);

	    // function is used to view file attribute.
	    BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
	    BasicFileAttributes attributes = view.readAttributes();

	    // all the attributes of the file.
	    System.out.println("Creation Time: " + attributes.creationTime());
	    System.out.println("Last Accessed Time: " + attributes.lastAccessTime());
	    System.out.println("Last Modified Time: " + attributes.lastModifiedTime());
	    System.out.println("File Key: " + attributes.fileKey());
	    System.out.println("Directory: " + attributes.isDirectory());
	    System.out.println("Other Type of File: " + attributes.isOther());
	    System.out.println("Regular File: " + attributes.isRegularFile());
	    System.out.println("Symbolic File: " + attributes.isSymbolicLink());
	    System.out.println("Size: " + attributes.size());
	  }
}
