package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2 sm=new StringDemo2();
		//sm.check_count_of_character();
		//sm.check_everycount();
		//sm.count_present_charecter();
		//sm.numbercount();
		
	}

	private void numbercount() {
		int[] arr= {1,2,3,4,3,2,5,6};
		int[] a=new int[arr.length];
		int big=-1; 
		for( int j=0;j<arr.length;j++)
{
			int count=1;
			int no=arr[j];
			for(int i=j+1;i<arr.length;i++)
			{
				
			if(no==arr[i]) 
			{
				a[i]=-1;
				count++;
			}
			}
			if(a[j]!=-1)
			{
				a[j]=count;
			}
			/*if(count>big)
			{
				big=count;  //finding big 
			} */
			if(a[j]>=1)
			{
				System.out.println(no+"the present times "+a[j]); //count
			} 			
			
			
}
		//System.out.println(a[j] + "times for "+big);
				
	}

	private void count_present_charecter() {
		
		String n="sivasabaribala";
		int big=-1; char position=' ';
		
		int[] cc=new int[n.length()];
		
		for(int j=0;j<n.length();j++)
		{
			int count=1;
			char ch=n.charAt(j);
			
			for(int i=j+1;i<n.length();i++)
			{
				if(ch==n.charAt(i))
				{
					cc[i]=-1;
					count++;
				}
			}
			if(cc[j]!=-1)
			{
				cc[j]=count;
				if(count>big)
				{
					big=count;
					position=n.charAt(j);
				}
			}
			if(cc[j]>0)
			{
			System.out.println(ch+" appears for "+ cc[j]+ " times");
			}
			//System.out.println();
			//if(cc[j]==1)
			//{
				//System.out.println(ch+" appears for "+ cc[j] + " times");	
			//} 
					
		}
		System.out.println(position+" times for "+ big);
		
	}

	private void check_everycount() {
		// TODO Auto-generated method stub
		String n = "sivasabaribala";
	   
	    for(int j=0;j<n.length()-1;j++)
	    {
	    	 int count = 1; 
	    char ch = n.charAt(j);
	    for(int i=j+1; i<n.length();i++)
	    {
	      if(ch == n.charAt(i))
	      {
	        count++; 
	      }
	    }
	    
	    System.out.println(ch + " appears for " + count + 
	        " times");
	}
	}

	private void check_count_of_character() {
		
	    String n = "sivasabaribala";
	    int count = 1; 
	    char ch = n.charAt(0);
	    for(int i=1; i<n.length();i++)
	    {
	      if(ch == n.charAt(i))
	      {
	        count++; 
	      }
	    }
	    System.out.println(ch + " appears for " + count + 
	        " times");
	}

}
