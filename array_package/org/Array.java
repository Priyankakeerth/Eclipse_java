package array_package.org;

public class Array {

	public static void main(String[] args) {
		Array aa=new Array();
		
		int[] marks = {92, 78, 89, 99, 96}; 
//	    Array.find_second_biggest(marks);
//    Array.find_second_smallest(marks);
//    Array.find_mid();
    Array.copy_element();
//	Array.print_reverse();
//	Array.find_threebig(marks);

	}

	private static void find_threebig(int[] marks) {
		
		int fb=0,sb=0,tb=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>fb)
			{
				sb=fb;
			    tb=sb;
			fb=marks[i];	
			}
			else if(marks[i]>sb)
			{
			tb=sb;
			sb=marks[i];
			}
			else if(marks[i]>tb)
		{
			tb=marks[i];
		}
			
		}System.out.println("First big: "+fb);
		System.out.println("second big: "+sb);
		System.out.println("third big: "+tb);
		}
		

	private static void find_second_smallest(int[] marks) {
		int fs=marks[0]; int ss=marks[0];
		
		for(int i=1;i<marks.length;i++)
		{
			if(marks[i]<fs)
			{
				ss=fs;
				fs=marks[i];
			}
			else if(marks[i]<ss)
			{
				ss=marks[i];
			}
		}
		System.out.println("The first small: "+fs);
		System.out.println("The second small: "+ss);
	}

	private static void print_reverse() {
		char[] name= {'p','r','i','y','a'};
		char[] name2= new char[5];
		int i=0;int j=name.length-1;
		for( i=0;i<name.length;i++)
		{
			name2[i]=name[j];
			System.out.println(name2[i]);
			j=j-1;
			
		}
		
	}

	private static void copy_element() {
		char[] name= {'m','i','t'};
		char[] name2= new char[name.length];
		int i=0;
		for( i=0;i<name.length;i++)
		{
			name2[i]=name[i];
			System.out.println(name2[i]);
		}
		}
		

	private static void find_mid() {
		char[] name= {'p','r','i','y','a','n','k','a'};
		//int i=0;
		System.out.println(name.length);
		int mid=name.length/2;
		System.out.println(mid-1);
		System.out.println(mid);
		
	}

	private static void find_second_biggest(int[] marks) {
		
		int big=0;int sbig=0;
		
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>big)
			{
				sbig=big;
				big=marks[i];
			}
			else if(marks[i]>sbig)
			{
			sbig=marks[i];	
		}
	}
		System.out.println("The first big: "+big);
		System.out.println("The second big: "+sbig);
}
	
}
