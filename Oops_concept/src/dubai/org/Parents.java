package dubai.org;

public class Parents {

	public void take_to_movie(Children ch) {
		// TODO Auto-generated method stub
		System.out.println(ch.name.getClass());
		String name="KUmar";
		System.out.println(name);
		
		Oneplus op=new Oneplus();
		Parents p=new Parents();
		p.print(op);
		op.write();
	}

	private void print(Oneplus op) {//pass by object that means pass by reference
		// TODO Auto-generated method stub
		op.write();
		
	}

	
	
}
