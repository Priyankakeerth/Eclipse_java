package com.string;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringmanipulation sm=new Stringmanipulation();
		//sm.method1(); // seperate charec and int
		//sm.method2(); //a1b2c3
		sm.method3(); //concat
		//sm.method4(); //add days in last
		//sm.method5(); //a3 output aaa
		//sm.replacemethod(); //replacing string for another string
		
		

	}

	private void replacemethod() {
		String sen=" hi everyone hi";
		System.out.println(sen.replace("hi", "hello"));
		System.out.println(sen.replaceAll("hi everyone hi", "Hello how are you"));
		
		
		
	}

	private void method5() {
	String cha="a3";
	/*int x=Integer.parseInt(cha)	;
	System.out.println(x); */
	
		for(int i=0;i<cha.length();i++)
		{
			if(cha.charAt(i)>='a'&& cha.charAt(i)<='z')
			{
				System.out.print(cha.charAt(i));
			}
			else
			{
				int x= Character.getNumericValue(cha.charAt(i)); //charecter into integer converting
				//int x=Integer.parseInt(String.valueOf(cha.charAt(i)));
			for(int j=0;j<x;j++)
			{
		System.out.print(cha.charAt(i-1));
			}
				
			}
		} 
	
/*	for(int i=0;i<cha.length();i++)
	{
		if(cha.charAt(i)>='0'&& cha.charAt(i)<='9')
		{
			
		}
	} */
	} 

	private void method4() {
		String[] days= {"sun","mon","tues","wednes","thurs","fri"};
		for(int i=0;i<days.length;i++)
		{
			System.out.println(days[i]+"day");
		}
		
	}

	private void method3() {
		//concadination
		
		String name1="Priyanka";
		//String name2="Keerthi";
		
		//System.out.println(name1.concat(name2)); 
		String name="Priyanka";
		String name3="Priyanka";
		String name4="PRIYANKA";
		String name2="Pradeep";
		String result=name+" "+name2;
		System.out.println(result);
		String senten=" hi everyone,this is my first try" ;
		String sp="hi hello";
		System.out.println(name.startsWith("Pri"));  //starts with can check the charecter and string
		System.out.println(name.endsWith("ka")); //check end charecter or string
		/*System.out.println(senten.startsWith("hi"));
		System.out.println(senten.stripTrailing());
		System.out.println(senten.stripLeading());
		System.out.println(senten.trim());
		System.out.println(name.contains("Priyanka"));
		System.out.println(name.compareToIgnoreCase(name2)); //comparetoignorecase doubt
		System.out.println(senten.indexOf("i"));
		System.out.println(senten.lastIndexOf("i"));
		System.out.println(senten.getClass());
		System.out.println(name.equals(name2));// obj ref is diff so gives false
		System.out.println(name.equals(name3)); //object(memory reference) isthe same 
		System.out.println(name.equalsIgnoreCase(name2)); //FALSE
		System.out.println(name.equalsIgnoreCase(name4)); //same length and unicode is same so gives true
		System.out.println(senten.endsWith("try")); //end with if present gives true */
System.out.println(name.charAt(1)); //take charecter and check the indwx position
//System.out.println(name.toCharArray());//will discuss later
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.length());
/*String[] ss=sp.split(" ");
for(int i=0;i<ss.length;i++)
{
	System.out.println(ss[i]);
} */

	}

	private void method2() {
		
		String name="a1b2c3";
		
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='a'&&name.charAt(i)<='z')//if(Character.isAlphabetic(str.charA(i))
			{
				System.out.print(name.charAt(i));
			}
			else
			{
				int x= Character.getNumericValue(name.charAt(i));
				for(int j=1;j<x;j++)
				{
					System.out.print(name.charAt(i-1));
				}
			}
		
	
		}
			
	}

	

	private void method1() {
		 String name="abcd123";
		 
		 for(int i=0;i<name.length();i++)
		 {
			 if(name.charAt(i)>='a'&& name.charAt(i)<='z')
			 {
				 System.out.println(name.charAt(i));
			 }
			
			 else
			 {
				 System.out.print(name.charAt(i));
			 }
		 }
		
	}

}
