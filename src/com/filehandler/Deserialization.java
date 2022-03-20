package com.filehandler;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {

	public static void main(String[] args) {
		try {// 
			
			ObjectInputStream  o = new ObjectInputStream(new FileInputStream("serial.txt"));
			Save s = (Save)o.readObject();
			System.out.println("After deserialization the value of i is "+s.i);
			o.close();
			}
			catch(Exception e){
				System.out.println(" error occur....");
				
			}

	}

}
