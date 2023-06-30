package array_package.org;

public class Array_copy {

	public static void main(String[] args) {
		
		Array_copy ac=new Array_copy();
//		ac.addition();
//		ac.addition1();
//		ac.concadinate();
//		ac.find_negativeno();
//		ac.find_negativeno_count();
		ac.create_negativeno_array();
		
		
	    
	}
	private void create_negativeno_array() {
		
		int[] num= {1,-2,3,-4,5,-6,7,-8};
		
		int i; int j=0;int count=0;
		
		for (i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
			count++;
			int[] b=new int[count];
			b[j]=num[i];
			System.out.println(b[j]);
			j++;
			}
		}
		
		
		
	}
	private void find_negativeno_count() {
		int[] num= {10,-10,20,-20,30,-30,40,-40};
		int i;int count=0;
		for(i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				count++;
			}
		}
		System.out.println("Count of negative numbers in given array: "+count);
		
	}
	private void find_negativeno() {
		int[] num= {10,-10,20,-20,30,-30};
		int i;
		for (i=0;i<num.length;i++)
		{
		 if(num[i]<0)
		 {
			 System.out.println(num[i]);
		 }
		}
	}
	private void concadinate() {
		int[] a= {10,20,30};
		int[] b= {40,50,60};
		int[] c=new int[a.length+b.length];
		
		int i; int j=0;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		while(i<c.length)
		{
		c[i]=b[j];
		System.out.println(c[i]);
		j++;
		}
		
	}
	private void addition1() {
		int[] a= {10,20,30};
		int[] b= {10,20,30,40};
		int len=a.length>b.length?a.length:b.length;//ternary operator
		int[] c=new int[len];
		int i;
		for(i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
			}
			else if(i<c.length)
			{
				c[i]=b[i];
				System.out.println(c[i]);
				}
		}
		
		
	}
	private void addition() {
		
	    	int[] a = {10,20,30};
		    int[] b = {40,50,60};
		    int[] c = new int[a.length+b.length];
		    int i;
		    for(i= 0;i<a.length;  i++)
		    {
	   
		    	c[i]=a[i]+b[i];
		    	   System.out.println(c[i]); 
		    }

		}
	
	
	
	
	
	}


