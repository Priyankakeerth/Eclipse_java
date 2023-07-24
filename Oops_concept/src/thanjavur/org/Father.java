package thanjavur.org;

public class Father {
	private int amount=10000;
	private int amount2=100000;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount2() {
		return amount2;
	}
	public void setAmount2(int amount2) {
		this.amount2 = amount2;
	}
	void yield()
	{
		System.out.println("Yield Paddy");
	}
	protected void share_asset()
	{
		System.out.println("Sharing Assets");
	}

}
