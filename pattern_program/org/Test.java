package pattern_program.org;

public class Test {

	public static void main(String[] args) {
		Test tobj=new Test();
		
//		tobj.squarepattern();
		//tobj.triangleno();
		//tobj.triangleinsno();
//		tobj.trianglesameno();
		//tobj.numberincreasingrevpyramid();
	//tobj.numberchangingpyramid();
//		tobj.zeroone_triange(); //doubt 
	//tobj.rhombuspattern(); //verygood
	//tobj.diamond_pattern();// verygood
	//	tobj.squarefillpattern(); //verygood
	//tobj.righthalfpyramid(); //verygood
		//tobj.reverse_righthalfpyramid();
		//tobj.lefthalf_pyramid();
//tobj.reversenumber_trianglepattern(); //verygood
//		tobj.mirrorimage_trianglepattern(); //doubt
	//tobj.triangle_starpattern();
//		
//	tobj.hallowtriangle_pattern(); //pending
		
	//tobj.test1();
		//tobj.K_Pattern();
		

	}

	
	private void K_Pattern() {
		
	
		for(int i=10;i>=1;i--)
		{ 
			if(i>5)
			{
			for(int j=1;j<=i-5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
			
			else
				for(int j=1;j<=5-i;j++)
				{
					System.out.print("* ");
				}
			
				System.out.println();
			
				
			}
		
		}
		
		
	
	
	
		
	


	private void test1() {
		int n=5;
		// TODO Auto-generated method stub
		int i, j, k;
		  
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces.
            for (j = i; j < n; j++) 
            {
                System.out.print(" ");
            }
            
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
  
            System.out.println("");
        }
    }
		
	

	private void hallowtriangle_pattern() {
		int star; int n=5; int count;
		//outerloop
		for( count=1;count<=n;count++)
		{
			//lpp for print spaces
			for(int space=1;space<n;space++)
			{
				System.out.print(" ");
			}
			
			for( star=1;star<=2*count-1;star++);
			
			{
				//printing stars
				if(star==1||count==n||star==(2*count-1))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
				

				}
			System.out.println();
		}
		
	}

	private void triangle_starpattern() {
		
for(int count=1;count<=5;count++)
{
	for(int space=1;space<6-count;space++)
	{
		System.out.print(" ");
	}
	
	for(int i=1;i<=count;i++)
	{
	System.out.print("* ");
	}
	System.out.println();
	
}
	}
		
		
	

	private void mirrorimage_trianglepattern() {
		for(int j=1;j<=5;j++)
		{
		for(int space=1;space<j;space++)
		{
			System.out.print(" ");
		}
		for(int i=j;i<5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		for(int count=1;count<=3;count++)
		{
		
		for(int spac=1;spac<=4-count;spac++)
		{
			System.out.print(" ");
		}
		
		for(int k=4-count;k<=4;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		}
		
		
	}

	private void reversenumber_trianglepattern() {
		for(int j=1;j<=5;j++)
		{
		for(int space=1;space<j;space++)
		{
			System.out.print(" ");
		}
		for(int i=j;i<5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	}

	private void lefthalf_pyramid() {
		for(int count=1;count<6;count++)
		{
		
			for(int space=1;space<=5-count;space++)
			{
				System.out.print("  ");
			}
			
		for(int i=1;i<=count;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}

	private void reverse_righthalfpyramid() {
		for(int j=5;j>=1;j--)
		{
		
		for(int i=1;i<=j;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

	private void righthalfpyramid() {
		for(int j=1;j<=5;j++)
		{
		
		for(int i=1;i<=j;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

	private void squarefillpattern() {
		
		
		for(int j=1;j<=6;j++)
		{
		for(int i=1;i<=6;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	private void diamond_pattern() {
		for(int count=5;count>=1;count--)
		{
		for(int space=1;space<count;space++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=6-count;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		
		for( int coun=5;coun>=1;coun--)
		{
			for(int s=1;s<=6-coun;s++)
			{
				System.out.print(" ");
			}
			for(int no=1;no<coun;no++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private void rhombuspattern() {
		for(int j=1;j<=4;j++)
		{
for(int space=1;space<j;space++)
{
	System.out.print("  ");
}
		for(int i=1;i<=4;i++)
		{    
			
			System.out.print("* ");
		}
		System.out.println();
		}
	}

	private void zeroone_triange() {
		
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<j;i++)
			{
				if(i%2!=0)
				{
					System.out.print(1+" ");
				}
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
		
	}

	private void numberchangingpyramid() {
		int no=1;
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<j;i++)
		{
			System.out.print(no+" ");
			no++;
		}
		
		System.out.println();
	}
	}

	private void numberincreasingrevpyramid() {
		for(int j=5;j>=1;j--)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}

	private void trianglesameno() {
		int num=1;
		for(int j=5;j>=1;j--)
		{
		for(int i=1;i<j;i++)
		{
			System.out.print(" ");
				
	}
		for(int no=1;no<=6-j;no++)
		{
		System.out.print(num+" ");
		}
		num++;
		System.out.println();
	}
	}
	

	private void triangleinsno() {
		int no=1;
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(no+" ");
			no++;
		}
		System.out.println();
		}
	}

	private void triangleno() {
		for(int j=1;j<5;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	}

	private void squarepattern() {
		
		for(int i=1;i<=6;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for(int j=1;j<=4;j++)
		{
			System.out.print("* ");
			for(int space=1;space<=4;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int i=1;i<=6;i++)
		{
			System.out.print("* ");
		}
		
	}

	
}