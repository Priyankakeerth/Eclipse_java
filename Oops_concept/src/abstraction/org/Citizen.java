package abstraction.org;

public class Citizen extends Parents implements StateGovt,Govt,Zoho{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen obj=new Citizen();
		obj.watchMovies();
		obj.change2000Rupees();
		System.out.println(Citizen.fine_helmet); 
	
		System.out.println(Govt.last_date);
		Govt officer=new Citizen(); //Dynamic Binding
		officer.displayIDProof();

	}
	public void watchMovies()
	{
		System.out.println("Watching Movies");
	}

	@Override
	public void change2000Rupees() {
		// TODO Auto-generated method stub
		System.out.println("Bank");
		
	}

	@Override
	public void displayIDProof() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void displayAddressProof() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void study() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void provide_electriciy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}
	
}
