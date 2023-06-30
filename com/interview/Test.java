package com.interview;

public class Test {

	public static void main(String[] args) {
		Test tc=new Test();
		//tc.method1(); //chocolates eaten program
		//tc.method2(); //shortout codes for chocolate program
		//tc.method3(); //candy program
		//tc.method4(); spiral matrix 
		//tc.method5();// hackers rank
		//tc.method6(); //reverse string
		//tc.method7();// sword problem pending
		//tc.methods1();
		tc.method8();
		
		
		
		

	}

	
	private void method8() {
		String[] letters= {"a","b","c","a","b","c","a","e"};
		int[] array=new int[letters.length];
		
		for(int i=0;i<letters.length;i++)
		{
			int count=1;
	      String aplha=letters[i];
	for(int j=i+1;j<letters.length;j++)
	{
	
	if(aplha==letters[j])
	{
	    array[j]=-1;	
		count++;
		
	}
	
	}
	//System.out.println(aplha+" present times "+ count);
	if(array[i]!=-1)
	{
	array[i]=count;
	//for finding odd string and count 
if(count%2!=0)
	{
		System.out.println(aplha+ " present times "+count);
	}
	}

	//for finding duplicate string and count
	if(array[i]>1)
	{
	System.out.println(aplha+"  duplicates letter "+ count);
	}
	
	}
		
	}

	private void methods1() {
		int[][][] A=new int[0][0][0];
		
		
		
		
	}


	private void method7() {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int[]b=new int[5];
		int[]c=new int[3];
		//int j=0;
		/*for(int i=0;i<a.length;i++)  //loop for 10 numbers
		{
			if(a[i]%2!=0) 
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<b.length;i++)  //1 3 5 7 9
		{
			System.out.print(b[i]+" ");
		} */
		 int k=0;
		for(int i=0;i<b.length;i++)  //loop for 5 nos
		{
			if(b[i]==1 || b[i]==5 || b[i]==9)
{
	c[k]=b[i];
    k++;
}
			for(int l=0;l<c.length;l++)  //  1 5 9
			{
				System.out.print(c[l]+" ");
			}	
					}
		
	}


	private void method6() {
		String str="welcom";
		char[]str2=str.toCharArray();
		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]);
		}
	
		
	}


	private void method5() {
		int n=15;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Fizzbuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			
			else
			{
				System.out.println(i);
			}
		}
		
	}


	private void method4() {
	
		int[][] a=new int[9][9];
		
		
		
	    int no =5; 
	    int minRow=0, maxRow=8, minCol=0, maxCol=8;
	   
	  while(no>=1)
	  {
	    for(int col=minCol; col<=maxCol; col++){
	        a[minRow][col] = no; 
	         } minRow++; //minRow = 1

	 
	    for(int row=minRow; row<=maxRow; row++) {
	        a[row][maxCol] = no; 
	       } maxCol--; //maxCol = 7; 

	   
	    for(int col=maxCol;col>=minCol; col--){
	    a[maxRow][col] = no; 
	    } maxRow--; 

	  
	    for(int row=maxRow; row>=minRow; row--){
	        a[row][minCol] = no;  }
	    minCol++; 
	    no--;
	  }
	  
	  
	  for(int row=0;row<=8;row++)
	  {
		  for (int col=0;col<=8;col++)
{
	System.out.print(a[row][col]+" \t");
}
		  System.out.println();
	  }
	  
	  
	}


	private void method3() {
	int[] a= {1,0,1};
	int [] b=new int[a.length];
	int j=0;
for(int i=0;i<a.length-1;i++)
{
	if(a[i]>a[i+1])
	{
		b[j]=2;
		j++;
		b[j]=2-1;	
		j++;
	}
	
	else
	{
		b[j]=2;
	}
}
for(int i=0;i<b.length;i++)
{
	System.out.print(b[i]+" ");
}
		
	}

	private void method2() {
		int eaten=9;
		//int cover=3;
		int total_cover=eaten;
		int chocolates=0;
		while(total_cover>2)
		{
		chocolates=total_cover/3;
		eaten=eaten+chocolates;
		total_cover=total_cover%3+chocolates;
		
		
		}
		
	
//		balance_cover=balance_cover+cover;
//	chocolates=balance_cover/3;
//	eaten=eaten+chocolates;
	System.out.println("Total eaten chocolates "+eaten);
	
			
	}

	private void method1() {
		
		int eaten=15;
		int cover=15;
		int balance_cover=0;
		int chocolates=0;
		while(cover>=2) 
		{
		chocolates=cover/3;
		balance_cover=balance_cover+cover%3;
		//System.out.println(balance_cover);
		//System.out.println(chocolates);
		cover=chocolates;
		eaten=eaten+chocolates;
		//System.out.println(cover);
		//System.out.println(eaten);
		
		}
		//System.out.println(eaten);
	balance_cover=balance_cover+cover;
	chocolates=balance_cover/3;
	eaten=eaten+chocolates;
	System.out.println("Total eaten chocolates "+eaten);
	
	
		
		
	}

}
