package pattern_program.org;

public class Patterns2 {

	public static void main(String[] args) {
		Patterns2 p=new Patterns2();
	//p.printstar();	
	//	p.printstar1();
	//p.printstar2();
	//p.printstarwith_space();
//p.printnum();
	//p.pattern2();
		//Homeworks
	//p.printnumbers_1to5_decreasingorder();
	//	p.print_1_startwith1_endwith_5number();
//p.print5_until1();
	//	p.print_sameno_in_decreasingcount();
//p.printsameno_indecreasingorder();
	//p.print_startingwith15_until1();
	//p.print_startwith15_indecreasingcount();
	//p.print_binary();
//		Recall classes
	//p.patternwithstar();
//p.pattern_with_start_increasing();
		//homeworks
	//p.printstar_withnumber();
		//p.printspacewithno();
		p.printspacewithins();
		

	}

	private void printspacewithins() {
		int no=1;
		for(int row=5;row>=1;row--)
		{
			for(int star=1;star<row;star++)
			{
				System.out.print(" ");
			}
			for(int num=row;num<=row;row++)
			{
				System.out.print(no);
				no++;
			}
			System.out.println();
		}
		
	}

	private void printspacewithno() {
		//int no=5;
		for(int row = 5; row>=1; row--)
		{
		for(int star=1; star<row; star++)
		    {
		    System.out.print("  ");
		    }
		for(int num = row; num<=5; num++)
			{
			System.out.print(row+" ");
			
			}
		System.out.println(); 
		} 
		
	}

	private void printstar_withnumber() {
		
		for(int row=5;row>=1;row--)
			
		{ 
			
			for(int star=row;star<5;star++)
			{
				System.out.print("* ");
			}
			
			
			for(int no=1;no<=row+4;no+=2)
			{
				System.out.print(no+" ");
			}
			System.out.println();
			
			
			}
		
	}

	private void pattern_with_start_increasing() {
		for(int row = 5; row>=1; row--)
		{
		for(int star=1; star<row; star++)
		    {
		    System.out.print("  ");
		    }
		for(int num = row; num<=5; num++)
			{
			System.out.print(num+" ");
			}
		System.out.println(); 
		} 

		
	}
		
	

	

	private void patternwithstar() {
		
		    // TODO Auto-generated method stub
		    for(int row = 5; row>=1; row--)
		    {
		        for(int star =1; star<row; star++)
		        {
		        System.out.print("  ");
		        }
		        for(int no = 5; no>=row; no--)
		        {
		        System.out.print(no+" "); 
		        }  
		        System.out.println(); 
		    }


		    
		  }
		
	

	private void print_binary() {
		 
		for(int count=5;count>=1;count--)
		{
		for(int n=1;n<=count;n++)
		{
			if(n%2!=0)
			{
				System.out.print(1+ " ");	
			}
			else
				System.out.print(0+" ");
		}
		System.out.println();
		
	}
	}

	private void print_startwith15_indecreasingcount() {
		int num=15;
		for(int count=1;count<=5;count++)
		{
		for(int no=1;no<=count;no++)
		{
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
		}
		
	}

	private void print_startingwith15_until1() {
		int num=15;
		for(int count=5;count>=1;count--)
		{

		for(int no=1;no<=count;no++)
		{
			System.out.print(num+" ");
			num--;
		}
		System.out.println();
		}
		
	}

	private void printsameno_indecreasingorder() {
	for(int count=5;count>=1;count--)
		{
		for(int no=count;no<=5;no++)
		{
			System.out.print(count+" ");
		}
		System.out.println();
		
	}
		
	}

	private void print_sameno_in_decreasingcount() {
		for(int count=1;count<=5;count++)
		{
		
		for(int no=1;no<=count;no++)
		{
			System.out.print(count+" ");
		}
		System.out.println();
		}
		
	}

	private void print5_until1() {
		for(int count=1;count<=5;count++)
		{
		
		for(int no=5;no>=count;no--)
		{
			System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void print_1_startwith1_endwith_5number() 
	{
		
	int num=1;
		for(int count=1;count<=5;count++)
		{
		for(int no=1;no<=count;no++)
		{
			System.out.print(num +" ");
			num++;
		}
		System.out.println();
		}
		
	}

	private void printnumbers_1to5_decreasingorder() {
		for(int count=5;count>=1;count--)
		{
		
		for(int no=1;no<=count;no++)
		{
			System.out.print(no+" ");
		}
		System.out.println();
		}
	}

	private void pattern2() {
		for(int last = 1; last<=5; last++)
		{
		    for(int no = 1; no<=last; no++) // 1
		    {
		    System.out.print(no+" "); 
		    }
		    System.out.println();
		}
		
	}
		
	

	private void printnum() {
		
		
		for(int no=5;no>=1;no--)
		{
			for(int star=1;star<no;star++)
			{
				System.out.print("  ");
			}
			for(int num=1;num<=6-no;num++)
			{
				System.out.print(num+"   ");
			}
			System.out.println();
			
		}
		
	}

	private void printstarwith_space() {
		for(int no=5;no>=1;no--)
		{
			for(int star=1;star<no;star++)
			{
				System.out.print("  ");
			}
			for(int num=1;num<=6-no;num++)
			{
				System.out.print(1+"  ");
			}
			System.out.println();
			
		}
		
	}

	private void printstar2() {
		for(int no=5;no>=1;no--)
		{
			for(int star=1;star<no;star++)
			{
				System.out.print("* ");
			}
			for(int num=1;num<=6-no;num++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
			
		}
		
	}

	private void printstar1() {
		for(int no=5;no>=1;no--)
		{
		for(int star=1;star<no;star++)
		{
			System.out.print("* ");
			
		}
		for(int num=1;num<=5;num++)
		{
			System.out.print(1+" ");
		}
		System.out.println();
	}

}
		
	

	private void printstar() {
		
		for(int no=5;no>=1;no--)
		{
		for(int star=1;star<no;star++)
		{
			System.out.print("* ");
			
		}
		System.out.print(1);
		System.out.println();
	}

}
	
}
