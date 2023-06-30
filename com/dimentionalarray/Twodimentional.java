package com.dimentionalarray;

public class Twodimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Twodimentional td=new Twodimentional();
		//td.method1();
		//td.method2();
		td.method3();
		
	}

	private void method3() {
		
		/*int [] [] marks=new int [3][5];
		System.out.println(marks.length);//3 is the length 
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length); */
		int [] [] marks=new int [3][];//we can empty array java supports length is null empty
		marks[0]=new int[3];
		marks[1]=new int[2];
		marks[2]=new int[2];
		
		int k=0,j=0;
		marks[k][j]=10;j++;
		marks[k][j]=20; j++;
		marks[k][j]=30;j++;
		
		for( j=0;j<3;j++)
		{
			System.out.print(marks[k][j]+" ");
		}
		
		/*marks[1]=new int[5];
		marks[2]=new int[5];
		marks[3]=new int[6];//these are called jagged array
		System.out.println(marks.length);//6 is the length 
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length);
		System.out.println(marks[3].length); */
	}

	private void method2() {
		int[][] marks = new int[3][5];
		int exam = 0; 
		int subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 65; subject++;
		    marks[exam][subject] = 78; subject++;
		    
		    //half yearly: 
		    exam++;  //now exam 1
		    subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 92; subject++;
		    marks[exam][subject] = 99; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 95; subject++;
		    
		    //annual
		    exam++;  //now exam 2
		    subject = 0; 
		    marks[exam][subject] = 87; subject++;
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 95; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 93; subject++;
		    
		    int high=0; int examno=0;
		    for(exam=0;exam<3;exam++)
		    {
		    	int total=0;
		    	for(subject=0;subject<5;subject++)
		    	{
		    		total=total+marks[exam][subject];
		    	}
		    	System.out.println(total );
		    	if(total>high)
		    	{
		    		examno=exam;
		    		high=total;
		    	}
		    }
		    System.out.println("The highest total is "+ high +" exam "+examno); 
		   /* int low=431;
		    for(exam=0;exam<3;exam++)
		    {
		    	int total=0;
		    	for(subject=0;subject<5;subject++)
		    	{
		    		total=total+marks[exam][subject];
		    	}
		    	System.out.println(total);
		    	if(total<low)
		    	{
		    		low=total;
		    	}
		    }
		    System.out.println("The highest total is "+ low);
		    */
		  
		    
		
	}

	private void method1() {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][5];
		//quarterly: 
		int exam = 0; 
		int subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 65; subject++;
		    marks[exam][subject] = 78; subject++;
		    
		    //half yearly: 
		    exam++; 
		    subject = 0; 
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 92; subject++;
		    marks[exam][subject] = 99; subject++;
		    marks[exam][subject] = 100; subject++;
		    marks[exam][subject] = 95; subject++;
		    
		    //annual
		    exam++; 
		    subject = 0; 
		    marks[exam][subject] = 87; subject++;
		    marks[exam][subject] = 90; subject++;
		    marks[exam][subject] = 95; subject++;
		    marks[exam][subject] = 98; subject++;
		    marks[exam][subject] = 93; subject++;
		    
		  /*exam = 0; 
		  for(subject=0; subject<5; subject++)
		  {
		    System.out.print(marks[exam][subject]+" ");
		  }
		  System.out.println();
		  exam++;
		  for(subject=0; subject<5; subject++)
		  {
		    System.out.print(marks[exam][subject]+" ");
		  }
		  System.out.println();
		  exam++;
		  for(subject=0; subject<5; subject++)
		  {
		    System.out.print(marks[exam][subject]+" ");
		  }*/
		    
		    for(exam=0;exam<3;exam++)
		    {
		    	for( subject=0;subject<5;subject++)
		    	{
		    		if(marks[exam][subject]==100)
		    		{
		    			System.out.println(exam);
		    			System.out.println(subject);
		    		//System.out.print(marks[exam][subject]+" ");
		    		}
		    	}
		    	System.out.println();
		    } 
		    
		    

}
}