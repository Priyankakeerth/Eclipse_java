package array_package.org;

public class Array_May27 {

	public static void main(String[] args) {
		Array_May27 am=new Array_May27();
	am.arrayswapposition();
	//am.arraychangeposition();

	}

	private void arraychangeposition() {
	
		int[] a= {1,2,3,5,4,8,7};
		
		System.out.println("Before Swapping");
		
		for(int f:a)
		{
			System.out.print(f+" ");
		}
		System.out.println();
		for(int j=1;j<a.length;j++)
		{
		for(int i=0;i<a.length-j;i++)
		{
		if(a[i]>a[i+1])
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		}
		}
		System.out.println("After Swapping");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}

	private void arrayswapposition() {
		int[] ar= {10,7,3,1};
		System.out.println("Before Swapping");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int j=1;j<ar.length;j++)
		{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
			int temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
			}
		}
		}
		System.out.println();
		System.out.println("After Swapping");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
