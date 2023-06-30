package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File fileobj=new File("/home/priyanka/Downloads/Test.txt");
//          fileobj.createNewFile();

//		System.out.println(fileobj.createNewFile());
//	      System.out.println(fileobj.exists());
//	     System.out.println(fileobj.lastModified());
//	      Date dd=new Date(fileobj.lastModified());
//        System.out.println(dd); 
		
		
		File filefolder =new File("/home/priyanka/Downloads/priyanka");
		//System.out.println(filefolder.createNewFile());

		//System.out.println(filefolder.isDirectory());
		//System.out.println(filefolder.isFile());
		
		//System.out.println(filefolder.getName());
		//System.out.println(filefolder.mkdir());  //for folder creating
//		System.out.println(filefolder.mkdirs()); //subfolder
		
		//filewriter class
		/*FileWriter pen=new FileWriter(fileobj);
	     pen.write("priya \n");
		pen.write("siva\n");
		pen.write("Dani\n");
		
		pen.flush(); 
		pen.close(); 
		*/
		
		FileWriter pen=new FileWriter(fileobj, true) ;//already file available and rewrite new 
		/*pen.write("Sabari bala \n" );
		pen.write("saba \n");
		pen.write("yogesh balaji\n ");
		pen.write("ajitha \n");
		pen.flush();
		pen.close(); */
		
		 BufferedWriter bufWriter = new BufferedWriter(pen);

		bufWriter.write("ajitha ");
		bufWriter.newLine();   //is jus a method to write the text in new line
		bufWriter.write("sabaribala");
		bufWriter.newLine();
		bufWriter.write("yogesh balaji ");
		bufWriter.newLine();
	
		bufWriter.flush();
		bufWriter.close(); 
		
		FileReader reader = new FileReader(fileobj);
		/*System.out.println(reader.read()); //return datatype is int so return 112 no,
		int i = reader.read();
		while(i!=-1)
		{
		char ch = (char)i;   //we convert integer to charecter type casting
		System.out.print(ch);
		i = reader.read();
		}  
		*/
		
	BufferedReader bufReader = new BufferedReader(reader);
		String i1 = bufReader.readLine();
		int nooflines=0;
		int noofletter=0;
		while(i1!=null)
		{
		System.out.println(i1);
		System.out.println(i1.length());
		noofletter=noofletter+i1.length();
		i1 = bufReader.readLine();
		nooflines++;
		}
		System.out.println(nooflines);
		System.out.println(noofletter);
		
	}
	

}
