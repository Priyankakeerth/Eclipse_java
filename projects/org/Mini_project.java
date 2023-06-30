package projects.org;

import java.util.Scanner;

public class Mini_project {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number: ");
		
		int num=sc.nextInt();
		//System.out.println(num);
		System.out.println("Enter your Second Number: ");
		int num2=sc.nextInt();
		int no=0;
		
	for(int n=0;n<6;n++)

		{
		
		System.out.println("Choose your option");
		System.out.println("1.Addition"+ "2.Subtaction" +"3.Multiplication" +"4.Division"+"5.Exit");
		int option=sc.nextInt();
		
		
		switch(option)
		{
		case 1:
			
			System.out.println("Addiion of two numbers:");
			no=num+num2;
			System.out.println(no);
			System.out.println("Do you want to proceed");
			String reply=sc.next();
			if(reply=="yes")	
			{
				n++;
			}
			else if(reply=="no")
			{
				n=7;
			}
		break;
		
		case 2:
			
			System.out.println("Enter the second number");
			int subno=sc.nextInt();
			no=no-subno;
			
			System.out.println("Subtraction of two numbers:" + no);
			
			System.out.println("Do you want toproceed");
			int reply1=sc.next().charAt(0);
			if(reply1=='Y')
				n++;
			break;
			
		case 3:
			System.out.println("Enter the second number");
			int mulno=sc.nextInt();
			no=no*mulno;
			System.out.println("Multiplication of two numbers:"+ no);
			
			System.out.println("Do you want toproceed");
			int reply2=sc.next().charAt(0);
			if(reply2=='Y')
			{
				n++;
			}
		
			break;
			
		case 4:
			System.out.println("Enter the second number");
			int divno=sc.nextInt();
			no=no/divno;
			System.out.println("Division of two Numbers: "+no);
			System.out.println("Do you want toproceed");
			int reply3=sc.next().charAt(0);
			if(reply3=='Y')
			{
				n++;
			}
		     break;
		
		case 5:
			
				System.out.println("Thank you");
				n=7;
			
				break;
		}
	

		}
	


}
}
