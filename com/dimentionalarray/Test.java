package com.dimentionalarray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt=new Test();
		//tt.method1(); //2dimentionalarray
		//tt.method2(); //2 dimentional array
		//tt.method3();//
		//tt.method4(); //matrix for 2 dimention addition
		//tt.method5();   //matrix 3+3 addition
		tt.method7();  //marix 2* 2 multiplication
		//tt.method6(); //3 dimentional hw

	}

	private void method7() {
		int [][] a= { {1,2},{3,4} };
		int [][] b= { {5,6}, {7,8} };
		
		int c[][]=new int[2][2];
		
		for(int row=0;row<a.length;row++) //row=0 outer loop
		{
			for(int col=0;col<a[0].length;col++)
			{
				c[row][col]=a[row][col]*b[row][col];
				System.out.print(c[row][col]+"\t");
				
			}
			System.out.println();
			
		}
		System.out.println("The multiplication of two matrix");
		
	
	}

	private void method6() {
		int[][][] a=new int[2][3][5];
		System.out.println( "The persons count " +a.length);
		
		System.out.println("How many exam they attanded "+ a[0].length);
		System.out.println("How many subjects are per exam "+ a[0][0].length);
		 //person1 1st exam 5 subject
		a[0][0][0]=80;
		a[0][0][1]=90;
		a[0][0][2]=70;   //a0, exam 0,subject 5
		a[0][0][3]=95;
		a[0][0][4]=100;
		 //person1 2nd exam 5 subject
		a[0][1][0]=90;
		a[0][1][1]=100;
		a[0][1][2]=95;     //a0, exam 1,subject 5
		a[0][1][3]=99;
		a[0][1][4]=100;
		 //person1 3rd exam 5 subject
		a[0][2][0]= 99;
		a[0][2][1]=100;
		a[0][2][2]=100;    //a0, exam 2,subject 5
		a[0][2][3]=100;
		a[0][2][4]=100;
		
		//2nd person 1st exam 5 subject
		a[1][0][0]=70;
		a[1][0][1]=60;
		a[1][0][2]=80;
		a[1][0][3]=75;      //a1, exam 0,subject 5
		a[1][0][4]=65;
		//2nd person 2nd exam 5 subject
		a[1][1][0]=80;
		a[1][1][1]=70;
		a[1][1][2]=90;      //a1, exam 1,subject 5
		a[1][1][3]=85;
		a[1][1][4]=75;
		//2nd person 3rd exam 5 subject
		a[1][2][0]=90;
		a[1][2][1]=80;
		a[1][2][2]=80;   //a1, exam 2,subject 5
		a[1][2][3]=95;
		a[1][2][4]=95;
		
		//int [][] c=new int[2][3];
		
		 int high=0; int lowest=435; int Exam=0; int person;
		for(int row=0;row<a.length;row++) //row=0
			
		{
			for(int col=0;col<a[0].length;col++) //row=0;col=0;
			{
				int total=0;
				for(int no=0;no<5;no++)  //row=0;col=0;no=0;no++;
				{
					total=total+a[row][col][no];
					Exam=col;
					person=row;
				}
				System.out.println("Result " +total);
				//System.out.println("Person "+ row + " Exam "+ Exam +" Results "+ total);
				if(total>high)
				{
					high=total;
				} 
				/*if(total<lowest)
				{
					lowest=total;
				} */
			}
			System.out.println("************");
			
		}
		System.out.println("The highest mark "+high);
		//System.out.println("The lowest mark "+lowest);
		
		//a[0][0][0]+a[0][0][1]+a[0][0][2]+a[0][0][3]+a[0][0][4];
		//a[0]1][0]+a[0][1][1]+a[0][1][2]+a[0][1][3]+a[0][1][4]
		//a[0][2][0]+a[0][2][1]+a[0][2][2]+a[0][2][3]+a[0][2][4];  a0= ans
		
		//a[1][0][0]+a[1][0][1]+a[1][0][2]+a[1][0][3]+a[1][0][4];   a1=ans
		//a[1]1][0]+a[1][1][1]+a[1][1][2]+a[1][1][3]+a[1][1][4]
		//a[1][2][2]+a[1][2][1]+a[1][2][2]+a[1][2][3]+a[1][2][4]; 
		
	}

	private void method5() {
		
		int[][] a= { {1,2,3},{4,5,6},{7,8,9} };
		int[] [] b= { {10,11,12},{13,14,15},{16,17,18} };
		
		int [][] c=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

	private void method4() {
		
		int [][] a= { {1,2},{3,4} };
		int [][] b= { {5,6},{7,8} };
		
		/*a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		b[0][0]=5;
		b[0][1]=6;
		b[1][0]=7;
		b[1][1]=8;*/
		
		int [][] c=new int[2][4];
		
		//c[0][0]= a[0][0]+b[0][0]; 
		//c[0][1]=a[0][1]+b[0][1];
		//c[1][0]=a[1][0]+b[1][0];
		//c[1][1]=a[1][1]+b[1][1];
		int i;
		for(int j=0;j<2;j++)
		{
		for(i=0;i<a.length;i++)
		{
			c[j][i]=a[j][i]+b[j][i];  //j=0;i=0; j=0;i=1; //j=1;i=0; j=1;i=1;
			System.out.print(c[j][i]+" ");
			
		}
		System.out.println();
		
		}
			
	}

	private void method3() {
		int [][] no=new int[2][];
		
		
		System.out.println("the length of array "+ no.length);
		
		no[0][0]=1;
		no[0][1]=2;
		no[0][2]=3;
		no[1][0]=1;
		no[1][1]=2;
		no[1][2]=3;
		
		for(int i=0;i<no.length;i++)
		{
			for(int j=0;j<no[i].length;j++)
			{
				System.out.print(no[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void method2() {
		int[][] num= { {1,2,3,4},{5,6,7},{8,9} };
		
		System.out.println(num.length);
		/*no[0][0]=1;
		no[0][1]=2;
		no[0][2]=3;
		no[0][3]=4;
		no[1][0]=5;
		no[1][1]=6; 
		no[1][2]=7; 
		no[2][0]=8;
		no[2][1]=9;  
		
		*/
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void method1() {
		int[][] num= {{1,2,3,4},{5,6,7}};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
		}
		
	}

}
