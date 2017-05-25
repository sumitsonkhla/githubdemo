package com.algorithms.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			File file=new File("sumit.txt");
			FileOutputStream out=new FileOutputStream(file);
			ObjectOutputStream outObject=new ObjectOutputStream(out);
			Singleton single=Singleton.getInstance();
			single.setName("sumit");
			outObject.writeObject(single);
			outObject.close();
			out.close();
			
			FileInputStream input=new FileInputStream(file);
			ObjectInputStream inputObject=new ObjectInputStream(input);
			Singleton single1=(Singleton)inputObject.readObject();
			single1.setName("sonkhla");
			System.out.println(single.getName());
			
			
		}catch(Exception e){
			
		}

	}

}
