package array_package.org;

import java.util.Scanner;

public class Youtube_view {

	public static void main(String[] args) {
	Youtube_view yu=new Youtube_view();
	
  yu.find_view();
	}

	private void find_view() {
	
		int[] views= {120,40,400,150,330,250,890};
		int total=0;
		
		for(int i=0;i<views.length;i++)
		{
			total=total+views[i];
		}
		
System.out.println("Total views: "+total);
System.out.println("Average Views: "+ total/views.length);
}
}