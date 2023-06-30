package pattern_program.org;

public class Pattern {

	public static void main(String[] args) {
	Pattern p=new Pattern();
//	p.method();
//	p.method1();
//	p.method2();
//	p.method3();
//	p.method4();
//p.methods();
//p.print_startwith_5();
	//p.print_startwith_1();
//homeworks problems
	//p.print_untill5_decrese1_innext_line();
	//p.print_number15to1();
	//p.print_sameno();
		
		}

	private void print_sameno() {
		
		for (int count=1;count<=5;count++)
		{
		for(int n=1;n<=count;n++)
		{
			System.out.print(count+" ");
		}
		System.out.println();
		}
	}

	private void print_number15to1(){
		int num=15;
		
		for(int count=5;count>=1;count--) {
		
		for(int no=1;no<=count;no++)
		{
			System.out.print(num+ " ");
			num--;
		}
	System.out.println();
		}
		
	}

	private void print_untill5_decrese1_innext_line() {
		
		int count;
		for(count=1;count<=5;count++)
		{
		
		for(int no=count;no<=5;no++)
		{
			System.out.print(no+ " ");
		}
		System.out.println();
		}
	}

	private void print_startwith_1() {
		for(int count=1;count<=5;count++)
		{
		
		for(int no=1;no<=count;no++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
		
	}
	}

	private void methods() {
		  int count =5; 
		    int num = 1; 
		    while(count>=1)
		    {
		    for(int no=1; no<=count; no++)
		    { 
		      System.out.print(num + "\t");
		      num++; 
		    }
		    System.out.println(); 
		    count--; 
		    }
		
		
	}

	private void print_startwith_5() {
		for (int count=5;count>=1;count--)
		{
			for(int no=1;no<=count;no++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
	}

	private void method4() {
		for (int count=5;count>=1;count--)
		{
			for(int no=count;no>=1;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void method3() {
		// TODO Auto-generated method stub
		int count=5;
		for(count=1;count<=5;count++)
		{
		for(int no=5; no>=count; no--) {
			System.out.print(no+" "); 
			}
		
			System.out.println();
			
		}
		
	}

	private void method2() {
		int count=5;
		for(count=5;count>=1;count--)
		{
		for(int no=1; no<=count; no++) {
			System.out.print(no+" "); 
			}
		
			System.out.println();
			
		}
		
	}

	private void method1() {
		int no;
		
	for( no=1;no<=25;no++)
	{
		System.out.print(no+" ");
		if(no%5==0)
		{
			System.out.println();
		}
		
	}

	
	
	
	}

	private void method() {
		// TODO Auto-generated method stub
		   for(int count = 1; count<=3;count++)
		    {
		        for(int no = 1; no<=5; no++)
		        {
		        System.out.print(no+" "); 
		        }
		        System.out.println(); 
		    }

		    
		  }
	}


