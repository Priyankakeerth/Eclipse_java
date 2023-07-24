package thanjavur.org;

public class Son extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		son.yield();
		son.share_asset();
		int s=son.getAmount();
		System.out.println(s);
		son.setAmount(200000);
		System.out.println(son.getAmount());
		
		

	}

}
