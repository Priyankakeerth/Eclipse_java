package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Test ts=new Test();
		ts.method1();

	}

	private void method1() throws IOException {
		
		//creating file through java
		
		/*File ff=new File("/home/priyanka/Videos/Folder");
		boolean c=ff.mkdir(); //create folder
		System.out.println(c);
		*/
		File f=new File("/home/priyanka/Videos/Folder/Test1.txt");
//		f.createNewFile();  //creating filename
		//f.delete();  //deleting file
		
//		System.out.println(f.getName()); //get filename
//		System.out.println(f.exists());  //check if present file or not
//		System.out.println();
		
		//writing 
		
		//FileWriter fobj=new FileWriter(f);
		//fobj.write("priya");
		//fobj.write("Dani");
		//fobj.write("Hi hello very good morning");
		//fobj.flush();
		//fobj.close();
		
		
		//already writing file adding new content in the file
		FileWriter fobj=new FileWriter(f,true);
		fobj.write("pradeep");
		fobj.flush();
		fobj.close();
		
		//file reader
		FileReader fob=new FileReader(f);
		int j=fob.read(); //reading every single charecter
		while(j!=-1)
		{
		
		//System.out.println(i);
		
		char ch=(char)j;
		System.out.println(ch);
		j=fob.read();
		}
	}

}
