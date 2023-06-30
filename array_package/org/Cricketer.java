package array_package.org;

import java.util.Scanner;

public class Cricketer {

	public static void main(String[] args) {
		Cricketer cc=new Cricketer();
		cc.score_average();

	}

	private void score_average() {
//		int[] score= {89,50,100,40,70,60};
		System.out.println(" Virat Kohli attended innings");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int[] score=new int[count];
		int total_score=0;
		System.out.println("Balles faced");
	     int balls_faced= sc.nextInt();
	for(int i=0;i<score.length;i++)
	{
		System.out.println("Enter the score");
		score[i]=sc.nextInt();
	total_score=total_score+score[i];
	}
		System.out.println("Total score of virat:"+ total_score);
		float Strike_rate= (total_score/balls_faced)*100;
		System.out.println("Batting Srike rate:" + Strike_rate);
		System.out.println("Average score :"+ total_score/count);
		
	}

}
