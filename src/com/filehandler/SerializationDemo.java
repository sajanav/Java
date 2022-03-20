package com.filehandler;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
    Save obj = new Save(); // access the object from serializable class
    obj.i =4;
    //serialization---stream to object-- save the file in encoded format
    File f = new File("serial.txt");
    FileOutputStream fr = new FileOutputStream(f); // write
    ObjectOutputStream o = new ObjectOutputStream(fr);// object write
    o.writeObject(obj);
    o.close();// write should close
    
    // Deseralization--object to stream--- get the value in console
    FileInputStream fi = new FileInputStream(f);
    ObjectInputStream os = new ObjectInputStream(fi);
    Save  obj1 = (Save)os.readObject(); // type cast
    System.out.println("value of obj1...."+obj1.i);
    os.close();// read reference should close
    
    
	}

}



class Save implements Serializable{ // serializable marker interface  is used to perform serialization
	int i;// java not allow object to save // saving the object help to copy it
}