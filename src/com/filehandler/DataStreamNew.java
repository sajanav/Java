package com.filehandler;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamNew {

	public static void main(String[] args) {
		try {
			//writing 4bytes and reading 4bytes
			File obj = new File("varsha.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(2);
			dout.writeUTF("Welcome");
			dout.writeBoolean(true);
			fout.close();
			dout.close();
			//Reading
			
			FileInputStream fin = new FileInputStream(obj);
			DataInputStream din = new DataInputStream(fin);
			int a = din.readInt();
			String b = din.readUTF();
			boolean c = din.readBoolean();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			fin.close();
			din.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
