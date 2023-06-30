package array_package.org;

import java.util.Scanner;

public class Parentsexpense {

	public static void main(String[] args) {
		Parentsexpense pe=new Parentsexpense();
//		int spent_expense1=pe.first_year();
//		int spent_expense2=pe.second_year();
//		int total_spent=spent_expense1+spent_expense2;
//		System.out.println("Total expense spent for travel:"+ total_spent);
//		int Profit=spent_expense1-spent_expense2;
//		System.out.println("Saving&Profit from expense:"+Profit);
//		float percentage=(Profit*100/total_spent);
//	System.out.println("Savings in Percentage : "+percentage);
		
		pe.expense();

	}

	private void expense() {
		// TODO Auto-generated method stub
		int[] cost= {30,30};
		int days=25;
		int total=0;
		for(int i=0;i<cost.length;i++)
			
		{
			total=total+cost[i];
		}
		int totalcost_2m=total*days;
		int singlemember=totalcost_2m/2;
		int profit=totalcost_2m-singlemember;
		System.out.println("Total expense for 2 members:"+ totalcost_2m);
		System.out.println("expense for single member:"+singlemember);
		System.out.println("profit: "+profit);
		double percentage=profit*100/totalcost_2m;
		System.out.println(percentage);
	}

	int  first_year()
	{
		int days=25;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of persons for first year");
		int count=sc.nextInt();
		//30 for per day 1 person
     int[] travelingamount= {15,15};
		int result1=0;
		
		for(int i=0;i<travelingamount.length;i++)
		{
		
		
		
			 result1=result1+travelingamount[i];
		}
		System.out.println("Expense for 2 member: "+ (result1*count*days));
		return result1*count*days;
	}
	int second_year()
	{
		int days=25;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person count for second year");
		int person_count=sc.nextInt();
		//30rs for per person
     int[] travelingamount= {15,15};
		int result1=0;
	
		for(int i=0;i<travelingamount.length;i++)
		{
			 result1=result1+travelingamount[i];
		}
		System.out.println("Expense for 1 member: "+ (result1*person_count*days));
		return result1*person_count*days;
	}
	
	
	
}
