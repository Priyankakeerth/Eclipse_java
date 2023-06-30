package com.string;

public class Stringpractise {

	public static void main(String[] args) {
		Stringpractise sp=new Stringpractise();
		sp.reverse_word();

	}

	private void reverse_word() {
		String sen="i like this program,very much.";
//		StringBuilder sb=new StringBuilder(sen); //stringbuilder method
//		System.out.println(sb.reverse());
		
		/*String[] s=sen.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		} */
		System.out.println(sen.isEmpty());
		System.out.println(sen.charAt(4));
		System.out.println(sen.indexOf('i'));
		System.out.println(sen.lastIndexOf('i'));
		System.out.println(sen.toLowerCase());
		System.out.println(sen.toUpperCase());
		System.out.println(sen.startsWith("i"));
		System.out.println(sen.endsWith("much"));
		
	}

}
