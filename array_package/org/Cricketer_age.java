package array_package.org;

public class Cricketer_age {

	public static void main(String[] args) {
		
		Cricketer_age cc=new Cricketer_age();
		cc.find_age();
		
		
	}
		private void find_age() {
			   
			int[] Age = {41, 34, 36, 29, 40}; 
			String[] Name = {"Dhoni", "Virat", "Jaddu", "Rishab","Raina"}; 
			int max_i = 0; 
			int min_i =0; 
			int max = Age[0]; 
			int min = Age[0];
			for(int i=1; i<Age.length;i++)
			{
	//Maximum age
			  if(Age[i]>max)
			  {
			    max = Age[i];
			    max_i = i; 
			  }
			  //Minimum age
			  if(Age[i]<min)
			  {
			    min = Age[i];
			    min_i = i; 
			  }
			  
			}

			System.out.println("High Age Person: " + max +" From index of "+ Name[max_i]);
			System.out.println("Low Age Person : "+ min + " from index of "+ Name[min_i]);
			}

	}


