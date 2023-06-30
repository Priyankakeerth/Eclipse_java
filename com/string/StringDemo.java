package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo sm=new StringDemo();
		//sm.check_start();
		//sm.check_ends();
		//sm.split_method();
		//sm.length_method();
		//sm.check_string();
		//sm.converting_Captital();
		//sm.converting_small();
		//sm.convert();
		//sm.space();
		//sm.inbetween_space();
		
		/*String name="  i came to chennai  ";
		System.out.println(name.stripLeading()); //the starting spaces will be deleted
		System.out.println(name.stripTrailing()); //the ending spaces will be deleted
		System.out.println(name.trim());   //the first and last spaces will be deleted
		System.out.println(name.indexOf('c')); //find the index position of character
		System.out.println(name.lastIndexOf('c')); */   //find the last index position of character
		/* String name="nee kavithaigala.mp3"; 
		 System.out.println(name.substring(16));  //will only show after 15th position
		 System.out.println(name.substring(0, 16)); */   //will only show 0 to 15th position
		
		//homework
		//sm.find_evencharecter();
		//sm.eliminating_last_spaces();
		//sm.reverse_string();
		sm.check_contains();
		
		   
	}
		
	
	private void check_contains() {
		
		String sen="it is too hot here today";
		System.out.println(sen.contains("today")); //default method
		
	}


	private void reverse_string() {
		String name="Siva Rama Krishnan";
		
		String[] s=name.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		int space=0;
		for(int j=s.length-1;j>=0;j--)
		{
			System.out.print(s[j]);
			for( space=1;space<=1;space++)
			{
				System.out.print(" ");
			}
		}
	}

	private void eliminating_last_spaces() {
		
		String name="amal raj   ";                                                                         
		
		String name2="";
		//char[] ch=name.toCharArray();
		boolean alphabet=false;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char letter=name.charAt(i);
			if(letter==' ' && alphabet==false )
			{
				
			}
			else
			{
				alphabet= true;
				name2=name2+letter;
			}
			}
		System.out.println(name2);
		
		for(int i=name2.length()-1;i>=0;i--)
		{
			char[] cc=name2.toCharArray();
			
			System.out.print(cc[i]);
		}
		
	}


	private void find_evencharecter() {
		
		String name="mukilan";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(i%2!=0)               //for even position if(i%2==0)
			{
				System.out.print(ch);  //print odd position
			}
		}
		
	/*	for(int i=0;i<name.length();i+=2)
		{
			char letter=name.charAt(i);
			
			
			System.out.print(letter);		
		}
	*/
	}


	private void inbetween_space() {
		// TODO Auto-generated method stub
		String name = "   amal raj";
		String name2 = "";
		boolean alphabet_came = false;
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			char letter = ch[i];
			if (letter==' ' && alphabet_came == false)
			{
	
			}
			else {
				alphabet_came = true; 
			//System.out.print(ch[i]);
			name2 = name2 + letter; //amal
			}
		}
		System.out.println(name2);
		
	}


	private void space() {
		// TODO Auto-generated method stub
		String name = "   amalraj";
		String name2 = "";
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			char letter = ch[i];
			if (letter==' ')
			{
				
			}
			else {
			//System.out.print(ch[i]);  //char array print pandrathu
			name2 = name2 + letter;  //string print pandrathu
			}
		}
		System.out.println(name2);
		
	}


	private void convert() {
		// TODO Auto-generated method stub
		
		String name = "amalraj Vijayakumar";
		//AmAlRaJ
		//0123456
		//0	2 4 6 --> Index
		
		for(int i=0; i<name.length();i++)
		{
			char letter = name.charAt(i);
			if(letter>='a' && letter<='z')
			{
				if(i%2==0)
					{
					System.out.print((char)(letter-32));
					}
				else
				{
					System.out.print(letter);
				}
			}
			else
			{
				System.out.print(letter);
			}
		}
	}


	private void converting_small() {
		// TODO Auto-generated method stub
		
		String name="PRIYANKA";
		
		for(int i=0;i<name.length();i++)
		{
			char letter=name.charAt(i);
			if(letter>='A'&& letter<='Z')
			{
				System.out.print((char)(letter+32));
			}
				else
					System.out.print(letter);
			}
		
		
	}


	private void converting_Captital() {
		// TODO Auto-generated method stub
		
		String name="priyanka";
		for(int i=0;i<name.length();i++)
		{
		 char letter=name.charAt(i);
		 System.out.print((char)(letter-32)+" ");
		
		}
		
		String name1="Priyanka Keerthi";
		
		for(int i=0;i<name1.length();i++)
		{
			char letter=name1.charAt(i);
			if(letter>='a'&& letter<='z') //if the letter is present in between 'a' and 'z':
			{
			System.out.print((char)(letter-32));
		}
			else
				System.out.print(letter);
		}
		
		
		
	}


	private void check_string() {
		// TODO Auto-generated method stub
		 String s = "IPL Ended yesterday";
		    String[] ss = s.split(" ");
		   /* for(int i=0;i<ss.length;i++)
		    {
		    	System.out.println(ss[i]);
		    } */
		  
		    
		    System.out.println("the index of IPL:" + s.indexOf("Ended"));
		    System.out.println(s.toLowerCase());
		    System.out.println(s.toUpperCase());
		    
		    String name="Priyanka";
		    String aname="Keerthi";
		    
		    //System.out.println("tHe concadination of the string: "+ name+ " "+ aname);
		    System.out.println(name.concat(aname));
		
	}


	private void length_method() {
		// TODO Auto-generated method stub

		/*String last_movie1="GN";
		String last_movie2="GN";
		String last_movie3="GN";
		String last_movie4="GN";
		System.out.println(last_movie1.hashCode());
		System.out.println(last_movie2.hashCode());
		System.out.println(last_movie3.hashCode());
		System.out.println(last_movie4.hashCode());
		last_movie1="2018";
		System.out.println(last_movie1.hashCode());
		System.out.println(last_movie2.hashCode());
		System.out.println(last_movie3.hashCode());
		System.out.println(last_movie4.hashCode()); */
		String name = "sabaribala";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(3));
//		System.out.println(name.charAt(4));
		System.out.println(name.length());  //length method
	/*	for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));		
		} */
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.charAt(name.length()/2)); //middle letter
		
		System.out.println(name.startsWith("sa"));
		
	}

	void split_method()
	{
		String date = "30/05/2023";  //split method
		String[] ds = date.split("/");
		
		for(int i=0;i<ds.length;i++)
			System.out.println(ds[i]);
		
	}

	private void check_ends() {
		// TODO Auto-generated method stub
		String name1 = "sabaribala";
		String name2 = "bala";
		boolean ends = true;
		int len1 = name1.length()-1; 
		for(int len2 = name2.length()-1; len2>=0;len2--)
		{
			if(name1.charAt(len1)== name2.charAt(len2))
			{
				len1--;
				continue; 
			}
			else
			{
				System.out.println("No, not ends with");
				ends = false; 
				break; 
			}
		}	
		if(ends == true)
		{
			System.out.println("yes, ends with "+name2);
		}
			}
		
	

	private void check_start() {
		// TODO Auto-generated method stub
		String name1 = "sivaramakrishnan";
		String name3="";
		String name2 = "siva";
		boolean starts = true; 
		
		/*for(int i=0;i<name1.length();i++)
		{
			char letter=name1.charAt(i);
			
			if(letter>='A' && letter<='Z')
			{
				name3=()letter-32;
			}
		} */
		
for(int i=0; i<name2.length();i++)	{	
		if(name1.charAt(i) == name2.charAt(i))
		{
			continue;
		}
		else
		{
			starts = false; 
			break; 
		}
	}
	if(starts==true)
	{
		System.out.println("yes " + name1 + " starts with "+name2);
	}
	else
	{
		System.out.println("Not starts with "+name2);
	}
		
	}
	}


