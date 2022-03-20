package com.filehandler;

import java.io.File;
import java.io.IOException;

public class Methods {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/Methodfile");// It will point to file object if no path then it will point in workspace otherwise in specified location
	
		f.createNewFile();// create a IOException
		
		boolean value = f.exists();
		if(value) {
			System.out.println("File is created"+f.getName()+" and the path is "+f.getAbsolutePath()+" and the size of file is"+f.length());
		     System.out.println("The file is writeable"+f.canWrite());
		     System.out.println("The file is readable"+f.canRead());
		     
		     File g = new File("D:/hdDirectory");
		     boolean value1= g.mkdir();
		     if(value1) {
		       System.out.println("list the file in directory USTMETHOD");
		       File h = new File("D:/USTMETHOD");
		       String file[] = h.list();
		       
		       for(int i=0;i<file.length;i++)
		       {
		    	   System.out.println("The files are "+file[i]);
		       }
		     }
		    
		
	
	
	
		}
	}

}
