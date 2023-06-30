package com.string;

public class Trial {

	public static void main(String[] args) {
		Trial t=new Trial();
		t.find();
		//t.stars();
		
	//t.reverse_string();

	}

	private void reverse_string() {
		String name="Priyanka keerthi";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

	private void stars() {
String name1 = "Sivaramakrishnan";
//char[] na=name1.toCharArray();
String rev="";

for(int i=0;i<name1.length();i++)
{
	if(name1.charAt(i)=='S')
	{
		System.out.print((name1.charAt(i)-32));
	}
	else
	{
		System.out.print(name1.charAt(i));
	}
	
	
}


	
	
		String name2 = "siva";
		boolean starts = true; 
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
	
		
	

	private void find() {
		
		String s="r2v1m2h5";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
			for(int j=0;j<s.charAt(i+1)-48;j++)
			{
			System.out.print(s.charAt(i));
			}
			}
			}
		
	}

}
