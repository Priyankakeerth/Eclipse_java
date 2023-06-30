package pattern_program.org;

public class Pattern3 {

	public static void main(String[] args) {
	Pattern3 pn=new Pattern3();
//	pn.Pattern1();
//pn.pattern2();
// pn.pattern3in1();
//pn.pattern4();
//	pn.pattern5();
	//today class
//	pn.pattern6();
//pn.print8();
//pn.printT();

//homework
//	pn.patternA();
//pn.patternB();
//pn.patternc();
//	pn.patternD();
//pn.patternE();
//	pn.patternF();
//pn.patternG();
//	pn.patternH(); 
//pn.patternI();
//	pn.pattern_J();
	//pn.pattern_K();
//	pn.pattern_L();
//	pn.pattern_M();
//	pn.patternN();
//pn.patternO();
//	pn.printP();
//pn.pattern_Q(); 
	//pn.pattern_R();
//	pn.pattern_S();
//pn.patternT();
//	pn.pattern_U();
//pn.pattern_V();
	//pn.pattern_W(); //pending
	//pn.pattern_X();
	//pn.printY();
	//pn.patternZ();
			
	}

	private void pattern_W() {
		
		for(int row=1;row<=4;row++)
		{
			if(row<5)
			{
			for(int col=1;col<=8;col++)
			{
				if((col==1)||(col==8)&& (row<=4))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println();
			}
		}
		
		int no=4,no2=5;
			for(int row=5;row<=8;row++)
			{
				for(int col=1;col<=8;col++)
				{
					if((col==1)||(col==8)||(col==no )||( col==no2))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
				no--;
					no2++;}
		}
		
	
	

	private void pattern_R() {
		for(int col=1; col<=8; col++)
	      {
    if(col==8)
        System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=5;space++)
	        {
	        System.out.print("  ");
	        }
  System.out.println(" * "); 
	      }
	
	  for(int col=1; col<=8; col++)
	      {
     if(col==8)
       System.out.print("  "); 
    else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    int no1=2;
	    for(int row=1;row<=8;row++)
	    {
	    	for(int col=1;col<=9;col++)
	    	{
	    		if((col==1)|| (col==no1))
	    				{
	    			System.out.print("* ");
	    				}
	    		else
	    			System.out.print("  ");
	    	}
	    	System.out.println();
	    	no1++;
	    }
		
	}

	private void pattern_K() {
		int no1=2;
		for(int row=1;row<=16;row++)
		{
			if(row<=8)
				
		{
			for(int col=1;col<=9;col++)
			{
				if((col==1)||(col==10-row))
				
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
       }
	      
			else
			{
			  for(int col=1;col<=9;col++)
			  {
				  if((col==1)||(col==no1))
				  {
					  System.out.print("* ");
				  }
				  else
				  {
					  System.out.print("  ");
				  }
				  
			}
			  System.out.println(); 
			  no1++;
			
			}
			
		}
		
	}

	private void pattern_X() {

		for(int row=1;row<=9;row++)
		{
			
			for(int col=1;col<=9;col++)
			{
				if(col==row || col==10-row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			System.out.println();
			
		}
		
	}
	
	
	
	private void pattern_S() {
		for(int i=1;i<=7;i++)
		{
			System.out.print("* ");
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("* ");
		}
		
		for(int i=1;i<=8;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=7;space++)
			{
			System.out.print("  ");
		}
			System.out.println("* ");
		
	}
		for(int i=1;i<=8;i++)
		{
			System.out.print("* ");
		}
	}
	private void pattern_V() {
		
		for(int row=1;row<=9;row++)
		{
			if(row<=5)
			{
			for(int col=1;col<=9;col++)
			{
				if(col==row || col==10-row)
				{
					System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
	
		
		
	

	private void pattern_U() {
		
		for(int star=1;star<=8;star++)
		{
			System.out.print("* ");
			for( int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int i=1;i<=7;i++)
		{
			if(i==1)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		
	}

	private void pattern_Q() {
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	         }
	 System.out.println();
	  for(int i=1;i<=2;i++) {
	  for(int space=1;space<=5+i;space++)
	  {
		  System.out.print("  ");
	  }
	    System.out.println("*");
	  }
		
	}

	private void pattern_J() {
		
		for(int i=1;i<=9;i++)
		{
			System.out.print("*"+" ");
			
		}
		System.out.println();
		for(int j=1;j<=9;j++)
		{
			for(int space=1;space<=4;space++)
			{
				System.out.print("  ");
		}
			System.out.println("* ");
		}
		for(int i=1;i<=4;i++)
		{
			System.out.print("* ");
		}
		
	}

	private void pattern_L() {
		for(int i=1;i<=9;i++)
		{
			System.out.println("* ");
		}
		for(int j=1;j<=8;j++)
		{
			System.out.print("* ");;
		}
		
	}

	private void pattern_M() {
		// TODO Auto-generated method stub
		 int no1=0,no2=0;
	      for(int row=1;row<=9;row++) {
	      for(int col=1;col<=9;col++) {
	    	  if(col==1 || col==9 || (col==no1 || col==no2) && row<=10/2)
	    	  {
	        System.out.print("* ");}
	        else {
	          System.out.print("  ");
	        }
	      }
	      System.out.println();
	      if(row==1) {
       no1=1;
	        no2=9;
	      }
	      no1++;
	      no2--;
	      }
	      
	}

	private void patternG() {
		for(int row=1;row<=6;row++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int r=1;r<=4;r++)
		{
			System.out.println("* ");
		}	
				for(int r1=1;r1<=1;r1++)
				{
					System.out.print("* ");
				}
				
			for(int s=1;s<=3;s++)
			{
						System.out.print(" ");
					}
		
			
					for(int i=1;i<=4;i++)
					{
						System.out.print("* ");
					}
				
			System.out.println();
				
				for(int row1=1;row1<=6;row1++)
				{
				System.out.print("* ");
					for(int space=1;space<=5;space++)
					{
						System.out.print("  ");
						}
					System.out.println("*");
					}
			
		for(int row=1;row<=6;row++)
		{
			if(row==1)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
	}

	private void patternN() {
		int no1=1;
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if((col==1||col==9) ||((col==no1) && row<=9))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			no1++;
		}
		
		
		
	}

	private void patternZ() {
		
		int num=1;
		for(int col=1; col<=9; col++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<9-num; space++)
	        {
	        System.out.print("  ");
	        }
	    System.out.println("*"); 
	    num++;
	    
	}
	for(int col=1; col<=9; col++)
    {
    System.out.print("*"+" ");
    }
System.out.println(); 
	}
	
	private void patternH() {
		
		  for(int star=1; star<=7; star++)
		      {
		      System.out.print("* "); 
		      for(int space=1; space<=6;space++)
		        {
		        System.out.print("  ");
		        }
		      System.out.println("*"); 
		      }
		  for(int col=1; col<=8; col++)
	      {
	       
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
			 
	}	

	private void patternF() {
		for(int row=1;row<=6;row++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=9;star++)
		{
			if(star==4)
				for(int s=1;s<=5;s++)
				{
					System.out.print("* ");
				}
			else
			System.out.println("* ");
		}
		
	}

	private void patternE() {
		for(int row=1;row<=6;row++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=9;star++)
		{
			if(star==4)
			{
				for(int s=1;s<=5;s++)
				{
					System.out.print("* ");
				}
			}
			else
			System.out.println("* ");
		}
		for(int row=1;row<=6;row++)
		{
			System.out.print("* ");
		}
		
		
	}

	private void patternA() {
		for(int row=1;row<=8;row++)
		{
			if(row==1||row==8)			
				System.out.print(" ");
			else
				System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=6;star++)
		{
			System.out.print("* ");
			for(int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}for(int row=1;row<=8;row++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=6;star++)
		{
			System.out.print("* ");
			for(int space=1;space<=6;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		
	}

	private void patternT() {
		for(int col=1;col<=8;col++)
		{
			
			System.out.print("* ");
			}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			
				for(int space=1;space<=3;space++)
				{
					System.out.print("  ");
				}
				System.out.println("* ");
		}
		
		
	}

	private void patternI() {
		for(int col=1;col<=8;col++)
		{
			
			System.out.print("* ");
			}
		System.out.println();
		
		
		for(int star=1;star<=7;star++)
		{
			
				for(int space=1;space<=3;space++)
				{
					System.out.print("  ");
				}
				System.out.println("* ");
		}
		for(int col=1;col<=8;col++)
		{
			
			System.out.print("* ");
			}
		
		}
		
		
	

	private void patternD() {
		for(int col=1;col<=7;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int star=1;star<=6;star++)
		{
			System.out.print(" * ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println(" * ");
			
		}
		for(int col=1;col<=7;col++)
		{
			System.out.print("* ");
		}
		
	}

	private void patternB() {
		
		for(int col=1;col<=8;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
			for (int star=1;star<=6;star++)
			{
		System.out.print("* ");
		for (int space=1;space<=7;space++)
		{
			System.out.print("  ");
		}
		System.out.println("* ");
	      	}
			for(int col=1;col<=8;col++)
			{
				System.out.print("* ");
			}
			System.out.println();

			
			for (int star=1;star<=7;star++)
			{
		System.out.print("* ");
		for (int space=1;space<=7;space++)
		{
			System.out.print("  ");
		}
		System.out.println("* ");
	      	}
		
			for(int col=1;col<=8;col++)
			{
				System.out.print("* ");
			}
			
		
		
	}

	private void printP() {
		for(int col=1; col<=8; col++)
	      {
      if(col==8)
          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
    System.out.println("*"); 
	      }
	
	  for(int col=1; col<=8; col++)
	      {
       if(col==8)
         System.out.print("  "); 
      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println(""); 
	      }
		
	}

	private void printY() {
		 for(int row=1; row<=9;row++)
		    {
		      if(row<=5) 
		      {
		        for(int col=1; col<=9;col++)
		        {
		          if(col==row || col==10-row)
		          {
		            System.out.print("* ");
		          }
		          else
		            System.out.print("  ");
		        }
		        System.out.println();
		      }
		      else
		      {
		        for(int space=1; space<=4; space++)
		        {
		          System.out.print("  ");
		        }
		      System.out.println("*");
		      }
		      
		    }
		    
		
	}

	private void printT() {
		for(int star=1; star<=9; star++)
	    {
	    System.out.print("*"+" \t");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<=4; space++)
	        {
	        System.out.print(" "+"\t");
	        }
	    System.out.println("*"); 
	}
		
	}

	private void print8() {
	    for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	    for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	    for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
		
	}

	private void patternO() {
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    
		
	}

	private void patternc() {
		
		for(int col=1;col<=7;col++)
		{
			if(col==1)
				System.out.print("  ");
			else
				System.out.print("*"+" ");
		}
		System.out.println();
		for(int star=1; star<=7; star++)
	    {
	    System.out.println("* "); 
	    }
	for(int col=1; col<=7; col++)
	    {
	     if(col==1)
	        System.out.print("  "); 
	    else
	        System.out.print("* "); 
	    }
		
	}
	

	private void pattern6() {
		for(int row=5;row>=1;row--)
		{
		
		for(int star=1;star<=5-row;star++)
		{
			System.out.print("  ");
		}
		for(int no=1;no<=row;no++)
		{
			System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void pattern5() {
		int no=15;
	
		for(int row=1;row<=5;row++)
		{
		
		for(int star=1;star<row;star++)
		{
			System.out.print("  ");
		}
		for(int num=1;num<=6-row;num++)
		{
			System.out.print(no+" ");
			no--;
		}
		
		System.out.println();
		
		
	}
	}

	private void pattern4() {
		int num=15;
		for(int row=5;row>=1;row--)
		{
		
		for( int star=1;star<row;star++)
		{
			System.out.print("  ");
		}
		for(int no=1;no<=6-row;no++)
		{
         System.out.print(num+" ");
             num--;
		}
		System.out.println();
		}
		
	}

	private void pattern3in1() {
		
		for(int row=5;row>=1;row--)
		{
		
		for( int star=1;star<row;star++)
		{
			System.out.print("  ");
		}
		for(int no=1;no<=6-row;no++)
		{
			System.out.print(6-row+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern2() {
		int num=5;
		
		for(int row=5;row>=1;row--)
		{
			
		
		for(int star=1;star<row;star++)
		{
			System.out.print("  ");
		}
		for(int no=1;no<=6-row;no++)
		{
			System.out.print(row+" ");
			
		}
		System.out.println();
		}
	}


	private void Pattern1() {
		for(int row=5;row>=1;row--)
		{
		
		for(int star=1;star<row;star++)
		{
			System.out.print("  ");
		}
		for(int num=5;num>=row;num--)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
	}

}}
