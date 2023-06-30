package com.dimentionalarray;

public class Spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiralmatrix  s=new Spiralmatrix();
		//s.method1(); //spiral matrix
		s.method2();//reverse spiral matrix

	}

	private void method2() {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
	    int no =1; 
	    int minrow=0, maxrow=3, mincol=0, maxcol=3;
	   
	    
	    for(int col=maxcol;col>=mincol;col--)
	    {
	    	a[mincol][col]=no;
	    	no++;
	    } mincol++;
	    
	    for(int row=mincol;row<=maxrow;row++)
	    {
	    	a[row][minrow]=no;
	    	no++;
	    }
	    minrow++;
	    for(int col=minrow;col<=maxcol;col++)
	    {
	    	a[maxcol][col]=no;
	    	no++;
	    }
		maxcol--;
		for(int col=maxcol;col>=mincol;col--)
		{
			a[col][maxrow]=no;
			no++;
		}
		for(int col=maxcol;col>=mincol;col--)
		{
			a[minrow][col]=no;
			no++;
		}
		for(int col=minrow;col<=maxcol;col++)
		{
			a[maxcol][col]=no;
			no++;
		} 
		
	    
		for(int row=0;row<=3;row++)
		{
			for(int col=0;col<=3;col++)
			{
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
	}

	private void method1() {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
	    int no =1; 
	    int minRow=0, maxRow=3, minCol=0, maxCol=3;
	    //1 2 3  4
	  while(no<=16)
	  {
	    for(int col=minCol; col<=maxCol; col++){
	        a[minRow][col] = no; 
	        no++;  } minRow++; //minRow = 1

	    // 5 6 7 
	    for(int row=minRow; row<=maxRow; row++) {
	        a[row][maxCol] = no; 
	        no++; } maxCol--; //maxCol = 2; 

	    //8 9 10 
	    for(int col=maxCol;col>=minCol; col--){
	    a[maxRow][col] = no; no++; 
	    } maxRow--; 

	    //11 12
	    for(int row=maxRow; row>=minRow; row--){
	        a[row][minCol] = no; no++; }
	    minCol++; 
	  }
	  
	    
	    for(int row=0; row<=3; row++)
	    {
	      for(int col=0; col<=3; col++)
	      {
	        System.out.print( a[row][col]+"\t ");
	      }
	      System.out.println();
	    }
	}

}
